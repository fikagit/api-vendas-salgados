package venda.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import venda.api.model.Salgado;
import venda.api.model.Venda;
import venda.api.repository.SalgadoRepository;
import venda.api.repository.VendaRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private SalgadoRepository salgadoRepository;

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public Venda realizarVenda(Long salgadoId, int quantidade) {
        Salgado salgado = salgadoRepository.findById(salgadoId).orElseThrow();

        if (salgado.getQuantidadeEstoque() < quantidade) {
            throw new RuntimeException("Estoque insuficiente");
        }

        Venda venda = new Venda();
        venda.setDataVenda(LocalDateTime.now());
        venda.setSalgado(salgado);
        venda.setQuantidadeVendida(quantidade);
        venda.setValorTotal(salgado.getPreco() * quantidade);

        salgado.setQuantidadeEstoque(salgado.getQuantidadeEstoque() - quantidade);
        salgadoRepository.save(salgado);

        return vendaRepository.save(venda);
    }
}