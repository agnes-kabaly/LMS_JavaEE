package dal.implDAO;

import dal.UserDAO;
import model.User;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
public class UserHandler implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void storeUser(User user) {
        entityManager.persist(user);
    }

}
