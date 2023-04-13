package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.ActionSet
import java.util.UUID
import rater.catalog.catalog.domain.Action
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.ActionSetControllerRepository
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
class ActionSetControllerApiIT : AbstractIntegrationTest<ActionSet>() {

	private val url = "/action-sets"

	@Autowired
	lateinit var repository: ActionSetControllerRepository

	@Test
	fun `deleteAllUsingDELETE api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET api`() {
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

	@Test
	fun `getByIdUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: ActionSet, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertListsEquals(savedResource.actions, getValue(result, "$prefix.actions"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): ActionSet {
	return ActionSet(
				actions = listOf(Action(
					actionSet = null,
					actionSetId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					command = "test string value",
					commandType = "test string value",
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					description = "test string value",
					isDeleted = false,
					name = "test string value",
					triggerId = "test string value",
					triggerValue = 9223372036854775807L,
					triggerValueUnit = "test string value",
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				isDeleted = false,
				name = "test string value",
				realm = null,
				updatedDate = null
		)
	}

	private fun createWithAllFields(): ActionSet {
		return ActionSet(
				actions = listOf(Action(
					actionSet = null,
					actionSetId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					command = "test string value",
					commandType = "test string value",
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					description = "test string value",
					isDeleted = false,
					name = "test string value",
					triggerId = "test string value",
					triggerValue = 9223372036854775807L,
					triggerValueUnit = "test string value",
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				isDeleted = false,
				name = "test string value",
				realm = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
