package rater.catalog.catalog.domain

import java.util.Date
import java.util.UUID
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param currencyId 
* @param effectiveDateFrom 
* @param effectiveDateTo 
* @param isDeleted 
* @param providerId 
* @param rate 
* @param realm 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "currencyId", "effectiveDateFrom", "effectiveDateTo", "id", "isDeleted", "providerId", "rate", "realm", "updatedDate")

@Entity
@Table(name = "exchange_rate")
data class ExchangeRate(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "currency_id")
	var currencyId: String,

	@Column(name = "effective_date_from")
	var effectiveDateFrom: Date?,

	@Column(name = "effective_date_to")
	var effectiveDateTo: Date?,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "provider_id")
	var providerId: UUID?,

	@Column(name = "rate")
	var rate: Long,

	@Column(name = "realm")
	var realm: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

