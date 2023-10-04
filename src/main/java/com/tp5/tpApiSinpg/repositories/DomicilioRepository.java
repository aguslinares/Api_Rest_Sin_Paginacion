package com.tp5.tpApiSinpg.repositories;

import com.tp5.tpApiSinpg.entities.Domicilio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}
