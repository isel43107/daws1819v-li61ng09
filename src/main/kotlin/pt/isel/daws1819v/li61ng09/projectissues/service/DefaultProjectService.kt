package pt.isel.daws1819v.li61ng09.projectissues.service

import org.springframework.stereotype.Component
import pt.isel.daws1819v.li61ng09.projectissues.model.Project
import pt.isel.daws1819v.li61ng09.projectissues.repository.ProjectRepository
import pt.isel.daws1819v.li61ng09.projectissues.representation.Created
import pt.isel.daws1819v.li61ng09.projectissues.representation.CreationResult
import pt.isel.daws1819v.li61ng09.projectissues.representation.ProjectCreationRepr
import pt.isel.daws1819v.li61ng09.projectissues.representation.toProject

@Component
class DefaultProjectService(val projectrepository: ProjectRepository) : ProjectService {

    override fun getById(id: Long): Project? {
        return projectrepository.findById(id).get();
    }

    override fun getAll(): List<Project> {
        return projectrepository.findAll().toList();
    }

    override fun create(project: ProjectCreationRepr): CreationResult {

       var project =  projectrepository.save(project.toProject());

        return  Created(project.id.toString());
    }


}