package br.com.academiadigital.service;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.entity.view.AlunoView;
import br.com.academiadigital.entity.view.AvaliacaoFisicaView;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAlunoService {
    AlunoView create(AlunoForm form);

    AlunoView get(Long id);

    List<AlunoView> getAll(String dataNascimento);

    AlunoView update(Long id, AlunoUpdateForm form);

    void delete(Long id);

    List<AvaliacaoFisicaView> getAllAvaliacao(Long id);
}
