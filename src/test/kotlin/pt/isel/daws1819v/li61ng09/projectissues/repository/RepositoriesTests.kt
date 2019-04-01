package pt.isel.daws1819v.li61ng09.projectissues.repository

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull
import pt.isel.daws1819v.li61ng09.projectissues.model.Project

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val projectRepository: ProjectRepository) {

    @Test
    fun `When findByIdOrNull then return Project`() {
        val daw = Project("DAW Project", "projecto da disciplna DAW")
        entityManager.persist(daw)
        //val article = Article("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", juergen)
        //entityManager.persist(article)
        entityManager.flush()
        val found = projectRepository.findByIdOrNull(daw.id!!)
        assertThat(found).isEqualTo(daw)
    }
/*
    @Test
    fun `When findByLogin then return User`() {
        val juergen = User("springjuergen", "Juergen", "Hoeller")
        entityManager.persist(juergen)
        entityManager.flush()
        val user = userRepository.findByLogin(juergen.login)
        assertThat(user).isEqualTo(juergen)
    }
    */
}