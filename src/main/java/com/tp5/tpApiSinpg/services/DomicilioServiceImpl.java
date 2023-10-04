package com.tp5.tpApiSinpg.services;


import com.tp5.tpApiSinpg.entities.Domicilio;
import com.tp5.tpApiSinpg.entities.Persona;
import com.tp5.tpApiSinpg.repositories.BaseRepository;
import com.tp5.tpApiSinpg.repositories.DomicilioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {


    @Autowired
    private DomicilioRepository domicilioRepository;


    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
