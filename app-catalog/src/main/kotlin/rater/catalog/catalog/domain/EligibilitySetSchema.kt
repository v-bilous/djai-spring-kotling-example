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
* @param isSystem 
* @param schema 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "id", "isDeleted", "isSystem", "schema", "updatedDate")

@Entity
@Table(name = "eligibility_set_schema")
data class EligibilitySetSchema(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_system")
	var isSystem: Boolean,

	@Column(name = "schema")
	var schema: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

