package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.LayoutParameterItem
import rater.catalog.catalog.domain.LayoutRatingParametersGroup
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param group 
* @param isDeleted 
* @param layoutIds 
* @param parameters 
* @param position 
* @param tags 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "group", "id", "isDeleted", "layoutIds", "parameters", "position", "tags", "updatedDate")

@Entity
@Table(name = "layout_rating_parameters")
data class LayoutRatingParameters(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "group_", referencedColumnName = "id")
	var group: LayoutRatingParametersGroup?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "layout_rating_parameters_to_uuid",
			joinColumns = [JoinColumn(name = "layout_rating_parameters_id")]
	)
	@Column(name = "uuid_id")
	var layoutIds: Set<UUID>,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "layout_parameter_item_to_layout_rating_parameters",
			joinColumns = [JoinColumn(name = "layout_rating_parameters_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "layout_parameter_item_id", referencedColumnName = "id")]
	)
	var parameters: List<LayoutParameterItem>,

	@Column(name = "position")
	var position: Int,

	@Type(type = "json")
	@Column(name = "tags", columnDefinition = "json")
	var tags: Set<String>,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

