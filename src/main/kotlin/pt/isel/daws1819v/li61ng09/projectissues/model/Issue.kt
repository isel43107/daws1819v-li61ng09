package pt.isel.daws1819v.li61ng09.projectissues.model

import java.time.LocalDateTime
import javax.persistence.*

/**
 * Store issue of a project
 */
@Table(name = "issue")
@Entity
class Issue(

        @ManyToOne
        @JoinColumn(name = "project_id", nullable = false)
        var project: Project,

        var name: String,

        var shortDescription: String,

        var creationDate: LocalDateTime = LocalDateTime.now(),

        var closeDate: LocalDateTime? = LocalDateTime.now(),

        @Id
        @GeneratedValue
        var id: Long? = null
)