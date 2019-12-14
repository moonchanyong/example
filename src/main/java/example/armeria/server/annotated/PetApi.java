package example.armeria.server.annotated;

import example.armeria.server.model.ModelApiResponse;
import example.armeria.server.model.Pet;
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

public class PetApi {
    @Post("/pet")
    @Produces("application/xml")
    @Produces("application/json")
    @Consumes("application/json")
    @Consumes("application/xml")
    @Description("Add a new pet to the store")
    public HttpResponse addPet(
        @NotNull @Description("Pet object that needs to be added to the store") Pet body
    ) {
        /*
         *  TODO: Implement `addPet` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Delete("/pet/{petId}")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Deletes a pet")
    public HttpResponse deletePet(
        @Param("petId") @NotNull @Description("Pet id to delete") Long petId,
        @Header("api_key") String apiKey
    ) {
        /*
         *  TODO: Implement `deletePet` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/pet/findByStatus")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Finds Pets by status")
    public HttpResponse findPetsByStatus(
        @Param("status") @NotNull @Description("Status values that need to be considered for filter") List<String> status
    ) {
        /*
         *  TODO: Implement `findPetsByStatus` method
         *  Response Type: List<Pet>
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/pet/findByTags")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Finds Pets by tags")
    public HttpResponse findPetsByTags(
        @Param("tags") @NotNull @Description("Tags to filter by") List<String> tags
    ) {
        /*
         *  TODO: Implement `findPetsByTags` method
         *  Response Type: List<Pet>
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/pet/{petId}")
    @Produces("application/xml")
    @Produces("application/json")
    @Description("Find pet by ID")
    public HttpResponse getPetById(
        @Param("petId") @NotNull @Description("ID of pet to return") Long petId
    ) {
        /*
         *  TODO: Implement `getPetById` method
         *  Response Type: Pet
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Put("/pet")
    @Produces("application/xml")
    @Produces("application/json")
    @Consumes("application/json")
    @Consumes("application/xml")
    @Description("Update an existing pet")
    public HttpResponse updatePet(
        @NotNull @Description("Pet object that needs to be added to the store") Pet body
    ) {
        /*
         *  TODO: Implement `updatePet` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Post("/pet/{petId}")
    @Produces("application/xml")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    @Description("Updates a pet in the store with form data")
    public HttpResponse updatePetWithForm(
        @Param("petId") @NotNull @Description("ID of pet that needs to be updated") Long petId,
        @Description("Updated name of the pet") String name,
        @Description("Updated status of the pet") String status
    ) {
        /*
         *  TODO: Implement `updatePetWithForm` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Post("/pet/{petId}/uploadImage")
    @Produces("application/json")
    @Consumes("multipart/form-data")
    @Description("uploads an image")
    public HttpResponse uploadFile(
        @Param("petId") @NotNull @Description("ID of pet to update") Long petId,
        @Description("multipart data") byte[] multipartForm
    ) {
        /*
         *  TODO: Implement `uploadFile` method
         *  Response Type: ModelApiResponse
         */
        return HttpResponse.of(HttpStatus.OK);
    }
}
