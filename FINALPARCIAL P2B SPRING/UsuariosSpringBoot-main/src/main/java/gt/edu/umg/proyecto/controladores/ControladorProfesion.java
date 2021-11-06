/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.controladores;

import gt.edu.umg.proyecto.dto.Profesion;
import gt.edu.umg.proyecto.negocio.Negocio;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author vh36
 */
@Controller
public class ControladorProfesion {
    
    @Autowired
    private Negocio Negocio;

    @GetMapping("/agregarProfesion")
    public String agregarProfesion(Profesion profesion) {
        return "datosProfesion";
    }

    @GetMapping("/listarProfesiones")
    public String listarProfesiones(Model model) {
        model.addAttribute("profesiones", Negocio.listarProfesiones());
        return "listarProfesiones";
    }

   
    
    
}
