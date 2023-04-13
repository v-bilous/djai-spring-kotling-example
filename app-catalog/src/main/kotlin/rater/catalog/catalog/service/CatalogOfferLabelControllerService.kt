package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogOfferLabel
import java.util.UUID
import rater.catalog.catalog.repository.CatalogOfferLabelControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogOfferLabelControllerService(
    repository: CatalogOfferLabelControllerRepository
) : AbstractService<CatalogOfferLabel, CatalogOfferLabelControllerRepository>(repository)
