package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingTax
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingTaxControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingTaxControllerService(
    repository: CatalogBillingTaxControllerRepository
) : AbstractService<CatalogBillingTax, CatalogBillingTaxControllerRepository>(repository)
