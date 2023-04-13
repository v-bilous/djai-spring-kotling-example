package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogOfferLabelDto
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

@Api(value = "CatalogOfferLabelViewController", tags = ["CatalogOfferLabelViewController"], description = "the CatalogOfferLabelViewController API")
interface CatalogOfferLabelViewControllerApi {

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET16", notes = "", tags=["catalog-offer-label-view-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/offer-labels/full")
	fun getAllUsingGET16(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogOfferLabelDto>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET17", notes = "", tags=["catalog-offer-label-view-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/offer-labels/{id}/full")
	fun getByIdUsingGET17(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogOfferLabelDto> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
