package com.brunix.CursoRest.dao;

import com.brunix.CursoRest.modelo.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
