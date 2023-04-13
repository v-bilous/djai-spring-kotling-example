package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogCalendarProperties
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

@Api(value = "CatalogCalendarPropertiesController", tags = ["CatalogCalendarPropertiesController"], description = "the CatalogCalendarPropertiesController API")
interface CatalogCalendarPropertiesControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE10", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/calendars/{parentId}/properties/bulk")
	fun deleteAllUsingDELETE10(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogCalendarProperties>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE10", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/calendars/{parentId}/properties/{id}")
	fun deleteUsingDELETE10(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET11", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/calendars/{parentId}/properties")
	fun getAllUsingGET11(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogCalendarProperties>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET12", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/calendars/{parentId}/properties/{id}")
	fun getByIdUsingGET12(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET2", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/calendars/properties/{id}")
	fun getByIdUsingGET2(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendarProperties> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST10", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/calendars/{parentId}/properties/bulk")
	fun saveAllUsingPOST10(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogCalendarProperties: List<CatalogCalendarProperties>): ResponseEntity<List<CatalogCalendarProperties>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST10", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/calendars/{parentId}/properties")
	fun saveUsingPOST10(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogCalendarProperties: CatalogCalendarProperties): ResponseEntity<CatalogCalendarProperties> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT10", notes = "", tags=["catalog-calendar-properties-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/calendars/{parentId}/properties/{id}")
	fun updateUsingPUT10(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID,
			@RequestBody catalogCalendarProperties: CatalogCalendarProperties): ResponseEntity<CatalogCalendarProperties> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
