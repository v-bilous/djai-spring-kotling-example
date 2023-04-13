package rater.catalog.catalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@SpringBootApplication(scanBasePackages = ["rater.catalog.catalog", "rater.catalog.config"])
@EntityScan(value = ["rater.catalog.catalog.domain", "rater.catalog.domain"])
class CatalogApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<CatalogApplication>(*args)
}
