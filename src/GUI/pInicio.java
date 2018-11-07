/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.main.ContenedorMain;
import java.awt.GridLayout;

/**
 *
 * @author angel
 */
public class pInicio extends javax.swing.JPanel {

    /**
     * Creates new form pInicio
     */
    public pInicio() {
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

        Centro = new javax.swing.JPanel();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        Arriba = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Abajo = new javax.swing.JPanel();
        Derecha = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        Centro.setLayout(new java.awt.GridLayout(1, 3));

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        Centro.add(btnEntrada);

        btnSalida.setText("Salida");
        Centro.add(btnSalida);

        btnAlumnos.setText("Alumnos");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        Centro.add(btnAlumnos);

        add(Centro, java.awt.BorderLayout.CENTER);

        Arriba.setLayout(new java.awt.GridLayout(3, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        Arriba.add(jPanel2);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Gestión de entrada y salida  -  CECyTEM ");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        Arriba.add(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        Arriba.add(jPanel3);

        add(Arriba, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout AbajoLayout = new javax.swing.GroupLayout(Abajo);
        Abajo.setLayout(AbajoLayout);
        AbajoLayout.setHorizontalGroup(
            AbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        AbajoLayout.setVerticalGroup(
            AbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(Abajo, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(Derecha, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(Izquierda, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        pAlumno alumno = new pAlumno();
        alumno.setLocation(0, 0);
        ContenedorMain.removeAll();
        ContenedorMain.add(alumno,GridLayout.class);
        ContenedorMain.revalidate();
        ContenedorMain.repaint();
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        pEntrada entrada = new pEntrada();
        entrada.setLocation(0, 0);
        ContenedorMain.removeAll();
        ContenedorMain.add(entrada,GridLayout.class);
        ContenedorMain.revalidate();
        ContenedorMain.repaint();
    }//GEN-LAST:event_btnEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Abajo;
    private javax.swing.JPanel Arriba;
    private javax.swing.JPanel Centro;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
