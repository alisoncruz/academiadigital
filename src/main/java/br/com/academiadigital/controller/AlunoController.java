package br.com.academiadigital.controller;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.service.IAlunoService;
import br.com.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }
}
