package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.OfferData
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param description 
* @param name 
* @param offers 
* @param realm 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("description", "id", "name", "offers", "realm")

@Entity
@Table(name = "catalog_offer_label_dto")
data class CatalogOfferLabelDto(

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_offer_label_dto_to_offer_data",
			joinColumns = [JoinColumn(name = "catalog_offer_label_dto_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "offer_data_id", referencedColumnName = "id")]
	)
	var offers: List<OfferData>,

	@Column(name = "realm")
	var realm: String

) : BaseResource()

