package com.tp5.tpApiSinpg.services;

import com.tp5.tpApiSinpg.entities.Autor;
import com.tp5.tpApiSinpg.repositories.AutorRepository;
import com.tp5.tpApiSinpg.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }



}
