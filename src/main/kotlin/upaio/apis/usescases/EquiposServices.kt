package upaio.apis.usescases

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import upaio.apis.entities.Equipos
import upaio.apis.entities.IEquiposRepository

@ApplicationScoped
class EquiposServices {

    @Inject
    lateinit var equiposRepository: IEquiposRepository

    fun doSomethingWithEquipos(): List<Equipos> {
        // Fetch all equipos
        val allEquipos= equiposRepository.listAll()
        // You can add any business logic here if needed
        return allEquipos
    }

}