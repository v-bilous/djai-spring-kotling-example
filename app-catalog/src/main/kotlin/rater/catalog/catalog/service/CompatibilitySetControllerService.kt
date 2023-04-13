package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CompatibilitySet
import java.util.UUID
import rater.catalog.catalog.repository.CompatibilitySetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CompatibilitySetControllerService(
    repository: CompatibilitySetControllerRepository
) : AbstractService<CompatibilitySet, CompatibilitySetControllerRepository>(repository)
