package venda.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import venda.api.model.Salgado;
import venda.api.repository.SalgadoRepository;

import java.util.List;

@Service
public class SalgadoService {
    @Autowired
    private SalgadoRepository salgadoRepository;

    public List<Salgado> listarSalgados() {
        return salgadoRepository.findAll();
    }

    public Salgado salvarSalgado(Salgado salgado) {
        return salgadoRepository.save(salgado);
    }

    public Salgado atualizarEstoque(Long id, int quantidade) {
        Salgado salgado = salgadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Salgado não encontrado"));
        salgado.setQuantidadeEstoque(quantidade);
        return salgadoRepository.save(salgado);
    }
}