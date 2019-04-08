package pt.isel.daws1819v.li61ng09.projectissues.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.isel.daws1819v.li61ng09.projectissues.representation.hateoas.HomeResource

@RestController
class HomeController {

    @GetMapping(Uri.home)
    fun getHome() = HomeResource()
}