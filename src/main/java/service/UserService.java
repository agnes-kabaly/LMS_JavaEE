package service;

import dal.UserDAO;
import model.Role;
import model.User;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class UserService {

    @Inject
    UserDAO userHandler;

    @GET
    @Path("/")
    public String valami() {
        return "Helloooo";
    }

    @GET
    @Path("user")
    @Transactional
    public void saveUser() {
        User user = new User();
        user.setFirstName("Jenő2");
        user.setLastName("Diák2");
        user.setEmail("jeno@diak2.com");
        user.setRole(Role.STUDENT);
        userHandler.storeUser(user);
        System.out.println(userHandler.getUser(1));

    }


}
