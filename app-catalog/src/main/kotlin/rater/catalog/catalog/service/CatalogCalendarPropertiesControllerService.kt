package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogCalendarProperties
import java.util.UUID
import rater.catalog.catalog.repository.CatalogCalendarPropertiesControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogCalendarPropertiesControllerService(
    repository: CatalogCalendarPropertiesControllerRepository
) : AbstractService<CatalogCalendarProperties, CatalogCalendarPropertiesControllerRepository>(repository)
