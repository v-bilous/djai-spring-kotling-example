package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param catalogCalendarId 
* @param color 
* @param createdDate 
* @param description 
* @param domFrom 
* @param domTo 
* @param dowFrom 
* @param dowTo 
* @param isDeleted 
* @param monthFrom 
* @param monthTo 
* @param name 
* @param special 
* @param timeFrom 
* @param timeTo 
* @param updatedDate 
* @param version 
* @param yearFrom 
* @param yearTo 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("catalogCalendarId", "color", "createdDate", "description", "domFrom", "domTo", "dowFrom", "dowTo", "id", "isDeleted", "monthFrom", "monthTo", "name", "special", "timeFrom", "timeTo", "updatedDate", "version", "yearFrom", "yearTo")

@Entity
@Table(name = "catalog_calendar_properties")
data class CatalogCalendarProperties(

	@Column(name = "catalog_calendar_id")
	var catalogCalendarId: UUID,

	@Column(name = "color")
	var color: String?,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "dom_from")
	var domFrom: Int,

	@Column(name = "dom_to")
	var domTo: Int?,

	@Column(name = "dow_from")
	var dowFrom: Int,

	@Column(name = "dow_to")
	var dowTo: Int?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "month_from")
	var monthFrom: Int,

	@Column(name = "month_to")
	var monthTo: Int?,

	@Column(name = "name")
	var name: String,

	@Column(name = "special")
	var special: Boolean?,

	@Column(name = "time_from")
	var timeFrom: String?,

	@Column(name = "time_to")
	var timeTo: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "version")
	var version: Long?,

	@Column(name = "year_from")
	var yearFrom: Int,

	@Column(name = "year_to")
	var yearTo: Int?

) : BaseResource()

