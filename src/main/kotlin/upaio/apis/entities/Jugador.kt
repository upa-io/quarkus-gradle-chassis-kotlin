package upaio.apis.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn
import com.fasterxml.jackson.annotation.JsonBackReference

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