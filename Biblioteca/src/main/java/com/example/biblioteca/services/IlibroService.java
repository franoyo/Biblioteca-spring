package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.entity.Libro;

public interface IlibroService {
    public List<Libro> getTodosUsuarios();

     public Libro crearLibro(Libro libro);

     public Libro actualizarLibro(Libro libro);

     public void borrarLibro(Long idUser);

     public  Libro  buscarById(Long idUser);


}
