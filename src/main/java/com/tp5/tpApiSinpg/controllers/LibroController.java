package com.tp5.tpApiSinpg.controllers;

import com.tp5.tpApiSinpg.entities.Libro;
import com.tp5.tpApiSinpg.services.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro,LibroServiceImpl> {



}


