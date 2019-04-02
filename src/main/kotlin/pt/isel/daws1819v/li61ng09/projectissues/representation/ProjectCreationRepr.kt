package pt.isel.daws1819v.li61ng09.projectissues.representation

import pt.isel.daws1819v.li61ng09.projectissues.model.Project


data class ProjectCreationRepr(

        val name: String,
        val description: String,
        val startState: String,
        val allowIssueStates: Set<String>,
        val allowIssueLabels: Set<String>,
        //val allowIssueTransitions: Set<Map<String, String>>
        val allowIssueTransitions: Set<TransitionCreationRepr>

)

data class TransitionCreationRepr(
    val fromState: String,
    val toState: String
)




fun ProjectCreationRepr.toProject()  = Project(
        name = name,
        description = description
)