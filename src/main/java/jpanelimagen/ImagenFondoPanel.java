/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JSlider;

/**
 *
 * @author Usuario
 */
public class ImagenFondoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagenFondoPanel
     */
    public ImagenFondoPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        labelRuta = new javax.swing.JLabel();
        textoRuta = new javax.swing.JTextField();
        botonRuta = new javax.swing.JButton();
        labelOpacidad = new javax.swing.JLabel();
        sliderOpacidad = new javax.swing.JSlider();
        labelMinOpacidad = new javax.swing.JLabel();
        labelMaxOpacidad = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        labelRuta.setText("Ruta imagen:");

        textoRuta.setEditable(false);

        botonRuta.setText("...");
        botonRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRutaActionPerformed(evt);
            }
        });

        labelOpacidad.setText("Opacidad:");

        sliderOpacidad.setMinorTickSpacing(25);
        sliderOpacidad.setPaintLabels(true);
        sliderOpacidad.setPaintTicks(true);
        sliderOpacidad.setToolTipText("");
        sliderOpacidad.setValue(100);

        labelMinOpacidad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelMinOpacidad.setText("0");

        labelMaxOpacidad.setText("100");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitulo.setText("Propiedades de imagen de fondo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOpacidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMinOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMaxOpacidad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelRuta)
                                .addGap(13, 13, 13)
                                .addComponent(textoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRuta)
                    .addComponent(textoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOpacidad)
                        .addComponent(labelMinOpacidad))
                    .addComponent(sliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaxOpacidad))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRutaActionPerformed

        JFileChooser fileChooser = new  JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            textoRuta.setText(file.getAbsolutePath());
            
        }
    }//GEN-LAST:event_botonRutaActionPerformed

    public ImagenFondo getSelectedValue(){
        File f =  new File(textoRuta.getText());
        float op = sliderOpacidad.getValue()/100f;
        return new ImagenFondo(f, op);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRuta;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel labelMaxOpacidad;
    private javax.swing.JLabel labelMinOpacidad;
    private javax.swing.JLabel labelOpacidad;
    private javax.swing.JLabel labelRuta;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSlider sliderOpacidad;
    private javax.swing.JTextField textoRuta;
    // End of variables declaration//GEN-END:variables
}
