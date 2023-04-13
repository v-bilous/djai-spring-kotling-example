package rater.catalog.catalog.controller.api

import rater.catalog.catalog.domain.ProductOfferingView
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

@Api(value = "ProductOfferingViewController", tags = ["ProductOfferingViewController"], description = "the ProductOfferingViewController API")
interface ProductOfferingViewControllerApi {

	@ApiOperation(value = "getViewById", nickname = "getViewByIdUsingGET", notes = "", tags=["product-offering-view-controller"])
	@ApiResponses(
		ApiResponse(code = 200, message = "OK"),
		ApiResponse(code = 401, message = "Unauthorized"),
		ApiResponse(code = 403, message = "Forbidden"),
		ApiResponse(code = 404, message = "Not Found")
	)
	@GetMapping("/offerings/view/{id}")
	fun getViewByIdUsingGET(
			@PathVariable("id") id: UUID): ResponseEntity<ProductOfferingView> {
		return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
	}

}
