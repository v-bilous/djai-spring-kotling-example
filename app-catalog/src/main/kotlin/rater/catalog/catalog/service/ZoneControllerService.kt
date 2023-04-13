package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogZone
import java.util.UUID
import rater.catalog.catalog.repository.ZoneControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class ZoneControllerService(
    repository: ZoneControllerRepository
) : AbstractService<CatalogZone, ZoneControllerRepository>(repository)
