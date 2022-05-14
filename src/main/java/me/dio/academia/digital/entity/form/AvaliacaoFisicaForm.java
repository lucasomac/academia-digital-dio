package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
    @Positive(message = "Id deve ser maior que zero")
    private Long alunoId;
    @Positive(message = "Peso deve ser maior que zero")
    @NotNull(message = "Peso é obrigatório")
    private double peso;
    @NotNull(message = "Altura é obrigatório")
    @Positive(message = "Altura deve ser maior que zero")
    @DecimalMin(value = "150", message = "Altura deve ser no mínimo {value}cm")
    private double altura;
}
