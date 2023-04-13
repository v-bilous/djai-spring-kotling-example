package rater.catalog.catalog.controller

import rater.catalog.catalog.domain.EligibilitySet
import java.util.UUID
import rater.catalog.catalog.service.EligibilitySetControllerService
import rater.catalog.catalog.controller.api.EligibilitySetControllerApi
import rater.catalog.controller.AbstractController
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@RestController
class EligibilitySetControllerController(service: EligibilitySetControllerService)
    : AbstractController<EligibilitySet, EligibilitySetControllerService>(service), EligibilitySetControllerApi {


    override fun deleteAllUsingDELETE26(
			@RequestParam(value = "ids", required = true) ids: List<UUID>): ResponseEntity<List<EligibilitySet>> {
        return ResponseEntity.ok(super.deleteAll(ids))
    }

    override fun deleteUsingDELETE28(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySet> {
        return super.delete(id)
    }

    override fun getAllUsingGET31(
			@RequestParam(value = "offset", required = false) offset: Long?,
			@RequestParam(value = "pageNumber", required = false) pageNumber: Int?,
			@RequestParam(value = "pageSize", required = false) pageSize: Int?,
			@RequestParam(value = "paged", required = false) paged: Boolean?,
			@RequestParam(value = "search", required = false) search: String?,
			@RequestParam(value = "sort.sorted", required = false) sortSorted: Boolean?,
			@RequestParam(value = "sort.unsorted", required = false) sortUnsorted: Boolean?,
			@RequestParam(value = "unpaged", required = false) unpaged: Boolean?,
			@PageableDefault(value=0, size = 50, sort=["id"], direction = Sort.Direction.ASC) page: Pageable): ResponseEntity<Page<EligibilitySet>> {
        return getAll(search, page)
    }

    override fun getByIdUsingGET32(
			@PathVariable("id") id: UUID): ResponseEntity<EligibilitySet> {
        return super.getById(id)
    }

    override fun saveAllUsingPOST28(
			@RequestBody eligibilitySet: List<EligibilitySet>): ResponseEntity<List<EligibilitySet>> {
        return ResponseEntity.ok(super.saveAll(eligibilitySet))
    }

    override fun saveUsingPOST27(
			@RequestBody eligibilitySet: EligibilitySet): ResponseEntity<EligibilitySet> {
        return super.create(eligibilitySet)
    }

    override fun updateUsingPUT27(
			@PathVariable("id") id: UUID,
			@RequestBody eligibilitySet: EligibilitySet): ResponseEntity<EligibilitySet> {
        return super.update(id, eligibilitySet)
    }

}
