package pt.isel.daws1819v.li61ng09.projectissues.service

import pt.isel.daws1819v.li61ng09.projectissues.model.Project
import pt.isel.daws1819v.li61ng09.projectissues.representation.CreationResult
import pt.isel.daws1819v.li61ng09.projectissues.representation.ProjectCreationRepr
import pt.isel.daws1819v.li61ng09.projectissues.representation.ProjectItemRepr

interface ProjectService {

    fun getById(id: Long): Project?
    fun getAll(): List<Project>
    fun create(acr: ProjectCreationRepr): CreationResult
}