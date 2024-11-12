package venda.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import venda.api.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}