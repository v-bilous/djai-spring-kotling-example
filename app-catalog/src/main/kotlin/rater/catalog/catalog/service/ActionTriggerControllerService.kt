package rater.catalog.catalog.service

import rater.catalog.catalog.domain.ActionTrigger
import rater.catalog.catalog.repository.ActionTriggerControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class ActionTriggerControllerService(
    repository: ActionTriggerControllerRepository
) : AbstractService<ActionTrigger, ActionTriggerControllerRepository>(repository)
