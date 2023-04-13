package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogLcpTemplate
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param lcpTemplate 
* @param name 
* @param position 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "lcpTemplate", "name", "position")

@Entity
@Table(name = "lcp_template_header")
data class LcpTemplateHeader(

	@Column(name = "lcp_template")
	var lcpTemplate: CatalogLcpTemplate?,

	@Column(name = "name")
	var name: String,

	@Column(name = "position")
	var position: Int

) : BaseDomain()

