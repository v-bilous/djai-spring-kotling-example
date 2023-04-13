package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogPriceItem
import java.util.UUID
import rater.catalog.catalog.service.CatalogPriceItemControllerService
import rater.catalog.catalog.controller.api.CatalogPriceItemControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogPriceItemControllerController(service: CatalogPriceItemControllerService)
    : AbstractController<CatalogPriceItem, CatalogPriceItemControllerService>(service), CatalogPriceItemControllerApi {


    override fun deleteAllUsingDELETE15(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogPriceItem>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE15(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogPriceItem> {
        return super.delete(id)
    }

    override fun getAllUsingGET18(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogPriceItem>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET20(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogPriceItem> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST15(
			@RequestBody catalogPriceItem: List<CatalogPriceItem>): ResponseEntity<List<CatalogPriceItem>> {
        return ResponseEntity.ok(super.saveAll(catalogPriceItem))
    }

    override fun saveUsingPOST16(
			@RequestBody catalogPriceItem: CatalogPriceItem): ResponseEntity<CatalogPriceItem> {
        return super.create(catalogPriceItem)
    }

    override fun updateUsingPUT15(
			@PathVariable("id") id: UUID,
			@RequestBody catalogPriceItem: CatalogPriceItem): ResponseEntity<CatalogPriceItem> {
        return super.update(id, catalogPriceItem)
    }

}
