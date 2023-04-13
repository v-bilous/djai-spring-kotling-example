package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogProductOfferingDto
import rater.catalog.catalog.domain.ProductOfferingWithNestedService
import java.util.UUID
import rater.catalog.catalog.domain.CatalogOfferLabelDto
import rater.catalog.catalog.domain.OfferData
import rater.catalog.catalog.domain.CatalogLimit
import rater.catalog.catalog.domain.SimpleProductOfferingDto
import rater.catalog.catalog.domain.CatalogProductDto
import rater.catalog.catalog.domain.CatalogBalanceDto
import rater.catalog.catalog.domain.CatalogOfferTermDto
import rater.catalog.catalog.domain.CatalogRecurringType
import rater.catalog.catalog.domain.CatalogOfferPrice
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogProductOfferingFullViewControllerRepository
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
class CatalogProductOfferingFullViewControllerApiIT : AbstractIntegrationTest<CatalogProductOfferingDto>() {

	private val url = "/path-not-found"

	@Autowired
	lateinit var repository: CatalogProductOfferingFullViewControllerRepository

	@Test
	fun `getAllUsingGET21 api`() {
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
	fun `getNestedServicesUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getNestedServicesUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogProductOfferingDto, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.cardinality, getValue(result, "$prefix.cardinality") as Int?)
		assertListsEquals(savedResource.compatibilitySetIds, getValue(result, "$prefix.compatibilitySetIds"))
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertEquals(savedResource.customFields, getValue(result, "$prefix.customFields"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertListsEquals(savedResource.eligibilitySetIds, getValue(result, "$prefix.eligibilitySetIds"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.isIndividual, getValue(result, "$prefix.isIndividual"))
		assertEquals(savedResource.isOffered, getValue(result, "$prefix.isOffered"))
		assertEquals(savedResource.isPrimary, getValue(result, "$prefix.isPrimary"))
		assertListsEquals(savedResource.labels, getValue(result, "$prefix.labels"))
		assertObjectEquals(savedResource.limit, getValue(result, "$prefix.limit"))
		assertEquals(savedResource.linkedOffers, getValue(result, "$prefix.linkedOffers"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.nestedProductOffers, getValue(result, "$prefix.nestedProductOffers"))
		assertObjectEquals(savedResource.offerTerm, getValue(result, "$prefix.offerTerm"))
		assertObjectEquals(savedResource.periodicBalance, getValue(result, "$prefix.periodicBalance"))
		assertObjectEquals(savedResource.price, getValue(result, "$prefix.price"))
		assertEquals(savedResource.productId, getValue(result, "$prefix.productId"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertObjectEquals(savedResource.usageBalance, getValue(result, "$prefix.usageBalance"))
	}

	private fun createWithRequiredFields(): CatalogProductOfferingDto {
	return CatalogProductOfferingDto(
				cardinality = null,
				compatibilitySetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				customFields = null,
				description = null,
				eligibilitySetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				isIndividual = false,
				isOffered = false,
				isPrimary = false,
				labels = listOf(CatalogOfferLabelDto(
					description = "test string value",
					name = "test string value",
					offers = listOf(OfferData(
					name = "test string value"
				)),
					realm = "test string value"
				)),
				limit = null,
				linkedOffers = "hash_map_string_value",
				name = "test string value",
				nestedProductOffers = listOf(SimpleProductOfferingDto(
					allowance = 9223372036854775807L,
					customFields = "hash_map_string_value",
					limit = CatalogLimit(
					currency = "test string value",
					value = 9223372036854775807L
				),
					name = "test string value",
					product = CatalogProductDto(
					name = "test string value"
				),
					type = "test string value",
					usageBalance = CatalogBalanceDto(
					currencyId = "test string value",
					description = "test string value",
					isExternal = false,
					isVirtual = false,
					maximumBalance = 9223372036854775807L,
					minimumBalance = 9223372036854775807L,
					name = "test string value",
					type = "test string value"
				)
				)),
				offerTerm = null,
				periodicBalance = null,
				price = null,
				productId = null,
				realm = "test string value",
				type = "test string value",
				updatedDate = null,
				usageBalance = null
		)
	}

	private fun createWithAllFields(): CatalogProductOfferingDto {
		return CatalogProductOfferingDto(
				cardinality = 8,
				compatibilitySetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				customFields = "hash_map_string_value",
				description = "test string value",
				eligibilitySetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				isDeleted = false,
				isIndividual = false,
				isOffered = false,
				isPrimary = false,
				labels = listOf(CatalogOfferLabelDto(
					description = "test string value",
					name = "test string value",
					offers = listOf(OfferData(
					name = "test string value"
				)),
					realm = "test string value"
				)),
				limit = CatalogLimit(
					currency = "test string value",
					value = 9223372036854775807L
				),
				linkedOffers = "hash_map_string_value",
				name = "test string value",
				nestedProductOffers = listOf(SimpleProductOfferingDto(
					allowance = 9223372036854775807L,
					customFields = "hash_map_string_value",
					limit = CatalogLimit(
					currency = "test string value",
					value = 9223372036854775807L
				),
					name = "test string value",
					product = CatalogProductDto(
					name = "test string value"
				),
					type = "test string value",
					usageBalance = CatalogBalanceDto(
					currencyId = "test string value",
					description = "test string value",
					isExternal = false,
					isVirtual = false,
					maximumBalance = 9223372036854775807L,
					minimumBalance = 9223372036854775807L,
					name = "test string value",
					type = "test string value"
				)
				)),
				offerTerm = CatalogOfferTermDto(
					allowance = 9223372036854775807L,
					allowanceRenewalStrategy = "test string value",
					effectiveDateFrom = Date(),
					effectiveDateTo = Date(),
					isRemoveAfterBalanceDepletion = false,
					offerPriority = 8,
					offerRenewalStrategy = "test string value",
					realm = "test string value",
					recurringType = CatalogRecurringType(
					isCalendar = false,
					isProrated = false,
					realm = "test string value",
					type = "test string value",
					units = 9223372036854775807L,
					value = 9223372036854775807L
				),
					tariffPlanId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					type = "test string value"
				),
				periodicBalance = CatalogBalanceDto(
					currencyId = "test string value",
					description = "test string value",
					isExternal = false,
					isVirtual = false,
					maximumBalance = 9223372036854775807L,
					minimumBalance = 9223372036854775807L,
					name = "test string value",
					type = "test string value"
				),
				price = CatalogOfferPrice(
					currencyId = "test string value",
					realm = "test string value",
					value = 9223372036854775807L
				),
				productId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				realm = "test string value",
				type = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis()),
				usageBalance = CatalogBalanceDto(
					currencyId = "test string value",
					description = "test string value",
					isExternal = false,
					isVirtual = false,
					maximumBalance = 9223372036854775807L,
					minimumBalance = 9223372036854775807L,
					name = "test string value",
					type = "test string value"
				)
		)
	}

}
