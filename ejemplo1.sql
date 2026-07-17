-- ==========================================
-- CREACIÓN DE BASE DE DATOS
-- ==========================================

CREATE DATABASE EscuelaDB;
USE EscuelaDB;

-- ==========================================
-- TABLAS
-- ==========================================

CREATE TABLE alumnos (
    id_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) UNIQUE,
    edad INT CHECK (edad >= 18)
);

CREATE TABLE materias (
    id_materia INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    creditos INT NOT NULL CHECK (creditos > 0)
);

CREATE TABLE inscripciones (
    id_inscripcion INT AUTO_INCREMENT PRIMARY KEY,
    id_alumno INT NOT NULL,
    id_materia INT NOT NULL,
    calificacion DECIMAL(5,2),

    CONSTRAINT fk_alumno
        FOREIGN KEY (id_alumno)
        REFERENCES alumnos(id_alumno)
        ON DELETE CASCADE
        ON UPDATE CASCADE,

    CONSTRAINT fk_materia
        FOREIGN KEY (id_materia)
        REFERENCES materias(id_materia)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

-- ==========================================
-- ÍNDICES
-- ==========================================

CREATE INDEX idx_nombre_alumno
ON alumnos(nombre);

CREATE INDEX idx_nombre_materia
ON materias(nombre);

-- ==========================================
-- INSERT
-- ==========================================

INSERT INTO alumnos(nombre, correo, edad)
VALUES
('Juan Perez','juan@correo.com',20),
('Ana Lopez','ana@correo.com',22),
('Carlos Ruiz','carlos@correo.com',21);

INSERT INTO materias(nombre, creditos)
VALUES
('Bases de Datos',8),
('Programacion',10),
('Redes',6);

INSERT INTO inscripciones(id_alumno,id_materia,calificacion)
VALUES
(1,1,95),
(1,2,88),
(2,1,90),
(3,3,85);

-- ==========================================
-- SELECT
-- ==========================================

SELECT * 
FROM alumnos;

SELECT nombre, edad
FROM alumnos
WHERE edad > 20;

-- ==========================================
-- JOIN
-- ==========================================

SELECT
    a.nombre AS Alumno,
    m.nombre AS Materia,
    i.calificacion
FROM alumnos a
INNER JOIN inscripciones i
ON a.id_alumno = i.id_alumno
INNER JOIN materias m
ON i.id_materia = m.id_materia;

-- ==========================================
-- GROUP BY
-- ==========================================

SELECT
    m.nombre,
    AVG(i.calificacion) AS Promedio
FROM materias m
INNER JOIN inscripciones i
ON m.id_materia = i.id_materia
GROUP BY m.nombre;

-- ==========================================
-- ORDER BY
-- ==========================================

SELECT *
FROM alumnos
ORDER BY nombre ASC;

-- ==========================================
-- FUNCIONES AGREGADAS
-- ==========================================

SELECT COUNT(*) AS TotalAlumnos
FROM alumnos;

SELECT MAX(calificacion) AS Mayor
FROM inscripciones;

SELECT MIN(calificacion) AS Menor
FROM inscripciones;

SELECT AVG(calificacion) AS Promedio
FROM inscripciones;

SELECT SUM(creditos) AS TotalCreditos
FROM materias;

-- ==========================================
-- UPDATE
-- ==========================================

UPDATE alumnos
SET edad = 23
WHERE id_alumno = 2;

-- ==========================================
-- DELETE
-- ==========================================

DELETE FROM inscripciones
WHERE id_inscripcion = 4;

-- ==========================================
-- VISTA
-- ==========================================

CREATE VIEW vista_calificaciones AS

SELECT
    a.nombre,
    m.nombre AS materia,
    i.calificacion
FROM alumnos a
INNER JOIN inscripciones i
ON a.id_alumno = i.id_alumno
INNER JOIN materias m
ON m.id_materia = i.id_materia;


-- Consultar vista

SELECT *
FROM vista_calificaciones;

-- ==========================================
-- PROCEDIMIENTO ALMACENADO
-- ==========================================

CREATE PROCEDURE ObtenerAlumno(
    IN pid INT
)

BEGIN

SELECT *
FROM alumnos
WHERE id_alumno = pid;

END;


CALL ObtenerAlumno(1);

-- ==========================================
-- TRIGGER
-- ==========================================

CREATE TABLE historial_alumnos(

    id_historial INT AUTO_INCREMENT PRIMARY KEY,
    mensaje VARCHAR(200),
    fecha DATETIME

);


CREATE TRIGGER trg_insert_alumno

AFTER INSERT
ON alumnos

FOR EACH ROW

BEGIN

INSERT INTO historial_alumnos(mensaje,fecha)

VALUES(
    CONCAT('Se agrego el alumno: ',NEW.nombre),
    NOW()
);

END;


-- Probar trigger

INSERT INTO alumnos(nombre,correo,edad)

VALUES('Luis Torres','luis@correo.com',24);


-- ==========================================
-- TRANSACCIONES
-- ==========================================

START TRANSACTION;

INSERT INTO alumnos(nombre,correo,edad)

VALUES('Maria','maria@correo.com',20);

COMMIT;


START TRANSACTION;

UPDATE alumnos

SET edad = 30

WHERE id_alumno = 1;

ROLLBACK;


-- ==========================================
-- RESTRICCIONES
-- ==========================================

ALTER TABLE alumnos

ADD CONSTRAINT chk_edad

CHECK(edad >= 18);


-- ==========================================
-- INTEGRIDAD REFERENCIAL
-- ==========================================

-- Se garantiza mediante las llaves foráneas:
-- fk_alumno
-- fk_materia


SELECT * FROM alumnos;

SELECT * FROM materias;

SELECT * FROM inscripciones;

SELECT * FROM historial_alumnos;

SELECT * FROM vista_calificaciones;