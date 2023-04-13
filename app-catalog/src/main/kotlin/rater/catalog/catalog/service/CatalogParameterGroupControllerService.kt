package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogParameterGroup
import java.util.UUID
import rater.catalog.catalog.repository.CatalogParameterGroupControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogParameterGroupControllerService(
    repository: CatalogParameterGroupControllerRepository
) : AbstractService<CatalogParameterGroup, CatalogParameterGroupControllerRepository>(repository)
