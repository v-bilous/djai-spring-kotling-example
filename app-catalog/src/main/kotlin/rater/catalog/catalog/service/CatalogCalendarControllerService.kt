package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogCalendar
import java.util.UUID
import rater.catalog.catalog.repository.CatalogCalendarControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogCalendarControllerService(
    repository: CatalogCalendarControllerRepository
) : AbstractService<CatalogCalendar, CatalogCalendarControllerRepository>(repository)
