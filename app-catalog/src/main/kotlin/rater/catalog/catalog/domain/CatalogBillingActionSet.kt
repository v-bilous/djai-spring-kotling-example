package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogBillingAction
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param actions 
* @param createdDate 
* @param description 
* @param isDeleted 
* @param name 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actions", "createdDate", "description", "id", "isDeleted", "name", "updatedDate")

@Entity
@Table(name = "catalog_billing_action_set")
data class CatalogBillingActionSet(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_billing_action_to_catalog_billing_action_set",
			joinColumns = [JoinColumn(name = "catalog_billing_action_set_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "catalog_billing_action_id", referencedColumnName = "id")]
	)
	var actions: List<CatalogBillingAction>,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

