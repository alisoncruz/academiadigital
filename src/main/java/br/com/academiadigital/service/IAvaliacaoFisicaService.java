package br.com.academiadigital.service;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.form.AlunoForm;
import br.com.academiadigital.entity.form.AlunoUpdateForm;
import br.com.academiadigital.entity.form.AvaliacaoFisicaForm;
import br.com.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form);

    void delete(Long id);
}
