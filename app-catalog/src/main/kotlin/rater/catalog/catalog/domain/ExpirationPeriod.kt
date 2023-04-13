package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param realm 
* @param type 
* @param units 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "realm", "type", "units")

@Entity
@Table(name = "expiration_period")
data class ExpirationPeriod(

	@Column(name = "realm")
	var realm: String,

	@Column(name = "type")
	var type: String,

	@Column(name = "units")
	var units: Int

) : BaseDomain()

