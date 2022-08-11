package br.com.academiadigital.entity;

import java.time.LocalDateTime;

public class Matricula {

    private Long id;

    private Aluno aluno;

    private LocalDateTime data = LocalDateTime.now();
}
