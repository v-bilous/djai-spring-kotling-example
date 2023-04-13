package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param actionSetIds 
* @param createdDate 
* @param currencyId 
* @param description 
* @param isDeleted 
* @param isExternal 
* @param isVirtual 
* @param maximumBalance 
* @param minimumBalance 
* @param name 
* @param realm 
* @param type 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("actionSetIds", "createdDate", "currencyId", "description", "id", "isDeleted", "isExternal", "isVirtual", "maximumBalance", "minimumBalance", "name", "realm", "type", "updatedDate")

@Entity
@Table(name = "catalog_balance")
data class CatalogBalance(

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_balance_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_balance_id")]
	)
	@Column(name = "uuid_id")
	var actionSetIds: Set<UUID>?,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "currency_id")
	var currencyId: String,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_external")
	var isExternal: Boolean,

	@Column(name = "is_virtual")
	var isVirtual: Boolean,

	@Column(name = "maximum_balance")
	var maximumBalance: Long,

	@Column(name = "minimum_balance")
	var minimumBalance: Long,

	@Column(name = "name")
	var name: String?,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "type")
	var type: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

