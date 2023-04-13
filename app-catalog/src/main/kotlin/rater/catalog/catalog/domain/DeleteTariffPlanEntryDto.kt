package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param layout 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("layout")

@Embeddable
data class DeleteTariffPlanEntryDto(

	@Type(type = "json")
	@Column(name = "layout", columnDefinition = "json")
	var layout: List<String>?

) 

