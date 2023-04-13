package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogPriceItem
import rater.catalog.catalog.domain.CatalogTariff
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param catalogTariff 
* @param catalogTariffId 
* @param createdDate 
* @param currencyId 
* @param isDeleted 
* @param name 
* @param nextStep 
* @param priceItem 
* @param repetitions 
* @param step 
* @param updatedDate 
* @param value 
* @param version 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("catalogTariff", "catalogTariffId", "createdDate", "currencyId", "id", "isDeleted", "name", "nextStep", "priceItem", "repetitions", "step", "updatedDate", "value", "version")

@Entity
@Table(name = "catalog_tariff_step")
data class CatalogTariffStep(

	@Column(name = "catalog_tariff")
	var catalogTariff: CatalogTariff?,

	@Column(name = "catalog_tariff_id")
	var catalogTariffId: UUID?,

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "currency_id")
	var currencyId: String?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "next_step")
	var nextStep: Int?,

	@OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "price_item", referencedColumnName = "id")
	var priceItem: CatalogPriceItem,

	@Column(name = "repetitions")
	var repetitions: Int?,

	@Column(name = "step")
	var step: Int,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?,

	@Column(name = "value_")
	var value: Long?,

	@Column(name = "version")
	var version: Long?

) : BaseResource()

