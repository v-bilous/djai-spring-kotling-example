package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogPriceItem
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

@Api(value = "CatalogPriceItemController", tags = ["CatalogPriceItemController"], description = "the CatalogPriceItemController API")
interface CatalogPriceItemControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE15", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/price-items/bulk")
	fun deleteAllUsingDELETE15(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogPriceItem>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE15", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/price-items/{id}")
	fun deleteUsingDELETE15(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogPriceItem> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET18", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/price-items")
	fun getAllUsingGET18(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogPriceItem>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET20", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/price-items/{id}")
	fun getByIdUsingGET20(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogPriceItem> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST15", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/price-items/bulk")
	fun saveAllUsingPOST15(
			@RequestBody catalogPriceItem: List<CatalogPriceItem>): ResponseEntity<List<CatalogPriceItem>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST16", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/price-items")
	fun saveUsingPOST16(
			@RequestBody catalogPriceItem: CatalogPriceItem): ResponseEntity<CatalogPriceItem> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT15", notes = "", tags=["catalog-price-item-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/price-items/{id}")
	fun updateUsingPUT15(
			@PathVariable("id") id: UUID,
			@RequestBody catalogPriceItem: CatalogPriceItem): ResponseEntity<CatalogPriceItem> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
