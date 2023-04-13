package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogLayout
import java.util.UUID
import rater.catalog.catalog.repository.CatalogLayoutControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogLayoutControllerService(
    repository: CatalogLayoutControllerRepository
) : AbstractService<CatalogLayout, CatalogLayoutControllerRepository>(repository)
