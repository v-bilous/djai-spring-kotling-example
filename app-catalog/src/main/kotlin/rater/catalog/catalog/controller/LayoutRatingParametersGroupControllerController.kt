package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.LayoutRatingParametersGroup
import java.util.UUID
import rater.catalog.catalog.service.LayoutRatingParametersGroupControllerService
import rater.catalog.catalog.controller.api.LayoutRatingParametersGroupControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class LayoutRatingParametersGroupControllerController(service: LayoutRatingParametersGroupControllerService)
    : AbstractController<LayoutRatingParametersGroup, LayoutRatingParametersGroupControllerService>(service), LayoutRatingParametersGroupControllerApi {


    override fun deleteAllUsingDELETE29(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<LayoutRatingParametersGroup>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE31(
			@PathVariable("id") id: UUID): ResponseEntity<LayoutRatingParametersGroup> {
        return super.delete(id)
    }

    override fun getAllUsingGET34(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<LayoutRatingParametersGroup>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET35(
			@PathVariable("id") id: UUID): ResponseEntity<LayoutRatingParametersGroup> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST31(
			@RequestBody layoutRatingParametersGroup: List<LayoutRatingParametersGroup>): ResponseEntity<List<LayoutRatingParametersGroup>> {
        return ResponseEntity.ok(super.saveAll(layoutRatingParametersGroup))
    }

    override fun saveUsingPOST30(
			@RequestBody layoutRatingParametersGroup: LayoutRatingParametersGroup): ResponseEntity<LayoutRatingParametersGroup> {
        return super.create(layoutRatingParametersGroup)
    }

    override fun updateUsingPUT30(
			@PathVariable("id") id: UUID,
			@RequestBody layoutRatingParametersGroup: LayoutRatingParametersGroup): ResponseEntity<LayoutRatingParametersGroup> {
        return super.update(id, layoutRatingParametersGroup)
    }

}
