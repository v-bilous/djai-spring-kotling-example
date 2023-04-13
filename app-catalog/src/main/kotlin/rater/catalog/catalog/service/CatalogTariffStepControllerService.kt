package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogTariffStep
import java.util.UUID
import rater.catalog.catalog.repository.CatalogTariffStepControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogTariffStepControllerService(
    repository: CatalogTariffStepControllerRepository
) : AbstractService<CatalogTariffStep, CatalogTariffStepControllerRepository>(repository)
