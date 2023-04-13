package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogParameterGroup
import java.util.UUID
import rater.catalog.catalog.service.CatalogParameterGroupControllerService
import rater.catalog.catalog.controller.api.CatalogParameterGroupControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogParameterGroupControllerController(service: CatalogParameterGroupControllerService)
    : AbstractController<CatalogParameterGroup, CatalogParameterGroupControllerService>(service), CatalogParameterGroupControllerApi {


    override fun deleteAllUsingDELETE14(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogParameterGroup>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE14(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogParameterGroup> {
        return super.delete(id)
    }

    override fun getAllUsingGET17(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogParameterGroup>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET19(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogParameterGroup> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST14(
			@RequestBody catalogParameterGroup: List<CatalogParameterGroup>): ResponseEntity<List<CatalogParameterGroup>> {
        return ResponseEntity.ok(super.saveAll(catalogParameterGroup))
    }

    override fun saveUsingPOST15(
			@RequestBody catalogParameterGroup: CatalogParameterGroup): ResponseEntity<CatalogParameterGroup> {
        return super.create(catalogParameterGroup)
    }

    override fun updateUsingPUT14(
			@PathVariable("id") id: UUID,
			@RequestBody catalogParameterGroup: CatalogParameterGroup): ResponseEntity<CatalogParameterGroup> {
        return super.update(id, catalogParameterGroup)
    }

}
