package upaio.apis.entities

import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*

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