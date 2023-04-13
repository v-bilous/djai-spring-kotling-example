package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.LayoutRatingParameters
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param data 
* @param description 
* @param isDeleted 
* @param isIndividual 
* @param name 
* @param ratingParameterSetId 
* @param realm 
* @param updatedDate 
* @param version 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "data", "description", "id", "isDeleted", "isIndividual", "name", "ratingParameterSetId", "realm", "updatedDate", "version")

@Entity
@Table(name = "catalog_layout")
data class CatalogLayout(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_layout_to_layout_rating_parameters",
			joinColumns = [JoinColumn(name = "catalog_layout_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "layout_rating_parameters_id", referencedColumnName = "id")]
	)
	var data: Set<LayoutRatingParameters>,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "is_individual")
	var isIndividual: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "rating_parameter_set_id")
	var ratingParameterSetId: UUID?,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "version")
	var version: Long?

) : BaseResource()

