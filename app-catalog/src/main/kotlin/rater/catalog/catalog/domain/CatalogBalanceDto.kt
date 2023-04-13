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
* @param isExternal 
* @param isVirtual 
* @param maximumBalance 
* @param minimumBalance 
* @param name 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("currencyId", "description", "id", "isExternal", "isVirtual", "maximumBalance", "minimumBalance", "name", "type")

@Entity
@Table(name = "catalog_balance_dto")
data class CatalogBalanceDto(

	@Column(name = "currency_id")
	var currencyId: String?,

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_external")
	var isExternal: Boolean,

	@Column(name = "is_virtual")
	var isVirtual: Boolean,

	@Column(name = "maximum_balance")
	var maximumBalance: Long,

	@Column(name = "minimum_balance")
	var minimumBalance: Long,

	@Column(name = "name")
	var name: String?,

	@Column(name = "type")
	var type: String

) : BaseResource()

