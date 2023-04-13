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
* @param isDeleted 
* @param name 
* @param providerIds 
* @param realm 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "id", "isDeleted", "name", "providerIds", "realm", "updatedDate")

@Entity
@Table(name = "catalog_service")
data class CatalogService(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_service_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_service_id")]
	)
	@Column(name = "uuid_id")
	var providerIds: Set<UUID>,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

