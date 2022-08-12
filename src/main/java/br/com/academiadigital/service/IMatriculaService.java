package br.com.academiadigital.service;

import br.com.academiadigital.entity.AvaliacaoFisica;
import br.com.academiadigital.entity.Matricula;
import br.com.academiadigital.entity.form.AvaliacaoFisicaForm;
import br.com.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.academiadigital.entity.form.MatriculaForm;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
