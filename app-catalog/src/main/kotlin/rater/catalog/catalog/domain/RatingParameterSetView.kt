package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.RatingParameterView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param description 
* @param name 
* @param ratingParameter 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("description", "id", "name", "ratingParameter")

@Entity
@Table(name = "rating_parameter_set_view")
data class RatingParameterSetView(

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "rating_parameter_set_view_to_rating_parameter_view",
			joinColumns = [JoinColumn(name = "rating_parameter_set_view_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "rating_parameter_view_id", referencedColumnName = "id")]
	)
	var ratingParameter: List<RatingParameterView>

) : BaseResource()

