package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.EligibilitySetSchema
import java.util.UUID
import rater.catalog.catalog.service.EligibilitySetSchemaControllerService
import rater.catalog.catalog.controller.api.EligibilitySetSchemaControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class EligibilitySetSchemaControllerController(service: EligibilitySetSchemaControllerService)
    : AbstractController<EligibilitySetSchema, EligibilitySetSchemaControllerService>(service), EligibilitySetSchemaControllerApi {


    override fun deleteAllUsingDELETE27(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<EligibilitySetSchema>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE29(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySetSchema> {
        return super.delete(id)
    }

    override fun getAllUsingGET32(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<EligibilitySetSchema>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET33(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySetSchema> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST29(
			@RequestBody eligibilitySetSchema: List<EligibilitySetSchema>): ResponseEntity<List<EligibilitySetSchema>> {
        return ResponseEntity.ok(super.saveAll(eligibilitySetSchema))
    }

    override fun saveUsingPOST28(
			@RequestBody eligibilitySetSchema: EligibilitySetSchema): ResponseEntity<EligibilitySetSchema> {
        return super.create(eligibilitySetSchema)
    }

    override fun updateUsingPUT28(
			@PathVariable("id") id: UUID,
			@RequestBody eligibilitySetSchema: EligibilitySetSchema): ResponseEntity<EligibilitySetSchema> {
        return super.update(id, eligibilitySetSchema)
    }

}
