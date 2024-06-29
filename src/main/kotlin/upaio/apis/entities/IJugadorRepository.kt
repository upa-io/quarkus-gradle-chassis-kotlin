package upaio.apis.repositories

import upaio.apis.entities.Jugador

interface IJugadorRepository {
    fun listAll(): List<Jugador>
}