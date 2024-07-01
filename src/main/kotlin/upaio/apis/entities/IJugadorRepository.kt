package upaio.apis.entities

fun interface IJugadorRepository {
    fun listAll(): List<Jugador>
}