package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogBillingDiscountSet
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

@Api(value = "CatalogBillingDiscountSetController", tags = ["CatalogBillingDiscountSetController"], description = "the CatalogBillingDiscountSetController API")
interface CatalogBillingDiscountSetControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE6", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/billing-discount-sets/bulk")
	fun deleteAllUsingDELETE6(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogBillingDiscountSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE6", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/billing-discount-sets/{id}")
	fun deleteUsingDELETE6(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscountSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET7", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/billing-discount-sets")
	fun getAllUsingGET7(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogBillingDiscountSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET8", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/billing-discount-sets/{id}")
	fun getByIdUsingGET8(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogBillingDiscountSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST6", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/billing-discount-sets/bulk")
	fun saveAllUsingPOST6(
			@RequestBody catalogBillingDiscountSet: List<CatalogBillingDiscountSet>): ResponseEntity<List<CatalogBillingDiscountSet>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST6", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/billing-discount-sets")
	fun saveUsingPOST6(
			@RequestBody catalogBillingDiscountSet: CatalogBillingDiscountSet): ResponseEntity<CatalogBillingDiscountSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT6", notes = "", tags=["catalog-billing-discount-set-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/billing-discount-sets/{id}")
	fun updateUsingPUT6(
			@PathVariable("id") id: UUID,
			@RequestBody catalogBillingDiscountSet: CatalogBillingDiscountSet): ResponseEntity<CatalogBillingDiscountSet> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
