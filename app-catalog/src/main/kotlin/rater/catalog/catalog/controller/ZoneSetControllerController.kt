package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogZoneSet
import java.util.UUID
import rater.catalog.catalog.service.ZoneSetControllerService
import rater.catalog.catalog.controller.api.ZoneSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class ZoneSetControllerController(service: ZoneSetControllerService)
    : AbstractController<CatalogZoneSet, ZoneSetControllerService>(service), ZoneSetControllerApi {


    override fun deleteAllUsingDELETE31(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogZoneSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE34(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogZoneSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET37(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogZoneSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET39(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogZoneSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST34(
			@RequestBody catalogZoneSet: List<CatalogZoneSet>): ResponseEntity<List<CatalogZoneSet>> {
        return ResponseEntity.ok(super.saveAll(catalogZoneSet))
    }

    override fun saveUsingPOST33(
			@RequestBody catalogZoneSet: CatalogZoneSet): ResponseEntity<CatalogZoneSet> {
        return super.create(catalogZoneSet)
    }

    override fun updateUsingPUT32(
			@PathVariable("id") id: UUID,
			@RequestBody catalogZoneSet: CatalogZoneSet): ResponseEntity<CatalogZoneSet> {
        return super.update(id, catalogZoneSet)
    }

}
