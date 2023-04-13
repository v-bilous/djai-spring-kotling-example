package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingTaxSet
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingTaxSetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingTaxSetControllerService(
    repository: CatalogBillingTaxSetControllerRepository
) : AbstractService<CatalogBillingTaxSet, CatalogBillingTaxSetControllerRepository>(repository)
