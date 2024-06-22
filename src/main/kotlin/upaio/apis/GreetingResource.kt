package upaio.apis

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/upaio/apis/v1")
class GreetingResource {

    @GET
    @Path("/greetings")
    @Produces(MediaType.APPLICATION_JSON)
    fun greetings(): Response {
        return Response.ok("Hello from Quarkus REST").build()
    }

}