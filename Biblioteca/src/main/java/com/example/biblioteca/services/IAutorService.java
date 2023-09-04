/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.services;

import com.example.biblioteca.entity.Autor;

import org.springframework.stereotype.Service;

/**
 *
 * @author santiago
 */
@Service
public interface IAutorService {
    
    Autor guardar(Autor autor);

    Autor encontarPorId(Long id);

    void eliminarPorId(Long id);

}
