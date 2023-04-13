package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.Action
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
* @param realm 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actions", "createdDate", "description", "id", "isDeleted", "name", "realm", "updatedDate")

@Entity
@Table(name = "action_set")
data class ActionSet(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "action_to_action_set",
			joinColumns = [JoinColumn(name = "action_set_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "action_id", referencedColumnName = "id")]
	)
	var actions: List<Action>,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "realm")
	var realm: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

