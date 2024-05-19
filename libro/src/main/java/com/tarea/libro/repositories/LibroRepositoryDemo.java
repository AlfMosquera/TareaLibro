package com.tarea.libro.repositories;

import java.util.ArrayList;
import java.util.List;

import com.tarea.libro.models.Libro;

public class LibroRepositoryDemo implements LibroRepository {

    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryDemo(){
        libros.add(new Libro(11, "Confesiones", "Angeles","Namco",2020));
        libros.add(new Libro(12, "Envidia", "Rodas","Latjap",2021));
        libros.add(new Libro(13, "Avaricia", "Cailo","Namco",2020));
    }

    public Libro getLibro(int id){
        System.out.println("Conectado a base de datos ORACLE");
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros(){
        System.out.println("Conectado a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevoLibro'");
    }
}
