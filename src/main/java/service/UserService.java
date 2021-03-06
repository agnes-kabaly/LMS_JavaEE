package service;

import dal.UserDAO;
import model.Role;
import model.User;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

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
    @Path("/user")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveUser() {
        String responseText;
        User user = new User();
        user.setFirstName("Jenő2");
        user.setLastName("Diák2");
        user.setEmail("jeno@diak2.com");
        user.setRole(Role.STUDENT);
        try {
            userHandler.storeUser(user);
            responseText = "success";
        } catch (Exception e) {
            responseText = "error";
        }
        System.out.println(userHandler.getUser(1));
        return Response.status(200).entity(responseText).build();
    }

    @GET
    @Path("/allUser")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> gerAllUser() {
        return userHandler.getAllUser();
    }


}
