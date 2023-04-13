package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLcpConfiguration
import java.util.UUID
import rater.catalog.catalog.service.CatalogLcpConfigurationControllerService
import rater.catalog.catalog.controller.api.CatalogLcpConfigurationControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class CatalogLcpConfigurationControllerController(service: CatalogLcpConfigurationControllerService)
    : AbstractController<CatalogLcpConfiguration, CatalogLcpConfigurationControllerService>(service), CatalogLcpConfigurationControllerApi {


    override fun deleteAllUsingDELETE12(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogLcpConfiguration>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE12(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLcpConfiguration> {
        return super.delete(id)
    }

    override fun findByLcpTemplateIdUsingGET(
			@PathVariable("lcpTemplateId") lcpTemplateId: UUID): ResponseEntity<CatalogLcpConfiguration> {
        return super.getById(lcpTemplateId)
    }

    override fun getAllUsingGET13(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogLcpConfiguration>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET14(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLcpConfiguration> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST12(
			@RequestBody catalogLcpConfiguration: List<CatalogLcpConfiguration>): ResponseEntity<List<CatalogLcpConfiguration>> {
        return ResponseEntity.ok(super.saveAll(catalogLcpConfiguration))
    }

    override fun saveUsingPOST12(
			@RequestBody catalogLcpConfiguration: CatalogLcpConfiguration): ResponseEntity<CatalogLcpConfiguration> {
        return super.create(catalogLcpConfiguration)
    }

    override fun updateUsingPUT12(
			@PathVariable("id") id: UUID,
			@RequestBody catalogLcpConfiguration: CatalogLcpConfiguration): ResponseEntity<CatalogLcpConfiguration> {
        return super.update(id, catalogLcpConfiguration)
    }

}
