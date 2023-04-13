package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogTariffPlan
import java.util.UUID
import rater.catalog.catalog.service.CatalogTariffPlanControllerService
import rater.catalog.catalog.controller.api.CatalogTariffPlanControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogTariffPlanControllerController(service: CatalogTariffPlanControllerService)
    : AbstractController<CatalogTariffPlan, CatalogTariffPlanControllerService>(service), CatalogTariffPlanControllerApi {


    override fun deleteAllUsingDELETE23(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogTariffPlan>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE24(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffPlan> {
        return super.delete(id)
    }

    override fun downloadFileUsingGET1(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffPlan> {
        return super.getById(id, )
    }

    override fun getAllUsingGET27(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogTariffPlan>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET28(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffPlan> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST23(
			@RequestBody catalogTariffPlan: List<CatalogTariffPlan>): ResponseEntity<List<CatalogTariffPlan>> {
        return ResponseEntity.ok(super.saveAll(catalogTariffPlan))
    }

    override fun saveUsingPOST24(
			@RequestBody catalogTariffPlan: CatalogTariffPlan): ResponseEntity<CatalogTariffPlan> {
        return super.create(catalogTariffPlan)
    }

    override fun updateUsingPUT23(
			@PathVariable("id") id: UUID,
			@RequestBody catalogTariffPlan: CatalogTariffPlan): ResponseEntity<CatalogTariffPlan> {
        return super.update(id, catalogTariffPlan)
    }

}
