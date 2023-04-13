package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param parameterGroupName 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "parameterGroupName", "value")

@Entity
@Table(name = "layout_parameter_item")
data class LayoutParameterItem(

	@Column(name = "parameter_group_name")
	var parameterGroupName: String?,

	@Column(name = "value_")
	var value: String

) : BaseDomain()

