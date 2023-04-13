package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogService
import java.util.UUID
import rater.catalog.catalog.service.CatalogServiceControllerService
import rater.catalog.catalog.controller.api.CatalogServiceControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogServiceControllerController(service: CatalogServiceControllerService)
    : AbstractController<CatalogService, CatalogServiceControllerService>(service), CatalogServiceControllerApi {


    override fun deleteAllUsingDELETE21(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogService>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE22(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogService> {
        return super.delete(id)
    }

    override fun getAllUsingGET25(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogService>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET26(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogService> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST21(
			@RequestBody catalogService: List<CatalogService>): ResponseEntity<List<CatalogService>> {
        return ResponseEntity.ok(super.saveAll(catalogService))
    }

    override fun saveUsingPOST22(
			@RequestBody catalogService: CatalogService): ResponseEntity<CatalogService> {
        return super.create(catalogService)
    }

    override fun updateUsingPUT21(
			@PathVariable("id") id: UUID,
			@RequestBody catalogService: CatalogService): ResponseEntity<CatalogService> {
        return super.update(id, catalogService)
    }

}
