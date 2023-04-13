package rater.catalog.catalog.domain

import rater.catalog.catalog.domain.PriceItemDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currency 
* @param priceItem 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currency", "priceItem", "value")

@Embeddable
data class TariffStepDto(

	@Column(name = "currency")
	var currency: String?,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "price_item_currency")),
		AttributeOverride(name = "value", column = Column(name = "price_item_value_")),
	)
	@Embedded
	var priceItem: PriceItemDto,

	@Column(name = "value_")
	var value: Long

) 

