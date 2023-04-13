package rater.catalog.catalog.domain

import rater.catalog.catalog.domain.PriceItemEntryDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currency 
* @param priceItem 
* @param repetitions 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currency", "priceItem", "repetitions", "value")

@Embeddable
data class TariffStepEntryDto(

	@Column(name = "currency")
	var currency: String?,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "price_item_currency")),
		AttributeOverride(name = "value", column = Column(name = "price_item_value_")),
	)
	@Embedded
	var priceItem: PriceItemEntryDto,

	@Column(name = "repetitions")
	var repetitions: Int?,

	@Column(name = "value_")
	var value: Long?

) 

