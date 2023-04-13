package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param isActive 
* @param isDeleted 
* @param name 
* @param providerId 
* @param realm 
* @param serviceId 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "id", "isActive", "isDeleted", "name", "providerId", "realm", "serviceId", "updatedDate")

@Entity
@Table(name = "catalog_product")
data class CatalogProduct(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_active")
	var isActive: Boolean,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "provider_id")
	var providerId: UUID?,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "service_id")
	var serviceId: UUID,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

