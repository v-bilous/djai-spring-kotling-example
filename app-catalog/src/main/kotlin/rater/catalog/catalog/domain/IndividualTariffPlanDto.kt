package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.DeleteTariffPlanEntryDto
import rater.catalog.catalog.domain.InsertTariffPlanEntryDto
import rater.catalog.catalog.domain.UpdateTariffPlanEntryDto
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param add 
* @param delete 
* @param edit 
* @param subscriberOfferId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("add", "delete", "edit", "subscriberOfferId")

@Embeddable
data class IndividualTariffPlanDto(

	@Type(type = "json")
	@Column(name = "add", columnDefinition = "json")
	var add: Set<InsertTariffPlanEntryDto>?,

	@Type(type = "json")
	@Column(name = "delete", columnDefinition = "json")
	var delete: Set<DeleteTariffPlanEntryDto>?,

	@Type(type = "json")
	@Column(name = "edit", columnDefinition = "json")
	var edit: Set<UpdateTariffPlanEntryDto>?,

	@Column(name = "subscriber_offer_id")
	var subscriberOfferId: UUID

) 

