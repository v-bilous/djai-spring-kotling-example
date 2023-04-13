package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.ServiceView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param description 
* @param isActive 
* @param name 
* @param service 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("description", "id", "isActive", "name", "service")

@Entity
@Table(name = "product_view")
data class ProductView(

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_active")
	var isActive: Boolean,

	@Column(name = "name")
	var name: String,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
	@JoinColumn(name = "service", referencedColumnName = "id")
	var service: ServiceView?

) : BaseResource()

