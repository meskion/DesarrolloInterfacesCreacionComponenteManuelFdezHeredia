/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ImagenFondo implements Serializable {
    private File rutaImagen;
    private float opacidad;

    public ImagenFondo(File rutaImagen, float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public float getOpacidad() {
        return opacidad;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public void setOpacidad(float opacidad) {
        this.opacidad = opacidad;
    }
 

    
}


