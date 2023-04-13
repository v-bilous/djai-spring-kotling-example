package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.BonusStep
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param bonusSetIds 
* @param createdDate 
* @param description 
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

@JsonPropertyOrder("bonusSetIds", "createdDate", "description", "entityIds", "entityType", "id", "isDeleted", "name", "steps", "type", "unitType", "updatedDate")

@Entity
@Table(name = "catalog_billing_bonus")
data class CatalogBillingBonus(

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_bonus_to_bonus_set_ids",
			joinColumns = [JoinColumn(name = "catalog_billing_bonus_id")]
	)
	@Column(name = "uuid_id")
	var bonusSetIds: Set<UUID>,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_bonus_to_entity_ids",
			joinColumns = [JoinColumn(name = "catalog_billing_bonus_id")]
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
			name = "bonus_step_to_catalog_billing_bonus",
			joinColumns = [JoinColumn(name = "catalog_billing_bonus_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "bonus_step_id", referencedColumnName = "id")]
	)
	var steps: List<BonusStep>,

	@Column(name = "type")
	var type: String,

	@Column(name = "unit_type")
	var unitType: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

