-- Creación de secuencias para equipos y jugadores
CREATE SEQUENCE equipos_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE jugadores_seq START WITH 1 INCREMENT BY 1;

-- Creación de la tabla equipos con verificación
CREATE TABLE IF NOT EXISTS equipos (
    id BIGINT DEFAULT nextval('equipos_seq') NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255) NOT NULL
);

-- Creación de la tabla jugadores con verificación y la columna posicion
CREATE TABLE IF NOT EXISTS jugadores (
    id BIGINT DEFAULT nextval('jugadores_seq') NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    posicion VARCHAR(255), -- Columna posicion agregada
    equipo_id BIGINT,
    FOREIGN KEY (equipo_id) REFERENCES equipos(id)
);

-- Inserción de datos iniciales en equipos
INSERT INTO equipos (nombre, ciudad) VALUES ('FC Barcelona', 'Barcelona');
INSERT INTO equipos (nombre, ciudad) VALUES ('Real Madrid', 'Madrid');

-- Inserción de datos iniciales en jugadores
INSERT INTO jugadores (nombre, equipo_id, posicion) VALUES ('Lionel Messi', (SELECT id FROM equipos WHERE nombre = 'FC Barcelona'), 'Delantero');
INSERT INTO jugadores (nombre, equipo_id, posicion) VALUES ('Karim Benzema', (SELECT id FROM equipos WHERE nombre = 'Real Madrid'), 'Delantero');
