package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogZone
import java.util.UUID
import rater.catalog.catalog.service.ZoneControllerService
import rater.catalog.catalog.controller.api.ZoneControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class ZoneControllerController(service: ZoneControllerService)
    : AbstractController<CatalogZone, ZoneControllerService>(service), ZoneControllerApi {


    override fun deleteAllUsingDELETE30(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogZone>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE33(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogZone> {
        return super.delete(id)
    }

    override fun getAllUsingGET36(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogZone>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET38(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogZone> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST33(
			@RequestBody catalogZone: List<CatalogZone>): ResponseEntity<List<CatalogZone>> {
        return ResponseEntity.ok(super.saveAll(catalogZone))
    }

    override fun saveUsingPOST32(
			@RequestBody catalogZone: CatalogZone): ResponseEntity<CatalogZone> {
        return super.create(catalogZone)
    }

    override fun updateUsingPUT31(
			@PathVariable("id") id: UUID,
			@RequestBody catalogZone: CatalogZone): ResponseEntity<CatalogZone> {
        return super.update(id, catalogZone)
    }

}
