package upaio.apis.entities

fun interface IEquiposRepository {
    fun listAll(): List<Equipos>
}