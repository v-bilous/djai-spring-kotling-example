package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currencyId 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currencyId", "id", "value")

@Entity
@Table(name = "offer_price_view")
data class OfferPriceView(

	@Column(name = "currency_id")
	var currencyId: String,

	@Column(name = "value_")
	var value: Long

) : BaseDomain()

