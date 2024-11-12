package venda.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import venda.api.model.Salgado;

public interface SalgadoRepository extends JpaRepository<Salgado, Long> {
}