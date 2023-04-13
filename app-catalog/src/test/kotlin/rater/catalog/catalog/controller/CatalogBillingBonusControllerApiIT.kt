package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogBillingBonus
import java.util.UUID
import rater.catalog.catalog.domain.BonusStep
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogBillingBonusControllerRepository
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
class CatalogBillingBonusControllerApiIT : AbstractIntegrationTest<CatalogBillingBonus>() {

	private val url = "/billing-bonuses"

	@Autowired
	lateinit var repository: CatalogBillingBonusControllerRepository

	@Test
	fun `deleteAllUsingDELETE3 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE3 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET4 api`() {
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
	fun `getByIdUsingGET5 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET5 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST3 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST3 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST3 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST3 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT3 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT3 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogBillingBonus, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertListsEquals(savedResource.bonusSetIds, getValue(result, "$prefix.bonusSetIds"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertListsEquals(savedResource.entityIds, getValue(result, "$prefix.entityIds"))
		assertEquals(savedResource.entityType, getValue(result, "$prefix.entityType"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.steps, getValue(result, "$prefix.steps"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.unitType, getValue(result, "$prefix.unitType"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogBillingBonus {
	return CatalogBillingBonus(
				bonusSetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				entityIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				entityType = "test string value",
				isDeleted = false,
				name = null,
				steps = listOf(BonusStep(
					balanceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					bonus = null,
					currency = "test string value",
					from = 777.77.toBigDecimal(),
					to = 777.77.toBigDecimal(),
					value = 777.77.toBigDecimal()
				)),
				type = "test string value",
				unitType = null,
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogBillingBonus {
		return CatalogBillingBonus(
				bonusSetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				entityIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				entityType = "test string value",
				isDeleted = false,
				name = "test string value",
				steps = listOf(BonusStep(
					balanceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					bonus = null,
					currency = "test string value",
					from = 777.77.toBigDecimal(),
					to = 777.77.toBigDecimal(),
					value = 777.77.toBigDecimal()
				)),
				type = "test string value",
				unitType = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
