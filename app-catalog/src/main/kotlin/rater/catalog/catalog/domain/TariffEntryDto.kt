package rater.catalog.catalog.domain

import rater.catalog.catalog.domain.TariffStepEntryDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param step 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("name", "step", "type")

@Embeddable
data class TariffEntryDto(

	@Column(name = "name")
	var name: String?,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "step_currency")),
		AttributeOverride(name = "priceItem.currency", column = Column(name = "step_price_item_currency")),
		AttributeOverride(name = "priceItem.value", column = Column(name = "step_price_item_value_")),
		AttributeOverride(name = "repetitions", column = Column(name = "step_repetitions")),
		AttributeOverride(name = "value", column = Column(name = "step_value_")),
	)
	@Embedded
	var step: TariffStepEntryDto?,

	@Column(name = "type")
	var type: String

) 

