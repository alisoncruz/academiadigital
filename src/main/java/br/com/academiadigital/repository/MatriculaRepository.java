package br.com.academiadigital.repository;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
