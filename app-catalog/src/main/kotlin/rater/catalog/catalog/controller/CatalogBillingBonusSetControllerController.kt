package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingBonusSet
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingBonusSetControllerService
import rater.catalog.catalog.controller.api.CatalogBillingBonusSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingBonusSetControllerController(service: CatalogBillingBonusSetControllerService)
    : AbstractController<CatalogBillingBonusSet, CatalogBillingBonusSetControllerService>(service), CatalogBillingBonusSetControllerApi {


    override fun deleteAllUsingDELETE4(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingBonusSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE4(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingBonusSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET5(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingBonusSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET6(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingBonusSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST4(
			@RequestBody catalogBillingBonusSet: List<CatalogBillingBonusSet>): ResponseEntity<List<CatalogBillingBonusSet>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingBonusSet))
    }

    override fun saveUsingPOST4(
			@RequestBody catalogBillingBonusSet: CatalogBillingBonusSet): ResponseEntity<CatalogBillingBonusSet> {
        return super.create(catalogBillingBonusSet)
    }

    override fun updateUsingPUT4(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingBonusSet: CatalogBillingBonusSet): ResponseEntity<CatalogBillingBonusSet> {
        return super.update(id, catalogBillingBonusSet)
    }

}
