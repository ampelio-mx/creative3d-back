
package com.ampeliodev.creatorthreed.service.productos;

import com.ampeliodev.creatorthreed.domain.productos.ProductosEntidad;
import java.util.List;

public interface IProductosService {
    
    public List<ProductosEntidad> listarProductos();
    
    public ProductosEntidad guardarProductos(ProductosEntidad producto);
    
    public void eliminarProductos(ProductosEntidad producto);
    
    public ProductosEntidad encontrarProductos(ProductosEntidad producto);
    
}
