package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.Lookup
import java.util.UUID
import rater.catalog.catalog.CatalogApplication
import rater.catalog.catalog.repository.LookupControllerRepository
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
class LookupControllerApiIT : AbstractIntegrationTest<Lookup>() {

	private val url = "/lookups"

	@Autowired
	lateinit var repository: LookupControllerRepository

	@Test
	fun `deleteUsingDELETE32 api`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.delete(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getAllUsingGET35 api`() {
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
	fun `getByIdUsingGET36 with required fields`() {
		val res = createWithRequiredFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `getByIdUsingGET36 with all fields`() {
		val res = createWithAllFields()
		val savedRes = repository.save(res)

		val result = super.getById(url, savedRes.id!!)
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST32 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveAllUsingPOST32 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST31 with required fields`() {
		val res = createWithRequiredFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}

	@Test
	fun `saveUsingPOST31 with all fields`() {
		val res = createWithAllFields()
		val result = super.create(url, res)
		val savedRes = repository.getById(findIdentityId(result))
		resourceAsserts(savedRes, result)
	}


	private fun resourceAsserts(savedResource: Lookup, result: MvcResult, index: Int = -1) {
		val prefix = if (index == -1) "$" else "$.content[$index]"
		if (savedResource.id != null) {
			assertEquals(savedResource.id, getValue(result, "$prefix.id"))
		} else {
			assertNotNull(getValue(result, "$prefix.id"))
		}
		assertDateEquals(savedResource.effectiveDateFrom, getValue(result, "$prefix.effectiveDateFrom"))
		assertDateEquals(savedResource.effectiveDateTo, getValue(result, "$prefix.effectiveDateTo"))
		assertEquals(savedResource.groupId, getValue(result, "$prefix.groupId"))
		assertEquals(savedResource.isDeleted, getValue(result, "$prefix.isDeleted"))
		assertEquals(savedResource.key, getValue(result, "$prefix.key"))
		assertEquals(savedResource.keyName, getValue(result, "$prefix.keyName"))
		assertEquals(savedResource.module, getValue(result, "$prefix.module"))
		assertEquals(savedResource.realm, getValue(result, "$prefix.realm"))
		assertEquals(savedResource.value, getValue(result, "$prefix.value"))
	}

	private fun createWithRequiredFields(): Lookup {
	return Lookup(
				effectiveDateFrom = null,
				effectiveDateTo = null,
				groupId = null,
				isDeleted = false,
				key = "test string value",
				keyName = null,
				module = "test string value",
				realm = "test string value",
				value = "test string value"
		)
	}

	private fun createWithAllFields(): Lookup {
		return Lookup(
				effectiveDateFrom = Date(),
				effectiveDateTo = Date(),
				groupId = "test string value",
				isDeleted = false,
				key = "test string value",
				keyName = "test string value",
				module = "test string value",
				realm = "test string value",
				value = "test string value"
		)
	}

}
