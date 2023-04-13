package rater.catalog.catalog.domain

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param key 
* @param position 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("key", "position", "value")

@Embeddable
data class CustomListItem(

	@Column(name = "key_")
	var key: String,

	@Column(name = "position")
	var position: Int,

	@Column(name = "value_")
	var value: String

) 

