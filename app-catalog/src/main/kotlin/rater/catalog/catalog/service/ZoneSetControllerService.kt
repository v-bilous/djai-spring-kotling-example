package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogZoneSet
import java.util.UUID
import rater.catalog.catalog.repository.ZoneSetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class ZoneSetControllerService(
    repository: ZoneSetControllerRepository
) : AbstractService<CatalogZoneSet, ZoneSetControllerRepository>(repository)
