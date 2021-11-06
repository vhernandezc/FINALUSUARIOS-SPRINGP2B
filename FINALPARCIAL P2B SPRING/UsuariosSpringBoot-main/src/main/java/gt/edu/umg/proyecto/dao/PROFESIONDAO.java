/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.dao;

import gt.edu.umg.proyecto.dto.Profesion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vh36
 */
public interface PROFESIONDAO extends CrudRepository<Profesion,Integer>{
    
}
