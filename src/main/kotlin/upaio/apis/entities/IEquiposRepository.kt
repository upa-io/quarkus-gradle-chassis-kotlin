package upaio.apis.repositories

import upaio.apis.entities.Equipos

interface IEquiposRepository {
    fun listAll(): List<Equipos>
}