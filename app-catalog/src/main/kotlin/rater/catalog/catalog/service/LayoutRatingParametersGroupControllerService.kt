package rater.catalog.catalog.service

import rater.catalog.catalog.domain.LayoutRatingParametersGroup
import java.util.UUID
import rater.catalog.catalog.repository.LayoutRatingParametersGroupControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class LayoutRatingParametersGroupControllerService(
    repository: LayoutRatingParametersGroupControllerRepository
) : AbstractService<LayoutRatingParametersGroup, LayoutRatingParametersGroupControllerRepository>(repository)
