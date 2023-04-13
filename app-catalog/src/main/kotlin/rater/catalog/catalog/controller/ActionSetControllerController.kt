package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.ActionSet
import java.util.UUID
import rater.catalog.catalog.service.ActionSetControllerService
import rater.catalog.catalog.controller.api.ActionSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class ActionSetControllerController(service: ActionSetControllerService)
    : AbstractController<ActionSet, ActionSetControllerService>(service), ActionSetControllerApi {


    override fun deleteAllUsingDELETE(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<ActionSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE(
			@PathVariable("id") id: UUID): ResponseEntity<ActionSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<ActionSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET(
			@PathVariable("id") id: UUID): ResponseEntity<ActionSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST(
			@RequestBody actionSet: List<ActionSet>): ResponseEntity<List<ActionSet>> {
        return ResponseEntity.ok(super.saveAll(actionSet))
    }

    override fun saveUsingPOST(
			@RequestBody actionSet: ActionSet): ResponseEntity<ActionSet> {
        return super.create(actionSet)
    }

    override fun updateUsingPUT(
			@PathVariable("id") id: UUID,
			@RequestBody actionSet: ActionSet): ResponseEntity<ActionSet> {
        return super.update(id, actionSet)
    }

}
