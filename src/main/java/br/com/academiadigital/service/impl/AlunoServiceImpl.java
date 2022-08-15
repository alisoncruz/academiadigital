package br.com.academiadigital.service.impl;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.entity.view.AlunoView;
import br.com.academiadigital.entity.view.AvaliacaoFisicaView;
import br.com.academiadigital.infra.utils.JavaTimeUtils;
import br.com.academiadigital.repository.AlunoRepository;
import br.com.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    AlunoRepository repository;

    @Override
    public AlunoView create(AlunoForm form) {
        Aluno entity = new Aluno();
        entity.setNome(form.getNome());
        entity.setCpf(form.getCpf());
        entity.setBairro(form.getBairro());
        entity.setDataNascimento(form.getDataNascimento());
        entity = repository.save(entity);
        return new AlunoView(entity.getId(), entity.getNome(), entity.getDataNascimento());
    }

    @Override
    public AlunoView get(Long id) {
        Aluno entity = repository.findById(id).get();
        return new AlunoView(entity.getId(), entity.getNome(), entity.getDataNascimento());
    }

    @Override
    public List<AlunoView> getAll(String dataNascimento) {
        if (dataNascimento == null) {
            return AlunoView.getList(repository.findAll());
        }
        LocalDate dataNasc = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return AlunoView.getList(repository.findByDataNascimento(dataNasc));
    }

    @Override
    public AlunoView update(Long id, AlunoUpdateForm form) {
        Aluno entity = repository.findById(id).get();
        entity.setNome(form.getNome());
        entity.setBairro(form.getBairro());
        entity.setDataNascimento(form.getDataNascimento());
        entity = repository.save(entity);
        return new AlunoView(entity.getId(), entity.getNome(), entity.getDataNascimento());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisicaView> getAllAvaliacao(Long id) {
        Aluno aluno = repository.findById(id).get();
        return AvaliacaoFisicaView.getList(aluno.getAvaliacoes());
    }
}
