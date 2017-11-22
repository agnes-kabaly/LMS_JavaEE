package application;

import model.Curriculum;
import model.Role;
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

        User user1 = new User("Béla", "Kovács");
        user1.setRole(Role.MENTOR);

        Curriculum curriculum = new Curriculum(LocalDateTime.now(), LocalDateTime.now().plusDays(7L));

        entityManager.persist(user1);
        entityManager.persist(curriculum);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }


}
