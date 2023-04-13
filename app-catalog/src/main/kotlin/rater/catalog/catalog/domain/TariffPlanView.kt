package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CalendarView
import rater.catalog.catalog.domain.LayoutView
import rater.catalog.catalog.domain.TariffCalendarRangeView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param calendar 
* @param description 
* @param layout 
* @param name 
* @param ranges 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("calendar", "description", "id", "layout", "name", "ranges")

@Entity
@Table(name = "tariff_plan_view")
data class TariffPlanView(

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "calendar", referencedColumnName = "id")
	var calendar: CalendarView?,

	@Column(name = "description")
	var description: String?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "layout", referencedColumnName = "id")
	var layout: LayoutView,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "tariff_calendar_range_view_to_tariff_plan_view",
			joinColumns = [JoinColumn(name = "tariff_plan_view_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "tariff_calendar_range_view_id", referencedColumnName = "id")]
	)
	var ranges: List<TariffCalendarRangeView>

) : BaseResource()

