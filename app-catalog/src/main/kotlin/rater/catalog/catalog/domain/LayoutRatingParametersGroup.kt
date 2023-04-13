package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.LayoutGroupItem
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param isDeleted 
* @param name 
* @param parameters 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "id", "isDeleted", "name", "parameters", "updatedDate")

@Entity
@Table(name = "layout_rating_parameters_group")
data class LayoutRatingParametersGroup(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "layout_group_item_to_layout_rating_parameters_group",
			joinColumns = [JoinColumn(name = "layout_rating_parameters_group_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "layout_group_item_id", referencedColumnName = "id")]
	)
	var parameters: List<LayoutGroupItem>?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

