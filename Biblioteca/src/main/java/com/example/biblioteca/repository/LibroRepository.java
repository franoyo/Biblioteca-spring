/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author santiago
 */
@Repository
public class LibroRepository {
    @PersistenceContext
    private EntityManager entityM;

    public List<Libro> findAll() {
        TypedQuery<Libro> buscar = entityM.createQuery("select l from libro l", Libro.class);
        return buscar.getResultList();
    }

    @Transactional
    public void guardar(Libro libro) {
        entityM.persist(libro);
    }

    @Transactional
    public Libro actualizar(Libro libro) {
        entityM.merge(libro);
        return libro;
    }

    @Transactional
    public Libro encontarPorId(long id) {
        Libro libroActual= entityM.find(Libro.class, id);
        return libroActual;
    }

    @Transactional
    public void eliminarPorId(long id) {
        Libro eliminarLibro = encontarPorId(id);
        if (eliminarLibro != null) {
            entityM.remove(eliminarLibro);
        }
    }
}
