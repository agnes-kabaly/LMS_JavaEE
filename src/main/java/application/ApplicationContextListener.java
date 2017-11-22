package application;

import dal.UserDAO;
import dal.implDAO.UserHandler;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.transaction.Transactional;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void contextInitialized(ServletContextEvent sce) {

        UserDAO userHandler = new UserHandler();

        User user1 = new User("Ő Kovács Ő Béla");
        entityManager.persist(user1);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
