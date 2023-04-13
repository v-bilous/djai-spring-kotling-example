package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogProduct
import java.util.UUID
import rater.catalog.catalog.repository.CatalogProductControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogProductControllerService(
    repository: CatalogProductControllerRepository
) : AbstractService<CatalogProduct, CatalogProductControllerRepository>(repository)
