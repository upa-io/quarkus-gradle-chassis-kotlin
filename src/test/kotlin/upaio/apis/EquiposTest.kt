package upaio.apis

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import upaio.apis.entities.Equipos
import upaio.apis.entities.Jugador

@QuarkusTest
class EquiposTest {

    @Test
    fun testEquiposCreation() {
        val nombre = "Test Nombre"
        val ciudad = "Test Ciudad"
        val equipos = Equipos(nombre = nombre, ciudad = ciudad)

        assertEquals(0, equipos.id, "The id should be 0")
        assertEquals(nombre, equipos.nombre, "The nombre should be $nombre")
        assertEquals(ciudad, equipos.ciudad, "The ciudad should be $ciudad")
    }

    @Test
    fun testEquiposCreationWithJugadores() {
        val nombre = "Test Nombre"
        val ciudad = "Test Ciudad"
        val jugador = Jugador(nombre = "Jugador Test", posicion = "Delantero", equipo = null)
        val jugadores = listOf(jugador)
        val equipos = Equipos(nombre = nombre, ciudad = ciudad, jugadores = jugadores)

        assertEquals(0, equipos.id, "The id should be 0")
        assertEquals(nombre, equipos.nombre, "The nombre should be $nombre")
        assertEquals(ciudad, equipos.ciudad, "The ciudad should be $ciudad")
        assertEquals(1, equipos.jugadores.size, "The jugadores list should have one element")
        assertEquals(jugador, equipos.jugadores[0], "The first jugador should be the one we created")
    }

    @Test
    fun testEquiposCreationWithSecondaryConstructor() {
        val equipos = Equipos()

        assertEquals(0, equipos.id, "The id should be 0")
        assertEquals("", equipos.nombre, "The nombre should be an empty string")
        assertEquals("", equipos.ciudad, "The ciudad should be an empty string")
        assertEquals(emptyList<Jugador>(), equipos.jugadores, "The jugadores list should be empty")
    }
}