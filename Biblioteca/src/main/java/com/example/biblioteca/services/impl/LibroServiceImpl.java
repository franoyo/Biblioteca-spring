package com.example.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.services.IlibroService;

@Service
public class LibroServiceImpl implements IlibroService {
    
    
    @Autowired
    private LibroRepository  libroRepository;
    @Override
    public List<Libro> getTodosUsuarios() {

       List<Libro> lista = libroRepository.findAll();
       return lista;
    }
@Override
    public Libro crearLibro(Libro libro) {

         Libro nuevoLibro = libroRepository.save(libro);
         return nuevoLibro;
    }
   @Override
    public Libro actualizarLibro(Libro libro) {
          
        Libro libroExistente = libroRepository.findById(libro.getLibroId()).get();
        libroExistente.setNombreLibro(libro.getNombreLibro());
        libroExistente.setPrecioPublico(libro.getPrecioPublico());
        libroExistente.setIsbn(libro.getIsbn());

        Libro libroUpdated = libroRepository.save(libroExistente);
        return libroUpdated;
    }
    @Override
    public void borrarLibro(Long idUser) {
        Libro libroAborrar = libroRepository.findById(idUser).get();
        if (libroAborrar != null) {
            libroRepository.deleteById(idUser);
        }
        
    }
    @Override
    public Libro buscarById(Long idUser){
        Libro libroExistente = libroRepository.findById(idUser).get();
        return libroExistente;
    }
}
