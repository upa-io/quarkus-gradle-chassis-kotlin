package upaio.apis.repositories

import jakarta.enterprise.context.ApplicationScoped
import upaio.apis.entities.Equipos
import upaio.apis.entities.Jugador
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository

@ApplicationScoped
class JugadorRepository : PanacheRepository<Jugador>, IJugadorRepository {
    
    override fun listAll(): List<Jugador> = findAll().list()

}