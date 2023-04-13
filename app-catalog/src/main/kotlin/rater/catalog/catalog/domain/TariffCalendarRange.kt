package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.TariffCalendarRangeListItem
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param list 
* @param tariffId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("list", "tariffId")

@Embeddable
data class TariffCalendarRange(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "tariff_calendar_range_to_tariff_calendar_range_list_item",
			joinColumns = [JoinColumn(name = "tariff_calendar_range_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "tariff_calendar_range_list_item_id", referencedColumnName = "id")]
	)
	var list: List<TariffCalendarRangeListItem>?,

	@Column(name = "tariff_id")
	var tariffId: UUID

) 

