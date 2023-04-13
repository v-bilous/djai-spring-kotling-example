package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBalance
import java.util.UUID
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogBalanceControllerRepository
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
class CatalogBalanceControllerApiIT : AbstractIntegrationTest<CatalogBalance>() {

	private val url = "/balances"

	@Autowired
	lateinit var repository: CatalogBalanceControllerRepository

	@Test
	fun `deleteAllUsingDELETE1 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE1 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET2 api`() {
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
	fun `getByIdUsingGET3 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET3 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST1 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST1 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST1 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST1 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT1 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT1 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogBalance, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertListsEquals(savedResource.actionSetIds, getValue(result, "$prefix.actionSetIds"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.currencyId, getValue(result, "$prefix.currencyId"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isExternal, getValue(result, "$prefix.isExternal"))
		assertEquals(savedResource.isVirtual, getValue(result, "$prefix.isVirtual"))
		assertEquals(savedResource.maximumBalance, getValue(result, "$prefix.maximumBalance"))
		assertEquals(savedResource.minimumBalance, getValue(result, "$prefix.minimumBalance"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogBalance {
	return CatalogBalance(
				actionSetIds = null,
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				currencyId = "test string value",
				description = null,
				isDeleted = false,
				isExternal = false,
				isVirtual = false,
				maximumBalance = 9223372036854775807L,
				minimumBalance = 9223372036854775807L,
				name = null,
				realm = "test string value",
				type = "test string value",
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogBalance {
		return CatalogBalance(
				actionSetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				currencyId = "test string value",
				description = "test string value",
				isDeleted = false,
				isExternal = false,
				isVirtual = false,
				maximumBalance = 9223372036854775807L,
				minimumBalance = 9223372036854775807L,
				name = "test string value",
				realm = "test string value",
				type = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
