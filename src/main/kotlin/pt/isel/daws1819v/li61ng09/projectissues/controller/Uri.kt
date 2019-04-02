package pt.isel.daws1819v.li61ng09.projectissues.controller

import org.springframework.web.util.UriTemplate
import java.net.URI


object Uri {
    fun forProjects() = URI(projects)
    fun forProjectsById(acr: String) = courseByIdTemplate.expand(acr)

    const val projects = "/projects"
    const val projectById = "/projects/{id}"
    val courseByIdTemplate = UriTemplate("/projects/{id}")
}