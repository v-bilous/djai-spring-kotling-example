package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogLayout
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
* @param isSystem 
* @param layout 
* @param name 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "eligibilitySet", "id", "isDeleted", "isSystem", "layout", "name", "updatedDate")

@Entity
@Table(name = "catalog_zone")
data class CatalogZone(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_zone_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_zone_id")]
	)
	@Column(name = "uuid_id")
	var eligibilitySet: List<UUID>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_system")
	var isSystem: Boolean,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "layout", referencedColumnName = "id")
	var layout: CatalogLayout?,

	@Column(name = "name")
	var name: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

