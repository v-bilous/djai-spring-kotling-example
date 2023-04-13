package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogZone
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param eligibilitySet 
* @param isDeleted 
* @param name 
* @param updatedDate 
* @param zone 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "eligibilitySet", "id", "isDeleted", "name", "updatedDate", "zone")

@Entity
@Table(name = "catalog_zone_set")
data class CatalogZoneSet(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_zone_set_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_zone_set_id")]
	)
	@Column(name = "uuid_id")
	var eligibilitySet: Set<UUID>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_zone_to_catalog_zone_set",
			joinColumns = [JoinColumn(name = "catalog_zone_set_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "catalog_zone_id", referencedColumnName = "id")]
	)
	var zone: List<CatalogZone>?

) : BaseResource()

