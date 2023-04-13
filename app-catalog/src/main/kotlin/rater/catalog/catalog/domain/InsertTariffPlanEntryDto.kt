package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.TariffEntryDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param layout 
* @param position 
* @param tariff 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("layout", "position", "tariff")

@Embeddable
data class InsertTariffPlanEntryDto(

	@Type(type = "json")
	@Column(name = "layout", columnDefinition = "json")
	var layout: List<String>?,

	@Column(name = "position")
	var position: Int?,

	@Type(type = "json")
	@Column(name = "tariff", columnDefinition = "json")
	var tariff: List<TariffEntryDto>?

) 

