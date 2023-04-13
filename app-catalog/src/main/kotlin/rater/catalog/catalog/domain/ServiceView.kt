package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.ProviderView
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param name 
* @param providers 
* @param statuses 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "name", "providers", "statuses")

@Entity
@Table(name = "service_view")
data class ServiceView(

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "provider_view_to_service_view",
			joinColumns = [JoinColumn(name = "service_view_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "provider_view_id", referencedColumnName = "id")]
	)
	var providers: Set<ProviderView>,

	@Type(type = "json")
	@Column(name = "statuses", columnDefinition = "json")
	var statuses: Set<String>

) : BaseDomain()

