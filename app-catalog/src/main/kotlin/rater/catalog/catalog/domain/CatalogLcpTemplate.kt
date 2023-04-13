package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.LcpTemplateHeader
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param headers 
* @param isDeleted 
* @param name 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "headers", "id", "isDeleted", "name", "updatedDate")

@Entity
@Table(name = "catalog_lcp_template")
data class CatalogLcpTemplate(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_lcp_template_to_lcp_template_header",
			joinColumns = [JoinColumn(name = "catalog_lcp_template_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "lcp_template_header_id", referencedColumnName = "id")]
	)
	var headers: List<LcpTemplateHeader>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "name")
	var name: String,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

