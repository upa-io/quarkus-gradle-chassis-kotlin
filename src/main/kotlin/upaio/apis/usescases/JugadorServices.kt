package upaio.apis.usescases

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import upaio.apis.entities.IJugadorRepository
import upaio.apis.entities.Jugador

@ApplicationScoped
class JugadorServices {

    @Inject
    lateinit var jugadorRepository: IJugadorRepository

    fun doSomethingWithJugador(): List<Jugador> {
        // Fetch all equipos
        val allJugadores = jugadorRepository.listAll()
        // You can add any business logic here if needed
        return allJugadores
    }
}