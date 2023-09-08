/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.services.impl;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.services.lLibroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santiago
 */
@Service
public class LibroService implements lLibroService{
    
    @Autowired
    private     LibroRepository libroRepositorio;

    public void guardarLibro(Libro libro) {
        // Lógica para guardar el autor en la base de datos utilizando el autorRepositorio
        libroRepositorio.guardar(libro);
    }

    public Libro buscarLibroPorId(Long id) {
        // Lógica para buscar un autor por su ID utilizando el autorRepositorio
        return libroRepositorio.encontarPorId(id);
    }

    public void eliminarLibro(Long id) {
        // Lógica para eliminar un autor por su ID utilizando el autorRepositorio
        libroRepositorio.eliminarPorId(id);
    }
    public List<Libro> findAll() {
        return libroRepositorio.findAll();
    }
    @Override
    public Libro guardar(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Libro encontarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
