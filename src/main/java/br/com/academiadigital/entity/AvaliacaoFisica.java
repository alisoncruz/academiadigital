package br.com.academiadigital.entity;

import java.time.LocalDateTime;

public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    private LocalDateTime data = LocalDateTime.now();

    private double peso;

    private double altura;
}
