package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogLcpTemplate
import java.util.UUID
import rater.catalog.catalog.repository.CatalogLcpTemplateControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogLcpTemplateControllerService(
    repository: CatalogLcpTemplateControllerRepository
) : AbstractService<CatalogLcpTemplate, CatalogLcpTemplateControllerRepository>(repository)
