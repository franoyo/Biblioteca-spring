/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.biblioteca.services.impl.LibroService;

/**
 *
 * @author santiago
 */
@Controller
@RequestMapping
public class LibroController {
    
    @GetMapping ("/index")
    public String vistaIndex(Model model) {
        return "Index";  }
    
          @Autowired
    private LibroService libroService;
@GetMapping("/crudLibros")
public  String vistaCrudLibros(Model model){
    model.addAttribute("Libro", libroService.findAll());
return "crudLibros";

}

   
    
}
