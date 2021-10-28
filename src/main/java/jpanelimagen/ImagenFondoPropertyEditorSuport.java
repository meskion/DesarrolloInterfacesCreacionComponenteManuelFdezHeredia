/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Usuario
 */
public class ImagenFondoPropertyEditorSuport extends PropertyEditorSupport {

    private ImagenFondoPanel panel = new ImagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return panel;
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = panel.getSelectedValue();

        String ruta = imagenFondo.getRutaImagen().getAbsolutePath();
        ruta = ruta.replace('\\', '/');
        return "new jpanelimagen.ImagenFondo(" + "new java.io.File(\"" + ruta + "\")," + imagenFondo.getOpacidad() + "f)";
        /*El setter que nos da error debe recibir un tipo de dato ImagenFondo*/
        /*Toda clase que utilice en este string debe llevar la clase y el paquete de donde viene ya que aquí no podemos generar import*/
    }

    @Override
    public Object getValue() {
        return panel.getSelectedValue();
    }

}
