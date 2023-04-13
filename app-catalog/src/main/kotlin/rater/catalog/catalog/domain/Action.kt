package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.ActionSet
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param actionSet 
* @param actionSetId 
* @param command 
* @param commandType 
* @param createdDate 
* @param description 
* @param isDeleted 
* @param name 
* @param triggerId 
* @param triggerValue 
* @param triggerValueUnit 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actionSet", "actionSetId", "command", "commandType", "createdDate", "description", "id", "isDeleted", "name", "triggerId", "triggerValue", "triggerValueUnit", "updatedDate")

@Entity
@Table(name = "action")
data class Action(

	@Column(name = "action_set")
	var actionSet: ActionSet?,

	@Column(name = "action_set_id")
	var actionSetId: UUID?,

	@Column(name = "command")
	var command: String?,

	@Column(name = "command_type")
	var commandType: String,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "trigger_id")
	var triggerId: String,

	@Column(name = "trigger_value")
	var triggerValue: Long?,

	@Column(name = "trigger_value_unit")
	var triggerValueUnit: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

