package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingActionSet
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingActionSetControllerService
import rater.catalog.catalog.controller.api.CatalogBillingActionSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingActionSetControllerController(service: CatalogBillingActionSetControllerService)
    : AbstractController<CatalogBillingActionSet, CatalogBillingActionSetControllerService>(service), CatalogBillingActionSetControllerApi {


    override fun deleteAllUsingDELETE2(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingActionSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE2(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingActionSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET3(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingActionSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET4(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingActionSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST2(
			@RequestBody catalogBillingActionSet: List<CatalogBillingActionSet>): ResponseEntity<List<CatalogBillingActionSet>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingActionSet))
    }

    override fun saveUsingPOST2(
			@RequestBody catalogBillingActionSet: CatalogBillingActionSet): ResponseEntity<CatalogBillingActionSet> {
        return super.create(catalogBillingActionSet)
    }

    override fun updateUsingPUT2(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingActionSet: CatalogBillingActionSet): ResponseEntity<CatalogBillingActionSet> {
        return super.update(id, catalogBillingActionSet)
    }

}
