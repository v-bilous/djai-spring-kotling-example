package rater.catalog.catalog.domain

import java.util.UUID
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param eligibilityData 
* @param offerIds 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("eligibilityData", "offerIds")

@Embeddable
data class EligibilityCompatibilityData(

	@Column(name = "eligibility_data")
	var eligibilityData: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "eligibility_compatibility_data_to_uuid",
			joinColumns = [JoinColumn(name = "eligibility_compatibility_data_id")]
	)
	@Column(name = "uuid_id")
	var offerIds: Set<UUID>?

) 

