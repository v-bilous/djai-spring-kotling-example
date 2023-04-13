package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingBonus
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingBonusControllerService
import rater.catalog.catalog.controller.api.CatalogBillingBonusControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingBonusControllerController(service: CatalogBillingBonusControllerService)
    : AbstractController<CatalogBillingBonus, CatalogBillingBonusControllerService>(service), CatalogBillingBonusControllerApi {


    override fun deleteAllUsingDELETE3(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingBonus>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE3(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingBonus> {
        return super.delete(id)
    }

    override fun getAllUsingGET4(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingBonus>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET5(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingBonus> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST3(
			@RequestBody catalogBillingBonus: List<CatalogBillingBonus>): ResponseEntity<List<CatalogBillingBonus>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingBonus))
    }

    override fun saveUsingPOST3(
			@RequestBody catalogBillingBonus: CatalogBillingBonus): ResponseEntity<CatalogBillingBonus> {
        return super.create(catalogBillingBonus)
    }

    override fun updateUsingPUT3(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingBonus: CatalogBillingBonus): ResponseEntity<CatalogBillingBonus> {
        return super.update(id, catalogBillingBonus)
    }

}
