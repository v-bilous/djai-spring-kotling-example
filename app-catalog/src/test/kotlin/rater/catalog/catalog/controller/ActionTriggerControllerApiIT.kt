package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.ActionTrigger
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.ActionTriggerControllerRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MvcResult
import org.springframework.util.LinkedMultiValueMap
import java.util.*
import kotlin.test.*

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [CatalogApplication::class])
@AutoConfigureMockMvc
class ActionTriggerControllerApiIT : AbstractIntegrationTest<ActionTrigger>() {

	private val url = "/path-not-found"

	@Autowired
	lateinit var repository: ActionTriggerControllerRepository

	@Test
	fun `getAllUsingGET1 api`() {
		repository.deleteAll()
		val res1 = createWithRequiredFields()
		val res2 = createWithAllFields()

		val savedRes1 = repository.save(res1)
		val savedRes2 = repository.save(res2)

		val params = LinkedMultiValueMap<String, String>()
		params["sort"] = "entity.history.createdDate"
		val result = super.findAll(url, params)

		resourceAsserts(savedRes1, result, 0)
		resourceAsserts(savedRes2, result, 1)
	}


	private fun resourceAsserts(savedResource: ActionTrigger, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.hasValue, getValue(result, "$prefix.hasValue"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isSystem, getValue(result, "$prefix.isSystem"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertListsEquals(savedResource.valueType, getValue(result, "$prefix.valueType"))
	}

	private fun createWithRequiredFields(): ActionTrigger {
	return ActionTrigger(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				hasValue = false,
				isDeleted = false,
				isSystem = false,
				name = "test string value",
				type = "test string value",
				updatedDate = null,
				valueType = null
		)
	}

	private fun createWithAllFields(): ActionTrigger {
		return ActionTrigger(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				hasValue = false,
				isDeleted = false,
				isSystem = false,
				name = "test string value",
				type = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				valueType = listOf("test_list_string_value")
		)
	}

}
