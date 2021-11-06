/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.controladores;

//import gt.edu.umg.proyecto.dto.Departamento;
//import gt.edu.umg.proyecto.dto.Profesion;
import gt.edu.umg.proyecto.dto.Usuario;
import gt.edu.umg.proyecto.negocio.Negocio;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
//import java.util.HashMap;
//import java.util.Map;
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
@Controller     //sirve para la interacción de las funciones que el usuario seleccione
public class ControladorUsuario {

    @Autowired
    private Negocio Negocio;

    

//el getMapping nos ayuda a simplificar los metodos de spring    
    @GetMapping("/agregarUsuario")
    public String agregarUsuario(Usuario usuario, Model model) {
        model.addAttribute("departamentos", Negocio.listarDepartamentos());
        model.addAttribute("profesiones", Negocio.listarProfesiones());
        return "modificar";
    }
@Autowired
    private Negocio negocio;

    @GetMapping("/listar")
    public String listarUsuarios(Model model) {
        var personas = negocio.listarUsuarios();
      // var personas = IpersonaDao.findAll();
        model.addAttribute("personas",personas);
        return "listarUsuarios";
    }

   

    
    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@Valid Usuario usuario, BindingResult resultado, Model model) {
        if (resultado.hasErrors()) {
            model.addAttribute("departamentos", Negocio.listarDepartamentos());
            model.addAttribute("profesiones", Negocio.listarProfesiones());
            return "modificar";
        }
        if (usuario.getID_USUARIO() <= 0) {
            java.util.Date tiempo = new java.util.Date();
            java.sql.Timestamp fechaRegistro = new java.sql.Timestamp(tiempo.getTime());
            usuario.setFECHA_REGISTRO(fechaRegistro);
        }
        Negocio.guardar(usuario);
        return "redirect:/listar";
    }
}
