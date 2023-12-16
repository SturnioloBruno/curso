package com.brunix.CursoRest.dao;

import com.brunix.CursoRest.modelo.Cursada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursadaRepository extends CrudRepository<Cursada, Long> {
}
