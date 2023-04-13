package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogRatingParameterSet
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

@Api(value = "CatalogRatingParameterSetController", tags = ["CatalogRatingParameterSetController"], description = "the CatalogRatingParameterSetController API")
interface CatalogRatingParameterSetControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE20", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/rating-parameter-sets/bulk")
	fun deleteAllUsingDELETE20(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogRatingParameterSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE21", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/rating-parameter-sets/{id}")
	fun deleteUsingDELETE21(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogRatingParameterSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET24", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/rating-parameter-sets")
	fun getAllUsingGET24(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogRatingParameterSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET25", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/rating-parameter-sets/{id}")
	fun getByIdUsingGET25(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogRatingParameterSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST20", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/rating-parameter-sets/bulk")
	fun saveAllUsingPOST20(
			@RequestBody catalogRatingParameterSet: List<CatalogRatingParameterSet>): ResponseEntity<List<CatalogRatingParameterSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST21", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/rating-parameter-sets")
	fun saveUsingPOST21(
			@RequestBody catalogRatingParameterSet: CatalogRatingParameterSet): ResponseEntity<CatalogRatingParameterSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT20", notes = "", tags=["catalog-rating-parameter-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/rating-parameter-sets/{id}")
	fun updateUsingPUT20(
			@PathVariable("id") id: UUID,
			@RequestBody catalogRatingParameterSet: CatalogRatingParameterSet): ResponseEntity<CatalogRatingParameterSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
