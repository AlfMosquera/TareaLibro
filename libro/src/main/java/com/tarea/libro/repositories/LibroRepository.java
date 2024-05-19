package com.tarea.libro.repositories;

import java.util.List;

import com.tarea.libro.models.Libro;

public interface LibroRepository {
    Libro getLibro(int id);
    List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);
    
} 
