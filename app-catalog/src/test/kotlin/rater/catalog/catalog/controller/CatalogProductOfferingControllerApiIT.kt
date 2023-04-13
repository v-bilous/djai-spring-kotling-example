package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogProductOffering
import java.util.UUID
import rater.catalog.catalog.domain.CatalogLimit
import rater.catalog.catalog.domain.CatalogOfferTerm
import rater.catalog.catalog.domain.ExpirationPeriod
import rater.catalog.catalog.domain.CatalogRecurringType
import rater.catalog.catalog.domain.CatalogOfferPoolPlan
import rater.catalog.catalog.domain.CatalogOfferPrice
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogProductOfferingControllerRepository
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
class CatalogProductOfferingControllerApiIT : AbstractIntegrationTest<CatalogProductOffering>() {

	private val url = "/product-offerings"

	@Autowired
	lateinit var repository: CatalogProductOfferingControllerRepository

	@Test
	fun `deleteUsingDELETE18 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET20 api`() {
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
	fun `getByIdUsingGET22 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET22 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST18 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST18 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT17 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `updateUsingPUT17 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.update(url, savedRes.id!!, savedRes)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogProductOffering, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertListsEquals(savedResource.actionSetIds, getValue(result, "$prefix.actionSetIds"))
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
		assertObjectEquals(savedResource.limit, getValue(result, "$prefix.limit"))
		assertEquals(savedResource.linkedOffers, getValue(result, "$prefix.linkedOffers"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.nestedProductOfferIds, getValue(result, "$prefix.nestedProductOfferIds"))
		assertListsEquals(savedResource.offerLabelIds, getValue(result, "$prefix.offerLabelIds"))
		assertObjectEquals(savedResource.offerTerm, getValue(result, "$prefix.offerTerm"))
		assertListsEquals(savedResource.parentProductOffers, getValue(result, "$prefix.parentProductOffers"))
		assertEquals(savedResource.periodicBalanceId, getValue(result, "$prefix.periodicBalanceId"))
		assertObjectEquals(savedResource.poolPlan, getValue(result, "$prefix.poolPlan"))
		assertObjectEquals(savedResource.price, getValue(result, "$prefix.price"))
		assertEquals(savedResource.productId, getValue(result, "$prefix.productId"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
		assertEquals(savedResource.usageBalanceId, getValue(result, "$prefix.usageBalanceId"))
	}

	private fun createWithRequiredFields(): CatalogProductOffering {
	return CatalogProductOffering(
				actionSetIds = null,
				cardinality = null,
				compatibilitySetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				customFields = null,
				description = null,
				eligibilitySetIds = null,
				isDeleted = false,
				isIndividual = false,
				isOffered = false,
				isPrimary = false,
				limit = null,
				linkedOffers = "hash_map_string_value",
				name = "test string value",
				nestedProductOfferIds = listOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				offerLabelIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				offerTerm = null,
				parentProductOffers = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				periodicBalanceId = null,
				poolPlan = null,
				price = null,
				productId = null,
				realm = "test string value",
				type = "test string value",
				updatedDate = null,
				usageBalanceId = null
		)
	}

	private fun createWithAllFields(): CatalogProductOffering {
		return CatalogProductOffering(
				actionSetIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
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
				limit = CatalogLimit(
					currency = "test string value",
					value = 9223372036854775807L
				),
				linkedOffers = "hash_map_string_value",
				name = "test string value",
				nestedProductOfferIds = listOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				offerLabelIds = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				offerTerm = CatalogOfferTerm(
					allowance = 9223372036854775807L,
					allowanceRenewalStrategy = "test string value",
					currencyId = "test string value",
					effectiveDateFrom = Date(),
					effectiveDateTo = Date(),
					expirationPeriod = ExpirationPeriod(
					realm = "test string value",
					type = "test string value",
					units = 8
				),
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
				parentProductOffers = setOf("aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()),
				periodicBalanceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
				poolPlan = CatalogOfferPoolPlan(
					maxSubscribers = 8,
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
				usageBalanceId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID()
		)
	}

}
