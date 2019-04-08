package pt.isel.daws1819v.li61ng09.projectissues.representation.hateoas

import org.springframework.hateoas.ResourceSupport
import org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo
import org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn
import pt.isel.daws1819v.li61ng09.projectissues.controller.ProjectController

class HomeResource : ResourceSupport() {
    init {
        this.add(linkTo(methodOn(ProjectController::class.java).getList()).withRel("projects"))
    }
}