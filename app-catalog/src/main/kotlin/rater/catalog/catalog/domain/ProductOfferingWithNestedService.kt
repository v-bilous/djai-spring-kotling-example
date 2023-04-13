package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.NestedProductOfferingDto
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param nestedProductOffers 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "nestedProductOffers")

@Entity
@Table(name = "product_offering_with_nested_service")
data class ProductOfferingWithNestedService(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "nested_product_offering_dto_to_product_offering_with_nested_service",
			joinColumns = [JoinColumn(name = "product_offering_with_nested_service_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "nested_product_offering_dto_id", referencedColumnName = "id")]
	)
	var nestedProductOffers: List<NestedProductOfferingDto>

) : BaseDomain()

