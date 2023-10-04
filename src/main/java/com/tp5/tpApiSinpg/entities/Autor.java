package com.tp5.tpApiSinpg.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "autor")
public class Autor extends Base{
    private String nombre;
    private String apellido;
    @Column(name = "biografia", length = 1500)
    private String biografia;



}
