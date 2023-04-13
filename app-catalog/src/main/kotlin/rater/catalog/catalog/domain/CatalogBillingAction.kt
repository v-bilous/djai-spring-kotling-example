package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogBillingActionSet
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param billingActionSet 
* @param command 
* @param commandType 
* @param description 
* @param name 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("billingActionSet", "command", "commandType", "description", "id", "name")

@Entity
@Table(name = "catalog_billing_action")
data class CatalogBillingAction(

	@Column(name = "billing_action_set")
	var billingActionSet: CatalogBillingActionSet?,

	@Column(name = "command")
	var command: String,

	@Column(name = "command_type")
	var commandType: String,

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String

) : BaseResource()

