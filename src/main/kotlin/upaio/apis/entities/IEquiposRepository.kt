package upaio.apis.entities

import upaio.apis.entities.Equipos

fun interface IEquiposRepository {
    fun listAll(): List<Equipos>
}