CREATE SCHEMA `test` ;

CREATE TABLE `test`.`persona` (
  `id_persona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  PRIMARY KEY (`id_persona`));

  CREATE TABLE `test`.`user` (
    `id_username` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NULL,
    `password` VARCHAR(128) NULL,
    `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id_username`));

    CREATE TABLE `test`.`rol` (
      `id_rol` INT NOT NULL AUTO_INCREMENT,
      `nombre` VARCHAR(45) NULL,
      `id_username` INT NULL,
      PRIMARY KEY (`id_rol`),
      INDEX `id_rol_username_idx` (`id_username` ASC) VISIBLE,
      CONSTRAINT `id_rol_username`
        FOREIGN KEY (`id_username`)
        REFERENCES `test`.`user` (`id_username`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION);

INSERT INTO `test`.`user` (`username`, `password`) VALUES ('admin', '9701');
INSERT INTO `test`.`user` (`username`, `password`) VALUES ('user', '9701');

INSERT INTO `test`.`rol` (`nombre`, `id_username`) VALUES ('ROLE_ADMIN', '1');
INSERT INTO `test`.`rol` (`nombre`, `id_username`) VALUES ('ROLE_USER', '2');
INSERT INTO `test`.`rol` (`nombre`, `id_username`) VALUES ('ROLE_USER', '2');


INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Juan', 'Betancur', 'mail@gmail.com', '321445');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Camilo', 'Rico', 'camilo@mail.com', '6544789');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('JC', 'BR', 'jcbr@email.com', '477852');
INSERT INTO `test`.`persona` (`nombre`, `apellido`, `email`, `telefono`) VALUES ('Carola', 'Restrepo', 'cr@gmail.com', '789511');
--Para reiniciar el autorincrementable del id de la tabla
ALTER TABLE test.persona AUTO_INCREMENT = 1;

ALTER TABLE `test`.`persona`
ADD COLUMN `saldo` DOUBLE NULL AFTER `telefono`;

UPDATE `test`.`persona` SET `saldo` = '250' WHERE (`id_persona` = '11');
UPDATE `test`.`persona` SET `saldo` = '200' WHERE (`id_persona` = '13');
UPDATE `test`.`persona` SET `saldo` = '150' WHERE (`id_persona` = '14');
