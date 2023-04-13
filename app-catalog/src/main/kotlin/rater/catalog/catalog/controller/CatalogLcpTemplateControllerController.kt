package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLcpTemplate
import java.util.UUID
import rater.catalog.catalog.service.CatalogLcpTemplateControllerService
import rater.catalog.catalog.controller.api.CatalogLcpTemplateControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogLcpTemplateControllerController(service: CatalogLcpTemplateControllerService)
    : AbstractController<CatalogLcpTemplate, CatalogLcpTemplateControllerService>(service), CatalogLcpTemplateControllerApi {


    override fun getAllUsingGET14(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogLcpTemplate>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET15(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLcpTemplate> {
        return super.getById(id)
    }

    override fun saveUsingPOST13(
			@RequestBody catalogLcpTemplate: CatalogLcpTemplate): ResponseEntity<CatalogLcpTemplate> {
        return super.create(catalogLcpTemplate)
    }

}
