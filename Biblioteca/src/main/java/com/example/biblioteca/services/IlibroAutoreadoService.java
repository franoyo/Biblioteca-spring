package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.entity.LibroAutoreado;

public interface IlibroAutoreadoService {
       public List<LibroAutoreado> getTodosUsuarios();

     public LibroAutoreado crearLibro(LibroAutoreado libro);

     public LibroAutoreado actualizarLibro(LibroAutoreado libro);

     public void borrarLibro(Long idUser);

     public  LibroAutoreado  buscarById(Long idUser);
 
}
