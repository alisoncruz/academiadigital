package br.com.academiadigital.controller;

import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AvaliacaoFisicaForm;
import br.com.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private IAvaliacaoFisicaService service;

    @PostMapping
    private AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }


}
