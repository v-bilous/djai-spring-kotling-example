package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.LayoutRatingParametersGroupView
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param group 
* @param parameters 
* @param position 
* @param tags 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("group", "id", "parameters", "position", "tags")

@Entity
@Table(name = "layout_rating_parameters_view")
data class LayoutRatingParametersView(

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "group_", referencedColumnName = "id")
	var group: LayoutRatingParametersGroupView?,

	@Type(type = "json")
	@Column(name = "parameters", columnDefinition = "json")
	var parameters: List<String>,

	@Column(name = "position")
	var position: Int,

	@Type(type = "json")
	@Column(name = "tags", columnDefinition = "json")
	var tags: Set<String>

) : BaseDomain()

