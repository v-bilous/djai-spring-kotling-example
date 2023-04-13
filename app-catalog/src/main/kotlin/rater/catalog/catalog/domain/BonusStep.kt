package rater.catalog.catalog.domain

import java.math.BigDecimal
import java.util.UUID
import rater.catalog.catalog.domain.CatalogBillingBonus
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param balanceId 
* @param bonus 
* @param currency 
* @param from 
* @param to 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("balanceId", "bonus", "currency", "from", "id", "to", "value")

@Entity
@Table(name = "bonus_step")
data class BonusStep(

	@Column(name = "balance_id")
	var balanceId: UUID?,

	@Column(name = "bonus")
	var bonus: CatalogBillingBonus?,

	@Column(name = "currency")
	var currency: String,

	@Column(name = "from_")
	var from: BigDecimal?,

	@Column(name = "to_")
	var to: BigDecimal?,

	@Column(name = "value_")
	var value: BigDecimal?

) : BaseDomain()

