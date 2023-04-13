package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogProduct
import java.util.UUID
import rater.catalog.catalog.service.CatalogProductControllerService
import rater.catalog.catalog.controller.api.CatalogProductControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogProductControllerController(service: CatalogProductControllerService)
    : AbstractController<CatalogProduct, CatalogProductControllerService>(service), CatalogProductControllerApi {


    override fun deleteAllUsingDELETE16(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogProduct>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE16(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogProduct> {
        return super.delete(id)
    }

    override fun getAllUsingGET19(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogProduct>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET21(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogProduct> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST16(
			@RequestBody catalogProduct: List<CatalogProduct>): ResponseEntity<List<CatalogProduct>> {
        return ResponseEntity.ok(super.saveAll(catalogProduct))
    }

    override fun saveUsingPOST17(
			@RequestBody catalogProduct: CatalogProduct): ResponseEntity<CatalogProduct> {
        return super.create(catalogProduct)
    }

    override fun updateUsingPUT16(
			@PathVariable("id") id: UUID,
			@RequestBody catalogProduct: CatalogProduct): ResponseEntity<CatalogProduct> {
        return super.update(id, catalogProduct)
    }

}
