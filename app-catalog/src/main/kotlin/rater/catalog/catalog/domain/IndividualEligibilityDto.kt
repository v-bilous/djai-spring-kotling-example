package rater.catalog.catalog.domain

import java.util.UUID
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param customerAccountId 
* @param planType 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("customerAccountId", "planType")

@Embeddable
data class IndividualEligibilityDto(

	@Column(name = "customer_account_id")
	var customerAccountId: UUID,

	@Column(name = "plan_type")
	var planType: String?

) 

