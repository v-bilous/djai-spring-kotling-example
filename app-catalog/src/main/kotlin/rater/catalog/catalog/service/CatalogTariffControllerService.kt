package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogTariff
import java.util.UUID
import rater.catalog.catalog.repository.CatalogTariffControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogTariffControllerService(
    repository: CatalogTariffControllerRepository
) : AbstractService<CatalogTariff, CatalogTariffControllerRepository>(repository)
