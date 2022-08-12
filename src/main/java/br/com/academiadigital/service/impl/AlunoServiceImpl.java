package br.com.academiadigital.service.impl;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.repository.AlunoRepository;
import br.com.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno entity = new Aluno();
        entity.setNome(form.getNome());
        entity.setCpf(form.getCpf());
        entity.setBairro(form.getBairro());
        entity.setDataNascimento(form.getDataNascimento());
        entity = repository.save(entity);
        return entity;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm form) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
