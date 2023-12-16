package com.brunix.CursoRest.service;

import com.brunix.CursoRest.modelo.EstudianteDto;

import java.util.Set;

public interface EstudianteService {
    void crearEstudiante(EstudianteDto estudianteDto);
    EstudianteDto leerEstudiante(Long id);
    void modificarEstudiante(EstudianteDto estudianteDto);
    void eliminarEstudiante(Long id);
    Set<EstudianteDto> getTodos();
}
