package upaio.apis.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.FetchType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import upaio.apis.entities.Jugador
import com.fasterxml.jackson.annotation.JsonManagedReference

@Entity
@Table(name = "equipos")
class Equipos(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val nombre: String,
    val ciudad: String,

    @OneToMany(mappedBy = "equipo", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JsonManagedReference
    val jugadores: List<Jugador> = emptyList()    
)
{
    // Constructor secundario sin argumentos requerido por Hibernate
    constructor() : this(id = 0, nombre = "", ciudad = "")
}