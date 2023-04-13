package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogRatingParameter
import java.util.UUID
import rater.catalog.catalog.repository.CatalogRatingParameterControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogRatingParameterControllerService(
    repository: CatalogRatingParameterControllerRepository
) : AbstractService<CatalogRatingParameter, CatalogRatingParameterControllerRepository>(repository)
