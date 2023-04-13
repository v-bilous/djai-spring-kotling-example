package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLayout
import java.util.UUID
import rater.catalog.catalog.domain.LayoutRatingParameters
import rater.catalog.catalog.domain.LayoutRatingParametersGroup
import rater.catalog.catalog.domain.LayoutGroupItem
import rater.catalog.catalog.domain.LayoutParameterItemDto
import rater.catalog.catalog.domain.LayoutParameterItem
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogLayoutControllerRepository
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
class CatalogLayoutControllerApiIT : AbstractIntegrationTest<CatalogLayout>() {

	private val url = "/layouts"

	@Autowired
	lateinit var repository: CatalogLayoutControllerRepository

	@Test
	fun `deleteAllUsingDELETE11 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE11 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `downloadFileUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `downloadFileUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET12 api`() {
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
	fun `getByIdUsingGET13 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET13 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST11 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST11 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST11 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST11 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT11 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT11 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogLayout, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertListsEquals(savedResource.data, getValue(result, "$prefix.data"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isIndividual, getValue(result, "$prefix.isIndividual"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.ratingParameterSetId, getValue(result, "$prefix.ratingParameterSetId"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.version, getValue(result, "$prefix.version"))
	}

	private fun createWithRequiredFields(): CatalogLayout {
	return CatalogLayout(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				data = setOf(LayoutRatingParameters(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					group = LayoutRatingParametersGroup(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					isDeleted = false,
					name = "test string value",
					parameters = listOf(LayoutGroupItem(
					parameters = listOf(LayoutParameterItemDto(
					parameterGroupName = "test string value",
					value = "test string value"
				)),
					position = 8,
					tags = setOf("test_set_string_value")
				)),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				),
					isDeleted = false,
					layoutIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
					parameters = listOf(LayoutParameterItem(
					parameterGroupName = "test string value",
					value = "test string value"
				)),
					position = 8,
					tags = setOf("test_set_string_value"),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				description = null,
				isDeleted = false,
				isIndividual = false,
				name = "test string value",
				ratingParameterSetId = null,
				realm = "test string value",
				updatedDate = null,
				version = null
		)
	}

	private fun createWithAllFields(): CatalogLayout {
		return CatalogLayout(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				data = setOf(LayoutRatingParameters(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					group = LayoutRatingParametersGroup(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					isDeleted = false,
					name = "test string value",
					parameters = listOf(LayoutGroupItem(
					parameters = listOf(LayoutParameterItemDto(
					parameterGroupName = "test string value",
					value = "test string value"
				)),
					position = 8,
					tags = setOf("test_set_string_value")
				)),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				),
					isDeleted = false,
					layoutIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
					parameters = listOf(LayoutParameterItem(
					parameterGroupName = "test string value",
					value = "test string value"
				)),
					position = 8,
					tags = setOf("test_set_string_value"),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				description = "test string value",
				isDeleted = false,
				isIndividual = false,
				name = "test string value",
				ratingParameterSetId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				realm = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				version = 9223372036854775807L
		)
	}

}
