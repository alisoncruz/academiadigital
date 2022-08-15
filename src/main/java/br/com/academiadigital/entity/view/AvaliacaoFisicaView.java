package br.com.academiadigital.entity.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaView {
    private String nomeAluno;
    private LocalDateTime data;
    private double pesoAtual;
    private double alturaAtual;
}
