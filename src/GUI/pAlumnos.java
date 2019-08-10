/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.pInicio.btnPagAnterior;
import static GUI.pInicio.btnPagFinal;
import static GUI.pInicio.btnPagInicio;
import static GUI.pInicio.btnPagSiguiente;
import static GUI.pInicio.etiEstadoGuardar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Herramientas.BD;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class pAlumnos extends javax.swing.JPanel {

    boolean noControl, nombre, apPat, apMat, fechaNac, grupo;
    String sqlNoControl, sqlNombre, sqlApPat, sqlApMat, sqlFechaNac, sqlGrupo;
    Connection con;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form Pentrada
     */
    public pAlumnos(){
        initComponents();
        ValuesInit();
        try {
            llenarLista("");
        } catch (SQLException ex) {
            Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void ValuesInit() {
        xNumControl.setVisible(false);
        xNombre.setVisible(false);
        xApPat.setVisible(false);
        xApMat.setVisible(false);
        xFechaNac.setVisible(false);
        xGrupo.setVisible(false);
        txtNoControl.setText("");
        txtNombre.setText("");
        txtApPat.setText("");
        txtApMat.setText("");
        txtCalendar.setDate(null);
        txtGrupo.setText("");
        /*Barra*/
        btnPagInicio.setVisible(false);
        btnPagAnterior.setVisible(false);
        btnPagSiguiente.setVisible(false);
        btnPagFinal.setVisible(false);
        etiEstadoGuardar.setText("");
        etiEstadoGuardar.setForeground(new Color(51,51,51));
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
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtNoControl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtApPat = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtApMat = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        xNumControl = new javax.swing.JLabel();
        xNombre = new javax.swing.JLabel();
        xApPat = new javax.swing.JLabel();
        xApMat = new javax.swing.JLabel();
        xGrupo = new javax.swing.JLabel();
        xFechaNac = new javax.swing.JLabel();
        txtCalendar = new com.toedter.calendar.JDateChooser();
        btnBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        Contenedor.setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(24, 160, 221));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 160, 221));
        jLabel1.setText("<html>\n<p></p>\n<p></p>\nAlumnos\n<p></p>\n<p></p>\n<p></p>\n<html>");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

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

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaAlumnos.setToolTipText("Lista de Alumnos");
        TablaAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAlumnosMouseClicked(evt);
            }
        });
        TablaAlumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaAlumnosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaAlumnos);

        jPanel6.add(jScrollPane2);

        jPanel3.add(jPanel6);

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

        jLabel5.setText("Número de control");

        jLabel6.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel7.setText("Apellido Paterno");

        txtApPat.setBackground(new java.awt.Color(244, 244, 244));
        txtApPat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApPat.setBorder(null);
        txtApPat.setOpaque(false);
        txtApPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPatActionPerformed(evt);
            }
        });
        txtApPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPatKeyTyped(evt);
            }
        });

        txtApMat.setBackground(new java.awt.Color(244, 244, 244));
        txtApMat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApMat.setBorder(null);
        txtApMat.setOpaque(false);
        txtApMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMatActionPerformed(evt);
            }
        });
        txtApMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMatKeyTyped(evt);
            }
        });

        jLabel8.setText("Apellido Materno");

        jLabel9.setText("Fecha de Nacimiento");

        jLabel10.setText("Grupo");

        txtGrupo.setBackground(new java.awt.Color(244, 244, 244));
        txtGrupo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtGrupo.setBorder(null);
        txtGrupo.setOpaque(false);
        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });
        txtGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrupoKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(241, 241, 241));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        xNumControl.setForeground(new java.awt.Color(214, 36, 55));
        xNumControl.setText("X");
        xNumControl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        xNombre.setForeground(new java.awt.Color(214, 36, 55));
        xNombre.setText("X");
        xNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        xApPat.setForeground(new java.awt.Color(214, 36, 55));
        xApPat.setText("X");
        xApPat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        xApMat.setForeground(new java.awt.Color(214, 36, 55));
        xApMat.setText("X");
        xApMat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        xGrupo.setForeground(new java.awt.Color(214, 36, 55));
        xGrupo.setText("X");
        xGrupo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        xFechaNac.setForeground(new java.awt.Color(214, 36, 55));
        xFechaNac.setText("X");
        xFechaNac.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtCalendar.setDateFormatString("dd/MM/yyyy");

        btnBorrar.setBackground(new java.awt.Color(241, 241, 241));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNoControl)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(xNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGrupo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(xNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(xFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel5);

        jPanel4.setOpaque(false);

        jPanel7.setOpaque(false);

        txtBuscar.setBackground(new java.awt.Color(244, 244, 244));
        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(241, 241, 241));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel7);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(Contenedor);
    }// </editor-fold>//GEN-END:initComponents
    private boolean Validacion() {
        boolean Save;
        if (txtNoControl.getText().isEmpty() || txtNoControl.getText().length() != 14) {
            xNumControl.setVisible(true);
            noControl = false;
        } else {
            xNumControl.setVisible(false);
            noControl = true;
        }
        if (txtNombre.getText().isEmpty() || txtNoControl.getText().length() > 24) {
            xNombre.setVisible(true);
            nombre = false;
        } else {
            xNombre.setVisible(false);
            nombre = true;
        }
        if (txtApPat.getText().isEmpty() || txtApPat.getText().length() > 24) {
            xApPat.setVisible(true);
            apPat = false;
        } else {
            xApPat.setVisible(false);
            apPat = true;
        }
        if (txtApMat.getText().isEmpty() || txtApMat.getText().length() > 24) {
            xApMat.setVisible(true);
            apMat = false;
        } else {
            xApMat.setVisible(false);
            apPat = true;
        }
        if (txtGrupo.getText().isEmpty() || txtGrupo.getText().length()!=3) {
            xGrupo.setVisible(true);
            grupo = false;
        } else {
            xGrupo.setVisible(false);
            grupo = true;
        }
        if (txtCalendar.getDate() == null) {
            fechaNac = false;
            xFechaNac.setVisible(true);
        } else {
            fechaNac = true;
            xFechaNac.setVisible(false);
        }

        Save = noControl && nombre && apPat && apPat && grupo && fechaNac;
        return Save;
    }
    
    private void llenarLista(String condicion) throws SQLException{
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Número de Control");
            modelo.addColumn("Nombre del Alumno");
            BD b;
            b=new BD();
            b.conectarBD();
            rs = b.ejecutarSentenciaSQL("SELECT noControl,Nombre FROM Alumnos "
                    + ""+condicion+"");
            while(rs.next()){
                System.out.println(rs.getString("Nombre"));
                modelo.addRow(new Object[]{rs.getString("noControl"),rs.getString("Nombre")});
            }
            
            TablaAlumnos.setModel(modelo);
            TablaAlumnos.setDefaultEditor(Object.class, null);
            b.cerrarBD();
            //javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void ObtenerAlumno(String numControl){
        try {
            BD b;
            b=new BD();
            b.conectarBD();
            rs = b.ejecutarSentenciaSQL("SELECT * FROM Alumnos WHERE "
                    + "noControl = '"+numControl+"'");
            if(rs.next()){
                txtNoControl.setText(rs.getString("noControl"));
                txtNombre.setText(rs.getString("Nombre"));
                txtApPat.setText(rs.getString("ApPat"));
                txtApMat.setText(rs.getString("ApMat"));
                txtCalendar.setDate(rs.getDate("FechaNac"));
                txtGrupo.setText(rs.getString("Grupo"));
            }
            b.cerrarBD();
        } catch (SQLException ex) {
            Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlActionPerformed

    }//GEN-LAST:event_txtNoControlActionPerformed

    private void txtNoControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) 
            evt.consume();
        if (txtNoControl.getText().length() > 13) 
            evt.consume();
    }//GEN-LAST:event_txtNoControlKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && (evt.getKeyChar()) != KeyEvent.VK_SPACE) {
            evt.consume();
        } 
        if (txtNombre.getText().length() > 24) 
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPatActionPerformed

    private void txtApPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && (evt.getKeyChar()) != KeyEvent.VK_SPACE) {
            evt.consume();
        }
        if (txtApPat.getText().length() > 24)
            evt.consume();
    }//GEN-LAST:event_txtApPatKeyTyped

    private void txtApMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMatActionPerformed

    private void txtApMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && (evt.getKeyChar()) != KeyEvent.VK_SPACE) 
            evt.consume();
        if (txtApMat.getText().length() > 24) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApMatKeyTyped

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed

    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrupoKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if (txtGrupo.getText().length() > 2) 
            evt.consume();
    }//GEN-LAST:event_txtGrupoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Validacion()) {
            try {
                Date date = txtCalendar.getDate();
                long d = date.getTime();
                java.sql.Date fecha = new java.sql.Date(d);
                sqlFechaNac = String.valueOf(fecha);
                BD b=new BD();
                b.conectarBD();
                rs = b.ejecutarSentenciaSQL("SELECT noControl FROM Alumnos WHERE noControl ='"+
                        txtNoControl.getText()+"'");
                if(rs.next())
                    JOptionPane.showMessageDialog(null, "El alumno ya está registrado", "Aviso", 0);
                else{
                    b.ejecutarSentenciaSQL("INSERT INTO Alumnos VALUES ('" + txtNoControl.getText()+"','"+
                    txtNombre.getText()+"','"+txtApPat.getText()+"','"+txtApMat.getText()+
                    "','"+sqlFechaNac+"','"+
                    txtGrupo.getText()+"')");
                    javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    llenarLista("");
                    ValuesInit();
                }
                b.cerrarBD();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellena los campos correctamente", "Aviso", 0);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void txtNoControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlKeyPressed

    }//GEN-LAST:event_txtNoControlKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!txtBuscar.getText().isEmpty()){
            try {
                llenarLista("WHERE noControl LIKE '"+txtBuscar.getText()+"%'");
            } catch (SQLException ex) {
                Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtBuscar.requestFocus();
        }
        else{
            try {
                llenarLista("");
        } catch (SQLException ex) {
            Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
            txtBuscar.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TablaAlumnosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaAlumnosKeyPressed
        
    }//GEN-LAST:event_TablaAlumnosKeyPressed

    private void TablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAlumnosMouseClicked
        String numControl = TablaAlumnos.getValueAt(TablaAlumnos.getSelectedRow() ,0).toString();
        ObtenerAlumno(numControl);
    }//GEN-LAST:event_TablaAlumnosMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                BD b;
                b=new BD();
                b.conectarBD();
                b.ejecutarSentenciaSQL("DELETE FROM Alumnos "
                        + "WHERE noControl = '"+txtNoControl.getText()+"'");
                b.cerrarBD();
                llenarLista("");
                ValuesInit();
            } catch (SQLException ex) {
                Logger.getLogger(pAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser txtCalendar;
    private javax.swing.JTextField txtGrupo;
    public javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel xApMat;
    private javax.swing.JLabel xApPat;
    private javax.swing.JLabel xFechaNac;
    private javax.swing.JLabel xGrupo;
    private javax.swing.JLabel xNombre;
    private javax.swing.JLabel xNumControl;
    // End of variables declaration//GEN-END:variables
}
