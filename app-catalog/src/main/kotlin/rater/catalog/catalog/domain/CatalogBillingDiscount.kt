package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.DiscountStep
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param discountSetIds 
* @param entityIds 
* @param entityType 
* @param isDeleted 
* @param name 
* @param steps 
* @param type 
* @param unitType 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "discountSetIds", "entityIds", "entityType", "id", "isDeleted", "name", "steps", "type", "unitType", "updatedDate")

@Entity
@Table(name = "catalog_billing_discount")
data class CatalogBillingDiscount(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_discount_to_discount_set_ids",
			joinColumns = [JoinColumn(name = "catalog_billing_discount_id")]
	)
	@Column(name = "uuid_id")
	var discountSetIds: Set<UUID>,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_discount_to_entity_ids",
			joinColumns = [JoinColumn(name = "catalog_billing_discount_id")]
	)
	@Column(name = "uuid_id")
	var entityIds: Set<UUID>,

	@Column(name = "entity_type")
	var entityType: String,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String?,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_billing_discount_to_discount_step",
			joinColumns = [JoinColumn(name = "catalog_billing_discount_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "discount_step_id", referencedColumnName = "id")]
	)
	var steps: List<DiscountStep>,

	@Column(name = "type")
	var type: String,

	@Column(name = "unit_type")
	var unitType: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

