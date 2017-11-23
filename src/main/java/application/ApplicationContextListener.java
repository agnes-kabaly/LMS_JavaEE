package application;

import model.Curriculum;
import model.Role;
import model.Solution;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void contextInitialized(ServletContextEvent sce) {

        User user1 = new User();
        user1.setFirstName("Béla");
        user1.setLastName("Kovács");
        user1.setEmail("kovacs@mentor.com");
        user1.setRole(Role.MENTOR);

        Curriculum curriculum = new Curriculum("Practice MySQL", true, "Create some data...", "Kovács Béla", LocalDateTime.now(), LocalDateTime.now().plusDays(7L), 10);
        Solution solution = new Solution(1, 1, LocalDateTime.now());

        entityManager.persist(user1);
        entityManager.persist(curriculum);
        entityManager.persist(solution);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }


}
