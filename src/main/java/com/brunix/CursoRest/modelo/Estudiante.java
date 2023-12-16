package com.brunix.CursoRest.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    @OneToMany(mappedBy = "estudiante")
    @JsonIgnore
    private Set<Cursada> cursadas;
}
