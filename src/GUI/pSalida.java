/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sql.conexion;

/**
 *
 * @author angel
 */
public class pSalida extends javax.swing.JPanel {
    Connection con;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form Psalida
     */
    public pSalida() {
        initComponents();
        xNumControl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        xNumControl = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(1, 0));

        Contenedor.setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setBackground(new java.awt.Color(24, 160, 221));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 160, 221));
        jLabel1.setText("Registro de Salida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Número de control");

        txtNoControl.setBackground(new java.awt.Color(244, 244, 244));
        txtNoControl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNoControl.setBorder(null);
        txtNoControl.setOpaque(false);
        txtNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlActionPerformed(evt);
            }
        });
        txtNoControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoControlKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoControlKeyPressed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(244, 244, 244));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        xNumControl.setForeground(new java.awt.Color(214, 36, 55));
        xNumControl.setText("X");
        xNumControl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar)
                            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNoControl)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xNumControl))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(0, 290, Short.MAX_VALUE))
        );

        add(Contenedor);
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean Validacion() {
        boolean noControl;
        if (txtNoControl.getText().isEmpty() || txtNoControl.getText().length() != 14) {
            xNumControl.setVisible(true);
            noControl = false;
        } else {
            xNumControl.setVisible(false);
            noControl = true;
        }
        return noControl;
    }
    
    private void Registrar(){
        if (Validacion()) {
            //JOptionPane.showMessageDialog(null, "Guardado exitosamente", "Mensaje", 1);
            Date date = new Date();
            //Caso 1: obtener la hora y salida por pantalla con formato:
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Hora: " + hourFormat.format(date));
            //Caso 2: obtener la fecha y salida por pantalla con formato:
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Fecha: " + dateFormat.format(date));
            long d = date.getTime();
            java.sql.Date fecha = new java.sql.Date(d);
            System.out.println("" + fecha);
            String sqlNoControl = txtNoControl.getText();
            try {
                String url = "jdbc:mysql://localhost:3306/cecytem";
                String usuario = "root";
                String contraseña = "root";

                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url, usuario, contraseña);
                if (con != null) {
                    System.out.println("Se ha establecido una conexión a la base de datos "
                            + "\n " + url);
                }
                ps = con.prepareStatement("SELECT * FROM Alumnos WHERE noControl = (?)"); // or Nombre = (?)");
                ps.setString(1, txtNoControl.getText());
                stmt = con.createStatement();
                rs = ps.executeQuery();
                if (rs.next()) { //Para leer varias posibles filas se cambia el while por el if
                    //rs.getInt("id_compania");
                    ps = con.prepareStatement("INSERT INTO Salida (noControl,Fecha, Hora) VALUES(?,?,?)");
                    ps.setString(1, txtNoControl.getText());
                    ps.setString(2, dateFormat.format(date));
                    ps.setString(3, hourFormat.format(date));
                    stmt = con.createStatement();
                    ps.executeUpdate();
                    System.out.println("Los valores han sido agregados a la base de datos ");
                    JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    txtNoControl.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El número de control es incorrecto",
                            "Aviso",0);
                    txtNoControl.requestFocus();
                }

            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al agregar");
                JOptionPane.showMessageDialog(null, "Error al registar salida","Aviso - Base de datos error",0);
            } finally {
                if (con != null) {
                    try {
                        con.close();
                        stmt.close();
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Rellena los campos correctamente", "Aviso", 0);
        }
    }
    private void txtNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlActionPerformed

    }//GEN-LAST:event_txtNoControlActionPerformed

    private void txtNoControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(txtNoControl.getText().length()>13){
            evt.consume();
        }
    }//GEN-LAST:event_txtNoControlKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         Registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNoControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                Registrar();
        }
    }//GEN-LAST:event_txtNoControlKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JLabel xNumControl;
    // End of variables declaration//GEN-END:variables
}
