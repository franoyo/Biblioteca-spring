/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.repository;

import com.example.biblioteca.entity.LibroAutoreado;
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
public class LibroAutoreadoRepository {

    @PersistenceContext
    private EntityManager entityM;

    public List<LibroAutoreado> findAll() {
        TypedQuery<LibroAutoreado> buscar = entityM.createQuery("select l from libro_autoreado l", LibroAutoreado.class);
        return buscar.getResultList();
    }

    @Transactional
    public void guardar(LibroAutoreado libroAutoreado) {
        entityM.persist(libroAutoreado);
    }

    @Transactional
    public LibroAutoreado actualizar(LibroAutoreado libroAutoreado) {
        entityM.merge(libroAutoreado);
        return libroAutoreado;
    }

    @Transactional
    public LibroAutoreado encontarPorId(long id) {
        LibroAutoreado libroAutoreadoActual = entityM.find(LibroAutoreado.class, id);
        return libroAutoreadoActual;
    }

    @Transactional
    public void eliminarPorId(long id) {
        LibroAutoreado eliminarlibroAutoreado = encontarPorId(id);
        if (eliminarlibroAutoreado != null) {
            entityM.remove(eliminarlibroAutoreado);
        }
    }
}
