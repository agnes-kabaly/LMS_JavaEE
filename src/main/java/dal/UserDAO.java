package dal;

import model.User;

public interface UserDAO {

    void storeUser(User user);
    User getUser(int id);

}
