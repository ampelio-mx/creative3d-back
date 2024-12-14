
package com.ampeliodev.creatorthreed.web.productos;

import com.ampeliodev.creatorthreed.service.productos.ImagenService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/imagenes")
public class ImagenProductosControlador {
    
    @Autowired
    private ImagenService imagenService;
    
    @PostMapping("/guardarImagen")
    public ResponseEntity<String> guardarImagen(@RequestParam("archivoImagen") MultipartFile archivoImagen){
        try{
            String nombreArchivo = imagenService.guardarImagen(archivoImagen);
            return ResponseEntity.ok(nombreArchivo);
        }catch (IOException e){
            return ResponseEntity.status(500).body("Error al cargar la immagen:" + e.getMessage());
        }
    }
    
}
