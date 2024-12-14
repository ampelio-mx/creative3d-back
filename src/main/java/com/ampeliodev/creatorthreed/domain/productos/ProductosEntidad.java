
package com.ampeliodev.creatorthreed.domain.productos;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="productos")
public class ProductosEntidad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private int idProducto; 
    @Column(name="categoria_producto")
    private String categoriaProducto;
    @Column(name="nombre_producto")
    private String nombreProducto;
    @Column(name="tamano_producto")
    private String tamanoProducto;
    @Column(name="precio_producto")
    private int precioProducto;
    @Column(name="color_producto")
    private String colorProducto;
    @Column(name="cantidad_producto")
    private int cantidadproducto;
    @Column(name="imagen_producto")
    private String imagenProducto;
    
}
