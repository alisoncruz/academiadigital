package br.com.academiadigital.entity.view;

import br.com.academiadigital.entity.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoView {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;

    public static List<AlunoView> getList(List<Aluno> list){
        return list.stream()
                .map(a -> new AlunoView(a.getId(),
                        a.getNome(),
                        a.getDataNascimento()))
                .collect(Collectors.toList());
    }
}
