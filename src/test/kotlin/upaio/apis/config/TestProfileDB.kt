package upaio.apis.config

import io.quarkus.test.junit.QuarkusTestProfile

class TestProfileDB : QuarkusTestProfile {
    // Constructor secundario
    constructor() {
        // Inicialización o configuración adicional
        println("TestProfileDB initialized")
    }
    override fun getConfigOverrides(): Map<String, String> {
        return mapOf(
            "quarkus.datasource.devservices.image-name" to "postgres:16",
            "quarkus.flyway.migrate-at-start" to "true",
            "quarkus.http.test-port" to "0",
            "quarkus.hibernate-orm.database.generation" to "none"
        )
    }        
}