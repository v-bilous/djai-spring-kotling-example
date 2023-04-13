package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.PriceItemView
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currencyId 
* @param name 
* @param nextStep 
* @param priceItem 
* @param repetitions 
* @param step 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currencyId", "id", "name", "nextStep", "priceItem", "repetitions", "step", "value")

@Entity
@Table(name = "tariff_step_view")
data class TariffStepView(

	@Column(name = "currency_id")
	var currencyId: String?,

	@Column(name = "name")
	var name: String,

	@Column(name = "next_step")
	var nextStep: Int?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "price_item", referencedColumnName = "id")
	var priceItem: PriceItemView,

	@Column(name = "repetitions")
	var repetitions: Int?,

	@Column(name = "step")
	var step: Int,

	@Column(name = "value_")
	var value: Long?

) : BaseDomain()

