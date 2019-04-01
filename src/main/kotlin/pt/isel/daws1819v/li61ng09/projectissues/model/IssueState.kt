package pt.isel.daws1819v.li61ng09.projectissues.model

import javax.persistence.*

/**
 * Store allowed issue's state. Per project
 */
@Table(name="issue_state",
        indexes = [Index(name = "idx_issue_state", columnList = "project_id, state_name",  unique = true)]
)
@Entity
class IssueState (

        @ManyToOne
        @JoinColumn(name="project_id", nullable = false)
        var project: Project,

        @Id
        @Column(name = "state_name", nullable = false)
        var name: String
)