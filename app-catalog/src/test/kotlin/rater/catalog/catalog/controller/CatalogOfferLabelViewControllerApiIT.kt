package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogOfferLabelDto
import java.util.UUID
import rater.catalog.catalog.domain.OfferData
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogOfferLabelViewControllerRepository
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
class CatalogOfferLabelViewControllerApiIT : AbstractIntegrationTest<CatalogOfferLabelDto>() {

	private val url = "/path-not-found"

	@Autowired
	lateinit var repository: CatalogOfferLabelViewControllerRepository

	@Test
	fun `getAllUsingGET16 api`() {
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
	fun `getByIdUsingGET17 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET17 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogOfferLabelDto, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.description, getValue(result, "$prefix.description"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertListsEquals(savedResource.offers, getValue(result, "$prefix.offers"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
	}

	private fun createWithRequiredFields(): CatalogOfferLabelDto {
	return CatalogOfferLabelDto(
				description = null,
				name = "test string value",
				offers = listOf(OfferData(
					name = "test string value"
				)),
				realm = "test string value"
		)
	}

	private fun createWithAllFields(): CatalogOfferLabelDto {
		return CatalogOfferLabelDto(
				description = "test string value",
				name = "test string value",
				offers = listOf(OfferData(
					name = "test string value"
				)),
				realm = "test string value"
		)
	}

}
