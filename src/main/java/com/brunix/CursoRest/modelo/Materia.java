package com.brunix.CursoRest.modelo;

import lombok.Data;

import java.util.Set;

@Data
public class Materia {
    private Long id;
    private String nombre;

    private Set<Cursada> cursadas;
}
