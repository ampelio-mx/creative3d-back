
package com.ampeliodev.creatorthreed.web.prospectos;

import com.ampeliodev.creatorthreed.domain.prospectos.ProspectosEntidad;
import com.ampeliodev.creatorthreed.service.prospectos.IProspectosService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ProspectosControlador {
    
    @Autowired
    private IProspectosService prospectoServiceObject; 
    
    @PostMapping("/controladorProspectos")
    public void guardarProspecto(@RequestBody ProspectosEntidad prospecto){
        prospectoServiceObject.guardarProspectos(prospecto);
    };
    
    
    @PostMapping("/listarProspectos")
    public List<ProspectosEntidad> listarProspectos(ProspectosEntidad prospecto){
        return prospectoServiceObject.listarProspectos();
    }
    
}
