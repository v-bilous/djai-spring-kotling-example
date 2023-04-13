package rater.catalog.catalog.domain

import java.util.UUID
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param fromRealm 
* @param fromSubscriberId 
* @param toRealm 
* @param toSubscriberId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("fromRealm", "fromSubscriberId", "toRealm", "toSubscriberId")

@Embeddable
data class LookupMovingDto(

	@Column(name = "from_realm")
	var fromRealm: String,

	@Column(name = "from_subscriber_id")
	var fromSubscriberId: UUID,

	@Column(name = "to_realm")
	var toRealm: String,

	@Column(name = "to_subscriber_id")
	var toSubscriberId: UUID

) 

