package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogRatingParameterSet
import java.util.UUID
import rater.catalog.catalog.repository.CatalogRatingParameterSetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogRatingParameterSetControllerService(
    repository: CatalogRatingParameterSetControllerRepository
) : AbstractService<CatalogRatingParameterSet, CatalogRatingParameterSetControllerRepository>(repository)
