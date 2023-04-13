package rater.catalog.catalog.domain

import java.util.UUID
import org.hibernate.annotations.Type
import rater.catalog.catalog.domain.LayoutParameterItemDto
import rater.catalog.domain.BaseDomain
import com.fasterxml.jackson.annotation.*
import javax.persistence.*
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption

/**
* 
* @param parameters 
* @param position 
* @param tags 
*/
@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"], comments = "version:")

@JsonPropertyOrder("id", "parameters", "position", "tags")

@Entity
@Table(name = "layout_group_item")
data class LayoutGroupItem(

	@OneToMany(cascade = [CascadeType.ALL])
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "layout_group_item_to_layout_parameter_item_dto",
			joinColumns = [JoinColumn(name = "layout_group_item_id", referencedColumnName = "id")],
			inverseJoinColumns = [JoinColumn(name = "layout_parameter_item_dto_id", referencedColumnName = "id")]
	)
	var parameters: List<LayoutParameterItemDto>,

	@Column(name = "position")
	var position: Int,

	@Type(type = "json")
	@Column(name = "tags", columnDefinition = "json")
	var tags: Set<String>

) : BaseDomain()

