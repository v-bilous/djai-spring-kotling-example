package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogTariffPlan
import java.util.UUID
import rater.catalog.catalog.repository.CatalogTariffPlanControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogTariffPlanControllerService(
    repository: CatalogTariffPlanControllerRepository
) : AbstractService<CatalogTariffPlan, CatalogTariffPlanControllerRepository>(repository)
