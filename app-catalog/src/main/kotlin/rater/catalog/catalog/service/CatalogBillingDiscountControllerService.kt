package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingDiscount
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingDiscountControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingDiscountControllerService(
    repository: CatalogBillingDiscountControllerRepository
) : AbstractService<CatalogBillingDiscount, CatalogBillingDiscountControllerRepository>(repository)
