package com.ampeliodev.creatorthreed.dto.productos;

import org.springframework.web.multipart.MultipartFile;

public class ProductosDTO {

    private String categoriaProducto;
    private String nombreProducto;
    private String tamanoProducto;
    private int precioProducto;
    private String colorProducto;
    private int cantidadproducto;
    private MultipartFile imagenProducto;

    public ProductosDTO() {
    }

    public ProductosDTO(String categoriaProducto, String nombreProducto, String tamanoProducto, int precioProducto, String colorProducto, int cantidadproducto, MultipartFile imagenProducto) {
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.tamanoProducto = tamanoProducto;
        this.precioProducto = precioProducto;
        this.colorProducto = colorProducto;
        this.cantidadproducto = cantidadproducto;
        this.imagenProducto = imagenProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTamanoProducto() {
        return tamanoProducto;
    }

    public void setTamanoProducto(String tamanoProducto) {
        this.tamanoProducto = tamanoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public MultipartFile getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(MultipartFile imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    @Override
    public String toString() {
        return "ProductosDTO{" + "categoriaProducto=" + categoriaProducto + ", nombreProducto=" + nombreProducto + ", tamanoProducto=" + tamanoProducto + ", precioProducto=" + precioProducto + ", colorProducto=" + colorProducto + ", cantidadproducto=" + cantidadproducto + ", imagenProducto=" + imagenProducto + '}';
    }

    
    
}
