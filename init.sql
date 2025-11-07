CREATE SCHEMA IF NOT EXISTS miproyectodb;
USE miproyectodb;

CREATE TABLE IF NOT EXISTS usuarios
(
    id_usuario INT         NOT NULL AUTO_INCREMENT,
    nombre     VARCHAR(45) NOT NULL,
    telefono   VARCHAR(45) NOT NULL,
    correo     VARCHAR(45) NOT NULL,
    password   VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_usuario)
)
    ENGINE = InnoDB;

insert into usuarios(nombre,
                     telefono,
                     correo,
                     password)
values ('Jorge M',
        '1234567890',
        'jorge@correo.com',
        '1234');

