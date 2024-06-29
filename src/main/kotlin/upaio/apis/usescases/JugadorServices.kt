package upaio.apis.usescases

import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import jakarta.inject.Inject
import upaio.apis.entities.Jugador
import upaio.apis.repositories.JugadorRepository
import upaio.apis.repositories.IJugadorRepository

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