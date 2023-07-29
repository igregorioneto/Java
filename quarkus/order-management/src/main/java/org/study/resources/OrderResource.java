package org.study.resources;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.study.models.Order;
import org.study.services.OrderService;

import java.util.List;

@Path("order")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    private OrderService service;

    @POST
    public Response create(Order order) {
        Order newOrder = service.save(order);
        return Response.ok().entity(newOrder).status(Response.Status.CREATED).build();
    }

    @GET
    public Response findAll() {
        List<Order> orders = service.findAll();
        if (orders.isEmpty())
            return Response.noContent().build();

        return Response.ok().entity(orders).status(Response.Status.OK).build();
    }

}
