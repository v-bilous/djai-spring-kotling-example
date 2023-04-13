package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogCalendarProperties
import java.util.UUID
import rater.catalog.catalog.service.CatalogCalendarPropertiesControllerService
import rater.catalog.catalog.controller.api.CatalogCalendarPropertiesControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogCalendarPropertiesControllerController(service: CatalogCalendarPropertiesControllerService)
    : AbstractController<CatalogCalendarProperties, CatalogCalendarPropertiesControllerService>(service), CatalogCalendarPropertiesControllerApi {


    override fun deleteAllUsingDELETE10(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogCalendarProperties>> {
        return ResponseEntity.ok(super.deleteAll(parentId, ids))
    }

    override fun deleteUsingDELETE10(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
        return super.delete(parentId, id)
    }

    override fun getAllUsingGET11(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogCalendarProperties>> {
        return getAll(parentId, search, page)
    }

    override fun getByIdUsingGET12(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
        return super.getById(parentId, id)
    }

    override fun getByIdUsingGET2(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST10(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogCalendarProperties: List<CatalogCalendarProperties>): ResponseEntity<List<CatalogCalendarProperties>> {
        return ResponseEntity.ok(super.saveAll(parentId, catalogCalendarProperties))
    }

    override fun saveUsingPOST10(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogCalendarProperties: CatalogCalendarProperties): ResponseEntity<CatalogCalendarProperties> {
        return super.create(parentId, catalogCalendarProperties)
    }

    override fun updateUsingPUT10(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID,
			@RequestBody catalogCalendarProperties: CatalogCalendarProperties): ResponseEntity<CatalogCalendarProperties> {
        return super.update(parentId, id, catalogCalendarProperties)
    }

}
