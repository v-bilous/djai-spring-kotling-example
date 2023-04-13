package rater.catalog.catalog.service

import rater.catalog.catalog.domain.Lookup
import java.util.UUID
import rater.catalog.catalog.repository.LookupControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class LookupControllerService(
    repository: LookupControllerRepository
) : AbstractService<Lookup, LookupControllerRepository>(repository)
