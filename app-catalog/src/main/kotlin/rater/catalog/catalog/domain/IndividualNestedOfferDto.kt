package rater.catalog.catalog.domain

import java.math.BigDecimal
import java.util.UUID
import rater.catalog.catalog.domain.IndividualOfferPoolPlanDto
import rater.catalog.catalog.domain.OfferLimit
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param allowance 
* @param allowanceRenewalStrategy 
* @param currency 
* @param customFields 
* @param limit 
* @param poolPlan 
* @param seniority 
* @param usageBalanceId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("allowance", "allowanceRenewalStrategy", "currency", "customFields", "id", "limit", "poolPlan", "seniority", "usageBalanceId")

@Entity
@Table(name = "individual_nested_offer_dto")
data class IndividualNestedOfferDto(

	@Column(name = "allowance")
	var allowance: BigDecimal?,

	@Column(name = "allowance_renewal_strategy")
	var allowanceRenewalStrategy: String?,

	@Column(name = "currency")
	var currency: String?,

	@Column(name = "custom_fields")
	var customFields: String?,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "limit__currency")),
		AttributeOverride(name = "value", column = Column(name = "limit__value_")),
	)
	@Embedded
	var limit: OfferLimit?,

	@AttributeOverrides(
		AttributeOverride(name = "maxSubscribers", column = Column(name = "pool_plan_max_subscribers")),
		AttributeOverride(name = "type", column = Column(name = "pool_plan_type")),
	)
	@Embedded
	var poolPlan: IndividualOfferPoolPlanDto?,

	@Column(name = "seniority")
	var seniority: Int?,

	@Column(name = "usage_balance_id")
	var usageBalanceId: UUID?

) : BaseDomain()

