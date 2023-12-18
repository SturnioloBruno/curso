package com.brunix.CursoRest.controller;

import com.brunix.CursoRest.modelo.CursadaDto;
import com.brunix.CursoRest.service.CursadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursadas")
public class CursadaController {

    @Autowired
    private CursadaService service;

    @PostMapping
    public ResponseEntity<?> crearCursada(@RequestBody CursadaDto cursadaDto) {
        service.crearCursada(cursadaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCursada(@PathVariable Long id) {
        return ResponseEntity.ok(service.leerCursadas(id));
    }

    @PutMapping
    public ResponseEntity<?> modificarCursada(@RequestBody CursadaDto cursadaDto) {
        service.modificarCursada(cursadaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCursada(@PathVariable Long id) {
        service.eliminarCursada(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getTodasLasCursadas() {
        return ResponseEntity.ok(service.getTodos());
    }
}
