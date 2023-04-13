package rater.catalog.catalog.domain

import java.math.BigDecimal
import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param currency 
* @param description 
* @param isDeleted 
* @param name 
* @param taxSetIds 
* @param updatedDate 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "currency", "description", "id", "isDeleted", "name", "taxSetIds", "updatedDate", "value")

@Entity
@Table(name = "catalog_billing_tax")
data class CatalogBillingTax(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "currency")
	var currency: String?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_tax_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_billing_tax_id")]
	)
	@Column(name = "uuid_id")
	var taxSetIds: Set<UUID>,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "value_")
	var value: BigDecimal?

) : BaseResource()

