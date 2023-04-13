package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogPriceItem
import java.util.UUID
import rater.catalog.catalog.repository.CatalogPriceItemControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogPriceItemControllerService(
    repository: CatalogPriceItemControllerRepository
) : AbstractService<CatalogPriceItem, CatalogPriceItemControllerRepository>(repository)
