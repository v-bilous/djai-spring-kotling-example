package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogLcpConfiguration
import java.util.UUID
import rater.catalog.catalog.repository.CatalogLcpConfigurationControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogLcpConfigurationControllerService(
    repository: CatalogLcpConfigurationControllerRepository
) : AbstractService<CatalogLcpConfiguration, CatalogLcpConfigurationControllerRepository>(repository)
