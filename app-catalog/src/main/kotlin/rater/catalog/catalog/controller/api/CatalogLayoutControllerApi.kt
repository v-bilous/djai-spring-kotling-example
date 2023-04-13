package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogLayout
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

@Api(value = "CatalogLayoutController", tags = ["CatalogLayoutController"], description = "the CatalogLayoutController API")
interface CatalogLayoutControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE11", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/layouts/bulk")
	fun deleteAllUsingDELETE11(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogLayout>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE11", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/layouts/{id}")
	fun deleteUsingDELETE11(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "downloadFile", nickname = "downloadFileUsingGET", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/layouts/{id}/download")
	fun downloadFileUsingGET(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET12", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/layouts")
	fun getAllUsingGET12(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogLayout>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET13", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/layouts/{id}")
	fun getByIdUsingGET13(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogLayout> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST11", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/layouts/bulk")
	fun saveAllUsingPOST11(
			@RequestBody catalogLayout: List<CatalogLayout>): ResponseEntity<List<CatalogLayout>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST11", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/layouts")
	fun saveUsingPOST11(
			@RequestBody catalogLayout: CatalogLayout): ResponseEntity<CatalogLayout> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT11", notes = "", tags=["catalog-layout-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/layouts/{id}")
	fun updateUsingPUT11(
			@PathVariable("id") id: UUID,
			@RequestBody catalogLayout: CatalogLayout): ResponseEntity<CatalogLayout> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
