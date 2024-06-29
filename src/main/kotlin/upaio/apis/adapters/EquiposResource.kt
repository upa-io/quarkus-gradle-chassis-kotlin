package upaio.apis

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.Consumes
import jakarta.inject.Inject
import upaio.apis.usescases.EquiposServices
import upaio.apis.entities.Equipos

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