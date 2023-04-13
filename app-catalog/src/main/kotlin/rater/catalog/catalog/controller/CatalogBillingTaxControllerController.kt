package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingTax
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingTaxControllerService
import rater.catalog.catalog.controller.api.CatalogBillingTaxControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingTaxControllerController(service: CatalogBillingTaxControllerService)
    : AbstractController<CatalogBillingTax, CatalogBillingTaxControllerService>(service), CatalogBillingTaxControllerApi {


    override fun deleteAllUsingDELETE7(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingTax>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE7(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingTax> {
        return super.delete(id)
    }

    override fun getAllUsingGET8(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingTax>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET9(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingTax> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST7(
			@RequestBody catalogBillingTax: List<CatalogBillingTax>): ResponseEntity<List<CatalogBillingTax>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingTax))
    }

    override fun saveUsingPOST7(
			@RequestBody catalogBillingTax: CatalogBillingTax): ResponseEntity<CatalogBillingTax> {
        return super.create(catalogBillingTax)
    }

    override fun updateUsingPUT7(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingTax: CatalogBillingTax): ResponseEntity<CatalogBillingTax> {
        return super.update(id, catalogBillingTax)
    }

}
