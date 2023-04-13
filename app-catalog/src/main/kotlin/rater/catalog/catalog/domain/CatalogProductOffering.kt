package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogLimit
import rater.catalog.catalog.domain.CatalogOfferPoolPlan
import rater.catalog.catalog.domain.CatalogOfferPrice
import rater.catalog.catalog.domain.CatalogOfferTerm
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param actionSetIds 
* @param cardinality 
* @param compatibilitySetIds 
* @param createdDate 
* @param customFields 
* @param description 
* @param eligibilitySetIds 
* @param isDeleted 
* @param isIndividual 
* @param isOffered 
* @param isPrimary 
* @param limit 
* @param linkedOffers 
* @param name 
* @param nestedProductOfferIds 
* @param offerLabelIds 
* @param offerTerm 
* @param parentProductOffers 
* @param periodicBalanceId 
* @param poolPlan 
* @param price 
* @param productId 
* @param realm 
* @param type 
* @param updatedDate 
* @param usageBalanceId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actionSetIds", "cardinality", "compatibilitySetIds", "createdDate", "customFields", "description", "eligibilitySetIds", "id", "isDeleted", "isIndividual", "isOffered", "isPrimary", "limit", "linkedOffers", "name", "nestedProductOfferIds", "offerLabelIds", "offerTerm", "parentProductOffers", "periodicBalanceId", "poolPlan", "price", "productId", "realm", "type", "updatedDate", "usageBalanceId")

@Entity
@Table(name = "catalog_product_offering")
data class CatalogProductOffering(

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_action_set_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var actionSetIds: Set<UUID>?,

	@Column(name = "cardinality")
	var cardinality: Int?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_compatibility_set_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var compatibilitySetIds: Set<UUID>,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "custom_fields")
	var customFields: String?,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_eligibility_set_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var eligibilitySetIds: Set<UUID>?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_individual")
	var isIndividual: Boolean,

	@Column(name = "is_offered")
	var isOffered: Boolean,

	@Column(name = "is_primary")
	var isPrimary: Boolean,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "limit_", referencedColumnName = "id")
	var limit: CatalogLimit?,

	@Column(name = "linked_offers")
	var linkedOffers: String,

	@Column(name = "name")
	var name: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_nested_product_offer_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var nestedProductOfferIds: List<UUID>,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_offer_label_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var offerLabelIds: Set<UUID>,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "offer_term", referencedColumnName = "id")
	var offerTerm: CatalogOfferTerm?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_to_parent_product_offers",
			joinColumns = [JoinColumn(name = "catalog_product_offering_id")]
	)
	@Column(name = "uuid_id")
	var parentProductOffers: Set<UUID>,

	@Column(name = "periodic_balance_id")
	var periodicBalanceId: UUID?,

	@AttributeOverrides(
		AttributeOverride(name = "maxSubscribers", column = Column(name = "pool_plan_max_subscribers")),
		AttributeOverride(name = "type", column = Column(name = "pool_plan_type")),
	)
	@Embedded
	var poolPlan: CatalogOfferPoolPlan?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "price", referencedColumnName = "id")
	var price: CatalogOfferPrice?,

	@Column(name = "product_id")
	var productId: UUID?,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "type")
	var type: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "usage_balance_id")
	var usageBalanceId: UUID?

) : BaseResource()

