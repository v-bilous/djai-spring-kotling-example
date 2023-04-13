package rater.catalog.catalog.domain

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param requiredId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("name", "requiredId")

@Embeddable
data class LcpRowType(

	@Column(name = "name")
	var name: String,

	@Column(name = "required_id")
	var requiredId: Boolean?

) 

