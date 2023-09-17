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

import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.services.IautorService;

/**
 *
 * @author santiago
 */
@Controller
@RequestMapping
public class AutorController {
    @Autowired
    private IautorService interfazServicioA;

    
    @GetMapping("/crudAutores")
    public String vistaCrudAutor(Model model) {
        List<Autor> listaAutor = interfazServicioA.getTodosAutors();
        model.addAttribute("listi", listaAutor);
        return "crudAutores";
    }

    @GetMapping("/addAutor")
    public String vistaAdd(Model model) {
        return "formAddAutor";
       
    }

    @PostMapping("/guardarAutor")
    public String saveAutor(@ModelAttribute Autor autor, BindingResult resultado) {

        interfazServicioA.crearAutor(autor);
        System.out.println("Autor guardado con exito");
        return "redirect:/crudAutores";
    }

    @PostMapping("/eliminarAutor")
    public String borrarAutor(@RequestParam("autorId") Long autorId) {
        interfazServicioA.borrarAutor(autorId);
        System.out.println("Autor eliminado con exito");
        return "redirect:/crudAutores";
    }

    @PostMapping("/actualizarAutor")
    public String actualizarAutor(@ModelAttribute Autor autor, BindingResult resultado) {
        interfazServicioA.actualizarAutor(autor);
        return "redirect:/crudAutores";
    }
}
