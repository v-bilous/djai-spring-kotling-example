package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogProductOffering
import java.util.UUID
import rater.catalog.catalog.repository.CatalogProductOfferingControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogProductOfferingControllerService(
    repository: CatalogProductOfferingControllerRepository
) : AbstractService<CatalogProductOffering, CatalogProductOfferingControllerRepository>(repository)
