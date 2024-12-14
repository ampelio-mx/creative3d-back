
package com.ampeliodev.creatorthreed.service.productos;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenService {
    
    private final String directorioImagenes = "directorioImagen";
    
    public ImagenService() throws IOException{
         Path path = Paths.get(directorioImagenes);
         
         if(!Files.exists(path)){
             Files.createDirectories(path);
         }
    }
    
    public String guardarImagen(MultipartFile archivoImagen) throws IOException{
        String nombreImagen = System.currentTimeMillis() + "_" + archivoImagen.getOriginalFilename();
        Path rutaArchivo = Paths.get(directorioImagenes, nombreImagen);
        
        Files.write(rutaArchivo, archivoImagen.getBytes());
        
        return nombreImagen;
    }
}
