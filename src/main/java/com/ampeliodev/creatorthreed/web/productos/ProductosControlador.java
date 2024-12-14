
package com.ampeliodev.creatorthreed.web.productos;

import com.ampeliodev.creatorthreed.domain.productos.ProductosEntidad;
import com.ampeliodev.creatorthreed.dto.productos.ProductosDTO;
import com.ampeliodev.creatorthreed.service.productos.IProductosService;
import com.ampeliodev.creatorthreed.service.productos.ImagenService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductosControlador {
    
    @Autowired
    private IProductosService entidadProductosService;
    
    @Autowired
    private ImagenService imagenServicio; 
    
    @GetMapping("/listarProductos")
    public List<ProductosEntidad> listarProspectos(ProductosEntidad producto){
        return entidadProductosService.listarProductos();
    }
    
    @PostMapping("/guardarProductos")
    public ResponseEntity<?> guardarProductos(@ModelAttribute ProductosDTO productoDTO){
        try{
            ProductosEntidad productoEntidad = new ProductosEntidad();             
            productoEntidad.setCategoriaProducto(productoDTO.getCategoriaProducto());
            productoEntidad.setNombreProducto(productoDTO.getNombreProducto());
            productoEntidad.setTamanoProducto(productoDTO.getTamanoProducto());
            productoEntidad.setPrecioProducto(productoDTO.getPrecioProducto());
            productoEntidad.setColorProducto(productoDTO.getColorProducto());
            productoEntidad.setCantidadproducto(productoDTO.getCantidadproducto());     
            
            String imagenURL = imagenServicio.guardarImagen(
            productoDTO.getImagenProducto()
            );
            
            productoEntidad.setImagenProducto(imagenURL);
            
             ProductosEntidad productoEntidadAlmacenado = entidadProductosService.guardarProductos(productoEntidad);
            return ResponseEntity.ok(productoEntidadAlmacenado);
            
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al capturar los datos del producto" + e.getMessage());
        }
    }
    
    
}
