CREATE TABLE venda (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       data_venda TIMESTAMP NOT NULL,
                       salgado_id BIGINT NOT NULL,
                       quantidade_vendida INT NOT NULL,
                       valor_total DECIMAL(10, 2) NOT NULL,
                       CONSTRAINT fk_salgado
                           FOREIGN KEY (salgado_id) REFERENCES salgado(id)
);
