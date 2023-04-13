package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogTariffStep
import java.util.UUID
import rater.catalog.catalog.domain.CatalogPriceItem
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogTariffStepControllerRepository
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
class CatalogTariffStepControllerApiIT : AbstractIntegrationTest<CatalogTariffStep>() {

	private val url = "/tariffs/parent-id/steps"

	@Autowired
	lateinit var repository: CatalogTariffStepControllerRepository

	@Test
	fun `deleteAllUsingDELETE24 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE25 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET28 api`() {
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
	fun `getByIdUsingGET29 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET29 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET37 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET37 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST24 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST24 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST25 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST25 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT24 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT24 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogTariffStep, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.catalogTariff, getValue(result, "$prefix.catalogTariff"))
		assertEquals(savedResource.catalogTariffId, getValue(result, "$prefix.catalogTariffId"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.currencyId, getValue(result, "$prefix.currencyId"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.nextStep, getValue(result, "$prefix.nextStep") as Int?)
		assertObjectEquals(savedResource.priceItem, getValue(result, "$prefix.priceItem"))
		assertEquals(savedResource.repetitions, getValue(result, "$prefix.repetitions") as Int?)
		assertEquals(savedResource.step, getValue(result, "$prefix.step") as Int?)
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.value, getValue(result, "$prefix.value"))
		assertEquals(savedResource.version, getValue(result, "$prefix.version"))
	}

	private fun createWithRequiredFields(): CatalogTariffStep {
	return CatalogTariffStep(
				catalogTariff = null,
				catalogTariffId = null,
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				currencyId = null,
				isDeleted = false,
				name = "test string value",
				nextStep = null,
				priceItem = CatalogPriceItem(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					currencyId = "test string value",
					description = "test string value",
					isDeleted = false,
					name = "test string value",
					realm = "test string value",
					updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
					value = 9223372036854775807L,
					version = 9223372036854775807L
				),
				repetitions = null,
				step = 8,
				updatedDate = null,
				value = null,
				version = null
		)
	}

	private fun createWithAllFields(): CatalogTariffStep {
		return CatalogTariffStep(
				catalogTariff = null,
				catalogTariffId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				currencyId = "test string value",
				isDeleted = false,
				name = "test string value",
				nextStep = 8,
				priceItem = CatalogPriceItem(
					createdDate = java.sql.Timestamp(System.currentTimeMillis()),
					currencyId = "test string value",
					description = "test string value",
					isDeleted = false,
					name = "test string value",
					realm = "test string value",
					updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
					value = 9223372036854775807L,
					version = 9223372036854775807L
				),
				repetitions = 8,
				step = 8,
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				value = 9223372036854775807L,
				version = 9223372036854775807L
		)
	}

}
