package com.example.biblioteca.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.services.IautorService;

@Service
public class AutorServiceImpl implements IautorService {
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> getTodosAutors() {

        List<Autor> lista = autorRepository.findAll();
        return lista;
    }

    @Override
    public Autor crearAutor(Autor autor) {

        Autor nuevoAutor = autorRepository.save(autor);
        return nuevoAutor;
    }

    @Override
    public Autor actualizarAutor(Autor autor) {

        Autor autorExistente = autorRepository.findById(autor.getAutorId()).get();
        autorExistente.setNombre(autor.getNombre());
        autorExistente.setCiudad(autor.getCiudad());

        Autor autorUpdated = autorRepository.save(autorExistente);
        return autorUpdated;
    }

    @Override
    public void borrarAutor(Long idAutor) {
        Autor autorAborrar = autorRepository.findById(idAutor).get();
        if (autorAborrar != null) {
            autorRepository.deleteById(idAutor);
        }

    }

    @Override
    public Autor buscarById(Long idAutor) {
        Autor autorExistente = autorRepository.findById(idAutor).get();
        return autorExistente;
    }

}
