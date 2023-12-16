package com.brunix.CursoRest.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name ="Materias")
public class Materia {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "materia")
    @JsonIgnore
    private Set<Cursada> cursadas;
}
