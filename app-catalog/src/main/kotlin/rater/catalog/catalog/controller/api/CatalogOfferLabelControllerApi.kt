package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogOfferLabel
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

@Api(value = "CatalogOfferLabelController", tags = ["CatalogOfferLabelController"], description = "the CatalogOfferLabelController API")
interface CatalogOfferLabelControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE13", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/offer-labels/bulk")
	fun deleteAllUsingDELETE13(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogOfferLabel>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE13", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/offer-labels/{id}")
	fun deleteUsingDELETE13(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogOfferLabel> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "duplicate", nickname = "duplicateUsingPOST", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/offer-labels/{id}/duplicate")
	fun duplicateUsingPOST(
			@PathVariable("id") id: UUID,
			@RequestParam(value = "attachToAll", required = false) attachToAll: Boolean?,
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET15", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/offer-labels")
	fun getAllUsingGET15(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogOfferLabel>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET16", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/offer-labels/{id}")
	fun getByIdUsingGET16(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogOfferLabel> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST13", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/offer-labels/bulk")
	fun saveAllUsingPOST13(
			@RequestBody catalogOfferLabel: List<CatalogOfferLabel>): ResponseEntity<List<CatalogOfferLabel>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST14", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/offer-labels")
	fun saveUsingPOST14(
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT13", notes = "", tags=["catalog-offer-label-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/offer-labels/{id}")
	fun updateUsingPUT13(
			@PathVariable("id") id: UUID,
			@RequestBody catalogOfferLabel: CatalogOfferLabel): ResponseEntity<CatalogOfferLabel> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
