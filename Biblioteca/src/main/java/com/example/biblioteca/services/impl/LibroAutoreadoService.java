package com.example.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.entity.LibroAutoreado;
import com.example.biblioteca.repository.LibroAutoreadoRepository;
import com.example.biblioteca.services.IlibroAutoreadoService;

@Service
public class LibroAutoreadoService implements IlibroAutoreadoService{
     @Autowired
    private LibroAutoreadoRepository  libroAutoreadoRepository;

     @Override
    public List<LibroAutoreado> getTodosUsuarios() {

       List<LibroAutoreado> lista = libroAutoreadoRepository.findAll();
       return lista;
    }
   @Override
    public LibroAutoreado crearLibro(LibroAutoreado libroAutoreado) {

         LibroAutoreado nuevoLibro = libroAutoreadoRepository.save(libroAutoreado);
         return nuevoLibro;
    }
    @Override
    public LibroAutoreado actualizarLibro(LibroAutoreado libroAutoreado) {
          
        LibroAutoreado libroExistente = libroAutoreadoRepository.findById(libroAutoreado.getLibroId()).get();
        libroExistente.setLibroId(libroAutoreado.getLibroId());
        libroExistente.setAutorId(libroAutoreado.getAutorId());
        libroExistente.setFecha(libroAutoreado.getFecha());
        libroExistente.setObservaciones(libroAutoreado.getObservaciones());

        LibroAutoreado libroUpdated = libroAutoreadoRepository.save(libroExistente);
        return libroUpdated;
    }
    @Override
    public void borrarLibro(Long idUser) {
        LibroAutoreado libroAborrar = libroAutoreadoRepository.findById(idUser).get();
        if (libroAborrar != null) {
            libroAutoreadoRepository.deleteById(idUser);
        }   
    }
    @Override
    public LibroAutoreado buscarById(Long idUser){
        LibroAutoreado libroExistente = libroAutoreadoRepository.findById(idUser).get();
        return libroExistente;
    }

}
