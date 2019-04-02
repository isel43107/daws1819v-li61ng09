package pt.isel.daws1819v.li61ng09.projectissues.model

import javax.persistence.*

/**
 * Store project metadata
 */
@Table(name="project")
@Entity
class Project (

        @Column(unique = true)
        var name: String,
        var description: String,
        @Id
        @GeneratedValue
        var id: Long? = null
)