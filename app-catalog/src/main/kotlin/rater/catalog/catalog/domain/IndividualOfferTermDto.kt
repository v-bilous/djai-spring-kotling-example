package rater.catalog.catalog.domain

import java.math.BigDecimal
import rater.catalog.catalog.domain.IndividualRecurringTypeDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param allowance 
* @param allowanceRenewalStrategy 
* @param currency 
* @param effectiveDateFrom 
* @param effectiveDateTo 
* @param isRemoveAfterBalanceDepletion 
* @param offerRenewalStrategy 
* @param priority 
* @param recurringType 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("allowance", "allowanceRenewalStrategy", "currency", "effectiveDateFrom", "effectiveDateTo", "isRemoveAfterBalanceDepletion", "offerRenewalStrategy", "priority", "recurringType")

@Embeddable
data class IndividualOfferTermDto(

	@Column(name = "allowance")
	var allowance: BigDecimal?,

	@Column(name = "allowance_renewal_strategy")
	var allowanceRenewalStrategy: String?,

	@Column(name = "currency")
	var currency: String?,

	@Column(name = "effective_date_from")
	var effectiveDateFrom: String?,

	@Column(name = "effective_date_to")
	var effectiveDateTo: String?,

	@Column(name = "is_remove_after_balance_depletion")
	var isRemoveAfterBalanceDepletion: Boolean?,

	@Column(name = "offer_renewal_strategy")
	var offerRenewalStrategy: String?,

	@Column(name = "priority")
	var priority: Int?,

	@AttributeOverrides(
		AttributeOverride(name = "isCalendar", column = Column(name = "recurring_type_is_calendar")),
		AttributeOverride(name = "isProrated", column = Column(name = "recurring_type_is_prorated")),
		AttributeOverride(name = "type", column = Column(name = "recurring_type_type")),
		AttributeOverride(name = "units", column = Column(name = "recurring_type_units")),
		AttributeOverride(name = "value", column = Column(name = "recurring_type_value_")),
	)
	@Embedded
	var recurringType: IndividualRecurringTypeDto?

) 

