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
* @param description 
* @param discountIds 
* @param isDeleted 
* @param name 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "discountIds", "id", "isDeleted", "name", "updatedDate")

@Entity
@Table(name = "catalog_billing_discount_set")
data class CatalogBillingDiscountSet(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_billing_discount_set_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_billing_discount_set_id")]
	)
	@Column(name = "uuid_id")
	var discountIds: Set<UUID>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String?,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

