package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currency 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currency", "id", "value")

@Entity
@Table(name = "catalog_limit")
data class CatalogLimit(

	@Column(name = "currency")
	var currency: String,

	@Column(name = "value_")
	var value: Long

) : BaseDomain()

