package service;

import dal.UserDAO;
import model.User;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class UserService {

    @Inject
    UserDAO beleveremasd;

    @GET
    @Path("/")
    public String valami() {
        return "Helloooo";
    }

    @GET
    @Path("user")
    @Transactional
    public void saveUser() {
        User user33 = new User("MÓNI belebele");
        beleveremasd.storeUser(user33);
    }
}
