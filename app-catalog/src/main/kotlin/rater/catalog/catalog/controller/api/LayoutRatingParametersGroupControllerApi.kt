package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.LayoutRatingParametersGroup
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

@Api(value = "LayoutRatingParametersGroupController", tags = ["LayoutRatingParametersGroupController"], description = "the LayoutRatingParametersGroupController API")
interface LayoutRatingParametersGroupControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE29", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/layout-rating-parameters-groups/bulk")
	fun deleteAllUsingDELETE29(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<LayoutRatingParametersGroup>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE31", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/layout-rating-parameters-groups/{id}")
	fun deleteUsingDELETE31(
			@PathVariable("id") id: UUID): ResponseEntity<LayoutRatingParametersGroup> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET34", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/layout-rating-parameters-groups")
	fun getAllUsingGET34(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<LayoutRatingParametersGroup>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET35", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/layout-rating-parameters-groups/{id}")
	fun getByIdUsingGET35(
			@PathVariable("id") id: UUID): ResponseEntity<LayoutRatingParametersGroup> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST31", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/layout-rating-parameters-groups/bulk")
	fun saveAllUsingPOST31(
			@RequestBody layoutRatingParametersGroup: List<LayoutRatingParametersGroup>): ResponseEntity<List<LayoutRatingParametersGroup>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST30", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/layout-rating-parameters-groups")
	fun saveUsingPOST30(
			@RequestBody layoutRatingParametersGroup: LayoutRatingParametersGroup): ResponseEntity<LayoutRatingParametersGroup> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT30", notes = "", tags=["layout-rating-parameters-group-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/layout-rating-parameters-groups/{id}")
	fun updateUsingPUT30(
			@PathVariable("id") id: UUID,
			@RequestBody layoutRatingParametersGroup: LayoutRatingParametersGroup): ResponseEntity<LayoutRatingParametersGroup> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
