package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.CatalogTariffStep
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

@Api(value = "CatalogTariffStepController", tags = ["CatalogTariffStepController"], description = "the CatalogTariffStepController API")
interface CatalogTariffStepControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE24", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/tariffs/{parentId}/steps/bulk")
	fun deleteAllUsingDELETE24(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<CatalogTariffStep>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE25", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/tariffs/{parentId}/steps/{id}")
	fun deleteUsingDELETE25(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET28", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/tariffs/{parentId}/steps")
	fun getAllUsingGET28(
			@PathVariable("parentId") parentId: UUID,
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<CatalogTariffStep>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET29", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/tariffs/{parentId}/steps/{id}")
	fun getByIdUsingGET29(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET37", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/tariffs/steps/{id}")
	fun getByIdUsingGET37(
			@PathVariable("id") id: UUID): ResponseEntity<CatalogTariffStep> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST24", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/tariffs/{parentId}/steps/bulk")
	fun saveAllUsingPOST24(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogTariffStep: List<CatalogTariffStep>): ResponseEntity<List<CatalogTariffStep>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST25", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/tariffs/{parentId}/steps")
	fun saveUsingPOST25(
			@PathVariable("parentId") parentId: UUID,
			@RequestBody catalogTariffStep: CatalogTariffStep): ResponseEntity<CatalogTariffStep> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT24", notes = "", tags=["catalog-tariff-step-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/tariffs/{parentId}/steps/{id}")
	fun updateUsingPUT24(
			@PathVariable("parentId") parentId: UUID,
			@PathVariable("id") id: UUID,
			@RequestBody catalogTariffStep: CatalogTariffStep): ResponseEntity<CatalogTariffStep> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
