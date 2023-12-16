package com.brunix.CursoRest.service;

import com.brunix.CursoRest.modelo.CursadaDto;
import com.brunix.CursoRest.modelo.MateriaDto;

import java.util.Set;

public interface CursadaService {
    void crearCursada(CursadaDto cursadaDto);
    CursadaDto leerCursadas(Long id);
    void modificarCursada(CursadaDto cursadaDto);
    void eliminarCursada(Long id);
    Set<CursadaDto> getTodos();
}
