package br.com.academiadigital.entity.view;

import br.com.academiadigital.entity.AvaliacaoFisica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaView {
    private Long id;
    private String nomeAluno;
    private LocalDateTime data;
    private double pesoAtual;
    private double alturaAtual;

    public static List<AvaliacaoFisicaView> getList(List<AvaliacaoFisica> list) {
        return list.stream().map(a -> new AvaliacaoFisicaView(a.getId(),
                a.getAluno().getNome(),
                a.getData(),
                a.getPeso(),
                a.getAltura())).collect(Collectors.toList());
    }
}
