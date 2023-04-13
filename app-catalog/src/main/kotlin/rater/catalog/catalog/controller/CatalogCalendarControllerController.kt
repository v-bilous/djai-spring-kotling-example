package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogCalendar
import java.util.UUID
import rater.catalog.catalog.service.CatalogCalendarControllerService
import rater.catalog.catalog.controller.api.CatalogCalendarControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogCalendarControllerController(service: CatalogCalendarControllerService)
    : AbstractController<CatalogCalendar, CatalogCalendarControllerService>(service), CatalogCalendarControllerApi {


    override fun deleteAllUsingDELETE9(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogCalendar>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE9(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendar> {
        return super.delete(id)
    }

    override fun getAllUsingGET10(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogCalendar>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET11(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendar> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST9(
			@RequestBody catalogCalendar: List<CatalogCalendar>): ResponseEntity<List<CatalogCalendar>> {
        return ResponseEntity.ok(super.saveAll(catalogCalendar))
    }

    override fun saveUsingPOST9(
			@RequestBody catalogCalendar: CatalogCalendar): ResponseEntity<CatalogCalendar> {
        return super.create(catalogCalendar)
    }

    override fun updateUsingPUT9(
			@PathVariable("id") id: UUID,
			@RequestBody catalogCalendar: CatalogCalendar): ResponseEntity<CatalogCalendar> {
        return super.update(id, catalogCalendar)
    }

}
