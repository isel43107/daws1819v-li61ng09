package pt.isel.daws1819v.li61ng09.projectissues.model

import javax.persistence.*

/**
 * Store allowed issue's label. Per project
 */
@Table(name="issue_label")
@Entity
class IssueLabel(

        @ManyToOne
        @JoinColumn(name="project_id", nullable = false)
        var project: Project,

        @Id
        @Column(unique = true)
        var name: String
)
