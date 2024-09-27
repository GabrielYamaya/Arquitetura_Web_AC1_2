package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CategoriaProduto;
import com.example.demo.models.Produto;
import com.example.demo.repositories.CategoriaProdutoRepository;
import com.example.demo.repositories.ProdutoRepository;

@RestController
@RequestMapping("api/demo")
public class CategoriaProdutoController {
    @Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    @GetMapping()
    public List<CategoriaProduto> getCategoriaProdutos() {
        return categoriaProdutoRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String postCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
        categoriaProdutoRepository.save(categoriaProduto);
    }
}
