package rater.catalog.catalog.service

import rater.catalog.catalog.domain.EligibilitySet
import java.util.UUID
import rater.catalog.catalog.repository.EligibilitySetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class EligibilitySetControllerService(
    repository: EligibilitySetControllerRepository
) : AbstractService<EligibilitySet, EligibilitySetControllerRepository>(repository)
