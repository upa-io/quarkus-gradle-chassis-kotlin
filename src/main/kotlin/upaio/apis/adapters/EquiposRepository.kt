package upaio.apis.repositories

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import upaio.apis.entities.Equipos
import upaio.apis.entities.IEquiposRepository

@ApplicationScoped
class EquiposRepository : PanacheRepository<Equipos>, IEquiposRepository {
    
    override fun listAll(): List<Equipos> = findAll().list()

}