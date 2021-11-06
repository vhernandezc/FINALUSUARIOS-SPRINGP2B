/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.controladores;

import gt.edu.umg.proyecto.negocio.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author vh36
 */
@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }
 
   /* @GetMapping("/usuario")
    public String usuario() {
        return "usuario";
    }

    @GetMapping("/profesion")
    public String profesion() {
        return "profesion";
    }*/
}
