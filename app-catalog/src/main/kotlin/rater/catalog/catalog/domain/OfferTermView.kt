package rater.catalog.catalog.domain

import java.util.Date
import java.util.UUID
import rater.catalog.catalog.domain.TariffPlanView
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param allowance 
* @param allowanceCurrency 
* @param allowanceRenewalStrategy 
* @param effectiveDateFrom 
* @param effectiveDateTo 
* @param expirationPeriodType 
* @param expirationPeriodUnits 
* @param offerPriority 
* @param offerRenewalStrategy 
* @param recurringType 
* @param tariffPlan 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("allowance", "allowanceCurrency", "allowanceRenewalStrategy", "effectiveDateFrom", "effectiveDateTo", "expirationPeriodType", "expirationPeriodUnits", "id", "offerPriority", "offerRenewalStrategy", "recurringType", "tariffPlan", "type")

@Entity
@Table(name = "offer_term_view")
data class OfferTermView(

	@Column(name = "allowance")
	var allowance: Long?,

	@Column(name = "allowance_currency")
	var allowanceCurrency: String?,

	@Column(name = "allowance_renewal_strategy")
	var allowanceRenewalStrategy: String,

	@Column(name = "effective_date_from")
	var effectiveDateFrom: Date,

	@Column(name = "effective_date_to")
	var effectiveDateTo: Date?,

	@Column(name = "expiration_period_type")
	var expirationPeriodType: String?,

	@Column(name = "expiration_period_units")
	var expirationPeriodUnits: Int?,

	@Column(name = "offer_priority")
	var offerPriority: Int,

	@Column(name = "offer_renewal_strategy")
	var offerRenewalStrategy: String,

	@Column(name = "recurring_type")
	var recurringType: String?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "tariff_plan", referencedColumnName = "id")
	var tariffPlan: TariffPlanView?,

	@Column(name = "type")
	var type: String

) : BaseDomain()

