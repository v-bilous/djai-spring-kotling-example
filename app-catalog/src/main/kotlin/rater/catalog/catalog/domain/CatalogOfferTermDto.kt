package rater.catalog.catalog.domain

import java.util.Date
import java.util.UUID
import rater.catalog.catalog.domain.CatalogRecurringType
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param allowance 
* @param allowanceRenewalStrategy 
* @param effectiveDateFrom 
* @param effectiveDateTo 
* @param isRemoveAfterBalanceDepletion 
* @param offerPriority 
* @param offerRenewalStrategy 
* @param realm 
* @param recurringType 
* @param tariffPlanId 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("allowance", "allowanceRenewalStrategy", "effectiveDateFrom", "effectiveDateTo", "id", "isRemoveAfterBalanceDepletion", "offerPriority", "offerRenewalStrategy", "realm", "recurringType", "tariffPlanId", "type")

@Entity
@Table(name = "catalog_offer_term_dto")
data class CatalogOfferTermDto(

	@Column(name = "allowance")
	var allowance: Long?,

	@Column(name = "allowance_renewal_strategy")
	var allowanceRenewalStrategy: String,

	@Column(name = "effective_date_from")
	var effectiveDateFrom: Date,

	@Column(name = "effective_date_to")
	var effectiveDateTo: Date?,

	@Column(name = "is_remove_after_balance_depletion")
	var isRemoveAfterBalanceDepletion: Boolean,

	@Column(name = "offer_priority")
	var offerPriority: Int,

	@Column(name = "offer_renewal_strategy")
	var offerRenewalStrategy: String,

	@Column(name = "realm")
	var realm: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "recurring_type", referencedColumnName = "id")
	var recurringType: CatalogRecurringType?,

	@Column(name = "tariff_plan_id")
	var tariffPlanId: UUID?,

	@Column(name = "type")
	var type: String

) : BaseDomain()

