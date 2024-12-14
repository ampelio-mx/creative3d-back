
package com.ampeliodev.creatorthreed.service.productos;

import com.ampeliodev.creatorthreed.dao.productos.IProductosDAO;
import com.ampeliodev.creatorthreed.domain.productos.ProductosEntidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImplement implements IProductosService {
    
    @Autowired
    private IProductosDAO entidadProductos;

    
    @Override
    @Transactional (readOnly = true)
    public List<ProductosEntidad> listarProductos(){
        return (List<ProductosEntidad>) entidadProductos.findAll();
    }
    
    @Override
    @Transactional
    public ProductosEntidad guardarProductos(ProductosEntidad producto){
        return entidadProductos.save(producto);
    }
    
    @Override
    @Transactional
    public void eliminarProductos(ProductosEntidad producto){
        entidadProductos.delete(producto);
    }
    
    @Override
    @Transactional (readOnly = true)
    public ProductosEntidad encontrarProductos(ProductosEntidad producto){
        return entidadProductos.findById(producto.getIdProducto()).orElse(null);
    }
    
    
}
