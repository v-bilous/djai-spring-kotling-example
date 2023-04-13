package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param condition 
* @param createdDate 
* @param description 
* @param expression 
* @param isDeleted 
* @param name 
* @param schemaId 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("condition", "createdDate", "description", "expression", "id", "isDeleted", "name", "schemaId", "updatedDate")

@Entity
@Table(name = "eligibility_set")
data class EligibilitySet(

	@Column(name = "condition_")
	var condition: String,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String,

	@Column(name = "expression")
	var expression: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "schema_id")
	var schemaId: UUID?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

