package br.com.academiadigital.controller;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.Matricula;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.MatriculaForm;
import br.com.academiadigital.service.IAlunoService;
import br.com.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private IMatriculaService service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }
}
