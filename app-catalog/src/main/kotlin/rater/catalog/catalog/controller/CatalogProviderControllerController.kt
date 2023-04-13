package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogProvider
import java.util.UUID
import rater.catalog.catalog.service.CatalogProviderControllerService
import rater.catalog.catalog.controller.api.CatalogProviderControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogProviderControllerController(service: CatalogProviderControllerService)
    : AbstractController<CatalogProvider, CatalogProviderControllerService>(service), CatalogProviderControllerApi {


    override fun deleteAllUsingDELETE18(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogProvider>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE19(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogProvider> {
        return super.delete(id)
    }

    override fun getAllUsingGET22(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogProvider>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET23(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogProvider> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST18(
			@RequestBody catalogProvider: List<CatalogProvider>): ResponseEntity<List<CatalogProvider>> {
        return ResponseEntity.ok(super.saveAll(catalogProvider))
    }

    override fun saveUsingPOST19(
			@RequestBody catalogProvider: CatalogProvider): ResponseEntity<CatalogProvider> {
        return super.create(catalogProvider)
    }

    override fun updateUsingPUT18(
			@PathVariable("id") id: UUID,
			@RequestBody catalogProvider: CatalogProvider): ResponseEntity<CatalogProvider> {
        return super.update(id, catalogProvider)
    }

}
