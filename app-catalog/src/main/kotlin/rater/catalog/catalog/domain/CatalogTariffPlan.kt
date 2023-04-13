package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.TariffCalendarRange
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param calendarId 
* @param createdDate 
* @param description 
* @param isDeleted 
* @param isIndividual 
* @param layoutId 
* @param name 
* @param ranges 
* @param realm 
* @param updatedDate 
* @param version 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("calendarId", "createdDate", "description", "id", "isDeleted", "isIndividual", "layoutId", "name", "ranges", "realm", "updatedDate", "version")

@Entity
@Table(name = "catalog_tariff_plan")
data class CatalogTariffPlan(

	@Column(name = "calendar_id")
	var calendarId: UUID?,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_individual")
	var isIndividual: Boolean,

	@Column(name = "layout_id")
	var layoutId: UUID,

	@Column(name = "name")
	var name: String,

	@Type(type = "json")
	@Column(name = "ranges", columnDefinition = "json")
	var ranges: List<TariffCalendarRange>,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "version")
	var version: Long?

) : BaseResource()

