package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLayout
import java.util.UUID
import rater.catalog.catalog.service.CatalogLayoutControllerService
import rater.catalog.catalog.controller.api.CatalogLayoutControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogLayoutControllerController(service: CatalogLayoutControllerService)
    : AbstractController<CatalogLayout, CatalogLayoutControllerService>(service), CatalogLayoutControllerApi {


    override fun deleteAllUsingDELETE11(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogLayout>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE11(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
        return super.delete(id)
    }

    override fun downloadFileUsingGET(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
        return super.getById(id, )
    }

    override fun getAllUsingGET12(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogLayout>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET13(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST11(
			@RequestBody catalogLayout: List<CatalogLayout>): ResponseEntity<List<CatalogLayout>> {
        return ResponseEntity.ok(super.saveAll(catalogLayout))
    }

    override fun saveUsingPOST11(
			@RequestBody catalogLayout: CatalogLayout): ResponseEntity<CatalogLayout> {
        return super.create(catalogLayout)
    }

    override fun updateUsingPUT11(
			@PathVariable("id") id: UUID,
			@RequestBody catalogLayout: CatalogLayout): ResponseEntity<CatalogLayout> {
        return super.update(id, catalogLayout)
    }

}
