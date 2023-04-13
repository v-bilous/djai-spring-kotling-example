package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param isDeleted 
* @param name 
* @param parameters 
* @param realm 
* @param updatedDate 
* @param values 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "id", "isDeleted", "name", "parameters", "realm", "updatedDate", "values")

@Entity
@Table(name = "catalog_parameter_group")
data class CatalogParameterGroup(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_parameter_group_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_parameter_group_id")]
	)
	@Column(name = "uuid_id")
	var parameters: Set<UUID>,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Type(type = "json")
	@Column(name = "values_", columnDefinition = "json")
	var values: Set<String>

) : BaseResource()

