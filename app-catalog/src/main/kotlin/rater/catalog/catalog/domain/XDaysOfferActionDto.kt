package rater.catalog.catalog.domain

import java.util.UUID
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param actionId 
* @param catalogProductOfferingId 
* @param triggerValue 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actionId", "catalogProductOfferingId", "triggerValue")

@Embeddable
data class XDaysOfferActionDto(

	@Column(name = "action_id")
	var actionId: UUID,

	@Column(name = "catalog_product_offering_id")
	var catalogProductOfferingId: UUID,

	@Column(name = "trigger_value")
	var triggerValue: Long

) 

