package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogBalanceDto
import rater.catalog.catalog.domain.CatalogLimit
import rater.catalog.catalog.domain.CatalogOfferLabelDto
import rater.catalog.catalog.domain.CatalogOfferPrice
import rater.catalog.catalog.domain.CatalogOfferTermDto
import rater.catalog.catalog.domain.SimpleProductOfferingDto
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
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
* @param labels 
* @param limit 
* @param linkedOffers 
* @param name 
* @param nestedProductOffers 
* @param offerTerm 
* @param periodicBalance 
* @param price 
* @param productId 
* @param realm 
* @param type 
* @param updatedDate 
* @param usageBalance 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("cardinality", "compatibilitySetIds", "createdDate", "customFields", "description", "eligibilitySetIds", "id", "isDeleted", "isIndividual", "isOffered", "isPrimary", "labels", "limit", "linkedOffers", "name", "nestedProductOffers", "offerTerm", "periodicBalance", "price", "productId", "realm", "type", "updatedDate", "usageBalance")

@Entity
@Table(name = "catalog_product_offering_dto")
data class CatalogProductOfferingDto(

	@Column(name = "cardinality")
	var cardinality: Int?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_product_offering_dto_to_compatibility_set_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_dto_id")]
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
			name = "catalog_product_offering_dto_to_eligibility_set_ids",
			joinColumns = [JoinColumn(name = "catalog_product_offering_dto_id")]
	)
	@Column(name = "uuid_id")
	var eligibilitySetIds: Set<UUID>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_individual")
	var isIndividual: Boolean,

	@Column(name = "is_offered")
	var isOffered: Boolean,

	@Column(name = "is_primary")
	var isPrimary: Boolean,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_offer_label_dto_to_catalog_product_offering_dto",
			joinColumns = [JoinColumn(name = "catalog_product_offering_dto_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "catalog_offer_label_dto_id", referencedColumnName = "id")]
	)
	var labels: List<CatalogOfferLabelDto>,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "limit_", referencedColumnName = "id")
	var limit: CatalogLimit?,

	@Column(name = "linked_offers")
	var linkedOffers: String,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_product_offering_dto_to_simple_product_offering_dto",
			joinColumns = [JoinColumn(name = "catalog_product_offering_dto_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "simple_product_offering_dto_id", referencedColumnName = "id")]
	)
	var nestedProductOffers: List<SimpleProductOfferingDto>,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "offer_term", referencedColumnName = "id")
	var offerTerm: CatalogOfferTermDto?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "periodic_balance", referencedColumnName = "id")
	var periodicBalance: CatalogBalanceDto?,

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

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "usage_balance", referencedColumnName = "id")
	var usageBalance: CatalogBalanceDto?

) : BaseResource()

