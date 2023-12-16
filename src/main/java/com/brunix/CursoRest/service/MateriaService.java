package com.brunix.CursoRest.service;

import com.brunix.CursoRest.modelo.MateriaDto;

import java.util.Set;

public interface MateriaService {
    void crearMateria(MateriaDto materiaDto);
    MateriaDto leerMateria(Long id);
    void modificarMateria(MateriaDto materiaDto);
    void eliminarMateria(Long id);
    Set<MateriaDto> getTodos();
}
