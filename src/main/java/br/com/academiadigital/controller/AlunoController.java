package br.com.academiadigital.controller;

import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.entity.view.AlunoView;
import br.com.academiadigital.entity.view.AvaliacaoFisicaView;
import br.com.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private IAlunoService service;

    @GetMapping
    public ResponseEntity<List<AlunoView>> getAll(@RequestParam(value = "dataNascimento"
            , required = false) String dataNascimento) {
        List<AlunoView> list = service.getAll(dataNascimento);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoView> getById(@PathVariable Long id) {
        AlunoView view = service.get(id);
        return ResponseEntity.ok(view);
    }

    @PostMapping
    public ResponseEntity<AlunoView> create(@Valid @RequestBody AlunoForm form) {
        AlunoView view = service.create(form);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(view.getId()).toUri();
        return ResponseEntity.created(uri).body(view);
    }

    @GetMapping("/avaliacoes/{id}")
    public ResponseEntity<List<AvaliacaoFisicaView>> getAllAvaliacaoById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getAllAvaliacao(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoView> update(@PathVariable Long id, @RequestBody AlunoUpdateForm form){
        AlunoView view = service.update(id, form);
        return ResponseEntity.ok(view);
    }
}
