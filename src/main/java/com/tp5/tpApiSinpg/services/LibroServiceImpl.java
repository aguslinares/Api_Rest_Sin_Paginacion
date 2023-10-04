package com.tp5.tpApiSinpg.services;

import com.tp5.tpApiSinpg.entities.Libro;
import com.tp5.tpApiSinpg.entities.Persona;
import com.tp5.tpApiSinpg.repositories.BaseRepository;
import com.tp5.tpApiSinpg.repositories.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;


    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
