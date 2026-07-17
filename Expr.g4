grammar Expr;

inicio
    : sentencia* EOF
    ;

sentencia
    : crearBaseDatos
    | crearLogin
    | usarBaseDatos
    | crearTabla
    | eliminarTabla
    | alterarTabla
    | crearIndice
    | crearVista
    | insertar
    | seleccionar
    | actualizar
    | eliminar
    | procedimiento
    | trigger
    | transaccion
    | commitStmt
    | rollbackStmt
    | llamadaProcedimiento
    ;


crearBaseDatos
    : CREATE DATABASE ID PUNTOYCOMA
    ;

crearLogin
    : CREATE LOGIN ID PUNTOYCOMA
    ;

usarBaseDatos
    : USE ID PUNTOYCOMA
    ;

eliminarTabla
    : DROP TABLE ID PUNTOYCOMA
    ;

crearTabla
    : CREATE TABLE ID
      PARIZQ
      elementoTabla (COMA elementoTabla)*
      PARDER
      PUNTOYCOMA
    ;

elementoTabla
    : columna
    | PRIMARY KEY PARIZQ listaColumnas PARDER

    | FOREIGN KEY PARIZQ listaColumnas PARDER
      REFERENCES ID
      PARIZQ listaColumnas PARDER
      accionReferencia*

    | CONSTRAINT ID FOREIGN KEY PARIZQ listaColumnas PARDER
      REFERENCES ID
      PARIZQ listaColumnas PARDER
      accionReferencia*

    | CONSTRAINT ID CHECK PARIZQ condicion PARDER

    | CONSTRAINT ID UNIQUE PARIZQ listaColumnas PARDER
    ;

columna
    : ID tipoDato modificadorColumna*
    | REFERENCES ID
      PARIZQ listaColumnas PARDER
      accionReferencia*
    ;

modificadorColumna
    : PRIMARY KEY
    | NOT NULL
    | UNIQUE
    | AUTO_INCREMENT
    | DEFAULT valor
    | CHECK PARIZQ condicion PARDER
    ;

accionReferencia
    : ON DELETE CASCADE
    | ON UPDATE CASCADE
    | ON DELETE RESTRICT
    | ON UPDATE RESTRICT
    ;

alterarTabla
    : ALTER TABLE ID
      (
          ADD columna
        | ADD CONSTRAINT ID CHECK PARIZQ condicion PARDER
        | DROP COLUMN ID
        | MODIFY columna
      )
      PUNTOYCOMA
    ;

crearIndice
    : CREATE INDEX ID
      ON ID
      PARIZQ listaColumnas PARDER
      PUNTOYCOMA
    ;

crearVista
    : CREATE VIEW ID
      AS
      seleccionarSinPuntoYComa
      PUNTOYCOMA
    ;

tipoDato
    : INT
    | INTEGER
    | BIGINT
    | SMALLINT
    | FLOAT
    | DOUBLE
    | DECIMAL PARIZQ ENTERO COMA ENTERO PARDER
    | NUMERIC PARIZQ ENTERO COMA ENTERO PARDER
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
      bloqueValores
      PUNTOYCOMA
    ;


bloqueValores
    : PARIZQ listaValores PARDER
      (COMA PARIZQ listaValores PARDER)*
    ;

listaColumnas
    : ID (COMA ID)*
    ;

listaValores
    : valor (COMA valor)*
    ;

seleccionar
    : seleccionarSinPuntoYComa PUNTOYCOMA
    ;

seleccionarSinPuntoYComa
    : SELECT DISTINCT? listaSeleccion
      FROM tablaOrigen
      joinClause*
      (WHERE condicion)?
      (GROUP BY listaColumnas)?
      (HAVING condicion)?
      (ORDER BY listaOrden)?
    ;

listaSeleccion
    : expresionSelect (COMA expresionSelect)*
    ;

tablaOrigen
    : ID (ID)?
    ;


joinClause
    : JOIN tablaOrigen
      ON condicionJoin
    | INNER JOIN tablaOrigen
      ON condicionJoin
    | LEFT JOIN tablaOrigen
      ON condicionJoin
    | RIGHT JOIN tablaOrigen
      ON condicionJoin
    | FULL JOIN tablaOrigen
      ON condicionJoin
    ;

condicionJoin
    : ID PUNTO ID IGUAL ID PUNTO ID
    ;

listaOrden
    : ordenColumna (COMA ordenColumna)*
    ;

ordenColumna
    : ID direccionOrden?
    | ID PUNTO ID direccionOrden?
    ;

direccionOrden
    : ASC
    | DESC
    ;

expresionSelect
    : MULT
    | referencia alias?
    | funcionSQL alias?
    ;

alias
    : AS ID
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

procedimiento
    : CREATE PROCEDURE ID
      PARIZQ parametros? PARDER
      BEGIN
        sentenciaProcedimiento*
      END (PUNTOYCOMA | DIV DIV)
    ;

parametros
    : parametro (COMA parametro)*
    ;

parametro
    : (IN | OUT | INOUT)? ID tipoDato
    ;

sentenciaProcedimiento
    : insertar
    | actualizar
    | eliminar
    | seleccionar
    | asignacionVariable
    ;

asignacionVariable
    : ID IGUAL valor PUNTOYCOMA
    ;

llamadaProcedimiento
    : CALL ID
      PARIZQ argumentos? PARDER
      PUNTOYCOMA
    ;

argumentos
    : valor (COMA valor)*
    ;

condicion
    : comparacion (AND comparacion | OR comparacion)*
    ;

comparacion
    : expresion operador expresion
    | PARIZQ condicion PARDER
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
    : expresion
    ;

expresion
    : expresionAritmetica
    | funcionSQL
    | referencia
    | literal
    ;

referencia
    : ID
    | ID PUNTO ID
    | NEW PUNTO ID
    | OLD PUNTO ID
    ;

literal
    : ENTERO
    | DECIMAL_NUM
    | CADENA
    | TRUE
    | FALSE
    | NULL
    ;

expresionAritmetica
    : termino ((MAS | MENOS) termino)*
    ;

termino
    : factor ((MULT | DIV) factor)*
    ;

factor
    : literal
    | referencia
    | funcionSQL
    | PARIZQ expresionAritmetica PARDER
    ;

funcionSQL
    : COUNT PARIZQ (MULT | referencia) PARDER
    | SUM PARIZQ referencia PARDER
    | AVG PARIZQ referencia PARDER
    | MIN PARIZQ referencia PARDER
    | MAX PARIZQ referencia PARDER
    | NOW PARIZQ PARDER
    | CURRENT_DATE PARIZQ PARDER
    | CURRENT_TIME PARIZQ PARDER
    | CONCAT PARIZQ listaExpresiones PARDER
    | UPPER PARIZQ expresion PARDER
    | LOWER PARIZQ expresion PARDER
    | LENGTH PARIZQ expresion PARDER
    ;

listaExpresiones
    : expresion (COMA expresion)*
    ;

trigger
    : CREATE TRIGGER ID
      tiempoTrigger eventoTrigger
      ON ID
      FOR EACH ROW
      BEGIN
         accionTrigger*
      END
      PUNTOYCOMA
    ;

tiempoTrigger
    : BEFORE
    | AFTER
    ;

eventoTrigger
    : INSERT
    | UPDATE
    | DELETE
    ;

accionTrigger
    : insertar
    | actualizar
    | eliminar
    | asignacionTrigger
    ;

asignacionTrigger
    : ID IGUAL referenciaTrigger PUNTOYCOMA
    ;

referenciaTrigger
    : NEW PUNTO ID
    | OLD PUNTO ID
    ;

transaccion
    : START TRANSACTION PUNTOYCOMA
    ;

commitStmt
    : COMMIT PUNTOYCOMA
    ;

rollbackStmt
    : ROLLBACK PUNTOYCOMA
    ;

CREATE : 'CREATE';
DATABASE : 'DATABASE';
USE : 'USE';
TABLE : 'TABLE';
DROP : 'DROP';

SELECT : 'SELECT';
INSERT : 'INSERT';
UPDATE : 'UPDATE';
LOGIN  : 'LOGIN';
ON : 'ON';
CASCADE : 'CASCADE';
DELETE : 'DELETE';
RESTRICT : 'RESTRICT';

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

IGUAL : '=';
MENOR : '<';
MAYOR : '>';
MENORIGUAL : '<=';
MAYORIGUAL : '>=';
DIFERENTE : '<>' | '!=';

PARIZQ : '(';
PARDER : ')';
CORIZQ: '[';
CORDER: ']';

COMA : ',';
PUNTOYCOMA : ';';
PUNTO: '.';

DECIMAL_NUM : [0-9]+ '.' [0-9]+;
ENTERO : [0-9]+;

CADENA
    : '\'' (~['\r\n])* '\''
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

ALTER : 'ALTER';
ADD : 'ADD';
MODIFY : 'MODIFY';
COLUMN : 'COLUMN';

AUTO_INCREMENT : 'AUTO_INCREMENT';
DEFAULT : 'DEFAULT';


INDEX : 'INDEX';
VIEW : 'VIEW';
AS : 'AS';

JOIN : 'JOIN';
INNER : 'INNER';
LEFT : 'LEFT';
RIGHT : 'RIGHT';
FULL : 'FULL';

GROUP : 'GROUP';
BY : 'BY';
HAVING : 'HAVING';

ORDER : 'ORDER';
ASC : 'ASC';
DESC : 'DESC';

DISTINCT : 'DISTINCT';

COUNT : 'COUNT';
SUM : 'SUM';
AVG : 'AVG';
MIN : 'MIN';
MAX : 'MAX';

AND : 'AND';

TRUE : 'TRUE';
FALSE : 'FALSE';

PROCEDURE : 'PROCEDURE';
CALL : 'CALL';

BEGIN : 'BEGIN';
END : 'END';

TRIGGER : 'TRIGGER';

BEFORE : 'BEFORE';
AFTER : 'AFTER';

FOR : 'FOR';
EACH : 'EACH';
ROW : 'ROW';

NEW : 'NEW';
OLD : 'OLD';

START : 'START';
TRANSACTION : 'TRANSACTION';

COMMIT : 'COMMIT';
ROLLBACK : 'ROLLBACK';

IN : 'IN';
OUT : 'OUT';
INOUT : 'INOUT';

MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';

OR : 'OR';

NOW : 'NOW';
CURRENT_DATE : 'CURRENT_DATE';
CURRENT_TIME : 'CURRENT_TIME';

CONCAT : 'CONCAT';
UPPER : 'UPPER';
LOWER : 'LOWER';
LENGTH : 'LENGTH';

CHECK : 'CHECK';
CONSTRAINT : 'CONSTRAINT';
FOREIGN : 'FOREIGN';
REFERENCES : 'REFERENCES';

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

ERROR
    : .
    ;