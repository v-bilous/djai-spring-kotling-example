package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.TariffStepDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param step 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("name", "step", "type")

@Embeddable
data class TariffDetailsDto(

	@Column(name = "name")
	var name: String,

	@Type(type = "json")
	@Column(name = "step", columnDefinition = "json")
	var step: List<TariffStepDto>,

	@Column(name = "type")
	var type: String

) 

