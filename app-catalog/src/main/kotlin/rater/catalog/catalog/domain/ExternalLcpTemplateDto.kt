package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param states 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "name", "states")

@Entity
@Table(name = "external_lcp_template_dto")
data class ExternalLcpTemplateDto(

	@Column(name = "name")
	var name: String,

	@Type(type = "json")
	@Column(name = "states", columnDefinition = "json")
	var states: Set<String>

) : BaseDomain()

