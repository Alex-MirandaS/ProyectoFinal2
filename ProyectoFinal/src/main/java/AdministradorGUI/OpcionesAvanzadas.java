package AdministradorGUI;

import Controladores.ControladorAdministrador;
import javax.swing.JLabel;

/**
 *
 * @author Alexs
 */
public class OpcionesAvanzadas extends javax.swing.JFrame {

    private ControladorAdministrador control;

    public OpcionesAvanzadas(ControladorAdministrador control, String text) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.control = control;
        this.texto.setText(text);
    }

    public JLabel getTexto() {
        return texto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText(" ");
        getContentPane().add(texto, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText(" ");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText(" ");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel2.add(crear);
        jPanel2.add(jLabel3);

        cargar.setText("Cargar Archivo");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel2.add(cargar);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        control.crearObjeto(texto.getText());
    }//GEN-LAST:event_crearActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        control.cargarObjeto(texto.getText());
    }//GEN-LAST:event_cargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
