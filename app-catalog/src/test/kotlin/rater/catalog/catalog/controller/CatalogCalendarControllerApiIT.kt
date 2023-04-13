package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogCalendar
import java.util.UUID
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogCalendarControllerRepository
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
class CatalogCalendarControllerApiIT : AbstractIntegrationTest<CatalogCalendar>() {

	private val url = "/calendars"

	@Autowired
	lateinit var repository: CatalogCalendarControllerRepository

	@Test
	fun `deleteAllUsingDELETE9 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE9 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET10 api`() {
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
	fun `getByIdUsingGET11 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET11 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST9 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST9 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST9 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST9 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT9 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT9 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogCalendar, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.version, getValue(result, "$prefix.version"))
	}

	private fun createWithRequiredFields(): CatalogCalendar {
	return CatalogCalendar(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				isDeleted = false,
				name = "test string value",
				realm = "test string value",
				updatedDate = null,
				version = null
		)
	}

	private fun createWithAllFields(): CatalogCalendar {
		return CatalogCalendar(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				isDeleted = false,
				name = "test string value",
				realm = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				version = 9223372036854775807L
		)
	}

}
