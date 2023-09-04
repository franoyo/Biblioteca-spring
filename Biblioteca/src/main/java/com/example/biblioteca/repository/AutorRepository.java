/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Autor;
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
public class AutorRepository {
       @PersistenceContext
    private EntityManager entityM;

    public List<Autor> findAll() {
        TypedQuery<Autor> buscar = entityM.createQuery("select l from autor l", Autor.class);
        return buscar.getResultList();
    }

    @Transactional
    public void guardar(Autor autor) {
        entityM.persist(autor);
    }

    @Transactional
    public Autor actualizar(Autor autor) {
        entityM.merge(autor);
        return autor;
    }

    @Transactional
    public Autor encontarPorId(long id) {
        Autor autorActual= entityM.find(Autor.class, id);
        return autorActual;
    }

    @Transactional
    public void eliminarPorId(long id) {
        Autor eliminarAutor = encontarPorId(id);
        if (eliminarAutor != null) {
            entityM.remove(eliminarAutor);
        }
    }
}
