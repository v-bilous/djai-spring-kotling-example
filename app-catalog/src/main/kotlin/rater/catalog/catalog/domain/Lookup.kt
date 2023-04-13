package rater.catalog.catalog.domain

import java.util.Date
import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param effectiveDateFrom 
* @param effectiveDateTo 
* @param groupId 
* @param isDeleted 
* @param key 
* @param keyName 
* @param module 
* @param realm 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("effectiveDateFrom", "effectiveDateTo", "groupId", "id", "isDeleted", "key", "keyName", "module", "realm", "value")

@Entity
@Table(name = "lookup")
data class Lookup(

	@Column(name = "effective_date_from")
	var effectiveDateFrom: Date?,

	@Column(name = "effective_date_to")
	var effectiveDateTo: Date?,

	@Column(name = "group_id")
	var groupId: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "key_")
	var key: String,

	@Column(name = "key_name")
	var keyName: String?,

	@Column(name = "module")
	var module: String,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "value_")
	var value: String

) : BaseResource()

