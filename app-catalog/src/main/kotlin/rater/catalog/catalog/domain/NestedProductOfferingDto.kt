package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param serviceId 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "serviceId")

@Entity
@Table(name = "nested_product_offering_dto")
data class NestedProductOfferingDto(

	@Column(name = "service_id")
	var serviceId: UUID

) : BaseDomain()

