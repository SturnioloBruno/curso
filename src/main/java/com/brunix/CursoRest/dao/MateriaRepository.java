package com.brunix.CursoRest.dao;

import com.brunix.CursoRest.modelo.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Long> {
}
