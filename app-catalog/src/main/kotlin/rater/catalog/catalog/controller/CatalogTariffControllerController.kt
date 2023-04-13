package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogTariff
import java.util.UUID
import rater.catalog.catalog.service.CatalogTariffControllerService
import rater.catalog.catalog.controller.api.CatalogTariffControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogTariffControllerController(service: CatalogTariffControllerService)
    : AbstractController<CatalogTariff, CatalogTariffControllerService>(service), CatalogTariffControllerApi {


    override fun deleteAllUsingDELETE22(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogTariff>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE23(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariff> {
        return super.delete(id)
    }

    override fun getAllUsingGET26(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogTariff>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET27(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariff> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST22(
			@RequestBody catalogTariff: List<CatalogTariff>): ResponseEntity<List<CatalogTariff>> {
        return ResponseEntity.ok(super.saveAll(catalogTariff))
    }

    override fun saveUsingPOST23(
			@RequestBody catalogTariff: CatalogTariff): ResponseEntity<CatalogTariff> {
        return super.create(catalogTariff)
    }

    override fun updateUsingPUT22(
			@PathVariable("id") id: UUID,
			@RequestBody catalogTariff: CatalogTariff): ResponseEntity<CatalogTariff> {
        return super.update(id, catalogTariff)
    }

}
