package venda.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataVenda;

    @ManyToOne
    @JoinColumn(name = "salgado_id")
    private Salgado salgado;

    private Integer quantidadeVendida;
    private Double valorTotal;
}