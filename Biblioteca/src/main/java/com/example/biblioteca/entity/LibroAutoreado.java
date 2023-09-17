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
import java.sql.Date;


/**
 *
 * @author santiago
 */
@Entity
@Table (name = "libro_autoreado")
public class LibroAutoreado  implements Serializable {
    private static final long serialVersionUID = 1L;
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorId;
    
   @Column (length = 255, nullable = false)

    private Long libroId;
   @Column (length = 255, nullable =false)
    private Date fecha;
    @Column (length = 255, nullable = false)
    private String observaciones;
public LibroAutoreado(){
}
    public LibroAutoreado(Long autorId, Long libroId, Date fecha, String observaciones) {
        this.autorId = autorId;
        this.libroId = libroId;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
