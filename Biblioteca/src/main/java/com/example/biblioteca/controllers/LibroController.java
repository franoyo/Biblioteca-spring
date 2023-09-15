/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.services.IlibroService;



/**
 *
 * @author santiago
 */
@Controller
@RequestMapping
public class LibroController {
    @Autowired
    private IlibroService interfazServicio;

    @GetMapping ("/index")
    public String vistaIndex(Model model) {
        return "Index";  }
@GetMapping("/crudLibros")
public  String vistaCrudLibros(Model model){
    List<Libro> listaLibros=interfazServicio.getTodosUsuarios();
    model.addAttribute("listica", listaLibros);

return "crudLibros";

}
@GetMapping("/addLibro")
public  String vistaAdd(Model model){
return "formAddLibro";

}

@PostMapping("/guardar")
    public String saveLibro(@ModelAttribute Libro libro, BindingResult resultado) {
        
         interfazServicio.crearLibro(libro);
         System.out.println("Libro guardado con exito");
         return "redirect:/crudLibros";
    }
    @PostMapping("/eliminarLibro")
    public String borrarLibro(@RequestParam("libroId") Long libroId) {
         interfazServicio.borrarLibro(libroId);
         System.out.println("Usuario eliminado con exito");
         return "redirect:/crudLibros";
    }
    
 
    

  
}
