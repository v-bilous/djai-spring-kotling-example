package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param isCalendar 
* @param isProrated 
* @param realm 
* @param type 
* @param units 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "isCalendar", "isProrated", "realm", "type", "units", "value")

@Entity
@Table(name = "catalog_recurring_type")
data class CatalogRecurringType(

	@Column(name = "is_calendar")
	var isCalendar: Boolean,

	@Column(name = "is_prorated")
	var isProrated: Boolean,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "type")
	var type: String,

	@Column(name = "units")
	var units: Long,

	@Column(name = "value_")
	var value: Long

) : BaseDomain()

