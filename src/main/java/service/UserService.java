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
        User user33 = new User("Jenő", "Diák");
        user33.setRole(Role.DIÁK);
        userHandler.storeUser(user33);
        System.out.println(userHandler.getUser(1));

    }


}
