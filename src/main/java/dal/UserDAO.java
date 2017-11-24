package dal;

import model.User;

import java.util.List;

public interface UserDAO {

    void storeUser(User user);
    User getUser(int id);
    List<User> getAllUser();

}
