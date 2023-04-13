package rater.catalog.catalog.domain

import java.util.UUID
import rater.catalog.catalog.domain.TariffStepView
import rater.catalog.domain.BaseResource
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param description 
* @param isAdaptive 
* @param isSystem 
* @param name 
* @param steps 
* @param type 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("description", "id", "isAdaptive", "isSystem", "name", "steps", "type")

@Entity
@Table(name = "tariff_view")
data class TariffView(

	@Column(name = "description")
	var description: String?,

	@Column(name = "is_adaptive")
	var isAdaptive: Boolean?,

	@Column(name = "is_system")
	var isSystem: Boolean,

	@Column(name = "name")
	var name: String,

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "tariff_step_view_to_tariff_view",
			joinColumns = [JoinColumn(name = "tariff_view_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "tariff_step_view_id", referencedColumnName = "id")]
	)
	var steps: Set<TariffStepView>,

	@Column(name = "type")
	var type: String

) : BaseResource()

