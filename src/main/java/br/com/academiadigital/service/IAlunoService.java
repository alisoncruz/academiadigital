package br.com.academiadigital.service;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm form);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacao(Long id);
}
