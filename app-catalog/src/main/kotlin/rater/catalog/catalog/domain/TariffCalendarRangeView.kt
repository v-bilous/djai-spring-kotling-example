package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.TariffView
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param calendarPropertiesId 
* @param position 
* @param tariff 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("calendarPropertiesId", "id", "position", "tariff")

@Entity
@Table(name = "tariff_calendar_range_view")
data class TariffCalendarRangeView(

	@Column(name = "calendar_properties_id")
	var calendarPropertiesId: UUID?,

	@Column(name = "position")
	var position: Int,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "tariff", referencedColumnName = "id")
	var tariff: TariffView?

) : BaseDomain()

