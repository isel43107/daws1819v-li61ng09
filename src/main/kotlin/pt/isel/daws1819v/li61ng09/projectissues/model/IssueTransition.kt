package pt.isel.daws1819v.li61ng09.projectissues.model

import javax.persistence.*

/**
 * Store allowed issue's transition. Per project
 */
@Table(name="issue_transition",
        indexes = [
            //Este Index permite limitar a combinacao da mesma transicao num projecto
            Index(name = "idx_issue_transition_state", columnList = "project_id, from_state, to_state",  unique = true)]
)
@Entity
class IssueTransition (


        // A combinacao desses 3 campos deve ser unico
        @ManyToOne
        @JoinColumn(name="project_id", insertable = false)
        var project: Project,

        @Column(name = "from_state", nullable = false)
        var fromState: String,

        @Column(name = "to_state", nullable = false)
        var toState: String,

        // Este id tem como objectivo facilitar o acesso/associacao (evitar usar uma chave primaria composta)
        @Id
        @GeneratedValue
        var id: Long? = null

        )