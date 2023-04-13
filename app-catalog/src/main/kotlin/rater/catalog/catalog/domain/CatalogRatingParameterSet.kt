package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param isDeleted 
* @param name 
* @param ratingParameterIds 
* @param realm 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "id", "isDeleted", "name", "ratingParameterIds", "realm", "updatedDate")

@Entity
@Table(name = "catalog_rating_parameter_set")
data class CatalogRatingParameterSet(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_rating_parameter_set_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_rating_parameter_set_id")]
	)
	@Column(name = "uuid_id")
	var ratingParameterIds: List<UUID>,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

