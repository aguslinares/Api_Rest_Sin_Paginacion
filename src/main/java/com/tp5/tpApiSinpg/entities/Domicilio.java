package com.tp5.tpApiSinpg.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "domicilio")
public class Domicilio extends Base {

        private String calle;
        private int numero;

        @ManyToOne(optional=false)
        @JoinColumn(name = "fk_localidad")
        private Localidad localidad;

}
