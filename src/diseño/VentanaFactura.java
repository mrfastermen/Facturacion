/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseño;

import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VentanaFactura extends javax.swing.JFrame {

    Connection conn;
    Statement st;
    VentanaPrincipal principal = new VentanaPrincipal();
    public String valorglobal;
    public String valorglobal2;
    public String valorglobal3;

    public VentanaFactura() {
        if (EXIT_ON_CLOSE == 0) {
            principal.setVisible(true);
        }
        initComponents();

        jButton4.setToolTipText("Actualizar Base de Datos");

        jTable1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt) {
                try {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if (Mouse_evt.getClickCount() == 1) {
                        jTextField3.setText("" + jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                        String valortablas = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
                        valorglobal = valortablas;
                        String valortablas2 = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
                        valorglobal3 = valortablas2;
                    }
                } catch (Exception e) {
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        //setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Editar");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("nombre empresa");

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Fecha de la Factura", "Valor de la Factura", "Numero de la Factura"
                }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(35);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addContainerGap())
        );

        jTabbedPane1.addTab("FACTURAS PENDIENTES", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                        .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addContainerGap())
        );

        jTabbedPane1.addTab("FACTURAS PAGADAS", jPanel2);

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("CERRAR ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)), "AGREGAR FACTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jDateChooser2.setDateFormatString("yyyy-MM-d");
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FECHA");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("N°. FACTURA");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("VALOR");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)), "PAGAR FACTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("N°. FACTURA A PAGAR");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setEditable(false);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser3.setDateFormatString("yyyy-MM-d");
        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("N° RECIBIDO");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("VALOR");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FECHA");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("PAGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("OBSERVACION");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel9))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))
        );

        jTextField6.setEditable(false);
        jTextField6.setBorder(null);
        jTextField6.setEnabled(false);
        jTextField6.setOpaque(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizacion.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("EDITAR FACTURA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jButton4)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold> 

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("img/icono.png"));

        return retValue;
    }

    //AGREGAR FACTURA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        conn = conexiondb.ConexionDB.GetConnection();

        String formato = jDateChooser2.getDateFormatString();
        Date date = jDateChooser2.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String fecha = null;
        try {
            fecha = String.valueOf(sdf.format(date));
        } catch (Exception e) {
        }

        String valor = jTextField1.getText();
        String num_factura = jTextField2.getText();
        String idempresa = jTextField6.getText();

        if ((valor.length() > 0) && (num_factura.length() > 0)) {
            //buscar id de la empresa seleccionada

            String sql = "INSERT INTO factura (fecha_factura, valor_factura, num_factura, empresa_idempresa)\n"
                    + "VALUES ('" + fecha + "', '" + valor + "', '" + num_factura + "', '" + idempresa + "')";

            try {
                st = conn.createStatement();
                int inser = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Factura Agregada con Exito...!");

                jDateChooser2.setToolTipText("");
                jTextField1.setText("");
                jTextField2.setText("");
            } catch (Exception ex) {
                if (fecha == null) {
                    JOptionPane.showMessageDialog(null, "Digite Fecha..!");
                } else {
                    JOptionPane.showMessageDialog(null, "Numero de Factuta ya Existe..!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene todo los campos..!");
        }
        leerDatos();
        principal.totalFactura();
    }

    //PAGAR FACTURA
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        conn = conexiondb.ConexionDB.GetConnection();
        boolean valoresmayor = false;

        String formato = jDateChooser3.getDateFormatString();
        Date date = jDateChooser3.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String fecha = null;

        try {
            fecha = String.valueOf(sdf.format(date));
        } catch (Exception e) {
        }

        String valor = jTextField4.getText();
        String num = jTextField5.getText();
        String obs = jTextArea1.getText();
        String idempresa = jTextField6.getText();
        String numfact = jTextField3.getText();

        try {
            if (numfact.equals("")) {
                JOptionPane.showMessageDialog(null, "No hay facturas por pagar", "Error", 0);
                return;
            }
        } catch (Exception e) {
        }

        String valorpagar = jTextField4.getText();

        if (valorglobal.equals(valorpagar)) {
            //System.out.println("si es igual");
            String modificarestado = "UPDATE factura SET estado = 'pagado' WHERE idfacturacion = '" + numfact + "'";

            try {
                st = conn.createStatement();
                int inser = st.executeUpdate(modificarestado);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {

            int valorg = 0;
            int valorp = 0;
            try {
                valorg = Integer.parseInt(valorglobal);
                valorp = Integer.parseInt(valorpagar);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            if (valorp < valorg) {
                //System.out.println("es menor");
                int nuevovalor = valorg - valorp;
                //System.out.println("Nuevo valoor" + nuevovalor);

                String abono = "UPDATE factura SET valor_factura = '" + nuevovalor + "' WHERE idfacturacion = '" + numfact + "'";

                try {
                    st = conn.createStatement();
                    int inser = st.executeUpdate(abono);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else {
                if (valorp > valorg) {
                    valoresmayor = true;
                }
            }
        }

        if ((valor.length() > 0) && (num.length() > 0) && (valoresmayor != true)) {
            String sql = "INSERT INTO abono (fecha_pagada, valor_pagado, num_recibido, factura_idfacturacion, factura_empresa_idempresa, observacion)\n"
                    + "VALUES ('" + fecha + "', '" + valor + "', '" + num + "', '" + numfact + "', '" + idempresa + "', '" + obs + "')";

            try {
                st = conn.createStatement();
                int inser = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Realizado con Exito...!");

                jDateChooser2.setToolTipText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField3.setText("");
                jTextArea1.setText("");
            } catch (Exception ex) {
                if (fecha == null) {
                    JOptionPane.showMessageDialog(null, "Digite Fecha..!");
                } else {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        } else {
            if (valoresmayor) {
                JOptionPane.showMessageDialog(null, "EL VALOR DE LA DEUDA ES MENOR..!");
            } else {
                JOptionPane.showMessageDialog(null, "Llene todo los campos..!cual");
            }
        }
        leerDatos();
        leerDatosPagos();
        principal.totalFactura();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        leerDatos();
        leerDatosPagos();
    }

    public void leerDatosPagos() {
        String idempresa = jTextField6.getText();
        String sql = "SELECT factura.num_factura AS '#', fecha_pagada AS 'FECHA DE PAGO', valor_pagado AS 'VALOR PAGADO', num_recibido AS 'NUMERO RECIBIDO', observacion AS 'OBSERVACION'\n"
                + "FROM abono INNER JOIN factura ON factura.idfacturacion = abono.factura_idfacturacion\n"
                + "WHERE factura_empresa_idempresa='" + idempresa + "'";

        try {
            conn = conexiondb.ConexionDB.GetConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumna = rsmd.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable2.setModel(modelo);

            for (int i = 1; i <= numColumna; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumna];

                for (int j = 0; j < numColumna; j++) {
                    fila[j] = rs.getObject(j + 1);
                }
                modelo.addRow(fila);
                JTableHeader th;
                th = jTable2.getTableHeader();
                Font fuente = new Font("Tahoma", Font.BOLD, 16);
                th.setFont(fuente);
                jTable2.setFont(new java.awt.Font("Tahoma", 0, 14));

                if (jTable2.getColumnModel().getColumnCount() > 0) {
                    jTable2.getColumnModel().getColumn(0).setMinWidth(35);
                    jTable2.getColumnModel().getColumn(0).setMaxWidth(50);
                }
            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se);
        }
    }

    public void leerDatos() {
        String idempresa = jTextField6.getText();
        String sql = "SELECT idfacturacion AS '#', fecha_factura AS 'FECHA FACTURA', valor_factura AS 'VALOR FACTURA', num_factura AS 'NUMERO FACTURA' "
                + "FROM factura WHERE empresa_idempresa= '" + idempresa + "' AND estado='pendiente'";
        try {
            conn = conexiondb.ConexionDB.GetConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumna = rsmd.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            for (int i = 1; i <= numColumna; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumna];

                for (int j = 0; j < numColumna; j++) {
                    fila[j] = rs.getObject(j + 1);
                }
                modelo.addRow(fila);
                JTableHeader th;
                th = jTable1.getTableHeader();
                Font fuente = new Font("Tahoma", Font.BOLD, 20);
                th.setFont(fuente);
                jTable1.setFont(new java.awt.Font("Tahoma", 0, 18));
                if (jTable1.getColumnModel().getColumnCount() > 0) {
                    jTable1.getColumnModel().getColumn(0).setMinWidth(35);
                    jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
                }
            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se);
        }
    }

    //validar solo numeros
    public void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(this, "Digite Solo Numeros..!");
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Calendar fechaActual = new GregorianCalendar();
        JTextField fecha = new JTextField(7);
        JTextField valor = new JTextField(5);
        JTextField numfact = new JTextField(5);
        
        fecha.setToolTipText("Año-Mes-Dia");

        int anio = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        
        fecha.setText(anio+"-"+(mes+1)+"-"+dia);
        valor.setText(valorglobal);
        numfact.setText(valorglobal3);

        JPanel myPanel = new JPanel();
        myPanel.add(Box.createHorizontalStrut(10)); // a spacer
        myPanel.add(new JLabel("Fecha:"));
        myPanel.add(fecha);
        myPanel.add(Box.createHorizontalStrut(10)); // a spacer
        myPanel.add(new JLabel("Valor:"));
        myPanel.add(valor);
        myPanel.add(Box.createHorizontalStrut(10)); // a spacer
        myPanel.add(new JLabel("Numero Factura:"));
        myPanel.add(numfact);

        int result = JOptionPane.showConfirmDialog(null, myPanel, "Modificar Factura", JOptionPane.OK_CANCEL_OPTION);
        String fec = fecha.getText();
        String val = valor.getText();
        String nfact = numfact.getText();
        String idfact = jTextField3.getText();

        if (result == JOptionPane.OK_OPTION) {
            
            if (!val.equals("") && (!nfact.equals(""))) {
                String sql = "UPDATE factura SET fecha_factura = '" + fec + "', valor_factura = '" + val + "', num_factura = '" + nfact + "' WHERE idfacturacion = '" + idfact + "'";
                try {
                    st = conn.createStatement();
                    int inser = st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Factura Modificada con Exito...!");
                } catch (Exception ex) {
                    if (fecha == null) {
                        JOptionPane.showMessageDialog(null, "Digite Fecha..!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Verifique Fecha ó Numero de Factura YA Exista..!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Llene todo los campos..!");
            }
            leerDatos();
            principal.totalFactura();
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration 
}
