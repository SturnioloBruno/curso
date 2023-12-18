package com.brunix.CursoRest.controller;

import com.brunix.CursoRest.modelo.MateriaDto;
import com.brunix.CursoRest.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService service;

    @PostMapping
    public ResponseEntity<?> crearMateria(@RequestBody MateriaDto materiaDto) {
        service.crearMateria(materiaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMateria(@PathVariable Long id) {
        return ResponseEntity.ok(service.leerMateria(id));
    }

    @PutMapping
    public ResponseEntity<?> modificarMateria(@RequestBody MateriaDto materiaDto) {
        service.modificarMateria(materiaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMateria(@PathVariable Long id) {
        service.eliminarMateria(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getTodasMaterias() {
        return ResponseEntity.ok(service.getTodos());
    }
}
