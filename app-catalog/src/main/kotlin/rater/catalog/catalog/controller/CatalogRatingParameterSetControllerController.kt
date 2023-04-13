package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogRatingParameterSet
import java.util.UUID
import rater.catalog.catalog.service.CatalogRatingParameterSetControllerService
import rater.catalog.catalog.controller.api.CatalogRatingParameterSetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogRatingParameterSetControllerController(service: CatalogRatingParameterSetControllerService)
    : AbstractController<CatalogRatingParameterSet, CatalogRatingParameterSetControllerService>(service), CatalogRatingParameterSetControllerApi {


    override fun deleteAllUsingDELETE20(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogRatingParameterSet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE21(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogRatingParameterSet> {
        return super.delete(id)
    }

    override fun getAllUsingGET24(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogRatingParameterSet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET25(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogRatingParameterSet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST20(
			@RequestBody catalogRatingParameterSet: List<CatalogRatingParameterSet>): ResponseEntity<List<CatalogRatingParameterSet>> {
        return ResponseEntity.ok(super.saveAll(catalogRatingParameterSet))
    }

    override fun saveUsingPOST21(
			@RequestBody catalogRatingParameterSet: CatalogRatingParameterSet): ResponseEntity<CatalogRatingParameterSet> {
        return super.create(catalogRatingParameterSet)
    }

    override fun updateUsingPUT20(
			@PathVariable("id") id: UUID,
			@RequestBody catalogRatingParameterSet: CatalogRatingParameterSet): ResponseEntity<CatalogRatingParameterSet> {
        return super.update(id, catalogRatingParameterSet)
    }

}
