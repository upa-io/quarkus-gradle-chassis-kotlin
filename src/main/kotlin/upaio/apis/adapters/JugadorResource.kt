import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.Consumes
import jakarta.inject.Inject
import upaio.apis.usescases.EquiposServices
import upaio.apis.entities.Equipos
import upaio.apis.usescases.JugadorServices

@Path("/upaio/apis/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class JugadorResource {

    @Inject
    lateinit var jugadorService: JugadorServices

    @GET
    @Path("/jugadores")
    fun listAll(): Response = Response.ok(jugadorService.doSomethingWithJugador()).build()

}