/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.services.impl;

import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.services.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santiago
 */
@Service
public class AutorService implements IAutorService {

    @Autowired
    private AutorRepository autorRepositorio;

    public void guardarAutor(Autor autor) {
        // Lógica para guardar el autor en la base de datos utilizando el autorRepositorio
        autorRepositorio.guardar(autor);
    }

    public Autor buscarAutorPorId(Long id) {
        // Lógica para buscar un autor por su ID utilizando el autorRepositorio
        return autorRepositorio.encontarPorId(id);
    }

    public void eliminarAutor(Long id) {
        // Lógica para eliminar un autor por su ID utilizando el autorRepositorio
        autorRepositorio.eliminarPorId(id);
    }

    @Override
    public Autor guardar(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor encontarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}   

    