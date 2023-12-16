package com.brunix.CursoRest.modelo;

import lombok.Data;

import java.util.Set;

@Data
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;

    private Set<Cursada> cursadas;
}
