package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingTaxSet
import java.util.UUID
import rater.catalog.catalog.service.CatalogBillingTaxSetControllerService
import rater.catalog.catalog.controller.api.CatalogBillingTaxSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogBillingTaxSetControllerController(service: CatalogBillingTaxSetControllerService)
    : AbstractController<CatalogBillingTaxSet, CatalogBillingTaxSetControllerService>(service), CatalogBillingTaxSetControllerApi {


    override fun deleteAllUsingDELETE8(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingTaxSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE8(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingTaxSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET9(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingTaxSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET10(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingTaxSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST8(
			@RequestBody catalogBillingTaxSet: List<CatalogBillingTaxSet>): ResponseEntity<List<CatalogBillingTaxSet>> {
        return ResponseEntity.ok(super.saveAll(catalogBillingTaxSet))
    }

    override fun saveUsingPOST8(
			@RequestBody catalogBillingTaxSet: CatalogBillingTaxSet): ResponseEntity<CatalogBillingTaxSet> {
        return super.create(catalogBillingTaxSet)
    }

    override fun updateUsingPUT8(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingTaxSet: CatalogBillingTaxSet): ResponseEntity<CatalogBillingTaxSet> {
        return super.update(id, catalogBillingTaxSet)
    }

}
