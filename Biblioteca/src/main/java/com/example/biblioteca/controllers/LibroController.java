/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
@GetMapping("/crudLibros")
public  String vistaCrudLibros(Model model){
return "crudLibros";

}
@GetMapping("/addLibro")
public  String vistaAdd(Model model){
return "formAddLibro";



}




   
    
}
