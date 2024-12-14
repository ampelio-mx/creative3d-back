
package com.ampeliodev.creatorthreed.dao.productos;

import com.ampeliodev.creatorthreed.domain.productos.ProductosEntidad;
import org.springframework.data.repository.CrudRepository;


public interface IProductosDAO extends CrudRepository<ProductosEntidad, Integer>{
    
}
