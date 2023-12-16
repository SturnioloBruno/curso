package com.brunix.CursoRest.service.impl;

import com.brunix.CursoRest.dao.EstudianteRepository;
import com.brunix.CursoRest.modelo.Estudiante;
import com.brunix.CursoRest.modelo.EstudianteDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EstudianteService implements com.brunix.CursoRest.service.EstudianteService {
    @Autowired
    private EstudianteRepository repository;
    @Autowired
    ObjectMapper mapper;

    private void guardarEstudiante(EstudianteDto estudianteDto){
        Estudiante estudiante = mapper.convertValue(estudianteDto, Estudiante.class);
        repository.save(estudiante);
    }

    @Override
    public void crearEstudiante(EstudianteDto estudianteDto) {
        guardarEstudiante(estudianteDto);
    }

    @Override
    public EstudianteDto leerEstudiante(Long id) {
        Estudiante estudiante = repository.findById(id).orElseThrow();

        return mapper.convertValue(estudiante, EstudianteDto.class);
    }

    @Override
    public void modificarEstudiante(EstudianteDto estudianteDto) {
        guardarEstudiante(estudianteDto);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<EstudianteDto> getTodos() {
        Iterable<Estudiante> estudiantes = repository.findAll();
        Set<EstudianteDto> estudianteDtos = new HashSet<>();

        for (Estudiante estudiante : estudiantes) {
            estudianteDtos.add(mapper.convertValue(estudiante, EstudianteDto.class));
        }

        return estudianteDtos;
    }
}
