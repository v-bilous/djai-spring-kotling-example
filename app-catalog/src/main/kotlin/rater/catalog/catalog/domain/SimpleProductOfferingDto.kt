package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogBalanceDto
import rater.catalog.catalog.domain.CatalogLimit
import rater.catalog.catalog.domain.CatalogProductDto
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param allowance 
* @param customFields 
* @param limit 
* @param name 
* @param product 
* @param type 
* @param usageBalance 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("allowance", "customFields", "id", "limit", "name", "product", "type", "usageBalance")

@Entity
@Table(name = "simple_product_offering_dto")
data class SimpleProductOfferingDto(

	@Column(name = "allowance")
	var allowance: Long?,

	@Column(name = "custom_fields")
	var customFields: String?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "limit_", referencedColumnName = "id")
	var limit: CatalogLimit?,

	@Column(name = "name")
	var name: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "product", referencedColumnName = "id")
	var product: CatalogProductDto?,

	@Column(name = "type")
	var type: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "usage_balance", referencedColumnName = "id")
	var usageBalance: CatalogBalanceDto?

) : BaseDomain()

