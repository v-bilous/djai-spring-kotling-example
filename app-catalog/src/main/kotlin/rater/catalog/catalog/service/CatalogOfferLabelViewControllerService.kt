package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogOfferLabelDto
import java.util.UUID
import rater.catalog.catalog.repository.CatalogOfferLabelViewControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogOfferLabelViewControllerService(
    repository: CatalogOfferLabelViewControllerRepository
) : AbstractService<CatalogOfferLabelDto, CatalogOfferLabelViewControllerRepository>(repository)
