package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingActionSet
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingActionSetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingActionSetControllerService(
    repository: CatalogBillingActionSetControllerRepository
) : AbstractService<CatalogBillingActionSet, CatalogBillingActionSetControllerRepository>(repository)
