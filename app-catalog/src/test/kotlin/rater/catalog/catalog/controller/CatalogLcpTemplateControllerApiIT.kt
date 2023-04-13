package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.CatalogLcpTemplate
import java.util.UUID
import rater.catalog.catalog.domain.LcpTemplateHeader
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.CatalogLcpTemplateControllerRepository
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
class CatalogLcpTemplateControllerApiIT : AbstractIntegrationTest<CatalogLcpTemplate>() {

	private val url = "/lcp-templates"

	@Autowired
	lateinit var repository: CatalogLcpTemplateControllerRepository

	@Test
	fun `getAllUsingGET14 api`() {
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
	fun `getByIdUsingGET15 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET15 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST13 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST13 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: CatalogLcpTemplate, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertEquals(savedResource.createdDate, getValue(result, "$prefix.createdDate"))
		assertListsEquals(savedResource.headers, getValue(result, "$prefix.headers"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.name, getValue(result, "$prefix.name"))
		assertEquals(savedResource.updatedDate, getValue(result, "$prefix.updatedDate"))
	}

	private fun createWithRequiredFields(): CatalogLcpTemplate {
	return CatalogLcpTemplate(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				headers = listOf(LcpTemplateHeader(
					lcpTemplate = null,
					name = "test string value",
					position = 8
				)),
				isDeleted = false,
				name = "test string value",
				updatedDate = null
		)
	}

	private fun createWithAllFields(): CatalogLcpTemplate {
		return CatalogLcpTemplate(
				createdDate = java.sql.Timestamp(System.currentTimeMillis()),
				headers = listOf(LcpTemplateHeader(
					lcpTemplate = null,
					name = "test string value",
					position = 8
				)),
				isDeleted = false,
				name = "test string value",
				updatedDate = java.sql.Timestamp(System.currentTimeMillis())
		)
	}

}
