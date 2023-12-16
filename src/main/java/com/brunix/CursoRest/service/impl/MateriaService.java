package com.brunix.CursoRest.service.impl;

import com.brunix.CursoRest.dao.MateriaRepository;
import com.brunix.CursoRest.modelo.Materia;
import com.brunix.CursoRest.modelo.MateriaDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MateriaService implements com.brunix.CursoRest.service.MateriaService {

    @Autowired
    private MateriaRepository repository;

    @Autowired
    ObjectMapper mapper;

    private void guardarMateria(MateriaDto materiaDto){
        Materia materia = mapper.convertValue(materiaDto, Materia.class);
        repository.save(materia);
    }
    @Override
    public void crearMateria(MateriaDto materiaDto) {
        guardarMateria(materiaDto);
    }

    @Override
    public MateriaDto leerMateria(Long id) {
        Materia materia = repository.findById(id).orElseThrow();

        return mapper.convertValue(materia, MateriaDto.class);
    }

    @Override
    public void modificarMateria(MateriaDto materiaDto) {
        guardarMateria(materiaDto);
    }

    @Override
    public void eliminarMateria(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<MateriaDto> getTodos() {
        Iterable<Materia> materias = repository.findAll();
        Set<MateriaDto> materiaDtos = new HashSet<>();

        for (Materia materia : materias) {
            materiaDtos.add(mapper.convertValue(materia, MateriaDto.class));
        }

        return materiaDtos;
    }
}
