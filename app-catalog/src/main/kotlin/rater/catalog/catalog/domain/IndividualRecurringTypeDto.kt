package rater.catalog.catalog.domain

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param isCalendar 
* @param isProrated 
* @param type 
* @param units 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("isCalendar", "isProrated", "type", "units", "value")

@Embeddable
data class IndividualRecurringTypeDto(

	@Column(name = "is_calendar")
	var isCalendar: Boolean?,

	@Column(name = "is_prorated")
	var isProrated: Boolean?,

	@Column(name = "type")
	var type: String?,

	@Column(name = "units")
	var units: Long?,

	@Column(name = "value_")
	var value: Long?

) 

