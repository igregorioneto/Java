package org.quarkus.api.resources;

import org.quarkus.api.models.Book;
import org.quarkus.api.services.BookService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.UUID;

@Path("book")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class BookResource {
    @Inject
    private BookService service;

    @POST
    public Response bookCreated(Book book) {
        service.created(book);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("{id}")
    public Response bookUpdated(@PathParam(value = "id") Long id, Book book) {
        service.updated(book);
        return Response.ok().build();
    }

    @GET
    public Response bookFind(@QueryParam(value = "id") Long id) {
        Optional<Book> optional = service.find(id);
        if (optional.isEmpty())
            return Response.noContent().build();

        return Response.ok().entity(optional.get()).build();
    }

    @DELETE
    @Path("{id}")
    public Response bookDelete(@PathParam(value = "id") Long id) {
        service.delete(id);
        return Response.ok().build();
    }
}
