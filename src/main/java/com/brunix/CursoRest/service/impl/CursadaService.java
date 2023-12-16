package com.brunix.CursoRest.service.impl;

import com.brunix.CursoRest.dao.CursadaRepository;
import com.brunix.CursoRest.modelo.Cursada;
import com.brunix.CursoRest.modelo.CursadaDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class CursadaService implements com.brunix.CursoRest.service.CursadaService {

    @Autowired
    private CursadaRepository repository;
    @Autowired
    ObjectMapper mapper;

    private void guardarCursada(CursadaDto cursadaDto) {
        Cursada cursada = mapper.convertValue(cursadaDto, Cursada.class);
        repository.save(cursada);
    }
    @Override
    public void crearCursada(CursadaDto cursadaDto) {
        guardarCursada(cursadaDto);
    }

    @Override
    public CursadaDto leerCursadas(Long id) {
        Cursada cursada = repository.findById(id).orElseThrow();
        return mapper.convertValue(cursada, CursadaDto.class);
    }

    @Override
    public void modificarCursada(CursadaDto cursadaDto) {
        // varia en base si el id es cero o null o no se pasa
        guardarCursada(cursadaDto);
    }

    @Override
    public void eliminarCursada(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<CursadaDto> getTodos() {
        Iterable<Cursada> cursadas = repository.findAll();
        Set<CursadaDto> cursadaDtos = new HashSet<>();

        for (Cursada cursada : cursadas) {
            cursadaDtos.add(mapper.convertValue(cursada, CursadaDto.class));
        }

        return cursadaDtos;
    }
}
