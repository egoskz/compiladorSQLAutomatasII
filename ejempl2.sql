CREATE DATABASE biblioteca;

USE biblioteca;


CREATE TABLE autores (

    id_autor INT AUTO_INCREMENT,

    nombre VARCHAR(100) NOT NULL,

    nacionalidad VARCHAR(50),

    PRIMARY KEY(id_autor)

);



CREATE TABLE libros (

    id_libro INT AUTO_INCREMENT,

    titulo VARCHAR(100) NOT NULL,

    categoria VARCHAR(50),

    anio_publicacion INT,

    stock INT NOT NULL,

    id_autor INT,

    PRIMARY KEY(id_libro),

    FOREIGN KEY(id_autor)

    REFERENCES autores(id_autor)

);



CREATE TABLE usuarios (

    id_usuario INT AUTO_INCREMENT,

    nombre VARCHAR(100) NOT NULL,

    correo VARCHAR(100) UNIQUE,

    telefono VARCHAR(20),

    PRIMARY KEY(id_usuario)

);



CREATE TABLE prestamos (

    id_prestamo INT AUTO_INCREMENT,

    fecha_prestamo DATE,

    fecha_devolucion DATE,

    id_usuario INT,

    id_libro INT,

    PRIMARY KEY(id_prestamo),

    FOREIGN KEY(id_usuario)

    REFERENCES usuarios(id_usuario),

    FOREIGN KEY(id_libro)

    REFERENCES libros(id_libro)

);



-- INDICES

CREATE INDEX idx_titulo

ON libros(titulo);


CREATE INDEX idx_correo

ON usuarios(correo);



-- INSERT

INSERT INTO autores(nombre,nacionalidad)

VALUES

('Gabriel Garcia Marquez','Colombia'),

('Julio Verne','Francia'),

('George Orwell','Inglaterra');



INSERT INTO libros(titulo,categoria,anio_publicacion,stock,id_autor)

VALUES

('Cien anos de soledad','Novela',1967,5,1),

('Viaje al centro de la Tierra','Aventura',1864,3,2),

('1984','Ficcion',1949,4,3);



INSERT INTO usuarios(nombre,correo,telefono)

VALUES

('Juan Perez','juan@gmail.com','555111'),

('Ana Lopez','ana@gmail.com','555222');



INSERT INTO prestamos(fecha_prestamo,id_usuario,id_libro)

VALUES

('2026-07-01',1,1),

('2026-07-05',2,2);



-- SELECT

SELECT *

FROM libros;



SELECT titulo, categoria

FROM libros

WHERE stock > 2;



-- JOIN

SELECT

usuarios.nombre,

libros.titulo,

prestamos.fecha_prestamo

FROM prestamos

INNER JOIN usuarios

ON prestamos.id_usuario = usuarios.id_usuario

INNER JOIN libros

ON prestamos.id_libro = libros.id_libro;



-- GROUP BY Y FUNCIONES AGREGADAS

SELECT

categoria,

COUNT(*) AS cantidad,

AVG(stock) AS promedio,

MAX(stock) AS mayor,

MIN(stock) AS menor

FROM libros

GROUP BY categoria;



-- ORDER BY

SELECT *

FROM libros

ORDER BY titulo ASC;



-- UPDATE

UPDATE libros

SET stock = 10

WHERE id_libro = 1;



-- DELETE

DELETE FROM prestamos

WHERE id_prestamo = 2;



-- VISTA

CREATE VIEW vista_libros AS

SELECT

titulo,

categoria,

stock

FROM libros;



SELECT *

FROM vista_libros;



-- PROCEDIMIENTO ALMACENADO

CREATE PROCEDURE mostrar_libros()

BEGIN

SELECT *

FROM libros;

END;



CALL mostrar_libros();



-- TRIGGER

CREATE TRIGGER reducir_stock

AFTER INSERT ON prestamos

FOR EACH ROW

BEGIN

UPDATE libros

SET stock = stock - 1

WHERE id_libro = NEW.id_libro;

END;



-- TRANSACCION

START TRANSACTION;


UPDATE libros

SET stock = stock - 1

WHERE id_libro = 1;


INSERT INTO prestamos(

fecha_prestamo,

id_usuario,

id_libro

)

VALUES(

'2026-07-10',

1,

1

);


COMMIT;



-- ROLLBACK

START TRANSACTION;


UPDATE libros

SET stock = -1

WHERE id_libro = 1;


ROLLBACK;



-- RESTRICCIONES

CREATE TABLE empleados (

    id_empleado INT,

    nombre VARCHAR(50) NOT NULL,

    edad INT,

    correo VARCHAR(100) UNIQUE,

    PRIMARY KEY(id_empleado),

    CHECK(edad >= 18)

);
