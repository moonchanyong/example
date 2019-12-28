package example.armeria.server.annotated;

import example.armeria.server.model.Order;
import com.linecorp.armeria.server.annotation.Delete;
import javax.validation.constraints.NotNull;
import com.linecorp.armeria.server.annotation.Description;
import java.util.List;
import com.linecorp.armeria.server.annotation.Param;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.server.annotation.Consumes;
import com.linecorp.armeria.server.annotation.Produces;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.annotation.ProducesJson;
import com.linecorp.armeria.server.annotation.Post;
import com.linecorp.armeria.server.annotation.Get;
import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.server.annotation.Header;

public class StoreApi {
    @Delete("/store/order/{orderId}")
    @Produces("application/xml")
    @ProducesJson
    @Description("Delete purchase order by ID")
    public HttpResponse deleteOrder(
        @Param("orderId") @NotNull @Description("ID of the order that needs to be deleted") String orderId
    ) {
        /*
         *  TODO: Implement `deleteOrder` method
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/store/inventory")
    @ProducesJson
    @Description("Returns pet inventories by status")
    public HttpResponse getInventory() {
        /*
         *  TODO: Implement `getInventory` method
         *  Response Type: Map<String, Integer>
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Get("/store/order/{orderId}")
    @Produces("application/xml")
    @ProducesJson
    @Description("Find purchase order by ID")
    public HttpResponse getOrderById(
        @Param("orderId") @NotNull @Description("ID of pet that needs to be fetched") Long orderId
    ) {
        /*
         *  TODO: Implement `getOrderById` method
         *  Response Type: Order
         */
        return HttpResponse.of(HttpStatus.OK);
    }

    @Post("/store/order")
    @Produces("application/xml")
    @ProducesJson
    @Description("Place an order for a pet")
    public HttpResponse placeOrder(
        @NotNull @Description("order placed for purchasing the pet") Order body
    ) {
        /*
         *  TODO: Implement `placeOrder` method
         *  Response Type: Order
         */
        return HttpResponse.of(HttpStatus.OK);
    }
}
