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
* @param currencyId 
* @param description 
* @param isDeleted 
* @param name 
* @param realm 
* @param updatedDate 
* @param value 
* @param version 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "currencyId", "description", "id", "isDeleted", "name", "realm", "updatedDate", "value", "version")

@Entity
@Table(name = "catalog_price_item")
data class CatalogPriceItem(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "currency_id")
	var currencyId: String?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "value_")
	var value: Long,

	@Column(name = "version")
	var version: Long?

) : BaseResource()

