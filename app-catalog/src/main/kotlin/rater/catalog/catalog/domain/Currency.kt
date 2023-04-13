package rater.catalog.catalog.domain

import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "name", "type")

@Entity
@Table(name = "currency")
data class Currency(

	@Column(name = "name")
	var name: String,

	@Column(name = "type")
	var type: String

) : BaseDomain()

