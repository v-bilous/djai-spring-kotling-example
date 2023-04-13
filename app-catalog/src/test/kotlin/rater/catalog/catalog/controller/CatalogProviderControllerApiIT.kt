package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogProvider
import java.util.UUID
import rater.catalog.catalog.domain.CatalogProduct
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogProviderControllerRepository
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
class CatalogProviderControllerApiIT : AbstractIntegrationTest<CatalogProvider>() {

	private val url = "/providers"

	@Autowired
	lateinit var repository: CatalogProviderControllerRepository

	@Test
	fun `deleteAllUsingDELETE18 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE19 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET22 api`() {
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
	fun `getByIdUsingGET23 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET23 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST18 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST18 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST19 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST19 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT18 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT18 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogProvider, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.alias, getValue(result, "$prefix.alias"))
		assertListsEquals(savedResource.codes, getValue(result, "$prefix.codes"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.isDefault, getValue(result, "$prefix.isDefault"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.products, getValue(result, "$prefix.products"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertListsEquals(savedResource.serviceIds, getValue(result, "$prefix.serviceIds"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogProvider {
	return CatalogProvider(
				alias = null,
				codes = setOf("test_set_string_value"),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				isDefault = false,
				isDeleted = false,
				name = "test string value",
				products = setOf(CatalogProduct(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					description = "test string value",
					isActive = false,
					isDeleted = false,
					name = "test string value",
					providerId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					realm = "test string value",
					serviceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				realm = "test string value",
				serviceIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogProvider {
		return CatalogProvider(
				alias = "test string value",
				codes = setOf("test_set_string_value"),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				isDefault = false,
				isDeleted = false,
				name = "test string value",
				products = setOf(CatalogProduct(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					description = "test string value",
					isActive = false,
					isDeleted = false,
					name = "test string value",
					providerId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					realm = "test string value",
					serviceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					updatedDate = java.sql.Timestamp(System.currentTimeMillis())
				)),
				realm = "test string value",
				serviceIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
