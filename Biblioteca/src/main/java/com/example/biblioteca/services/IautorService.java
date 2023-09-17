package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.entity.Autor;

public interface IautorService {
    public List<Autor> getTodosAutors();

    public Autor crearAutor(Autor autor);

    public Autor actualizarAutor(Autor autor);

    public void borrarAutor(Long idAutor);

    public Autor buscarById(Long idAutor);
}
