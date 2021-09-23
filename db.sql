CREATE SCHEMA `test` ;

CREATE TABLE `test`.`persona` (
  `id_persona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  PRIMARY KEY (`id_persona`));

INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Juan', 'Betancur', 'mail@gmail.com', '321445');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Camilo', 'Rico', 'camilo@mail.com', '6544789');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('JC', 'BR', 'jcbr@email.com', '477852');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Carola', 'Restrepo', 'cr@gmail.com', '789511');
--Para reiniciar el autorincrementable del id de la tabla
ALTER TABLE test.persona AUTO_INCREMENT = 1;