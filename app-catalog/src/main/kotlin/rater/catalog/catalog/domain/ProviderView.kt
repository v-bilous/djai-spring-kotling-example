package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param codes 
* @param isDefault 
* @param name 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("codes", "id", "isDefault", "name")

@Entity
@Table(name = "provider_view")
data class ProviderView(

	@Type(type = "json")
	@Column(name = "codes", columnDefinition = "json")
	var codes: Set<String>,

	@Column(name = "is_default")
	var isDefault: Boolean,

	@Column(name = "name")
	var name: String

) : BaseDomain()

