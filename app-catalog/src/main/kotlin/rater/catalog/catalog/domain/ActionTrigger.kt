package rater.catalog.catalog.domain

import org.hibernate.annotations.Type
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param hasValue 
* @param isDeleted 
* @param isSystem 
* @param name 
* @param type 
* @param updatedDate 
* @param valueType 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "hasValue", "id", "isDeleted", "isSystem", "name", "type", "updatedDate", "valueType")

@Entity
@Table(name = "action_trigger")
data class ActionTrigger(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "has_value")
	var hasValue: Boolean,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_system")
	var isSystem: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "type")
	var type: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Type(type = "json")
	@Column(name = "value_type", columnDefinition = "json")
	var valueType: List<String>?

) : BaseResource()

