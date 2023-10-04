package com.tp5.tpApiSinpg.services;

import com.tp5.tpApiSinpg.entities.Localidad;
import com.tp5.tpApiSinpg.repositories.BaseRepository;
import com.tp5.tpApiSinpg.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;


    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}

