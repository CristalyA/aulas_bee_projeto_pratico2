package controller;

import model.heranca.polimorfismo.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }
}
