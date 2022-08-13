package br.com.academiadigital.controller;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.service.IAlunoService;
import br.com.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private IAlunoService service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoById(@PathVariable Long id){
        return service.getAllAvaliacao(id);
    }
}
