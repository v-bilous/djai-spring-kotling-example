package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogLcpConfiguration
import java.util.UUID
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import io.swagger.annotations.ApiParam
import org.springframework.http.HttpStatus
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Api(value = "CatalogLcpConfigurationController", tags = ["CatalogLcpConfigurationController"], description = "the CatalogLcpConfigurationController API")
interface CatalogLcpConfigurationControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE12", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/lcp-configurations/bulk")
	fun deleteAllUsingDELETE12(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogLcpConfiguration>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE12", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/lcp-configurations/{id}")
	fun deleteUsingDELETE12(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLcpConfiguration> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "findByLcpTemplateId", nickname = "findByLcpTemplateIdUsingGET", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/lcp-configurations/template/{lcpTemplateId}")
	fun findByLcpTemplateIdUsingGET(
			@PathVariable("lcpTemplateId") lcpTemplateId: UUID): ResponseEntity<CatalogLcpConfiguration> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET13", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/lcp-configurations")
	fun getAllUsingGET13(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogLcpConfiguration>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET14", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/lcp-configurations/{id}")
	fun getByIdUsingGET14(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLcpConfiguration> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST12", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/lcp-configurations/bulk")
	fun saveAllUsingPOST12(
			@RequestBody catalogLcpConfiguration: List<CatalogLcpConfiguration>): ResponseEntity<List<CatalogLcpConfiguration>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST12", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/lcp-configurations")
	fun saveUsingPOST12(
			@RequestBody catalogLcpConfiguration: CatalogLcpConfiguration): ResponseEntity<CatalogLcpConfiguration> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT12", notes = "", tags=["catalog-lcp-configuration-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/lcp-configurations/{id}")
	fun updateUsingPUT12(
			@PathVariable("id") id: UUID,
			@RequestBody catalogLcpConfiguration: CatalogLcpConfiguration): ResponseEntity<CatalogLcpConfiguration> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
