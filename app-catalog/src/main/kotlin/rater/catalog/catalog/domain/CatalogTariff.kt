package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogTariffStep
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param isAdaptive 
* @param isDeleted 
* @param isIndividual 
* @param isSystem 
* @param name 
* @param realm 
* @param steps 
* @param type 
* @param updatedDate 
* @param version 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "id", "isAdaptive", "isDeleted", "isIndividual", "isSystem", "name", "realm", "steps", "type", "updatedDate", "version")

@Entity
@Table(name = "catalog_tariff")
data class CatalogTariff(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_adaptive")
	var isAdaptive: Boolean?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_individual")
	var isIndividual: Boolean,

	@Column(name = "is_system")
	var isSystem: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "realm")
	var realm: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_tariff_to_catalog_tariff_step",
			joinColumns = [JoinColumn(name = "catalog_tariff_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "catalog_tariff_step_id", referencedColumnName = "id")]
	)
	var steps: Set<CatalogTariffStep>,

	@Column(name = "type")
	var type: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "version")
	var version: Long?

) : BaseResource()

