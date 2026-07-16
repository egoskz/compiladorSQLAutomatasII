grammar Expr;

inicio
    : sentencia* EOF
    ;

sentencia
    : crearBaseDatos
    | usarBaseDatos
    | crearTabla
    | insertar
    | seleccionar
    | actualizar
    | eliminar
    | eliminarTabla
    ;

crearBaseDatos
    : CREATE DATABASE ID PUNTOYCOMA
    ;

usarBaseDatos
    : USE ID PUNTOYCOMA
    ;

eliminarTabla
    : DROP TABLE ID PUNTOYCOMA
    ;

crearTabla
    : CREATE TABLE ID PARIZQ columna (COMA columna)* PARDER PUNTOYCOMA
    ;

columna
    : ID tipoDato restricciones*
    ;

tipoDato
    : INT
    | INTEGER
    | BIGINT
    | SMALLINT
    | FLOAT
    | DOUBLE
    | DECIMAL
    | NUMERIC
    | CHAR PARIZQ ENTERO PARDER
    | VARCHAR PARIZQ ENTERO PARDER
    | TEXT
    | DATE
    | TIME
    | DATETIME
    | TIMESTAMP
    | BOOLEAN
    | BIT
    ;

restricciones
    : PRIMARY KEY
    | NOT NULL
    | UNIQUE
    ;

insertar
    : INSERT INTO ID
      PARIZQ listaColumnas PARDER
      VALUES
      PARIZQ listaValores PARDER
      PUNTOYCOMA
    ;

listaColumnas
    : ID (COMA ID)*
    ;

listaValores
    : valor (COMA valor)*
    ;

seleccionar
    : SELECT columnas
      FROM ID
      (WHERE condicion)?
      PUNTOYCOMA
    ;

columnas
    : MULT
    | ID (COMA ID)*
    ;

actualizar
    : UPDATE ID
      SET asignacion (COMA asignacion)*
      (WHERE condicion)?
      PUNTOYCOMA
    ;

asignacion
    : ID IGUAL valor
    ;

eliminar
    : DELETE FROM ID
      (WHERE condicion)?
      PUNTOYCOMA
    ;

condicion
    : ID operador valor
    ;

operador
    : IGUAL
    | MENOR
    | MAYOR
    | MENORIGUAL
    | MAYORIGUAL
    | DIFERENTE
    ;

valor
    : ENTERO
    | DECIMAL_NUM
    | CADENA
    | ID
    ;

CREATE : 'CREATE';
DATABASE : 'DATABASE';
USE : 'USE';
TABLE : 'TABLE';
DROP : 'DROP';

SELECT : 'SELECT';
INSERT : 'INSERT';
UPDATE : 'UPDATE';
DELETE : 'DELETE';

INTO : 'INTO';
VALUES : 'VALUES';
FROM : 'FROM';
WHERE : 'WHERE';
SET : 'SET';

PRIMARY : 'PRIMARY';
KEY : 'KEY';
NOT : 'NOT';
NULL : 'NULL';
UNIQUE : 'UNIQUE';

INT : 'INT';
INTEGER : 'INTEGER';
BIGINT : 'BIGINT';
SMALLINT : 'SMALLINT';

FLOAT : 'FLOAT';
DOUBLE : 'DOUBLE';
DECIMAL : 'DECIMAL';
NUMERIC : 'NUMERIC';

CHAR : 'CHAR';
VARCHAR : 'VARCHAR';
TEXT : 'TEXT';

DATE : 'DATE';
TIME : 'TIME';
DATETIME : 'DATETIME';
TIMESTAMP : 'TIMESTAMP';

BOOLEAN : 'BOOLEAN';
BIT : 'BIT';

MULT : '*';

IGUAL : '=';
MENOR : '<';
MAYOR : '>';
MENORIGUAL : '<=';
MAYORIGUAL : '>=';
DIFERENTE : '<>' | '!=';

PARIZQ : '(';
PARDER : ')';

COMA : ',';
PUNTOYCOMA : ';';

DECIMAL_NUM : [0-9]+ '.' [0-9]+;
ENTERO : [0-9]+;

CADENA
    : '\'' (~['\r\n])* '\''
    ;

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

COMENTARIO
    : '--' ~[\r\n]* -> skip
    ;

COMENTARIO_BLOQUE
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

ERROR
    : .
    ;