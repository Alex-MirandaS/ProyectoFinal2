/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdministradorGUI;

import Interfaces.ColocarImagen;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alexs
 */
public class Asiento extends javax.swing.JPanel implements ColocarImagen{

    /** Creates new form Asiento */
    public Asiento() {
        initComponents();
        this.setBorder(new LineBorder(Color.BLUE, 2, true));
        //colocarImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        imagenAsiento = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout());
        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout());
        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.GridLayout());
        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setLayout(new java.awt.GridLayout());
        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        imagenAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenAsientoMouseClicked(evt);
            }
        });
        add(imagenAsiento, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void imagenAsientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenAsientoMouseClicked
        
    }//GEN-LAST:event_imagenAsientoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenAsiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


    @Override
    public void colocarImagen() {

        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("asiento.jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        this.imagenAsiento.setIcon(imageIcon);
    
    }

}
