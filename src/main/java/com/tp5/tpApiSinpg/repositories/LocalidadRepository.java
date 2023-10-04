package com.tp5.tpApiSinpg.repositories;

import com.tp5.tpApiSinpg.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
