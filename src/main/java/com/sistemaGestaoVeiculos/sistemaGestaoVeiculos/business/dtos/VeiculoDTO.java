package com.sistemaGestaoVeiculos.sistemaGestaoVeiculos.business.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class VeiculoDTO {

    private Long id;
    @NotBlank(message = "A placa é obrigatória")
    @Size(min = 7, max = 8, message = "A placa é obrigatória")
    private String placa;
    @NotBlank(message = "A marca é obrigatória")
    private String marca;
    @NotNull(message = "O ano de fabricação é obrigatório")
    @Min(value = 1900, message = "O ano não pode ser anterior a 1900")
    private Integer anoFabricacao;
    @NotNull(message = "A quilometragem é obrigatória")
    @PositiveOrZero(message = "Quilometragem não pode ser negativa")
    private Integer quilometragem;


}
