package com.tp5.tpApiSinpg.services;

import com.tp5.tpApiSinpg.entities.Persona;
import com.tp5.tpApiSinpg.repositories.BaseRepository;
import com.tp5.tpApiSinpg.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }


}
