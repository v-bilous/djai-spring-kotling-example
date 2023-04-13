package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CustomListView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param customList 
* @param description 
* @param name 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("customList", "description", "id", "name")

@Entity
@Table(name = "rating_parameter_view")
data class RatingParameterView(

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "custom_list", referencedColumnName = "id")
	var customList: CustomListView?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String

) : BaseResource()

