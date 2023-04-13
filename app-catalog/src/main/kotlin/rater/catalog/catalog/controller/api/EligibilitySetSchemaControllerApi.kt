package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.EligibilitySetSchema
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

@Api(value = "EligibilitySetSchemaController", tags = ["EligibilitySetSchemaController"], description = "the EligibilitySetSchemaController API")
interface EligibilitySetSchemaControllerApi {

	@ApiOperation(value = "deleteAll", nickname = "deleteAllUsingDELETE27", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/eligibility-set-schemas/bulk")
	fun deleteAllUsingDELETE27(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<EligibilitySetSchema>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "delete", nickname = "deleteUsingDELETE29", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 204, message = "No Content"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden")
	)
	@DeleteMapping("/eligibility-set-schemas/{id}")
	fun deleteUsingDELETE29(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySetSchema> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getAll", nickname = "getAllUsingGET32", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/eligibility-set-schemas")
	fun getAllUsingGET32(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<EligibilitySetSchema>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "getById", nickname = "getByIdUsingGET33", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/eligibility-set-schemas/{id}")
	fun getByIdUsingGET33(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySetSchema> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "saveAll", nickname = "saveAllUsingPOST29", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/eligibility-set-schemas/bulk")
	fun saveAllUsingPOST29(
			@RequestBody eligibilitySetSchema: List<EligibilitySetSchema>): ResponseEntity<List<EligibilitySetSchema>> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "save", nickname = "saveUsingPOST28", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PostMapping("/eligibility-set-schemas")
	fun saveUsingPOST28(
			@RequestBody eligibilitySetSchema: EligibilitySetSchema): ResponseEntity<EligibilitySetSchema> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

	@ApiOperation(value = "update", nickname = "updateUsingPUT28", notes = "", tags=["eligibility-set-schema-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 201, message = "Created"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@PutMapping("/eligibility-set-schemas/{id}")
	fun updateUsingPUT28(
			@PathVariable("id") id: UUID,
			@RequestBody eligibilitySetSchema: EligibilitySetSchema): ResponseEntity<EligibilitySetSchema> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
