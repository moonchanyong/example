package example.armeria.server.annotated;

import example.armeria.server.model.User;
import com.linecorp.armeria.server.annotation.Delete;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.annotation.Description;
import javax.validation.constraints.NotNull;
import com.linecorp.armeria.server.annotation.Post;
import com.linecorp.armeria.server.annotation.Get;
import com.linecorp.armeria.server.annotation.Param;
import java.util.List;
import com.linecorp.armeria.server.annotation.Put;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.server.annotation.Consumes;
import com.linecorp.armeria.server.annotation.Header;
import com.linecorp.armeria.server.annotation.Produces;

public class UserApi {
    @Post("/user")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Create user")
    public HttpResponse createUser(
        @NotNull @Description("Created user object") User body
    ) {
        /*
         *  TODO: Implement `createUser` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Post("/user/createWithArray")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Creates list of users with given input array")
    public HttpResponse createUsersWithArrayInput(
        @NotNull @Description("List of user object") List<User> body
    ) {
        /*
         *  TODO: Implement `createUsersWithArrayInput` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Post("/user/createWithList")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Creates list of users with given input array")
    public HttpResponse createUsersWithListInput(
        @NotNull @Description("List of user object") List<User> body
    ) {
        /*
         *  TODO: Implement `createUsersWithListInput` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Delete("/user/{username}")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Delete user")
    public HttpResponse deleteUser(
        @Param("username") @NotNull @Description("The name that needs to be deleted") String username
    ) {
        /*
         *  TODO: Implement `deleteUser` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/user/{username}")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Get user by user name")
    public HttpResponse getUserByName(
        @Param("username") @NotNull @Description("The name that needs to be fetched. Use user1 for testing.") String username
    ) {
        /*
         *  TODO: Implement `getUserByName` method
         *  Response Type: User
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/user/login")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Logs user into the system")
    public HttpResponse loginUser(
        @Param("username") @NotNull @Description("The user name for login") String username,
        @Param("password") @NotNull @Description("The password for login in clear text") String password
    ) {
        /*
         *  TODO: Implement `loginUser` method
         *  Response Type: String
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/user/logout")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Logs out current logged in user session")
    public HttpResponse logoutUser() {
        /*
         *  TODO: Implement `logoutUser` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Put("/user/{username}")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Updated user")
    public HttpResponse updateUser(
        @Param("username") @NotNull @Description("name that need to be deleted") String username,
        @NotNull @Description("Updated user object") User body
    ) {
        /*
         *  TODO: Implement `updateUser` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }
}
