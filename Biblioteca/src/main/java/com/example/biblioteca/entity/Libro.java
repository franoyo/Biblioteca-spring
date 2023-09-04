/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author santiago
 */
@Entity
@Table (name = "libro")

public class Libro  implements Serializable{
    private static final long serialVersionUID = 1L;
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libroId;
    
    @Column (length = 100, nullable = false)
    private String isbn;
    
    @Column (length = 255, nullable = false)
    private String nombreLibro;
    
    @Column (length = 255, nullable = false)
    private double precioPublico;

    public Libro(Long libroId, String isbn, String nombreLibro, double precioPublico) {
        this.libroId = libroId;
        this.isbn = isbn;
        this.nombreLibro = nombreLibro;
        this.precioPublico = precioPublico;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }
    
    
}
