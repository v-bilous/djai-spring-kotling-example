package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.TariffDetailsDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param layout 
* @param tariff 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("layout", "tariff")

@Embeddable
data class TariffPlanDetailsDto(

	@Type(type = "json")
	@Column(name = "layout", columnDefinition = "json")
	var layout: List<String>,

	@AttributeOverrides(
		AttributeOverride(name = "name", column = Column(name = "tariff_name")),
		AttributeOverride(name = "step", column = Column(name = "tariff_step", columnDefinition = "json")),
		AttributeOverride(name = "type", column = Column(name = "tariff_type")),
	)
	@Embedded
	var tariff: TariffDetailsDto?

) 

