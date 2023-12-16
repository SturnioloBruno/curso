package com.brunix.CursoRest.modelo;

import lombok.Data;

@Data
public class Cursada {
    private Long id;
    private Estudiante estudiante;
    private Materia materia;
    private Double nota;
}
