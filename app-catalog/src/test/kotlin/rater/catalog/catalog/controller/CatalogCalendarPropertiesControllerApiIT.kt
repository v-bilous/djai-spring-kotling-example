package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogCalendarProperties
import java.util.UUID
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogCalendarPropertiesControllerRepository
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
class CatalogCalendarPropertiesControllerApiIT : AbstractIntegrationTest<CatalogCalendarProperties>() {

	private val url = "/calendars/parent-id/properties"

	@Autowired
	lateinit var repository: CatalogCalendarPropertiesControllerRepository

	@Test
	fun `deleteAllUsingDELETE10 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE10 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET11 api`() {
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
	fun `getByIdUsingGET12 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET12 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET2 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET2 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST10 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST10 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST10 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST10 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT10 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT10 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogCalendarProperties, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.catalogCalendarId, getValue(result, "$prefix.catalogCalendarId"))
		assertEquals(savedResource.color, getValue(result, "$prefix.color"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.domFrom, getValue(result, "$prefix.domFrom") as Int?)
		assertEquals(savedResource.domTo, getValue(result, "$prefix.domTo") as Int?)
		assertEquals(savedResource.dowFrom, getValue(result, "$prefix.dowFrom") as Int?)
		assertEquals(savedResource.dowTo, getValue(result, "$prefix.dowTo") as Int?)
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.monthFrom, getValue(result, "$prefix.monthFrom") as Int?)
		assertEquals(savedResource.monthTo, getValue(result, "$prefix.monthTo") as Int?)
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.special, getValue(result, "$prefix.special"))
		assertEquals(savedResource.timeFrom, getValue(result, "$prefix.timeFrom"))
		assertEquals(savedResource.timeTo, getValue(result, "$prefix.timeTo"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.version, getValue(result, "$prefix.version"))
		assertEquals(savedResource.yearFrom, getValue(result, "$prefix.yearFrom") as Int?)
		assertEquals(savedResource.yearTo, getValue(result, "$prefix.yearTo") as Int?)
	}

	private fun createWithRequiredFields(): CatalogCalendarProperties {
	return CatalogCalendarProperties(
				catalogCalendarId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				color = null,
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				domFrom = 8,
				domTo = null,
				dowFrom = 8,
				dowTo = null,
				isDeleted = false,
				monthFrom = 8,
				monthTo = null,
				name = "test string value",
				special = null,
				timeFrom = null,
				timeTo = null,
				updatedDate = null,
				version = null,
				yearFrom = 8,
				yearTo = null
		)
	}

	private fun createWithAllFields(): CatalogCalendarProperties {
		return CatalogCalendarProperties(
				catalogCalendarId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				color = "test string value",
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				domFrom = 8,
				domTo = 8,
				dowFrom = 8,
				dowTo = 8,
				isDeleted = false,
				monthFrom = 8,
				monthTo = 8,
				name = "test string value",
				special = false,
				timeFrom = "test string value",
				timeTo = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				version = 9223372036854775807L,
				yearFrom = 8,
				yearTo = 8
		)
	}

}
