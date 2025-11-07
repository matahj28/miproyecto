CREATE SCHEMA IF NOT EXISTS miproyectodb;
USE miproyectodb;

CREATE TABLE IF NOT EXISTS usuarios
(
    id_usuario INT         NOT NULL,
    nombre     VARCHAR(45) NOT NULL,
    telefono   VARCHAR(45) NOT NULL,
    correo     VARCHAR(45) NOT NULL,
    password   VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_usuario)
)
    ENGINE = InnoDB;

insert into usuarios(id_usuario,
                     nombre,
                     telefono,
                     correo,
                     password)
values (1,
        'Jorge M',
        '1234567890',
        'jorge@correo.com',
        '1234');

