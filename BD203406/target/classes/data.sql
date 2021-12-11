DROP TABLE IF EXISTS Cita;
CREATE TABLE Cita (
                      Fecha char(5) NOT NULL,
                      Hora char(5) NOT NULL,
                      IdTipoServicio char(5) NOT NULL,
                      IdDueño char(5) NOT NULL,
                      IdTipoMascota char(5) NOT NULL

) ;
INSERT INTO Cita (Fecha, Hora, IdTipoServicio, IdDueño, IdTipoMascota) VALUES ('lunes','15-00','00007','8966','9685');

DROP TABLE IF EXISTS Dueño;
CREATE TABLE Dueño (
                       IdDueño char(5) NOT NULL,
                       Nombre char(45) NOT NULL,
                       Telefono char(12) NOT NULL,
                       Direccion char(45) NOT NULL
) ;
INSERT INTO Dueño (IdDueño, Nombre, Telefono, Direccion) VALUES ('00001','Leyva','961-296-0202','Oriente Norte');
/*
DROP TABLE IF EXISTS Mascota
CREATE TABLE Mascota(
    IdMascota char (45) NOT NULL,
    NombreMascota char(45) NOT NULL,
    TipoMascota char(45) NOT NULL,
    FechaIngreso char(45) NOT NULL,

);
INSERT INTO Mascota(IdMascota, NombreMascota, TipoMascota, FechaIngreso) VALUES ('01','Richard','gato','2021-10-11');
*/