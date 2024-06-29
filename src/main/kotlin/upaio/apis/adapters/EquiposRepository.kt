package upaio.apis.repositories

import jakarta.enterprise.context.ApplicationScoped
import upaio.apis.entities.Equipos
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository

@ApplicationScoped
class EquiposRepository : PanacheRepository<Equipos>, IEquiposRepository{
    
    override fun listAll(): List<Equipos> = findAll().list()

}