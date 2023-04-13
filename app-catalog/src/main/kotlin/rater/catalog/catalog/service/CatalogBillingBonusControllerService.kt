package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingBonus
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingBonusControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingBonusControllerService(
    repository: CatalogBillingBonusControllerRepository
) : AbstractService<CatalogBillingBonus, CatalogBillingBonusControllerRepository>(repository)
