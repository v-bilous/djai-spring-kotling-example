package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.CatalogProduct
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param alias 
* @param codes 
* @param createdDate 
* @param isDefault 
* @param isDeleted 
* @param name 
* @param products 
* @param realm 
* @param serviceIds 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("alias", "codes", "createdDate", "id", "isDefault", "isDeleted", "name", "products", "realm", "serviceIds", "updatedDate")

@Entity
@Table(name = "catalog_provider")
data class CatalogProvider(

	@Column(name = "alias")
	var alias: String?,

	@Type(type = "json")
	@Column(name = "codes", columnDefinition = "json")
	var codes: Set<String>,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "is_default")
	var isDefault: Boolean,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_product_to_catalog_provider",
			joinColumns = [JoinColumn(name = "catalog_provider_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "catalog_product_id", referencedColumnName = "id")]
	)
	var products: Set<CatalogProduct>,

	@Column(name = "realm")
	var realm: String,

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(
			name = "catalog_provider_to_uuid",
			joinColumns = [JoinColumn(name = "catalog_provider_id")]
	)
	@Column(name = "uuid_id")
	var serviceIds: Set<UUID>,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

