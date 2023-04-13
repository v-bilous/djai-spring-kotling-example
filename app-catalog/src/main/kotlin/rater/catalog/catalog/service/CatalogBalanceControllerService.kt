package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBalance
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBalanceControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBalanceControllerService(
    repository: CatalogBalanceControllerRepository
) : AbstractService<CatalogBalance, CatalogBalanceControllerRepository>(repository)
