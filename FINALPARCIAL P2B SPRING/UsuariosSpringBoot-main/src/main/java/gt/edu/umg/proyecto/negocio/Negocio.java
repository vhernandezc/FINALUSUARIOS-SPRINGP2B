/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.negocio;

import gt.edu.umg.proyecto.dto.Departamento;
import gt.edu.umg.proyecto.dto.Profesion;
import gt.edu.umg.proyecto.dto.Usuario;
import gt.edu.umg.proyecto.servicios.DepartamentoService;
import gt.edu.umg.proyecto.servicios.ProfesionService;
import gt.edu.umg.proyecto.servicios.UsuarioService;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vh36*/
@Service
public class Negocio {

    @Autowired
    private UsuarioService UsuarioService;

    @Autowired
    private ProfesionService ProfesionService;

    @Autowired
    private DepartamentoService DepartamentoService;
    
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> datos = null;
        try {
            datos = UsuarioService.listar();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return datos;
    }

    public List<Profesion> listarProfesiones() {
        List<Profesion> datos = null;
        try {
            datos = ProfesionService.listar();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return datos;
    }

    public List<Departamento> listarDepartamentos() {
        List<Departamento> datos = null;
        try {
            datos = DepartamentoService.listar();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return datos;
    }

    public boolean guardar(Usuario usuario) {
        boolean resultado = false;
        try {
            UsuarioService.guardar(usuario);
            resultado = true;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return resultado;
    }

    

   
}
