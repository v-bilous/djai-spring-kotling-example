package rater.catalog.catalog.domain

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param maxSubscribers 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("maxSubscribers", "type")

@Embeddable
data class CatalogOfferPoolPlan(

	@Column(name = "max_subscribers")
	var maxSubscribers: Int?,

	@Column(name = "type")
	var type: String

) 

