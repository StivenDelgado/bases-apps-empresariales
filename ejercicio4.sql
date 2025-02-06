/*ear una tabla clientes con las siguientes columnas:
• id (INT, PRIMARY KEY, AUTO_INCREMENT)
• nombre (VARCHAR, 100)
• email (VARCHAR, 100, UNIQUE)
• telefono (VARCHAR, 20)
• fecha_registro (DATE, DEFAULT CURRENT_DATE)
• Insertar al menos 5 registros en la tabla clientes*/


USE ejercicio4;

/*
CREATE TABLE IF NOT EXISTS clientes (
    `id_cliente` INT NOT NULL AUTO_INCREMENT,
    `nombre_cliente` VARCHAR(100) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `telefono` VARCHAR(20) NOT NULL,
    `fecha_registro` DATE NOT NULL DEFAULT CURRENT_DATE,
    PRIMARY KEY (`id_cliente`),
    UNIQUE KEY `email` (`email`)
);
*/

INSERT INTO clientes (nombre_cliente, email, telefono) VALUES
('Juan david rodriguez', 'juanchurrias@miau.com', '33333333'),
('dieguis la loka', 'diega@gmai.com', '2222222'),
('Vale Marin', 'valecitalamaslinda@gmail.com', '88888888'),
('carechuspa tiven', 'tiven@gmail.com', '77777777'),
('piojo hola', 'piojo@gmail.com', '666666');



