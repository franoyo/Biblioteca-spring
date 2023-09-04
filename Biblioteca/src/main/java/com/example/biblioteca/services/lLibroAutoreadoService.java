/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.services;

import com.example.biblioteca.entity.LibroAutoreado;

/**
 *
 * @author santiago
 */
public interface lLibroAutoreadoService {
    LibroAutoreado guardar(LibroAutoreado libroAutoreado);

    LibroAutoreado encontarPorId(Long id);

    void eliminarPorId(Long id);
}
