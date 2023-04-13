package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param calendarPropertiesId 
* @param position 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("calendarPropertiesId", "id", "position")

@Entity
@Table(name = "tariff_calendar_range_list_item")
data class TariffCalendarRangeListItem(

	@Column(name = "calendar_properties_id")
	var calendarPropertiesId: UUID?,

	@Column(name = "position")
	var position: Int

) : BaseDomain()

