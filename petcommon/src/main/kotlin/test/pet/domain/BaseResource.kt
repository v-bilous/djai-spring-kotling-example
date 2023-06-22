package test.pet.domain

import test.pet.listener.BaseResourceListener
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@MappedSuperclass
@EntityListeners(BaseResourceListener::class)
open class BaseResource {

	@JsonIgnore
	@Id
	open var id: String? = null
		set(value) {
			field = value
		}


}
