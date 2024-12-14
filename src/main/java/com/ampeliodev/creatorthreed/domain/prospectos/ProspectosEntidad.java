package com.ampeliodev.creatorthreed.domain.prospectos;


import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="prospectos") 
public class ProspectosEntidad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_prospecto")
    private int idProspecto;
    @Column(name="nombre_prospecto")
    private String nombreProspecto;
    @Column(name="telefono_prospecto")
    private String telefonoProspecto;
    @Column(name="email_prospecto")
    private String emailProspecto;
    @Column(name="mensaje_prospecto")
    private String mensajeProspecto;
    
}

