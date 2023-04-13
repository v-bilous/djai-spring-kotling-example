package rater.catalog.catalog.domain

import java.math.BigDecimal
import java.util.UUID
import rater.catalog.catalog.domain.CatalogBillingDiscount
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currency 
* @param discount 
* @param from 
* @param to 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currency", "discount", "from", "id", "to", "value")

@Entity
@Table(name = "discount_step")
data class DiscountStep(

	@Column(name = "currency")
	var currency: String?,

	@Column(name = "discount")
	var discount: CatalogBillingDiscount?,

	@Column(name = "from_")
	var from: BigDecimal?,

	@Column(name = "to_")
	var to: BigDecimal?,

	@Column(name = "value_")
	var value: BigDecimal?

) : BaseDomain()

