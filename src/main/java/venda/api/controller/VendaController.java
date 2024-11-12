package venda.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import venda.api.model.Venda;
import venda.api.service.VendaService;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarVendas();
    }

    @PostMapping("/{salgadoId}/{quantidade}")
    public Venda realizarVenda(@PathVariable Long salgadoId, @PathVariable int quantidade) {
        return vendaService.realizarVenda(salgadoId, quantidade);
    }

}