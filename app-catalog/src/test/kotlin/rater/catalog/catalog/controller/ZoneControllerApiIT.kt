package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogZone
import java.util.UUID
import rater.catalog.catalog.domain.CatalogLayout
import rater.catalog.catalog.domain.LayoutRatingParameters
import rater.catalog.catalog.domain.LayoutRatingParametersGroup
import rater.catalog.catalog.domain.LayoutGroupItem
import rater.catalog.catalog.domain.LayoutParameterItemDto
import rater.catalog.catalog.domain.LayoutParameterItem
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.ZoneControllerRepository
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
class ZoneControllerApiIT : AbstractIntegrationTest<CatalogZone>() {

	private val url = "/zone"

	@Autowired
	lateinit var repository: ZoneControllerRepository

	@Test
	fun `deleteAllUsingDELETE30 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE33 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET36 api`() {
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
	fun `getByIdUsingGET38 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET38 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST33 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST33 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST32 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST32 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT31 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT31 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogZone, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertListsEquals(savedResource.eligibilitySet, getValue(result, "$prefix.eligibilitySet"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isSystem, getValue(result, "$prefix.isSystem"))
		assertObjectEquals(savedResource.layout, getValue(result, "$prefix.layout"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogZone {
	return CatalogZone(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				eligibilitySet = listOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				isSystem = false,
				layout = null,
				name = null,
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogZone {
		return CatalogZone(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				eligibilitySet = listOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				isSystem = false,
				layout = CatalogLayout(
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
				),
				name = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
