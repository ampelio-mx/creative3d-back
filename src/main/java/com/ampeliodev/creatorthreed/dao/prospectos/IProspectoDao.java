
package com.ampeliodev.creatorthreed.dao.prospectos;

import com.ampeliodev.creatorthreed.domain.prospectos.ProspectosEntidad;
import org.springframework.data.repository.CrudRepository;

public interface IProspectoDao extends CrudRepository<ProspectosEntidad, Integer> {
    
}
