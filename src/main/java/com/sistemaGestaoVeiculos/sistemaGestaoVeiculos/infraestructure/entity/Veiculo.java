package com.sistemaGestaoVeiculos.sistemaGestaoVeiculos.infraestructure.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "placa",nullable = false,length = 8,unique = true)
    private String placa;
    @Column(name = "marca",nullable = false)
    private String marca;
    @Column(name = "ano_Fabricacao",nullable = false)
    private int anoFabricacao;
    @Column(name = "quilometragem",nullable = false)
    private int quilometragem;
    @Column(nullable = false)
    boolean ativo = true;


}
