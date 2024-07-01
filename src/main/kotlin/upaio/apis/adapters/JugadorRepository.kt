package upaio.apis.repositories

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import upaio.apis.entities.IJugadorRepository
import upaio.apis.entities.Jugador

@ApplicationScoped
class JugadorRepository : PanacheRepository<Jugador>, IJugadorRepository {
    
    override fun listAll(): List<Jugador> = findAll().list()

}