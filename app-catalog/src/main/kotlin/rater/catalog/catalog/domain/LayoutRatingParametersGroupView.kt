package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "name")

@Entity
@Table(name = "layout_rating_parameters_group_view")
data class LayoutRatingParametersGroupView(

	@Column(name = "name")
	var name: String

) : BaseDomain()

