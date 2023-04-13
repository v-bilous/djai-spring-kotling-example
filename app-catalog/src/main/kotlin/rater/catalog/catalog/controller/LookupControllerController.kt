package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.Lookup
import java.util.UUID
import rater.catalog.catalog.service.LookupControllerService
import rater.catalog.catalog.controller.api.LookupControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class LookupControllerController(service: LookupControllerService)
    : AbstractController<Lookup, LookupControllerService>(service), LookupControllerApi {


    override fun deleteUsingDELETE32(
			@PathVariable("id") id: UUID): ResponseEntity<Lookup> {
        return super.delete(id)
    }

    override fun getAllUsingGET35(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<Lookup>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET36(
			@PathVariable("id") id: UUID): ResponseEntity<Lookup> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST32(
			@RequestBody lookup: List<Lookup>): ResponseEntity<List<Lookup>> {
        return ResponseEntity.ok(super.saveAll(lookup))
    }

    override fun saveUsingPOST31(
			@RequestBody lookup: Lookup): ResponseEntity<Lookup> {
        return super.create(lookup)
    }

}
