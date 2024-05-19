package com.tarea.libro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.libro.models.Libro;
import com.tarea.libro.services.LibroService;

@RestController
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/Bienvenido")
    public String Hola(){
        return "Tarea pt1";
    }

    @PostMapping("/libros")
    public Libro nuevoLibro(@RequestBody Libro libro){
        libroService.nuevoLibro(libro);
        return libro;
    }

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id){
        Libro libro = libroService.getLibro(id);
        return libro;
    }

    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }
    
}

