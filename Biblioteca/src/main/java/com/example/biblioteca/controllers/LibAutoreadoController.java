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

import com.example.biblioteca.entity.LibroAutoreado;
import com.example.biblioteca.services.IlibroAutoreadoService;

@Controller
@RequestMapping
public class LibAutoreadoController {
    @Autowired
    private IlibroAutoreadoService libroAutoreado;
    @GetMapping("/crudLibrosAutoreados")
public  String vistaCrudLibrosAutoreados(Model model){
    List<LibroAutoreado> listaLibros=libroAutoreado.getTodosUsuarios();
    model.addAttribute("lista", listaLibros);

return "crudLibroAutoreado";

}
@PostMapping("/guardarLibroAutoreado")
    public String saveLibro(@ModelAttribute LibroAutoreado libro, BindingResult resultado) {
        
         libroAutoreado.crearLibro(libro);
         System.out.println("Libro guardado con exito");
         return "redirect:/crudLibrosAutoreados";
    }
    @PostMapping("/eliminarLibroAutoreado")
    public String borrarLibro(@RequestParam("autorId") Long autorId) {
         libroAutoreado.borrarLibro(autorId);
         System.out.println("libro eliminado con exito");
         return "redirect:/crudLibrosAutoreados";
    }
}
