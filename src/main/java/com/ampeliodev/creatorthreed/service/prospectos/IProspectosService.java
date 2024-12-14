
package com.ampeliodev.creatorthreed.service.prospectos;
import com.ampeliodev.creatorthreed.domain.prospectos.ProspectosEntidad;
import java.util.List;

public interface IProspectosService {
    
    public List<ProspectosEntidad> listarProspectos();
    
    public void guardarProspectos(ProspectosEntidad prospecto);
    
    public void eliminarProspecto(ProspectosEntidad prospecto);
    
    public ProspectosEntidad encontrarProspecto(ProspectosEntidad prospecto); 
    
}
