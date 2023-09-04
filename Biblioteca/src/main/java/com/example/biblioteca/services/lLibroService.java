/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.services;

import com.example.biblioteca.entity.Libro;

/**
 *
 * @author santiago
 */
public interface lLibroService {
    Libro guardar(Libro libro);

    Libro encontarPorId(Long id);

    void eliminarPorId(Long id);

}
