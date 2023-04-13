package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.LayoutRatingParametersView
import rater.catalog.catalog.domain.RatingParameterSetView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param data 
* @param description 
* @param name 
* @param ratingParameterSet 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("data", "description", "id", "name", "ratingParameterSet")

@Entity
@Table(name = "layout_view")
data class LayoutView(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "layout_rating_parameters_view_to_layout_view",
			joinColumns = [JoinColumn(name = "layout_view_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "layout_rating_parameters_view_id", referencedColumnName = "id")]
	)
	var data: Set<LayoutRatingParametersView>,

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "rating_parameter_set", referencedColumnName = "id")
	var ratingParameterSet: RatingParameterSetView?

) : BaseResource()

