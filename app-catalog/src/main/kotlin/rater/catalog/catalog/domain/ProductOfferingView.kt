package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogLimitView
import rater.catalog.catalog.domain.OfferPriceView
import rater.catalog.catalog.domain.OfferTermView
import rater.catalog.catalog.domain.ProductView
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
* @param isOffered 
* @param isPrimary 
* @param limit 
* @param name 
* @param offerTerm 
* @param price 
* @param product 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("cardinality", "customFields", "description", "id", "isOffered", "isPrimary", "limit", "name", "offerTerm", "price", "product", "type")

@Entity
@Table(name = "product_offering_view")
data class ProductOfferingView(

	@Column(name = "cardinality")
	var cardinality: Int?,

	@Column(name = "custom_fields")
	var customFields: String?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_offered")
	var isOffered: Boolean,

	@Column(name = "is_primary")
	var isPrimary: Boolean,

	@AttributeOverrides(
		AttributeOverride(name = "currency", column = Column(name = "limit__currency")),
		AttributeOverride(name = "value", column = Column(name = "limit__value_")),
	)
	@Embedded
	var limit: CatalogLimitView?,

	@Column(name = "name")
	var name: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "offer_term", referencedColumnName = "id")
	var offerTerm: OfferTermView?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "price", referencedColumnName = "id")
	var price: OfferPriceView?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "product", referencedColumnName = "id")
	var product: ProductView?,

	@Column(name = "type")
	var type: String

) : BaseResource()

