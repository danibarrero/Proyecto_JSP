CREATE DATABASE IF NOT EXISTS `aplicacion` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `aplicacion`;

CREATE TABLE IF NOT EXISTS `aplicacion` (
    `usuarioID` int(11) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(40) DEFAULT NULL,
    `contraseña` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
    PRIMARY KEY (`usuarioID`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

INSERT INTO `aplicacion` (`usuarioID`, nombre, `contraseña`) VALUES
    (1, 'daniel', 'usuario'),
    (2, 'examen', 'aprueba');