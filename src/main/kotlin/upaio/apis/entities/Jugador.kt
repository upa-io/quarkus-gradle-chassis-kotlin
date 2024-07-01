package upaio.apis.entities

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*

@Entity
@Table(name = "jugadores")
class Jugador(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val nombre: String,
    val posicion: String,

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    @JsonBackReference
    val equipo: Equipos
)
{
    // Constructor secundario sin argumentos requerido por Hibernate
    constructor() : this(id = 0, nombre = "", posicion = "", equipo = Equipos())
}