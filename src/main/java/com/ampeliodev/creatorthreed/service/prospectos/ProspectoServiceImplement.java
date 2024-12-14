
package com.ampeliodev.creatorthreed.service.prospectos;

import com.ampeliodev.creatorthreed.dao.prospectos.IProspectoDao;
import com.ampeliodev.creatorthreed.domain.prospectos.ProspectosEntidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProspectoServiceImplement implements IProspectosService {
    
    @Autowired
    private IProspectoDao prospectodao;
    
    @Override
    @Transactional (readOnly = true)
    public List<ProspectosEntidad> listarProspectos(){
        return (List<ProspectosEntidad>) prospectodao.findAll();
    }
    
    @Override
    @Transactional
    public void guardarProspectos(ProspectosEntidad prospecto){
        prospectodao.save(prospecto);
    }
    
    @Override
    @Transactional
    public void eliminarProspecto(ProspectosEntidad prospecto){
        prospectodao.delete(prospecto);
    }
    
    @Override
    @Transactional (readOnly = true)
    public ProspectosEntidad encontrarProspecto(ProspectosEntidad prospecto){
        return prospectodao.findById(prospecto.getIdProspecto()).orElse(null);
    }
    
    
    
}
