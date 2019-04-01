package pt.isel.daws1819v.li61ng09.projectissues.repository

import org.springframework.data.repository.CrudRepository
import pt.isel.daws1819v.li61ng09.projectissues.model.Project


interface ProjectRepository : CrudRepository<Project, Long> {
    fun findByName(name: String): Project?
    fun findAllByOrderByIdDesc(): Iterable<Project>
}