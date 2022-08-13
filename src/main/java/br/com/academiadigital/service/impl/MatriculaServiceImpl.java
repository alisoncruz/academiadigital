package br.com.academiadigital.service.impl;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.Matricula;
import br.com.academiadigital.entity.form.MatriculaForm;
import br.com.academiadigital.repository.AlunoRepository;
import br.com.academiadigital.repository.MatriculaRepository;
import br.com.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    MatriculaRepository repository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula entity = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        entity.setAluno(aluno);
        entity = repository.save(entity);
        return entity;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
    }
}
