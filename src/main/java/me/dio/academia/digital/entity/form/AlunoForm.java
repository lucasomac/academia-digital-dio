package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    @NotEmpty(message = "Nome é obrigatório")
    @Size(min = 3, max = 50, message = "Nome deve ter no máximo {max} caracteres e no mínimo {min}")
    private String nome;
    @NotEmpty(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve ter {max} caracteres")
    @CPF(message = "'${validatedValue' é inválido")
    private String cpf;
    @NotEmpty(message = "Preencha o campo corretamente para continuar")
    @Size(min = 3, max = 50, message = "Bairro deve ter no máximo {max} caracteres e no mínimo {min}")
    private String bairro;

    @NotNull(message = "Data de nascimento é obrigatório")
    @Past(message = "Data de nascimento deve ser anterior a data atual")
    private LocalDate dataDeNascimento;
}
