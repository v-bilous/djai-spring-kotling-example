package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param currencyId 
* @param description 
* @param name 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currencyId", "description", "id", "name", "value")

@Entity
@Table(name = "price_item_view")
data class PriceItemView(

	@Column(name = "currency_id")
	var currencyId: String?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "name")
	var name: String,

	@Column(name = "value_")
	var value: Long

) : BaseResource()

