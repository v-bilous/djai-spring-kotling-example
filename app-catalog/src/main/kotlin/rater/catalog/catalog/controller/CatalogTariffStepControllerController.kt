package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogTariffStep
import java.util.UUID
import rater.catalog.catalog.service.CatalogTariffStepControllerService
import rater.catalog.catalog.controller.api.CatalogTariffStepControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogTariffStepControllerController(service: CatalogTariffStepControllerService)
    : AbstractController<CatalogTariffStep, CatalogTariffStepControllerService>(service), CatalogTariffStepControllerApi {


    override fun deleteAllUsingDELETE24(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogTariffStep>> {
        return ResponseEntity.ok(super.deleteAll(parentId, ids))
    }

    override fun deleteUsingDELETE25(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
        return super.delete(parentId, id)
    }

    override fun getAllUsingGET28(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogTariffStep>> {
        return getAll(parentId, search, page)
    }

    override fun getByIdUsingGET29(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
        return super.getById(parentId, id)
    }

    override fun getByIdUsingGET37(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST24(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogTariffStep: List<CatalogTariffStep>): ResponseEntity<List<CatalogTariffStep>> {
        return ResponseEntity.ok(super.saveAll(parentId, catalogTariffStep))
    }

    override fun saveUsingPOST25(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogTariffStep: CatalogTariffStep): ResponseEntity<CatalogTariffStep> {
        return super.create(parentId, catalogTariffStep)
    }

    override fun updateUsingPUT24(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID,
			@RequestBody catalogTariffStep: CatalogTariffStep): ResponseEntity<CatalogTariffStep> {
        return super.update(parentId, id, catalogTariffStep)
    }

}
