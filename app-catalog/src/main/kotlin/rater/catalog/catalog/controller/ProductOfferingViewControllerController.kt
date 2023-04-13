package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.ProductOfferingView
import java.util.UUID
import rater.catalog.catalog.service.ProductOfferingViewControllerService
import rater.catalog.catalog.controller.api.ProductOfferingViewControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class ProductOfferingViewControllerController(service: ProductOfferingViewControllerService)
    : AbstractController<ProductOfferingView, ProductOfferingViewControllerService>(service), ProductOfferingViewControllerApi {


    override fun getViewByIdUsingGET(
			@PathVariable("id") id: UUID): ResponseEntity<ProductOfferingView> {
        return super.getById(id)
    }

}
