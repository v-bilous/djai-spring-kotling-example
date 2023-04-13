package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.LcpConfigurationRow
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param createdDate 
* @param description 
* @param entityTypes 
* @param isDeleted 
* @param lcpTemplateId 
* @param name 
* @param rows 
* @param updatedDate 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("createdDate", "description", "entityTypes", "id", "isDeleted", "lcpTemplateId", "name", "rows", "updatedDate")

@Entity
@Table(name = "catalog_lcp_configuration")
data class CatalogLcpConfiguration(

	@Column(name = "created_date")
	var createdDate: java.sql.Timestamp,

	@Column(name = "description")
	var description: String?,

	@Type(type = "json")
	@Column(name = "entity_types", columnDefinition = "json")
	var entityTypes: List<String>,

	@Column(name = "is_deleted")
	var isDeleted: Boolean,

	@Column(name = "lcp_template_id")
	var lcpTemplateId: UUID,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "catalog_lcp_configuration_to_lcp_configuration_row",
			joinColumns = [JoinColumn(name = "catalog_lcp_configuration_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "lcp_configuration_row_id", referencedColumnName = "id")]
	)
	var rows: List<LcpConfigurationRow>,

	@Column(name = "updated_date")
	var updatedDate: java.sql.Timestamp?

) : BaseResource()

