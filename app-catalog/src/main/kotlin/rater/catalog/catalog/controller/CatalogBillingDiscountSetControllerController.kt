package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingDiscountSet
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingDiscountSetControllerService
import rater.catalog.catalog.controller.api.CatalogBillingDiscountSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingDiscountSetControllerController(service: CatalogBillingDiscountSetControllerService)
    : AbstractController<CatalogBillingDiscountSet, CatalogBillingDiscountSetControllerService>(service), CatalogBillingDiscountSetControllerApi {


    override fun deleteAllUsingDELETE6(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingDiscountSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE6(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscountSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET7(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingDiscountSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET8(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscountSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST6(
			@RequestBody catalogBillingDiscountSet: List<CatalogBillingDiscountSet>): ResponseEntity<List<CatalogBillingDiscountSet>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingDiscountSet))
    }

    override fun saveUsingPOST6(
			@RequestBody catalogBillingDiscountSet: CatalogBillingDiscountSet): ResponseEntity<CatalogBillingDiscountSet> {
        return super.create(catalogBillingDiscountSet)
    }

    override fun updateUsingPUT6(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingDiscountSet: CatalogBillingDiscountSet): ResponseEntity<CatalogBillingDiscountSet> {
        return super.update(id, catalogBillingDiscountSet)
    }

}
