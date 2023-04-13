package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogProvider
import java.util.UUID
import rater.catalog.catalog.repository.CatalogProviderControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogProviderControllerService(
    repository: CatalogProviderControllerRepository
) : AbstractService<CatalogProvider, CatalogProviderControllerRepository>(repository)
