/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.repository;

import org.springframework.stereotype.Repository;
import com.example.biblioteca.entity.LibroAutoreado;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author santiago
 */
@Repository
public interface LibroAutoreadoRepository extends JpaRepository<LibroAutoreado, Long> {


}
