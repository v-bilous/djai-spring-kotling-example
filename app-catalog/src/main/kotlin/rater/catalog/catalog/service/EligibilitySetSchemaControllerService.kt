package rater.catalog.catalog.service

import rater.catalog.catalog.domain.EligibilitySetSchema
import java.util.UUID
import rater.catalog.catalog.repository.EligibilitySetSchemaControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class EligibilitySetSchemaControllerService(
    repository: EligibilitySetSchemaControllerRepository
) : AbstractService<EligibilitySetSchema, EligibilitySetSchemaControllerRepository>(repository)
