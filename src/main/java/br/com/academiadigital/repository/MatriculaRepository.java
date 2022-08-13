package br.com.academiadigital.repository;

import br.com.academiadigital.entity.Aluno;
import br.com.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
    List<Matricula> findByAlunoBairro(String bairro);
}
