CREATE TABLE equipos (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255) NOT NULL
);

CREATE TABLE jugadores (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    equipo_id BIGINT,
    FOREIGN KEY (equipo_id) REFERENCES equipos(id)
);

-- Inserción de datos iniciales
INSERT INTO equipos (nombre, ciudad) VALUES ('FC Barcelona', 'Barcelona');
INSERT INTO equipos (nombre, ciudad) VALUES ('Real Madrid', 'Madrid');

-- Note: The 'posicion' column is missing in the 'jugadores' table definition.
-- Ensure to add it if you're inserting values into it.
INSERT INTO jugadores (nombre, equipo_id) VALUES ('Lionel Messi', 1);
INSERT INTO jugadores (nombre, equipo_id) VALUES ('Karim Benzema', 2);