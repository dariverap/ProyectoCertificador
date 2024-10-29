CREATE DATABASE ParticipacionActiva;

USE ParticipacionActiva;
-- Tabla Rol
CREATE TABLE Rol (
    ID_Rol INT AUTO_INCREMENT PRIMARY KEY,
    Nombre_Rol VARCHAR(50) NOT NULL
);

-- Tabla Persona
CREATE TABLE Persona (
    ID_Persona INT AUTO_INCREMENT PRIMARY KEY,
    ID_Rol INT,
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NOT NULL,
    Fecha_Registro DATE NOT NULL,
    FOREIGN KEY (ID_Rol) REFERENCES Rol(ID_Rol)
);

-- Tabla Usuario
CREATE TABLE Usuario (
    ID_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    ID_Persona INT NOT NULL,
    Correo VARCHAR(100) NOT NULL UNIQUE,
    Contrasena VARCHAR(255) NOT NULL,
    FOREIGN KEY (ID_Persona) REFERENCES Persona(ID_Persona)
);

-- Tabla Clase
CREATE TABLE Clase (
    ID_Clase INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Descripcion TEXT,
    Fecha DATE NOT NULL
);

-- Tabla Seccion
CREATE TABLE Seccion (
    ID_Seccion INT AUTO_INCREMENT PRIMARY KEY,
    ID_Clase INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    FOREIGN KEY (ID_Clase) REFERENCES Clase(ID_Clase)
);

-- Tabla Sesion
CREATE TABLE Sesion (
    ID_Sesion INT AUTO_INCREMENT PRIMARY KEY,
    ID_Seccion INT NOT NULL,
    Fecha_Sesion DATE NOT NULL,
    FOREIGN KEY (ID_Seccion) REFERENCES Seccion(ID_Seccion)
);

-- Tabla Pregunta
CREATE TABLE Pregunta (
    ID_Pregunta INT AUTO_INCREMENT PRIMARY KEY,
    ID_Sesion INT NOT NULL,
    ID_Persona INT NOT NULL,
    Contenido TEXT NOT NULL,
    Fecha_Creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ID_Sesion) REFERENCES Sesion(ID_Sesion),
    FOREIGN KEY (ID_Persona) REFERENCES Persona(ID_Persona)
);

-- Tabla Respuesta
CREATE TABLE Respuesta (
    ID_Respuesta INT AUTO_INCREMENT PRIMARY KEY,
    ID_Pregunta INT NOT NULL,
    ID_Persona INT NOT NULL,
    Contenido TEXT NOT NULL,
    Fecha_Respuesta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ID_Pregunta) REFERENCES Pregunta(ID_Pregunta),
    FOREIGN KEY (ID_Persona) REFERENCES Persona(ID_Persona)
);

-- Tabla HistoricoCambios
CREATE TABLE HistoricoCambios (
    ID_Cambio INT AUTO_INCREMENT PRIMARY KEY,
    ID_Persona INT NOT NULL,
    Fecha_Cambio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Descripcion TEXT NOT NULL,
    FOREIGN KEY (ID_Persona) REFERENCES Persona(ID_Persona)
);

-- Valores iniciales para la tabla Rol
INSERT INTO Rol (Nombre_Rol) VALUES ('Alumno'), ('Profesor');

-- Valores iniciales para la tabla Persona
INSERT INTO Persona (ID_Rol, Nombre, Apellido, Fecha_Registro) VALUES 
(1, 'Juan', 'Pérez', '2024-01-10'),       -- Alumno
(1, 'María', 'González', '2024-01-11'),   -- Alumno
(2, 'Luis', 'Martínez', '2024-01-12'),    -- Profesor
(2, 'Ana', 'Rodríguez', '2024-01-13');     -- Profesor

-- Valores iniciales para la tabla Usuario
INSERT INTO Usuario (ID_Persona, Correo, Contrasena) VALUES 
(1, 'juan.perez@example.com', 'password123'),   -- Juan Pérez (Alumno)
(2, 'maria.gonzalez@example.com', 'password456'), -- María González (Alumno)
(3, 'luis.martinez@example.com', 'password789'),  -- Luis Martínez (Profesor)
(4, 'ana.rodriguez@example.com', 'password101');   -- Ana Rodríguez (Profesor)
select*from usuario;