package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingDiscount
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingDiscountControllerService
import rater.catalog.catalog.controller.api.CatalogBillingDiscountControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingDiscountControllerController(service: CatalogBillingDiscountControllerService)
    : AbstractController<CatalogBillingDiscount, CatalogBillingDiscountControllerService>(service), CatalogBillingDiscountControllerApi {


    override fun deleteAllUsingDELETE5(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingDiscount>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE5(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscount> {
        return super.delete(id)
    }

    override fun getAllUsingGET6(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingDiscount>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET7(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscount> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST5(
			@RequestBody catalogBillingDiscount: List<CatalogBillingDiscount>): ResponseEntity<List<CatalogBillingDiscount>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingDiscount))
    }

    override fun saveUsingPOST5(
			@RequestBody catalogBillingDiscount: CatalogBillingDiscount): ResponseEntity<CatalogBillingDiscount> {
        return super.create(catalogBillingDiscount)
    }

    override fun updateUsingPUT5(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingDiscount: CatalogBillingDiscount): ResponseEntity<CatalogBillingDiscount> {
        return super.update(id, catalogBillingDiscount)
    }

}
