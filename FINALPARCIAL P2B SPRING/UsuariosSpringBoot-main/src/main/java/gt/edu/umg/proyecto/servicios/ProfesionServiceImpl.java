/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.proyecto.servicios;

import gt.edu.umg.proyecto.dto.Profesion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import gt.edu.umg.proyecto.dao.PROFESIONDAO;

/**
 *
 * @author vh36
 */
@Service
public class ProfesionServiceImpl implements ProfesionService {

    @Autowired
    private PROFESIONDAO InterProfesionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Profesion> listar() {
        return (List<Profesion>) InterProfesionDao.findAll();
    }

}
