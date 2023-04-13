package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.IndividualEligibilityDto
import rater.catalog.catalog.domain.IndividualNestedOfferDto
import rater.catalog.catalog.domain.IndividualOfferPoolPlanDto
import rater.catalog.catalog.domain.IndividualOfferPriceDto
import rater.catalog.catalog.domain.IndividualOfferTermDto
import rater.catalog.catalog.domain.OfferLimit
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param cardinality 
* @param customFields 
* @param description 
* @param individualEligibility 
* @param limit 
* @param linkedOffers 
* @param name 
* @param nestedOffers 
* @param offerTemplateId 
* @param offerTerm 
* @param periodicBalanceId 
* @param poolPlan 
* @param price 
* @param usageBalanceId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("cardinality", "customFields", "description", "id", "individualEligibility", "limit", "linkedOffers", "name", "nestedOffers", "offerTemplateId", "offerTerm", "periodicBalanceId", "poolPlan", "price", "usageBalanceId")

@Entity
@Table(name = "individual_offer_dto")
data class IndividualOfferDto(

	@Column(name = "cardinality")
	var cardinality: Int?,

	@Column(name = "custom_fields")
	var customFields: String?,

	@Column(name = "description")
	var description: String?,

	@AttributeOverrides(
		AttributeOverride(name = "customerAccountId", column = Column(name = "individual_eligibility_customer_account_id")),
		AttributeOverride(name = "planType", column = Column(name = "individual_eligibility_plan_type")),
	)
	@Embedded
	var individualEligibility: IndividualEligibilityDto,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "limit__currency")),
		AttributeOverride(name = "value", column = Column(name = "limit__value_")),
	)
	@Embedded
	var limit: OfferLimit?,

	@Column(name = "linked_offers")
	var linkedOffers: String?,

	@Column(name = "name")
	var name: String?,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "individual_nested_offer_dto_to_individual_offer_dto",
			joinColumns = [JoinColumn(name = "individual_offer_dto_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "individual_nested_offer_dto_id", referencedColumnName = "id")]
	)
	var nestedOffers: Set<IndividualNestedOfferDto>?,

	@Column(name = "offer_template_id")
	var offerTemplateId: UUID,

	@AttributeOverrides(
		AttributeOverride(name = "allowance", column = Column(name = "offer_term_allowance")),
		AttributeOverride(name = "allowanceRenewalStrategy", column = Column(name = "offer_term_allowance_renewal_strategy")),
		AttributeOverride(name = "currency", column = Column(name = "offer_term_currency")),
		AttributeOverride(name = "effectiveDateFrom", column = Column(name = "offer_term_effective_date_from")),
		AttributeOverride(name = "effectiveDateTo", column = Column(name = "offer_term_effective_date_to")),
		AttributeOverride(name = "isRemoveAfterBalanceDepletion", column = Column(name = "offer_term_is_remove_after_balance_depletion")),
		AttributeOverride(name = "offerRenewalStrategy", column = Column(name = "offer_term_offer_renewal_strategy")),
		AttributeOverride(name = "priority", column = Column(name = "offer_term_priority")),
		AttributeOverride(name = "recurringType.isCalendar", column = Column(name = "offer_term_recurring_type_is_calendar")),
		AttributeOverride(name = "recurringType.isProrated", column = Column(name = "offer_term_recurring_type_is_prorated")),
		AttributeOverride(name = "recurringType.type", column = Column(name = "offer_term_recurring_type_type")),
		AttributeOverride(name = "recurringType.units", column = Column(name = "offer_term_recurring_type_units")),
		AttributeOverride(name = "recurringType.value", column = Column(name = "offer_term_recurring_type_value_")),
	)
	@Embedded
	var offerTerm: IndividualOfferTermDto?,

	@Column(name = "periodic_balance_id")
	var periodicBalanceId: UUID?,

	@AttributeOverrides(
		AttributeOverride(name = "maxSubscribers", column = Column(name = "pool_plan_max_subscribers")),
		AttributeOverride(name = "type", column = Column(name = "pool_plan_type")),
	)
	@Embedded
	var poolPlan: IndividualOfferPoolPlanDto?,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "price_currency")),
		AttributeOverride(name = "value", column = Column(name = "price_value_")),
	)
	@Embedded
	var price: IndividualOfferPriceDto?,

	@Column(name = "usage_balance_id")
	var usageBalanceId: UUID?

) : BaseResource()

