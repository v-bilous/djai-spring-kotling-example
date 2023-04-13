package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CompatibilitySet
import java.util.UUID
import rater.catalog.catalog.service.CompatibilitySetControllerService
import rater.catalog.catalog.controller.api.CompatibilitySetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CompatibilitySetControllerController(service: CompatibilitySetControllerService)
    : AbstractController<CompatibilitySet, CompatibilitySetControllerService>(service), CompatibilitySetControllerApi {


    override fun deleteAllUsingDELETE25(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CompatibilitySet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE26(
			@PathVariable("id") id: UUID): ResponseEntity<CompatibilitySet> {
        return super.delete(id)
    }

    override fun getAllUsingGET29(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CompatibilitySet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET30(
			@PathVariable("id") id: UUID): ResponseEntity<CompatibilitySet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST25(
			@RequestBody compatibilitySet: List<CompatibilitySet>): ResponseEntity<List<CompatibilitySet>> {
        return ResponseEntity.ok(super.saveAll(compatibilitySet))
    }

    override fun saveUsingPOST26(
			@RequestBody compatibilitySet: CompatibilitySet): ResponseEntity<CompatibilitySet> {
        return super.create(compatibilitySet)
    }

    override fun updateUsingPUT25(
			@PathVariable("id") id: UUID,
			@RequestBody compatibilitySet: CompatibilitySet): ResponseEntity<CompatibilitySet> {
        return super.update(id, compatibilitySet)
    }

}
