package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.LcpConfigurationRow
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param lcpConfigurationRow 
* @param position 
* @param state 
* @param value 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "lcpConfigurationRow", "position", "state", "value")

@Entity
@Table(name = "lcp_configuration_value")
data class LcpConfigurationValue(

	@Column(name = "lcp_configuration_row")
	var lcpConfigurationRow: LcpConfigurationRow?,

	@Column(name = "position")
	var position: Int,

	@Column(name = "state")
	var state: String,

	@Column(name = "value_")
	var value: Boolean

) : BaseDomain()

