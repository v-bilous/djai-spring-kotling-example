package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogTariff
import java.util.UUID
import rater.catalog.catalog.domain.CatalogTariffStep
import rater.catalog.catalog.domain.CatalogPriceItem
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogTariffControllerRepository
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
class CatalogTariffControllerApiIT : AbstractIntegrationTest<CatalogTariff>() {

	private val url = "/tariffs"

	@Autowired
	lateinit var repository: CatalogTariffControllerRepository

	@Test
	fun `deleteAllUsingDELETE22 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `deleteUsingDELETE23 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET26 api`() {
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
	fun `getByIdUsingGET27 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET27 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST22 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST22 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST23 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST23 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT22 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT22 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogTariff, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isAdaptive, getValue(result, "$prefix.isAdaptive"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isIndividual, getValue(result, "$prefix.isIndividual"))
		assertEquals(savedResource.isSystem, getValue(result, "$prefix.isSystem"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertListsEquals(savedResource.steps, getValue(result, "$prefix.steps"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.version, getValue(result, "$prefix.version"))
	}

	private fun createWithRequiredFields(): CatalogTariff {
	return CatalogTariff(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = null,
				isAdaptive = null,
				isDeleted = false,
				isIndividual = false,
				isSystem = false,
				name = "test string value",
				realm = "test string value",
				steps = setOf(CatalogTariffStep(
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
				)),
				type = "test string value",
				updatedDate = null,
				version = null
		)
	}

	private fun createWithAllFields(): CatalogTariff {
		return CatalogTariff(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				description = "test string value",
				isAdaptive = false,
				isDeleted = false,
				isIndividual = false,
				isSystem = false,
				name = "test string value",
				realm = "test string value",
				steps = setOf(CatalogTariffStep(
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
				)),
				type = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				version = 9223372036854775807L
		)
	}

}
