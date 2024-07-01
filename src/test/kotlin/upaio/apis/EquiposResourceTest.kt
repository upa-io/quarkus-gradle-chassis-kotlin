package upaio.apis

import io.quarkus.test.junit.QuarkusTest
import io.quarkus.test.junit.TestProfile
import io.restassured.RestAssured.given
import io.restassured.common.mapper.TypeRef
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import upaio.apis.config.TestProfileDB
import upaio.apis.entities.Equipos

@QuarkusTest
@TestProfile(TestProfileDB::class)
class EquiposResourceTest {

    @Test
    fun testEquiposEndpoint() {
        val equipos: List<Equipos> = given()
            .`when`()
            .get("/upaio/apis/v1/equipos")
            .then()
            .statusCode(200)
            .extract()
            .`as`(object : TypeRef<List<Equipos>>() {})
    
            assertFalse(equipos.isEmpty(), "The equipos list should not be empty")
    }

}