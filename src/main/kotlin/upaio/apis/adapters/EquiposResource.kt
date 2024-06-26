package upaio.apis

import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import upaio.apis.usescases.EquiposServices

@Path("/upaio/apis/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class EquiposResource {

    @Inject
    lateinit var equipoService: EquiposServices

    @GET
    @Path("/equipos")
    fun listAll(): Response = Response.ok(equipoService.doSomethingWithEquipos()).build()

}