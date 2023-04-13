package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogCalendar
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

@Api(value = "CatalogCalendarController", tags = ["CatalogCalendarController"], description = "the CatalogCalendarController API")
interface CatalogCalendarControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE9", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/calendars/bulk")
	fun deleteAllUsingDELETE9(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogCalendar>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE9", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/calendars/{id}")
	fun deleteUsingDELETE9(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendar> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET10", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/calendars")
	fun getAllUsingGET10(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogCalendar>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET11", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/calendars/{id}")
	fun getByIdUsingGET11(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogCalendar> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST9", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/calendars/bulk")
	fun saveAllUsingPOST9(
			@RequestBody catalogCalendar: List<CatalogCalendar>): ResponseEntity<List<CatalogCalendar>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST9", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/calendars")
	fun saveUsingPOST9(
			@RequestBody catalogCalendar: CatalogCalendar): ResponseEntity<CatalogCalendar> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT9", notes = "", tags=["catalog-calendar-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/calendars/{id}")
	fun updateUsingPUT9(
			@PathVariable("id") id: UUID,
			@RequestBody catalogCalendar: CatalogCalendar): ResponseEntity<CatalogCalendar> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
