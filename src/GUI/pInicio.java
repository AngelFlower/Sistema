/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Principal.main;
import static Principal.main.ContenedorMain;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
        InitValues();
    }
    private void InitValues(){
        User.setName("false");
        btnInicio.setName("true");
        btnEntrada.setName("false");
        btnSalida.setName("false");
        btnCerrarSesion.setName("false");
        btnAlumnos.setName("false");
        pIniciemos iniciemos = new pIniciemos();
        ContenedorInicio.add(iniciemos,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        MenuMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        User = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalida = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAlumnos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ContenedorInicio = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new java.awt.GridLayout(1, 0));

        MenuMain.setBackground(new java.awt.Color(24, 160, 221));
        MenuMain.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setOpaque(false);

        User.setBackground(new java.awt.Color(27, 145, 199));
        User.setOpaque(false);
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserMouseEntered(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(246, 246, 246));
        jLabel1.setText("Administrador");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setForeground(new java.awt.Color(246, 246, 246));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user(1).png"))); // NOI18N

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnEntrada.setBackground(new java.awt.Color(27, 145, 199));
        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrada.setOpaque(false);
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntradaMouseEntered(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(246, 246, 246));
        jLabel3.setText("Entrada");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setForeground(new java.awt.Color(246, 246, 246));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N

        javax.swing.GroupLayout btnEntradaLayout = new javax.swing.GroupLayout(btnEntrada);
        btnEntrada.setLayout(btnEntradaLayout);
        btnEntradaLayout.setHorizontalGroup(
            btnEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntradaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEntradaLayout.setVerticalGroup(
            btnEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnInicio.setBackground(new java.awt.Color(27, 145, 199));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(246, 246, 246));
        jLabel5.setText("Inicio");

        jLabel6.setBackground(new java.awt.Color(250, 250, 250));
        jLabel6.setForeground(new java.awt.Color(246, 246, 246));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnSalida.setBackground(new java.awt.Color(27, 145, 199));
        btnSalida.setOpaque(false);
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalidaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalidaMouseEntered(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(246, 246, 246));
        jLabel7.setText("Salida");

        jLabel8.setBackground(new java.awt.Color(250, 250, 250));
        jLabel8.setForeground(new java.awt.Color(246, 246, 246));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit(2).png"))); // NOI18N

        javax.swing.GroupLayout btnSalidaLayout = new javax.swing.GroupLayout(btnSalida);
        btnSalida.setLayout(btnSalidaLayout);
        btnSalidaLayout.setHorizontalGroup(
            btnSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalidaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSalidaLayout.setVerticalGroup(
            btnSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnCerrarSesion.setBackground(new java.awt.Color(27, 145, 199));
        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(246, 246, 246));
        jLabel11.setText("Cerrar sesión");

        jLabel12.setBackground(new java.awt.Color(250, 250, 250));
        jLabel12.setForeground(new java.awt.Color(246, 246, 246));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit(2).png"))); // NOI18N

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnAlumnos.setBackground(new java.awt.Color(27, 145, 199));
        btnAlumnos.setOpaque(false);
        btnAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseEntered(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(246, 246, 246));
        jLabel9.setText("Alumnos");

        jLabel10.setBackground(new java.awt.Color(250, 250, 250));
        jLabel10.setForeground(new java.awt.Color(246, 246, 246));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit(2).png"))); // NOI18N

        javax.swing.GroupLayout btnAlumnosLayout = new javax.swing.GroupLayout(btnAlumnos);
        btnAlumnos.setLayout(btnAlumnosLayout);
        btnAlumnosLayout.setHorizontalGroup(
            btnAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAlumnosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAlumnosLayout.setVerticalGroup(
            btnAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );

        MenuMain.add(jPanel1);

        ContenedorInicio.setBackground(new java.awt.Color(224, 224, 224));
        ContenedorInicio.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(MenuMain, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContenedorInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContenedorInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(bg);
    }// </editor-fold>//GEN-END:initComponents
    void PanelSelectReset(JPanel panel){
        User.setName("false");
        User.setOpaque(false);
        btnInicio.setName("false");
        btnInicio.setOpaque(false);
        btnEntrada.setName("false");
        btnEntrada.setOpaque(false);
        btnSalida.setName("false");
        btnSalida.setOpaque(false);
        btnCerrarSesion.setName("false");
        btnCerrarSesion.setOpaque(false);
        btnAlumnos.setName("false");
        btnAlumnos.setOpaque(false);
        panel.setName("true");
        panel.setOpaque(true);
        this.repaint();
    }
    void EnteredMousePanel(JPanel panel){
        if(panel.getName().equals("false"))
            panel.setOpaque(true);
        this.repaint();
    }
    void ExitedMousePanel(JPanel panel){
        if(panel.getName().equals("false"))
            panel.setOpaque(false);
        this.repaint();
    }
    private void btnEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseEntered
        EnteredMousePanel(btnEntrada);
    }//GEN-LAST:event_btnEntradaMouseEntered

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        EnteredMousePanel(btnInicio);
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        EnteredMousePanel(btnSalida);
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseEntered
        EnteredMousePanel(User);
    }//GEN-LAST:event_UserMouseEntered

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        PanelSelectReset(User);
        pUsuario usuario = new pUsuario();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(usuario,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_UserMouseClicked

    private void UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseExited
        ExitedMousePanel(User);
    }//GEN-LAST:event_UserMouseExited

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        ExitedMousePanel(btnInicio);
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseExited
        ExitedMousePanel(btnEntrada);
    }//GEN-LAST:event_btnEntradaMouseExited

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        ExitedMousePanel(btnSalida);
    }//GEN-LAST:event_btnSalidaMouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        PanelSelectReset(btnInicio);
        pIniciemos iniciemos = new pIniciemos();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(iniciemos,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        PanelSelectReset(btnEntrada);
        pEntrada entrada = new pEntrada();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(entrada,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnEntradaMouseClicked

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        PanelSelectReset(btnSalida);
        pSalida salida = new pSalida();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(salida,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnSalidaMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        //PanelSelectReset(btnCerrarSesion);
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la sesion?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            pLogin configuracion = new pLogin();
            ContenedorMain.removeAll();
            ContenedorMain.add(configuracion,GridLayout.class);
            ContenedorMain.revalidate();
            ContenedorMain.repaint();
        }
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        ExitedMousePanel(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        EnteredMousePanel(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseClicked
        PanelSelectReset(btnAlumnos);
        pAlumnoCambios alumnos = new pAlumnoCambios();
        menuAlumno menu = new menuAlumno();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(alumnos,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
        MenuMain.removeAll();
        MenuMain.add(menu,GridLayout.class);
        MenuMain.revalidate();
        MenuMain.repaint();
    }//GEN-LAST:event_btnAlumnosMouseClicked

    private void btnAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseExited
        ExitedMousePanel(btnAlumnos);
    }//GEN-LAST:event_btnAlumnosMouseExited

    private void btnAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseEntered
        EnteredMousePanel(btnAlumnos);
    }//GEN-LAST:event_btnAlumnosMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel ContenedorInicio;
    public static javax.swing.JPanel MenuMain;
    private javax.swing.JPanel User;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAlumnos;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnEntrada;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
