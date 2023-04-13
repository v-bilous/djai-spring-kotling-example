package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogOfferLabel
import java.util.UUID
import rater.catalog.catalog.service.CatalogOfferLabelControllerService
import rater.catalog.catalog.controller.api.CatalogOfferLabelControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogOfferLabelControllerController(service: CatalogOfferLabelControllerService)
    : AbstractController<CatalogOfferLabel, CatalogOfferLabelControllerService>(service), CatalogOfferLabelControllerApi {


    override fun deleteAllUsingDELETE13(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogOfferLabel>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE13(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogOfferLabel> {
        return super.delete(id)
    }

    override fun duplicateUsingPOST(
			@PathVariable("id") id: UUID,
			@RequestParam(value = "attachToAll", required = false) attachToAll: Boolean?,
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
        return super.create(id, catalogOfferLabel)
    }

    override fun getAllUsingGET15(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogOfferLabel>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET16(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogOfferLabel> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST13(
			@RequestBody catalogOfferLabel: List<CatalogOfferLabel>): ResponseEntity<List<CatalogOfferLabel>> {
        return ResponseEntity.ok(super.saveAll(catalogOfferLabel))
    }

    override fun saveUsingPOST14(
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
        return super.create(catalogOfferLabel)
    }

    override fun updateUsingPUT13(
			@PathVariable("id") id: UUID,
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
        return super.update(id, catalogOfferLabel)
    }

}
