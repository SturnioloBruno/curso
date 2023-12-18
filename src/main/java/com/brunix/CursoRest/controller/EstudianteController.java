package com.brunix.CursoRest.controller;

import com.brunix.CursoRest.modelo.EstudianteDto;
import com.brunix.CursoRest.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @PostMapping
    public ResponseEntity<?> crearEstudiante(@RequestBody EstudianteDto estudianteDto) {
        service.crearEstudiante(estudianteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEstudianteById(@PathVariable Long id) {
        return ResponseEntity.ok(service.leerEstudiante(id));
    }

    @PutMapping
    public ResponseEntity<?> modificarEstudiante(@RequestBody EstudianteDto estudianteDto) {
        service.modificarEstudiante(estudianteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEstudiante(@PathVariable Long id) {
        service.eliminarEstudiante(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getTodosEstudiantes() {
        return ResponseEntity.ok(service.getTodos());
    }
}
