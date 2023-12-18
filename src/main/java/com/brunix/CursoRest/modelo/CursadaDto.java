package com.brunix.CursoRest.modelo;

import lombok.Data;

@Data
public class CursadaDto {
    private Long id;
    private Double nota;
    private Estudiante estudiante;
    private Materia materia;
}
