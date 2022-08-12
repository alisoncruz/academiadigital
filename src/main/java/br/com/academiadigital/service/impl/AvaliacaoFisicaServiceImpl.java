package br.com.academiadigital.service.impl;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.entity.form.AvaliacaoFisicaForm;
import br.com.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.academiadigital.repository.AlunoRepository;
import br.com.academiadigital.repository.AvaliacaoFisicaRepository;
import br.com.academiadigital.service.IAlunoService;
import br.com.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository repository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        AvaliacaoFisica entity = new AvaliacaoFisica();
        entity.setAltura(form.getAltura());
        entity.setPeso(form.getPeso());
        entity.setAluno(aluno);
        entity = repository.save(entity);
        return entity;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
