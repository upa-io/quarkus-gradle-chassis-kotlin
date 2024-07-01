package upaio.apis

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import upaio.apis.entities.Equipos
import upaio.apis.entities.Jugador

@QuarkusTest
class JugadorTest {

    @Test
    fun testJugadorCreation() {
        val nombre = "Test Nombre"
        val posicion = "Test Posicion"
        val jugador = Jugador(nombre = nombre, posicion = posicion, equipo = null)

        assertEquals(0, jugador.id, "The id should be 0")
        assertEquals(nombre, jugador.nombre, "The nombre should be $nombre")
        assertEquals(posicion, jugador.posicion, "The posicion should be $posicion")
        assertEquals(null, jugador.equipo, "The equipo should be null")
    }

    @Test
    fun testJugadorCreationWithEquipo() {
        val nombreEquipo = "Test Nombre Equipo"
        val ciudadEquipo = "Test Ciudad Equipo"
        val equipo = Equipos(nombre = nombreEquipo, ciudad = ciudadEquipo)

        val nombreJugador = "Test Nombre Jugador"
        val posicionJugador = "Test Posicion Jugador"
        val jugador = Jugador(nombre = nombreJugador, posicion = posicionJugador, equipo = equipo)

        assertEquals(0, jugador.id, "The id should be 0")
        assertEquals(nombreJugador, jugador.nombre, "The nombre should be $nombreJugador")
        assertEquals(posicionJugador, jugador.posicion, "The posicion should be $posicionJugador")
        assertEquals(equipo, jugador.equipo, "The equipo should be the one we created")
    }

    @Test
    fun testJugadorCreationWithSecondaryConstructor() {
        val jugador = Jugador()

        assertEquals(0, jugador.id, "The id should be 0")
        assertEquals("", jugador.nombre, "The nombre should be an empty string")
        assertEquals("", jugador.posicion, "The posicion should be an empty string")
        assertEquals(0, jugador.equipo?.id, "The equipo id should be 0")
        assertEquals("", jugador.equipo?.nombre, "The equipo nombre should be an empty string")
        assertEquals("", jugador.equipo?.ciudad, "The equipo ciudad should be an empty string")
        assertEquals(emptyList<Jugador>(), jugador.equipo?.jugadores, "The equipo jugadores list should be empty")
    }
}