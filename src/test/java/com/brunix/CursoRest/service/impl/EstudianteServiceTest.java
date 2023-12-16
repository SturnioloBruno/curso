package com.brunix.CursoRest.service.impl;

import com.brunix.CursoRest.modelo.EstudianteDto;
import com.brunix.CursoRest.service.EstudianteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    EstudianteService estudianteService;

    @Test
    public void testCrearEstudiante(){

        EstudianteDto estudianteDto = new EstudianteDto();
        estudianteDto.setNombre("Bruno");
        estudianteDto.setApellido("Sturniolo");

        estudianteService.crearEstudiante(estudianteDto);

        EstudianteDto estudianteBruno = estudianteService.leerEstudiante(1L);

        assertNotNull(estudianteBruno);
    }

}