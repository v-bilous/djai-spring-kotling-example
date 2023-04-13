package rater.catalog.catalog.service

import rater.catalog.catalog.domain.ProductOfferingView
import java.util.UUID
import rater.catalog.catalog.repository.ProductOfferingViewControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class ProductOfferingViewControllerService(
    repository: ProductOfferingViewControllerRepository
) : AbstractService<ProductOfferingView, ProductOfferingViewControllerRepository>(repository)
