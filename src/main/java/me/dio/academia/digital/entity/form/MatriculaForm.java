package me.dio.academia.digital.entity.form;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {
    @NotNull(message = "O id aluno é obrigatório")
    @Positive(message = "O id aluno deve ser positivo")
    private Long alunoId;

}
