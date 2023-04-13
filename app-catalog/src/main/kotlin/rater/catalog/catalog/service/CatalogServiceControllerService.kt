package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogService
import java.util.UUID
import rater.catalog.catalog.repository.CatalogServiceControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogServiceControllerService(
    repository: CatalogServiceControllerRepository
) : AbstractService<CatalogService, CatalogServiceControllerRepository>(repository)
