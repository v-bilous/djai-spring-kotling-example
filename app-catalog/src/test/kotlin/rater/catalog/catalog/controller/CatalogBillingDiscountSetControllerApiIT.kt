package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingDiscountSet
import java.util.UUID
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogBillingDiscountSetControllerRepository
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
class CatalogBillingDiscountSetControllerApiIT : AbstractIntegrationTest<CatalogBillingDiscountSet>() {

	private val url = "/billing-discount-sets"

	@Autowired
	lateinit var repository: CatalogBillingDiscountSetControllerRepository

	@Test
	fun `deleteAllUsingDELETE6 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE6 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET7 api`() {
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
	fun `getByIdUsingGET8 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET8 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST6 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST6 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST6 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST6 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT6 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT6 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogBillingDiscountSet, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertListsEquals(savedResource.discountIds, getValue(result, "$prefix.discountIds"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogBillingDiscountSet {
	return CatalogBillingDiscountSet(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				discountIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				name = null,
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogBillingDiscountSet {
		return CatalogBillingDiscountSet(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				discountIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				name = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
