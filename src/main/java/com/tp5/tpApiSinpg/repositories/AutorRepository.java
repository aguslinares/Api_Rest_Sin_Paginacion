package com.tp5.tpApiSinpg.repositories;

import com.tp5.tpApiSinpg.entities.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
