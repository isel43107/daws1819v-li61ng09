package pt.isel.daws1819v.li61ng09.projectissues.representation

import pt.isel.daws1819v.li61ng09.projectissues.model.Project

data class ProjectItemRepr(
        val name: String,
        val description: String
)



fun Project.toItemRepr() = ProjectItemRepr(
        name = name,
        description = description
)