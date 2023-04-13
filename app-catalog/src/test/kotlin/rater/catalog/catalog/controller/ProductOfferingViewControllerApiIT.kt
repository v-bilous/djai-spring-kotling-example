package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.ProductOfferingView
import java.util.UUID
import rater.catalog.catalog.domain.CatalogLimitView
import rater.catalog.catalog.domain.OfferTermView
import rater.catalog.catalog.domain.TariffPlanView
import rater.catalog.catalog.domain.CalendarView
import rater.catalog.catalog.domain.LayoutView
import rater.catalog.catalog.domain.LayoutRatingParametersView
import rater.catalog.catalog.domain.LayoutRatingParametersGroupView
import rater.catalog.catalog.domain.RatingParameterSetView
import rater.catalog.catalog.domain.RatingParameterView
import rater.catalog.catalog.domain.CustomListView
import rater.catalog.catalog.domain.TariffCalendarRangeView
import rater.catalog.catalog.domain.TariffView
import rater.catalog.catalog.domain.TariffStepView
import rater.catalog.catalog.domain.PriceItemView
import rater.catalog.catalog.domain.OfferPriceView
import rater.catalog.catalog.domain.ProductView
import rater.catalog.catalog.domain.ServiceView
import rater.catalog.catalog.domain.ProviderView
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.ProductOfferingViewControllerRepository
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
class ProductOfferingViewControllerApiIT : AbstractIntegrationTest<ProductOfferingView>() {

	private val url = "/offerings/view"

	@Autowired
	lateinit var repository: ProductOfferingViewControllerRepository

	@Test
	fun `getViewByIdUsingGET with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getViewByIdUsingGET with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: ProductOfferingView, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.cardinality, getValue(result, "$prefix.cardinality") as Int?)
		assertEquals(savedResource.customFields, getValue(result, "$prefix.customFields"))
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.isOffered, getValue(result, "$prefix.isOffered"))
		assertEquals(savedResource.isPrimary, getValue(result, "$prefix.isPrimary"))
		assertObjectEquals(savedResource.limit, getValue(result, "$prefix.limit"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertObjectEquals(savedResource.offerTerm, getValue(result, "$prefix.offerTerm"))
		assertObjectEquals(savedResource.price, getValue(result, "$prefix.price"))
		assertObjectEquals(savedResource.product, getValue(result, "$prefix.product"))
		assertEquals(savedResource.type, getValue(result, "$prefix.type"))
	}

	private fun createWithRequiredFields(): ProductOfferingView {
	return ProductOfferingView(
				cardinality = null,
				customFields = null,
				description = null,
				isOffered = false,
				isPrimary = false,
				limit = null,
				name = "test string value",
				offerTerm = null,
				price = null,
				product = null,
				type = "test string value"
		)
	}

	private fun createWithAllFields(): ProductOfferingView {
		return ProductOfferingView(
				cardinality = 8,
				customFields = "hash_map_string_value",
				description = "test string value",
				isOffered = false,
				isPrimary = false,
				limit = CatalogLimitView(
					currency = "test string value",
					value = 9223372036854775807L
				),
				name = "test string value",
				offerTerm = OfferTermView(
					allowance = 9223372036854775807L,
					allowanceCurrency = "test string value",
					allowanceRenewalStrategy = "test string value",
					effectiveDateFrom = Date(),
					effectiveDateTo = Date(),
					expirationPeriodType = "test string value",
					expirationPeriodUnits = 8,
					offerPriority = 8,
					offerRenewalStrategy = "test string value",
					recurringType = "test string value",
					tariffPlan = TariffPlanView(
					calendar = CalendarView(
					description = "test string value",
					name = "test string value"
				),
					description = "test string value",
					layout = LayoutView(
					data = setOf(LayoutRatingParametersView(
					group = LayoutRatingParametersGroupView(
					name = "test string value"
				),
					parameters = listOf("test_list_string_value"),
					position = 8,
					tags = setOf("test_set_string_value")
				)),
					description = "test string value",
					name = "test string value",
					ratingParameterSet = RatingParameterSetView(
					description = "test string value",
					name = "test string value",
					ratingParameter = listOf(RatingParameterView(
					customList = CustomListView(
					description = "test string value",
					name = "test string value"
				),
					description = "test string value",
					name = "test string value"
				))
				)
				),
					name = "test string value",
					ranges = listOf(TariffCalendarRangeView(
					calendarPropertiesId = "aaaaaaaa-bbbb-cccc-dddd-eeeeeeffffff".toUUID(),
					position = 8,
					tariff = TariffView(
					description = "test string value",
					isAdaptive = false,
					isSystem = false,
					name = "test string value",
					steps = setOf(TariffStepView(
					currencyId = "test string value",
					name = "test string value",
					nextStep = 8,
					priceItem = PriceItemView(
					currencyId = "test string value",
					description = "test string value",
					name = "test string value",
					value = 9223372036854775807L
				),
					repetitions = 8,
					step = 8,
					value = 9223372036854775807L
				)),
					type = "test string value"
				)
				))
				),
					type = "test string value"
				),
				price = OfferPriceView(
					currencyId = "test string value",
					value = 9223372036854775807L
				),
				product = ProductView(
					description = "test string value",
					isActive = false,
					name = "test string value",
					service = ServiceView(
					name = "test string value",
					providers = setOf(ProviderView(
					codes = setOf("test_set_string_value"),
					isDefault = false,
					name = "test string value"
				)),
					statuses = setOf("test_set_string_value")
				)
				),
				type = "test string value"
		)
	}

}
