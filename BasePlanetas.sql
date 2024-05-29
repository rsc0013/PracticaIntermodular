-- Rafael Soler Cabrero

DROP DATABASE IF EXISTS practica_intermodular;
CREATE DATABASE practica_intermodular;

-- Este bloque de código primero elimina la base de datos "practica_intermodular" si ya existe, y luego crea una nueva base de datos con ese nombre.

USE practica_intermodular;

-- Aquí se selecciona la base de datos "practica_intermodular" para trabajar en ella.

-- Creación de las tablas
CREATE TABLE Estrellas (
  Nombre VARCHAR(50) PRIMARY KEY,
  Tipo VARCHAR(10) NOT NULL,
  Radio DECIMAL(10,1) NOT NULL,
  Temperatura DECIMAL(10,1) NOT NULL,
  Distancia DECIMAL(10,1) NOT NULL,
  Composicion VARCHAR(100) NOT NULL,
  Fecha_Creacion DATE NOT NULL
);

CREATE TABLE Planetas (
  Nombre VARCHAR(50) PRIMARY KEY,
  Estrella VARCHAR(50) NOT NULL,
  Radio DECIMAL(10,1) NOT NULL,
  Distancia DECIMAL(10,1) NOT NULL,
  Periodo DECIMAL(10,1) NOT NULL,
  Temperatura DECIMAL(10,1) NOT NULL,
  Tipo VARCHAR(20) NOT NULL,
  Num_Satelites INT NOT NULL DEFAULT 0,
  Fecha_Creacion DATE NOT NULL
);

CREATE TABLE Satelites (
  Nombre VARCHAR(50) PRIMARY KEY,
  Planeta VARCHAR(50) NOT NULL,
  Radio DECIMAL(10,1) NOT NULL,
  Distancia DECIMAL(10,1) NOT NULL,
  Periodo DECIMAL(10,1) NOT NULL,
  Temperatura DECIMAL(10,1) NOT NULL,
  Tipo VARCHAR(20) NOT NULL,
  Fecha_Creacion DATE NOT NULL
);

-- Estas sentencias CREATE TABLE crean tres tablas: Estrellas, Planetas y Satélites, con sus respectivos campos y tipos de datos.

-- Relaciones entre entidades
ALTER TABLE Planetas
ADD FOREIGN KEY (Estrella) REFERENCES Estrellas(Nombre);

ALTER TABLE Satelites
ADD FOREIGN KEY (Planeta) REFERENCES Planetas(Nombre);

-- TRIGGER.

DELIMITER //
CREATE TRIGGER fecha_creacion_estrella
BEFORE INSERT ON Estrellas
FOR EACH ROW
BEGIN
SET NEW.Fecha_Creacion = CURDATE(); -- Le da formato
  -- SET NEW.Fecha_Creacion = sysdate();
END;
//
CREATE TRIGGER fecha_creacion_planeta
BEFORE INSERT ON Planetas
FOR EACH ROW
BEGIN
  SET NEW.Fecha_Creacion = CURDATE();
END;
//
CREATE TRIGGER fecha_creacion_satelite
BEFORE INSERT ON Satelites
FOR EACH ROW
BEGIN
  SET NEW.Fecha_Creacion = CURDATE();
END;
//
-- Creación del trigger para actualizar el número de satélites en la tabla Planetas
CREATE TRIGGER actualiza_num_satelites
AFTER INSERT ON Satelites
FOR EACH ROW
BEGIN
  DECLARE num_satelites INT;
  -- Contar el número de satélites del planeta
  SELECT COUNT(*) INTO num_satelites FROM Satelites WHERE Planeta = NEW.Planeta;
  --  SET num_satelites = num_satelites + 1 WHERE nombre = NEW.nombre; otra forma de hacerlo
  -- Actualizar el número de satélites en la tabla Planetas
  UPDATE Planetas
  SET Num_Satelites = num_satelites WHERE Nombre = NEW.Planeta;
END;
//

-- Inserción de datos (insertan los datos iniciales en las tablas Estrellas, Planetas y Satélites).
INSERT INTO Estrellas (Nombre, Tipo, Radio, Temperatura, Distancia, Composicion)
VALUES ('Sol', 'G2V', 696340.0, 5500.0, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros');

INSERT INTO Planetas (Nombre, Estrella, Radio, Distancia, Periodo, Temperatura, Tipo)
VALUES ('Mercurio', 'Sol', 2439.7, 57.9, 88.0, 167.0, 'Rocoso'),
       ('Venus', 'Sol', 6051.8, 108.2, 225.0, 464.0, 'Rocoso'),
       ('Tierra', 'Sol', 6371.0, 149.6, 365.25, 15.0, 'Rocoso'),
       ('Marte', 'Sol', 3389.5, 227.9, 687.0, -65.0, 'Rocoso'),
       ('Júpiter', 'Sol', 69911.0, 778.5, 4333.0, -110.0, 'Gaseoso'),
       ('Saturno', 'Sol', 58232.0, 1429.4, 10759.0, -140.0, 'Gaseoso'),
       ('Urano', 'Sol', 25362.0, 2870.9, 30687.0, -195.0, 'Gaseoso'),
       ('Neptuno', 'Sol', 24622.0, 4498.3, 60190.0, -200.0, 'Gaseoso');

INSERT INTO Satelites (Nombre, Planeta, Radio, Distancia, Periodo, Temperatura, Tipo)
VALUES ('Luna', 'Tierra', 1737.4, 384400.0, 27.3, -53.0, 'Sólido/Rocoso'),
       ('Fobos', 'Marte', 11.1, 9378.0, 0.3, -40.0, 'Sólido/Rocoso'),
       ('Deimos', 'Marte', 6.2, 23460.0, 1.3, -40.0, 'Sólido/Rocoso'),
       ('Io', 'Júpiter', 1821.6, 421700.0, 1.8, -143.0, 'Sólido/Rocoso'),
       ('Europa', 'Júpiter', 1560.8, 670900.0, 3.5, -160.0, 'Sólido/Hielo'),
       ('Ganimedes', 'Júpiter', 2634.1, 1070400.0, 7.2, -163.0, 'Sólido/Hielo'),
       ('Calisto', 'Júpiter', 2410.3, 1882700.0, 16.7, -139.0, 'Sólido/Hielo'),
       ('Titan', 'Saturno', 2575.5, 1222000.0, 15.9, -179.0, 'Sólido/Hielo'),
       ('Encelado', 'Saturno', 252.1, 238000.0, 1.4, -201.0, 'Sólido/Hielo'),
       ('Titania', 'Urano', 788.4, 435900.0, 8.7, -203.0, 'Sólido/Hielo'),
       ('Oberon', 'Urano', 761.4, 583500.0, 13.5, -203.0, 'Sólido/Hielo');


select * from Planetas;
