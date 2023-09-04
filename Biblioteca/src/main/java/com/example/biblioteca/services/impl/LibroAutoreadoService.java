/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.services.impl;

import com.example.biblioteca.entity.LibroAutoreado;
import com.example.biblioteca.repository.LibroAutoreadoRepository;
import com.example.biblioteca.services.lLibroAutoreadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santiago
 */
@Service
public class LibroAutoreadoService implements lLibroAutoreadoService {
    
    
    @Autowired
    private  LibroAutoreadoRepository libroAutoreadoRepositorio;

    public void guardarLibroAutoreadoRepository(LibroAutoreado libroAutoreadoRepository) {
        // Lógica para guardar el autor en la base de datos utilizando el autorRepositorio
        libroAutoreadoRepositorio.guardar(libroAutoreadoRepository);
    }

    public LibroAutoreado buscarLibroAutoreadoPorId(Long id) {
        // Lógica para buscar un autor por su ID utilizando el autorRepositorio
        return libroAutoreadoRepositorio.encontarPorId(id);
    }

    public void eliminarLibroAutoreado(Long id) {
        // Lógica para eliminar un autor por su ID utilizando el autorRepositorio
        libroAutoreadoRepositorio.eliminarPorId(id);
    }

    @Override
    public LibroAutoreado guardar(LibroAutoreado libroAutoreado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LibroAutoreado encontarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
