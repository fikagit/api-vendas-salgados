package venda.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import venda.api.model.Salgado;
import venda.api.service.SalgadoService;

import java.util.List;

@RestController
@RequestMapping("/salgados")
public class SalgadoController {
    @Autowired
    private SalgadoService salgadoService;

    @GetMapping
    public List<Salgado> listarSalgados() {
        return salgadoService.listarSalgados();
    }

    @PostMapping
    public Salgado salvarSalgado(@RequestBody Salgado salgado) {
        return salgadoService.salvarSalgado(salgado);
    }

    @PutMapping("/{id}/{quantidade}/atualizar-estoque")
    public Salgado atualizarEstoque(@PathVariable Long id, @PathVariable int quantidade) {
        return salgadoService.atualizarEstoque(id, quantidade);
    }
}
