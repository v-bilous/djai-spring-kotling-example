package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogProductOfferingDto
import rater.catalog.catalog.domain.ProductOfferingWithNestedService
import java.util.UUID
import rater.catalog.catalog.repository.CatalogProductOfferingFullViewControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogProductOfferingFullViewControllerService(
    repository: CatalogProductOfferingFullViewControllerRepository
) : AbstractService<CatalogProductOfferingDto, CatalogProductOfferingFullViewControllerRepository>(repository)
