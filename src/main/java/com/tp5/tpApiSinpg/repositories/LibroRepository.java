package com.tp5.tpApiSinpg.repositories;

import com.tp5.tpApiSinpg.entities.Libro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
