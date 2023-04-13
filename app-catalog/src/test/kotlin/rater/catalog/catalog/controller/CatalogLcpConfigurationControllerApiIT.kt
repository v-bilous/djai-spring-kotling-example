package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLcpConfiguration
import java.util.UUID
import rater.catalog.catalog.domain.LcpConfigurationRow
import rater.catalog.catalog.domain.LcpRowType
import rater.catalog.catalog.domain.LcpConfigurationValue
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogLcpConfigurationControllerRepository
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
class CatalogLcpConfigurationControllerApiIT : AbstractIntegrationTest<CatalogLcpConfiguration>() {

	private val url = "/lcp-configurations/template"

	@Autowired
	lateinit var repository: CatalogLcpConfigurationControllerRepository

	@Test
	fun `deleteAllUsingDELETE12 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE12 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `findByLcpTemplateIdUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `findByLcpTemplateIdUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET13 api`() {
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
	fun `getByIdUsingGET14 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET14 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST12 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST12 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST12 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST12 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT12 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT12 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogLcpConfiguration, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertListsEquals(savedResource.entityTypes, getValue(result, "$prefix.entityTypes"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.lcpTemplateId, getValue(result, "$prefix.lcpTemplateId"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.rows, getValue(result, "$prefix.rows"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogLcpConfiguration {
	return CatalogLcpConfiguration(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				entityTypes = listOf("test_list_string_value"),
				isDeleted = false,
				lcpTemplateId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				name = "test string value",
				rows = listOf(LcpConfigurationRow(
					entityId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					lcpConfiguration = null,
					position = 8,
					type = LcpRowType(
					name = "test string value",
					requiredId = false
				),
					values = listOf(LcpConfigurationValue(
					lcpConfigurationRow = null,
					position = 8,
					state = "test string value",
					value = false
				))
				)),
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogLcpConfiguration {
		return CatalogLcpConfiguration(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				entityTypes = listOf("test_list_string_value"),
				isDeleted = false,
				lcpTemplateId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				name = "test string value",
				rows = listOf(LcpConfigurationRow(
					entityId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					lcpConfiguration = null,
					position = 8,
					type = LcpRowType(
					name = "test string value",
					requiredId = false
				),
					values = listOf(LcpConfigurationValue(
					lcpConfigurationRow = null,
					position = 8,
					state = "test string value",
					value = false
				))
				)),
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
