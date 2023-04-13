package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.CatalogLcpConfiguration
import rater.catalog.catalog.domain.LcpConfigurationValue
import rater.catalog.catalog.domain.LcpRowType
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param entityId 
* @param lcpConfiguration 
* @param position 
* @param type 
* @param values 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("entityId", "id", "lcpConfiguration", "position", "type", "values")

@Entity
@Table(name = "lcp_configuration_row")
data class LcpConfigurationRow(

	@Column(name = "entity_id")
	var entityId: UUID?,

	@Column(name = "lcp_configuration")
	var lcpConfiguration: CatalogLcpConfiguration?,

	@Column(name = "position")
	var position: Int,

	@AttributeOverrides(
		AttributeOverride(name = "name", column = Column(name = "type_name")),
		AttributeOverride(name = "requiredId", column = Column(name = "type_required_id")),
	)
	@Embedded
	var type: LcpRowType,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "lcp_configuration_row_to_lcp_configuration_value",
			joinColumns = [JoinColumn(name = "lcp_configuration_row_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "lcp_configuration_value_id", referencedColumnName = "id")]
	)
	var values: List<LcpConfigurationValue>

) : BaseDomain()

