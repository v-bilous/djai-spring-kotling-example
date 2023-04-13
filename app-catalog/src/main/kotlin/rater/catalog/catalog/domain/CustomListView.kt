package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param description 
* @param name 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("description", "id", "name")

@Entity
@Table(name = "custom_list_view")
data class CustomListView(

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String

) : BaseResource()

