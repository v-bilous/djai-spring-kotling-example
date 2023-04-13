package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogCustomList
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param customList 
* @param description 
* @param isDeleted 
* @param name 
* @param parameterGroupIds 
* @param ratingParameterSetIds 
* @param realm 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "customList", "description", "id", "isDeleted", "name", "parameterGroupIds", "ratingParameterSetIds", "realm", "updatedDate")

@Entity
@Table(name = "catalog_rating_parameter")
data class CatalogRatingParameter(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "custom_list", referencedColumnName = "id")
	var customList: CatalogCustomList?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_rating_parameter_to_parameter_group_ids",
			joinColumns = [JoinColumn(name = "catalog_rating_parameter_id")]
	)
	@Column(name = "uuid_id")
	var parameterGroupIds: Set<UUID>,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_rating_parameter_to_rating_parameter_set_ids",
			joinColumns = [JoinColumn(name = "catalog_rating_parameter_id")]
	)
	@Column(name = "uuid_id")
	var ratingParameterSetIds: Set<UUID>,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

