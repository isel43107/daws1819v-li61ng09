package pt.isel.daws1819v.li61ng09.projectissues.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.isel.daws1819v.li61ng09.projectissues.representation.ProjectDetailRepr
import pt.isel.daws1819v.li61ng09.projectissues.representation.ProjectListRepr
import pt.isel.daws1819v.li61ng09.projectissues.representation.toDetailRepr
import pt.isel.daws1819v.li61ng09.projectissues.representation.toItemRepr
import pt.isel.daws1819v.li61ng09.projectissues.service.ProjectService

@RequestMapping(Uri.projects)
@RestController
class ProjectController(val projectService: ProjectService) {


    @GetMapping()
    fun getList(): ProjectListRepr =
            ProjectListRepr(items = projectService
                    .getAll()
                    .map { it.toItemRepr() })


    @GetMapping(Uri.projectById)
    fun getDetail(@PathVariable("id") id: Long): ResponseEntity<ProjectDetailRepr> =
            projectService.getById(id)
                    ?.let { ResponseEntity.ok(it.toDetailRepr()) }
                    ?: ResponseEntity.notFound().build()

}