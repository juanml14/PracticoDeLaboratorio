package GUI;

import Persistencia.BDClientes;
import Persistencia.BDPeliculas;
import Persistencia.BDRegistros;
import Persistencia.DataAccessException;
import Persistencia.NotFoundException;
import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import practicodelaboratorio.Caja;
import practicodelaboratorio.Calendario;
import practicodelaboratorio.Cliente;
import practicodelaboratorio.Pelicula;
import practicodelaboratorio.Registro;

public class VPrincipal extends javax.swing.JFrame {

    public VPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JBPeliculas = new javax.swing.JButton();
        jTBPelicula = new javax.swing.JToolBar();
        jBNuevaPelicula = new javax.swing.JButton();
        JBConsultarPelicula = new javax.swing.JButton();
        JBClientes = new javax.swing.JButton();
        jTBCliente = new javax.swing.JToolBar();
        jBNuevoCliente = new javax.swing.JButton();
        jBConsultarClientes = new javax.swing.JButton();
        jBRegistros = new javax.swing.JButton();
        jTBRegistros = new javax.swing.JToolBar();
        jBAlquiler = new javax.swing.JButton();
        jTBDevolucion = new javax.swing.JButton();
        jBCaja = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jIFBuscarCliente = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        JCBCPor = new javax.swing.JComboBox();
        jTCampoCliente = new javax.swing.JTextField();
        jBBCAceptar = new javax.swing.JButton();
        jBBCAceptar1 = new javax.swing.JButton();
        jIFBuscarPeliculas = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbPeliculas = new javax.swing.JTable();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        JCBPPor = new javax.swing.JComboBox();
        jTCampoPelicula = new javax.swing.JTextField();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCBuscarPGenero = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jCBuscarPFormato = new javax.swing.JComboBox();
        jBBPAceptar = new javax.swing.JButton();
        jIFNuevaPelicula = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jTNPTitulo = new javax.swing.JTextField();
        jTNPAutor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCNPFormato = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jCNPGenero = new javax.swing.JComboBox();
        JBNPAceptar = new javax.swing.JButton();
        JBNPCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTNPPrecio = new javax.swing.JTextField();
        jSEjemplares = new javax.swing.JSpinner();
        jIFNuevoRegistro = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLNRPeliculas = new javax.swing.JList();
        jTNRCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBNRAgregar = new javax.swing.JButton();
        jBNRQuitar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTNRMonto = new javax.swing.JTextField();
        jBNRAceptar = new javax.swing.JButton();
        jBNRCancelar = new javax.swing.JButton();
        jBNRBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTNRMultaPendiente = new javax.swing.JTextField();
        jIFNuevoCliente = new javax.swing.JInternalFrame();
        jLabel17 = new javax.swing.JLabel();
        jTNCNombre = new javax.swing.JTextField();
        jTNCDni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jBNCAceptar = new javax.swing.JButton();
        jBCNCancelar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTNCTelefono = new javax.swing.JTextField();
        jTNCDireccion = new javax.swing.JTextField();
        jIFDevolucion = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbRegistrosPendientes = new javax.swing.JTable();
        jToolBar6 = new javax.swing.JToolBar();
        jLabel14 = new javax.swing.JLabel();
        jTFClientePendientes = new javax.swing.JTextField();
        jBBuscarCliente = new javax.swing.JButton();
        jBRPAceptar = new javax.swing.JButton();
        jIFCaja = new javax.swing.JInternalFrame();
        jBCMostrar = new javax.swing.JButton();
        jSfecha1 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTCAlquiler = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTCMultas = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTCTotal = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSfecha2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(1);
        jToolBar1.setBorderPainted(false);

        JBPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        JBPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMAGENES/pelicula.png"))); // NOI18N
        JBPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPeliculasActionPerformed(evt);
            }
        });
        jToolBar1.add(JBPeliculas);

        jTBPelicula.setBackground(new java.awt.Color(255, 255, 255));
        jTBPelicula.setFloatable(false);
        jTBPelicula.setOrientation(1);
        jTBPelicula.setBorderPainted(false);
        jTBPelicula.setInheritsPopupMenu(true);
        jTBPelicula.setVisible(false);

        jBNuevaPelicula.setBackground(new java.awt.Color(255, 255, 255));
        jBNuevaPelicula.setText("Nueva Pelicula");
        jBNuevaPelicula.setBorder(null);
        jBNuevaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaPeliculaActionPerformed(evt);
            }
        });
        jTBPelicula.add(jBNuevaPelicula);

        JBConsultarPelicula.setBackground(new java.awt.Color(255, 255, 255));
        JBConsultarPelicula.setText("Consultar Peliculas");
        JBConsultarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultarPeliculaActionPerformed(evt);
            }
        });
        jTBPelicula.add(JBConsultarPelicula);

        jToolBar1.add(jTBPelicula);

        JBClientes.setBackground(new java.awt.Color(255, 255, 255));
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMAGENES/usuario-icono-4465-96.png"))); // NOI18N
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(JBClientes);

        jTBCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTBCliente.setFloatable(false);
        jTBCliente.setOrientation(1);
        jTBCliente.setBorderPainted(false);
        jTBCliente.setInheritsPopupMenu(true);
        jTBCliente.setVisible(false);

        jBNuevoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jBNuevoCliente.setText("Nuevo Cliente");
        jBNuevoCliente.setBorder(null);
        jBNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoClienteActionPerformed(evt);
            }
        });
        jTBCliente.add(jBNuevoCliente);

        jBConsultarClientes.setBackground(new java.awt.Color(255, 255, 255));
        jBConsultarClientes.setText("Consultar Clientes");
        jBConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarClientesActionPerformed(evt);
            }
        });
        jTBCliente.add(jBConsultarClientes);

        jToolBar1.add(jTBCliente);

        jBRegistros.setBackground(new java.awt.Color(255, 255, 255));
        jBRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMAGENES/registro.png"))); // NOI18N
        jBRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrosActionPerformed(evt);
            }
        });
        jToolBar1.add(jBRegistros);

        jTBRegistros.setBackground(new java.awt.Color(255, 255, 255));
        jTBRegistros.setFloatable(false);
        jTBRegistros.setOrientation(1);
        jTBRegistros.setRollover(true);
        jTBRegistros.setVisible(false);

        jBAlquiler.setBackground(new java.awt.Color(255, 255, 255));
        jBAlquiler.setText("Alquiler");
        jBAlquiler.setFocusable(false);
        jBAlquiler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAlquiler.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlquilerActionPerformed(evt);
            }
        });
        jTBRegistros.add(jBAlquiler);

        jTBDevolucion.setBackground(new java.awt.Color(255, 255, 255));
        jTBDevolucion.setText("Devolución");
        jTBDevolucion.setFocusable(false);
        jTBDevolucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jTBDevolucion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBDevolucionActionPerformed(evt);
            }
        });
        jTBRegistros.add(jTBDevolucion);

        jToolBar1.add(jTBRegistros);

        jBCaja.setBackground(new java.awt.Color(255, 255, 255));
        jBCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMAGENES/caja.png"))); // NOI18N
        jBCaja.setFocusable(false);
        jBCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCajaActionPerformed(evt);
            }
        });
        jToolBar1.add(jBCaja);

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 51));

        jIFBuscarCliente.setClosable(true);
        jIFBuscarCliente.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFBuscarCliente.setResizable(true);
        jIFBuscarCliente.setTitle("Buscar Cliente");
        jIFBuscarCliente.setVisible(false);
        jIFBuscarCliente.setBounds(0, 0, 500, 325);

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTableClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jLabel5.setText("   Buscar por   ");
        jToolBar3.add(jLabel5);

        JCBCPor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBCPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "DNI", "Nombre" }));
        JCBCPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCPorActionPerformed(evt);
            }
        });
        jToolBar3.add(JCBCPor);

        jTCampoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCampoClienteActionPerformed(evt);
            }
        });
        jTCampoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCampoClienteKeyReleased(evt);
            }
        });
        jToolBar3.add(jTCampoCliente);

        jBBCAceptar.setText("Aceptar");
        jBBCAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBCAceptarActionPerformed(evt);
            }
        });

        jBBCAceptar1.setText("Aceptar");
        jBBCAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBCAceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jIFBuscarClienteLayout = new javax.swing.GroupLayout(jIFBuscarCliente.getContentPane());
        jIFBuscarCliente.getContentPane().setLayout(jIFBuscarClienteLayout);
        jIFBuscarClienteLayout.setHorizontalGroup(
            jIFBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFBuscarClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jIFBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBBCAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBCAceptar1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jIFBuscarClienteLayout.setVerticalGroup(
            jIFBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFBuscarClienteLayout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jBBCAceptar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBCAceptar)
                .addContainerGap())
        );

        jIFBuscarCliente.setBounds(0, 0, 484, 360);
        jDesktopPane1.add(jIFBuscarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFBuscarPeliculas.setClosable(true);
        jIFBuscarPeliculas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFBuscarPeliculas.setResizable(true);
        jIFBuscarPeliculas.setTitle("Buscar Película");
        jIFBuscarPeliculas.setVisible(false);

        jScrollPane2.setBorder(null);

        jTbPeliculas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTbPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Autor", "Genero", "Formato", "Title 6", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbPeliculasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbPeliculas);

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);

        jLabel6.setText("   Buscar por   ");
        jToolBar4.add(jLabel6);

        JCBPPor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBPPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Título", "Autor" }));
        JCBPPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBPPorActionPerformed(evt);
            }
        });
        jToolBar4.add(JCBPPor);

        jTCampoPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCampoPeliculaActionPerformed(evt);
            }
        });
        jTCampoPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCampoPeliculaKeyReleased(evt);
            }
        });
        jToolBar4.add(jTCampoPelicula);

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        jLabel13.setText("   Filtrar por   ");
        jToolBar5.add(jLabel13);

        jLabel15.setText(" género   ");
        jToolBar5.add(jLabel15);

        jCBuscarPGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Acción", "Animación", "Aventuras", "Ciencia ficción", "Documental", "Musical", "Suspenso", "Terror", "Thriller" }));
        jCBuscarPGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBuscarPGeneroActionPerformed(evt);
            }
        });
        jToolBar5.add(jCBuscarPGenero);

        jLabel16.setText("   Formato   ");
        jToolBar5.add(jLabel16);

        jCBuscarPFormato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "BluRay", "DVD", "VHS" }));
        jCBuscarPFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBuscarPFormatoActionPerformed(evt);
            }
        });
        jToolBar5.add(jCBuscarPFormato);

        jBBPAceptar.setText("Aceptar");
        jBBPAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBPAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jIFBuscarPeliculasLayout = new javax.swing.GroupLayout(jIFBuscarPeliculas.getContentPane());
        jIFBuscarPeliculas.getContentPane().setLayout(jIFBuscarPeliculasLayout);
        jIFBuscarPeliculasLayout.setHorizontalGroup(
            jIFBuscarPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFBuscarPeliculasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBBPAceptar)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jIFBuscarPeliculasLayout.setVerticalGroup(
            jIFBuscarPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFBuscarPeliculasLayout.createSequentialGroup()
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBPAceptar))
        );

        jIFBuscarPeliculas.setBounds(0, 0, 386, 318);
        jDesktopPane1.add(jIFBuscarPeliculas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFNuevaPelicula.setClosable(true);
        jIFNuevaPelicula.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFNuevaPelicula.setResizable(true);
        jIFNuevaPelicula.setTitle("Pelicula Nueva");
        jIFNuevaPelicula.setVisible(false);

        jLabel7.setText("Título");

        jTNPTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNPTituloActionPerformed(evt);
            }
        });

        jLabel8.setText("Autor");

        jLabel9.setText("Género");

        jLabel10.setText("Formato");

        jCNPFormato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BluRay", "DVD", "VHS" }));
        jCNPFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNPFormatoActionPerformed(evt);
            }
        });

        jLabel11.setText("Cantidad");

        jCNPGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acción", "Animación", "Aventuras", "Ciencia ficción", "Documental", "Musical", "Suspenso", "Terror", "Thriller" }));

        JBNPAceptar.setText("Aceptar");
        JBNPAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNPAceptarActionPerformed(evt);
            }
        });

        JBNPCancelar.setText("Cancelar");
        JBNPCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNPCancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Precio");

        jTNPPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNPPrecioKeyReleased(evt);
            }
        });

        jSEjemplares.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout jIFNuevaPeliculaLayout = new javax.swing.GroupLayout(jIFNuevaPelicula.getContentPane());
        jIFNuevaPelicula.getContentPane().setLayout(jIFNuevaPeliculaLayout);
        jIFNuevaPeliculaLayout.setHorizontalGroup(
            jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevaPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 43, Short.MAX_VALUE)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCNPGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCNPFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jIFNuevaPeliculaLayout.createSequentialGroup()
                            .addComponent(JBNPCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JBNPAceptar))
                        .addComponent(jTNPAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jIFNuevaPeliculaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JBNPAceptar, JBNPCancelar});

        jIFNuevaPeliculaLayout.setVerticalGroup(
            jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevaPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTNPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTNPAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCNPGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCNPFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jIFNuevaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNPCancelar)
                    .addComponent(JBNPAceptar))
                .addContainerGap())
        );

        jIFNuevaPelicula.setBounds(0, 0, 337, 326);
        jDesktopPane1.add(jIFNuevaPelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFNuevoRegistro.setClosable(true);
        jIFNuevoRegistro.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFNuevoRegistro.setResizable(true);
        jIFNuevoRegistro.setTitle("Registro Nuevo");
        jIFNuevoRegistro.setVisible(false);

        jScrollPane3.setViewportView(jLNRPeliculas);

        jLabel1.setText("Cliente");

        jLabel2.setText("Películas");

        jBNRAgregar.setText("Agregar");
        jBNRAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNRAgregarActionPerformed(evt);
            }
        });

        jBNRQuitar.setText("Quitar");
        jBNRQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNRQuitarActionPerformed(evt);
            }
        });

        jLabel3.setText("Total a Pagar");

        jTNRMonto.setFocusable(false);
        jTNRMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNRMontoActionPerformed(evt);
            }
        });

        jBNRAceptar.setText("Aceptar");
        jBNRAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNRAceptarActionPerformed(evt);
            }
        });

        jBNRCancelar.setText("Cancelar");
        jBNRCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNRCancelarActionPerformed(evt);
            }
        });

        jBNRBuscar.setText("Buscar");
        jBNRBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNRBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Multa Pendiente");

        jTNRMultaPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNRMultaPendienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jIFNuevoRegistroLayout = new javax.swing.GroupLayout(jIFNuevoRegistro.getContentPane());
        jIFNuevoRegistro.getContentPane().setLayout(jIFNuevoRegistroLayout);
        jIFNuevoRegistroLayout.setHorizontalGroup(
            jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNRMultaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                        .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                                .addComponent(jTNRMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBNRCancelar)
                                .addGap(0, 70, Short.MAX_VALUE))
                            .addComponent(jTNRCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBNRBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNRAgregar)
                            .addComponent(jBNRQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBNRAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jIFNuevoRegistroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBNRAceptar, jBNRAgregar, jBNRBuscar, jBNRCancelar, jBNRQuitar});

        jIFNuevoRegistroLayout.setVerticalGroup(
            jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNRCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBNRBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jIFNuevoRegistroLayout.createSequentialGroup()
                        .addComponent(jBNRAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNRQuitar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNRMultaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jIFNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNRMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBNRAceptar)
                    .addComponent(jBNRCancelar))
                .addContainerGap())
        );

        jIFNuevoRegistro.setBounds(0, 0, 414, 302);
        jDesktopPane1.add(jIFNuevoRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFNuevoCliente.setClosable(true);
        jIFNuevoCliente.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFNuevoCliente.setTitle("Cliente Nuevo");
        jIFNuevoCliente.setVisible(false);

        jLabel17.setText("Nombre");

        jTNCNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNCNombreActionPerformed(evt);
            }
        });

        jTNCDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNCDniKeyReleased(evt);
            }
        });

        jLabel18.setText("DNI");

        jLabel19.setText("Dirección");

        jBNCAceptar.setText("Aceptar");
        jBNCAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNCAceptarActionPerformed(evt);
            }
        });

        jBCNCancelar.setText("Cancelar");
        jBCNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCNCancelarActionPerformed(evt);
            }
        });

        jLabel22.setText("Telefono");

        jTNCTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNCTelefonoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jIFNuevoClienteLayout = new javax.swing.GroupLayout(jIFNuevoCliente.getContentPane());
        jIFNuevoCliente.getContentPane().setLayout(jIFNuevoClienteLayout);
        jIFNuevoClienteLayout.setHorizontalGroup(
            jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jIFNuevoClienteLayout.createSequentialGroup()
                            .addComponent(jBCNCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBNCAceptar))
                        .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTNCTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jTNCDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNCDni, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jIFNuevoClienteLayout.setVerticalGroup(
            jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTNCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTNCDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTNCDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNCTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCNCancelar)
                    .addComponent(jBNCAceptar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jIFNuevoCliente.setBounds(0, 0, 271, 190);
        jDesktopPane1.add(jIFNuevoCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFDevolucion.setClosable(true);
        jIFDevolucion.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFDevolucion.setTitle("Registros Pendientes");
        jIFDevolucion.setVisible(false);

        jScrollPane4.setBorder(null);

        jTbRegistrosPendientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTbRegistrosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Fecha de devolucion", "Peliculas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbRegistrosPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbRegistrosPendientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTbRegistrosPendientes);

        jToolBar6.setFloatable(false);
        jToolBar6.setRollover(true);

        jLabel14.setText("   Cliente   ");
        jToolBar6.add(jLabel14);

        jTFClientePendientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFClientePendientesKeyReleased(evt);
            }
        });
        jToolBar6.add(jTFClientePendientes);

        jBBuscarCliente.setText("   Buscar   ");
        jBBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscarCliente.setFocusable(false);
        jBBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarClienteActionPerformed(evt);
            }
        });
        jToolBar6.add(jBBuscarCliente);

        jBRPAceptar.setText("Aceptar");
        jBRPAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRPAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jIFDevolucionLayout = new javax.swing.GroupLayout(jIFDevolucion.getContentPane());
        jIFDevolucion.getContentPane().setLayout(jIFDevolucionLayout);
        jIFDevolucionLayout.setHorizontalGroup(
            jIFDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar6, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFDevolucionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBRPAceptar)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jIFDevolucionLayout.setVerticalGroup(
            jIFDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIFDevolucionLayout.createSequentialGroup()
                .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRPAceptar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jIFDevolucion.setBounds(0, 0, 419, 337);
        jDesktopPane1.add(jIFDevolucion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jIFCaja.setClosable(true);
        jIFCaja.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFCaja.setResizable(true);
        jIFCaja.setTitle("Caja");
        jIFCaja.setVisible(false);

        jBCMostrar.setText("Mostrar");
        jBCMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCMostrarActionPerformed(evt);
            }
        });

        jSfecha1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        jLabel20.setText("Desde");

        jLabel21.setText("Hasta");

        jTCAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCAlquilerActionPerformed(evt);
            }
        });

        jLabel23.setText("Alquiler");

        jLabel24.setText("Multas");

        jLabel25.setText("Total");

        jLabel26.setText("Mostrar Ingresos");

        jSfecha2.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jIFCajaLayout = new javax.swing.GroupLayout(jIFCaja.getContentPane());
        jIFCaja.getContentPane().setLayout(jIFCajaLayout);
        jIFCajaLayout.setHorizontalGroup(
            jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBCMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jIFCajaLayout.createSequentialGroup()
                            .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25)
                                .addComponent(jLabel21))
                            .addGap(29, 29, 29)
                            .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTCAlquiler)
                                .addComponent(jTCMultas)
                                .addComponent(jTCTotal)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jIFCajaLayout.setVerticalGroup(
            jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jSfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCMultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIFCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jIFCaja.setBounds(20, 30, 210, 220);
        jDesktopPane1.add(jIFCaja, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPeliculasActionPerformed
        jTBRegistros.setVisible(false);
        jTBCliente.setVisible(false);
        jTBPelicula.setVisible(true);
    }//GEN-LAST:event_JBPeliculasActionPerformed

    private void jBRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrosActionPerformed
        jTBRegistros.setVisible(true);
        jTBPelicula.setVisible(false);
        jTBCliente.setVisible(false);
    }//GEN-LAST:event_jBRegistrosActionPerformed

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        jTBRegistros.setVisible(false);
        jTBPelicula.setVisible(false);
        jTBCliente.setVisible(true);

    }//GEN-LAST:event_JBClientesActionPerformed

    private void jBConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarClientesActionPerformed
        jIFBuscarCliente.setSize(500, 325);
        jIFBuscarCliente.setLocation(0, 0);
        jIFBuscarCliente.setVisible(true);
        jBBCAceptar.setVisible(false);
        jBBCAceptar1.setVisible(false);
        jIFBuscarCliente.setVisible(true);
    }//GEN-LAST:event_jBConsultarClientesActionPerformed

    private void JCBCPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCPorActionPerformed

    private void jTCampoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCampoClienteActionPerformed
    }//GEN-LAST:event_jTCampoClienteActionPerformed

    private void jTCampoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCampoClienteKeyReleased
        try {

            DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "DNI", "Nombre", "Direccion", "Telefono"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            TableRowSorter sorter = new TableRowSorter(modelo);
            switch (JCBCPor.getSelectedIndex()) {
                case 0: {
                    if (!jTCampoCliente.getText().equals("")) {
                        char ultimo = jTCampoCliente.getText().charAt(jTCampoCliente.getText().length() - 1);
                        if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                                || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                                || ultimo == '9' || ultimo == '0') {
                            ArrayList<Cliente> lista = BDClientes.buscarId(Integer.parseInt(jTCampoCliente.getText()));

                            for (Iterator<Cliente> it = lista.iterator(); it.hasNext();) {
                                Cliente c = it.next();
                                modelo.addRow(c.toArray());

                            }
                            jTableClientes.setModel(modelo);
                            jTableClientes.setRowSorter(sorter);
                        } else {
                            JOptionPane.showMessageDialog(this, "solo se pueden Insertar Numeros");
                            String numero = jTCampoCliente.getText();
                            jTCampoCliente.setText(numero.substring(0, numero.length() - 1));
                        }
                    }
                    break;
                }
                case 1: {

                    if (!jTCampoCliente.getText().equals("")) {
                        char ultimo = jTCampoCliente.getText().charAt(jTCampoCliente.getText().length() - 1);
                        if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                                || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                                || ultimo == '9' || ultimo == '0') {
                            ArrayList<Cliente> lista = BDClientes.buscarDni(Long.parseLong(jTCampoCliente.getText()));
                            for (Iterator<Cliente> it = lista.iterator(); it.hasNext();) {
                                Cliente c = it.next();
                                modelo.addRow(c.toArray());
                            }
                            jTableClientes.setModel(modelo);
                            jTableClientes.setRowSorter(sorter);
                        } else {
                            JOptionPane.showMessageDialog(this, "solo Se puede Insertar Numeros");
                            String numero = jTCampoCliente.getText();
                            jTCampoCliente.setText(numero.substring(0, numero.length() - 1));
                        }
                    }
                    break;
                }
                case 2: {
                    ArrayList<Cliente> lista = BDClientes.buscarNombre(jTCampoCliente.getText());

                    for (Iterator<Cliente> it = lista.iterator(); it.hasNext();) {
                        Cliente c = it.next();
                        modelo.addRow(c.toArray());
                    }
                    jTableClientes.setModel(modelo);
                    jTableClientes.setRowSorter(sorter);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jTCampoClienteKeyReleased

    private void JCBPPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBPPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBPPorActionPerformed

    private void jTCampoPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCampoPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCampoPeliculaActionPerformed

    private void jTCampoPeliculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCampoPeliculaKeyReleased
        try {
            DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Código", "Titulo", "Autor", "Genero", "Formato", "Precio", "Disponible"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            TableRowSorter sorter = new TableRowSorter(modelo);
            ArrayList<Pelicula> lista = null;
            switch (JCBPPor.getSelectedIndex()) {
                case 0: {
                    if (!jTCampoPelicula.getText().equals("")) {
                        char ultimo = jTCampoPelicula.getText().charAt(jTCampoPelicula.getText().length() - 1);
                        if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                                || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                                || ultimo == '9' || ultimo == '0') {
                            lista = BDPeliculas.buscarCodigo(Integer.parseInt(jTCampoPelicula.getText()));
                        } else {
                            JOptionPane.showMessageDialog(this, "solo se pueden Insertar Numeros");
                            String numero = jTCampoPelicula.getText();
                            jTCampoPelicula.setText(numero.substring(0, numero.length() - 1));
                        }
                    }
                    break;
                }
                case 1: {
                    lista = BDPeliculas.buscarTitulo(jTCampoPelicula.getText());
                    break;
                }
                case 2: {
                    lista = BDPeliculas.buscarPorAutor(jTCampoPelicula.getText());
                }
            }
            if (lista != null) {
                for (Iterator<Pelicula> it = lista.iterator(); it.hasNext();) {
                    Pelicula p = it.next();
                    if (jCBuscarPFormato.getSelectedIndex() == 0 && jCBuscarPGenero.getSelectedIndex() == 0) {
                        modelo.addRow(p.toArray());
                    } else if (jCBuscarPFormato.getSelectedIndex() == 0) {
                        if (p.getGenero().equals(jCBuscarPGenero.getSelectedItem())) {
                            modelo.addRow(p.toArray());
                        }
                    } else if (jCBuscarPGenero.getSelectedIndex() == 0) {
                        if (p.getFormato().equals((String) jCBuscarPFormato.getSelectedItem())) {
                            modelo.addRow(p.toArray());
                        }
                    } else {
                        if (p.getFormato().equals(jCBuscarPFormato.getSelectedItem())
                                && p.getGenero().equals(jCBuscarPGenero.getSelectedItem())) {
                            modelo.addRow(p.toArray());
                        }
                    }
                }
            }

            jTbPeliculas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table,
                        Object value,
                        boolean isSelected,
                        boolean hasFocus,
                        int row,
                        int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setBackground(Color.white);
                    table.setForeground(Color.black);
                    if (jTbPeliculas.getValueAt(row, 6) != null) {
                        if (jTbPeliculas.getValueAt(row, 6).equals(false)) {
                            this.setOpaque(true);
                            this.setBackground(Color.ORANGE);
                        }
                    }
                    return this;
                }
            });
            jTbPeliculas.setModel(modelo);
            jTbPeliculas.setRowSorter(sorter);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (NotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (NullPointerException ex) {
        }
    }//GEN-LAST:event_jTCampoPeliculaKeyReleased

    private void jCBuscarPFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBuscarPFormatoActionPerformed
        jTCampoPeliculaKeyReleased(null);
    }//GEN-LAST:event_jCBuscarPFormatoActionPerformed

    private void jCBuscarPGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBuscarPGeneroActionPerformed
        jTCampoPeliculaKeyReleased(null);
    }//GEN-LAST:event_jCBuscarPGeneroActionPerformed

    private void JBNPAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNPAceptarActionPerformed
        try {
            Pelicula p = new Pelicula(jCNPGenero.getSelectedItem().toString(),
                    jTNPTitulo.getText(), jCNPFormato.getSelectedItem().toString(),
                    jTNPAutor.getText(), (Integer) jSEjemplares.getValue(),
                    Float.parseFloat(jTNPPrecio.getText()));
            BDPeliculas.insertar(p);
            JOptionPane.showMessageDialog(this, "La Pelicula se ha Guardado\nCorrectamente");
            jTNPAutor.setText(null);
            jTNPTitulo.setText(null);
            jTNPPrecio.setText(null);
            jCNPFormato.setSelectedIndex(0);
            jCNPGenero.setSelectedIndex(0);
            jSEjemplares.setValue(0);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_JBNPAceptarActionPerformed

    private void jCNPFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNPFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCNPFormatoActionPerformed

    private void jTNPTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNPTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNPTituloActionPerformed

    private void jTNCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNCNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNCNombreActionPerformed

    private void jBNCAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNCAceptarActionPerformed
        try {
            Cliente c = new Cliente(Long.parseLong(jTNCDni.getText()), jTNCNombre.getText(), Long.parseLong(jTNCTelefono.getText()), jTNCDireccion.getText());
            BDClientes.insertar(c);
            JOptionPane.showMessageDialog(this, "Cliente Creado correctamente");
            jTNCDireccion.setText(null);
            jTNCDni.setText(null);
            jTNCNombre.setText(null);
            jTNCTelefono.setText(null);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBNCAceptarActionPerformed

    private void jTNCDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNCDniKeyReleased
        if (!jTNCDni.getText().equals("")) {
            char ultimo = jTNCDni.getText().charAt(jTNCDni.getText().length() - 1);
            if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                    || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                    || ultimo == '9' || ultimo == '0') {
            } else {
                JOptionPane.showMessageDialog(this, "solo se pueden Insertar Numeros");
                String numero = jTNCDni.getText();
                jTNCDni.setText(numero.substring(0, numero.length() - 1));
            }
        }
    }//GEN-LAST:event_jTNCDniKeyReleased

    private void jTNCTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNCTelefonoKeyReleased
        if (!jTNCTelefono.getText().equals("")) {

            char ultimo = jTNCTelefono.getText().charAt(jTNCTelefono.getText().length() - 1);
            if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                    || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                    || ultimo == '9' || ultimo == '0') {
            } else {
                JOptionPane.showMessageDialog(this, "solo se pueden Insertar Numeros");
                String numero = jTNCTelefono.getText();
                jTNCTelefono.setText(numero.substring(0, numero.length() - 1));
            }
        }
    }//GEN-LAST:event_jTNCTelefonoKeyReleased

    private void jBCNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCNCancelarActionPerformed
        jTNCDireccion.setText(null);
        jTNCDni.setText(null);
        jTNCNombre.setText(null);
        jTNCTelefono.setText(null);
        jIFNuevoCliente.setVisible(false);
    }//GEN-LAST:event_jBCNCancelarActionPerformed

    private void jTNPPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNPPrecioKeyReleased
        char ultimo = jTNPPrecio.getText().charAt(jTNPPrecio.getText().length() - 1);
        if (ultimo == '1' || ultimo == '2' || ultimo == '3' || ultimo == '4'
                || ultimo == '5' || ultimo == '6' || ultimo == '7' || ultimo == '8'
                || ultimo == '9' || ultimo == '0' || ultimo == '.') {
        } else {
            JOptionPane.showMessageDialog(this, "solo se pueden Insertar Numeros");
            String numero = jTNCTelefono.getText();
            jTNCTelefono.setText(numero.substring(0, numero.length() - 1));
        }
    }//GEN-LAST:event_jTNPPrecioKeyReleased

    private void JBNPCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNPCancelarActionPerformed
        jTNPAutor.setText(null);
        jTNPTitulo.setText(null);
        jTNPPrecio.setText(null);
        jCNPFormato.setSelectedIndex(0);
        jCNPGenero.setSelectedIndex(0);
        jSEjemplares.setValue(0);
        jIFNuevaPelicula.setVisible(false);
    }//GEN-LAST:event_JBNPCancelarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        try {
            int fila = jTableClientes.getSelectedRow();
            Integer id = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            cliente = BDClientes.buscarPorId(id);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jBBCAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBCAceptarActionPerformed
        try {
            registro = new Registro(cliente.getId(), Calendario.getFecha());
            int fila = jTableClientes.getSelectedRow();
            Integer id = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            cliente = BDClientes.buscarPorId(id);
            registro.agregarCliente(cliente.getId());
            jTNRCliente.setText(cliente.toString());
            jIFBuscarCliente.setVisible(false);
            jBBCAceptar.setVisible(false);
            jBBCAceptar1.setVisible(false);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBBCAceptarActionPerformed

    private void jTbPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPeliculasMouseClicked
        try {
            int fila = jTbPeliculas.getSelectedRow();
            Integer codigo = Integer.parseInt(jTbPeliculas.getValueAt(fila, 0).toString());
            pelicula = BDPeliculas.buscarPorCodigo(codigo);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jTbPeliculasMouseClicked

    private void jBBPAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBPAceptarActionPerformed
        try {
            if (pelicula.disponible()) {
                registro.agregarPelicula(pelicula);
                jLNRPeliculas.setListData(registro.ArrayPeliculasString());
                registro.calcularMonto();
                Float multaPendiete = BDClientes.buscarPorId(registro.getCliente()).getMultaPendiente();
                jTNRMultaPendiente.setText(multaPendiete.toString());
                Float monto = registro.getMonto();
                Float total = (monto + multaPendiete);
                jTNRMonto.setText(total.toString());
                jBBPAceptar.setVisible(false);
                jIFBuscarPeliculas.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "la pelicula no esta disponible");
            }
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jBBPAceptarActionPerformed

    private void jTNRMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNRMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNRMontoActionPerformed

    private void jBNRBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNRBuscarActionPerformed
        jBBCAceptar.setVisible(true);
        jBBCAceptar1.setVisible(false);
        jIFBuscarCliente.setVisible(true);
        jIFBuscarCliente.setLocation(0, 270);
        jIFBuscarCliente.setSize(500, 325);
    }//GEN-LAST:event_jBNRBuscarActionPerformed

    private void jBNRAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNRAgregarActionPerformed
        jBBPAceptar.setVisible(true);
        jIFBuscarPeliculas.setVisible(true);
        jIFBuscarPeliculas.setLocation(0, 270);
        jIFBuscarPeliculas.setSize(500, 325);
    }//GEN-LAST:event_jBNRAgregarActionPerformed

    private void jBNRAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNRAceptarActionPerformed
        try {
            registro.guardar();
            registro.alquilado();
            Caja.pagarAlquiler(registro);
            jTNRCliente.setText("");
            jTNRMonto.setText("");
            Object[] obj = {"", "", ""};
            jLNRPeliculas.setListData(obj);


        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jBNRAceptarActionPerformed

    private void jBNRQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNRQuitarActionPerformed
        try {
            int i = jLNRPeliculas.getSelectedIndex();
            registro.quitarPelicula(i);
            jLNRPeliculas.setListData(registro.ArrayPeliculasString());
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBNRQuitarActionPerformed

    private void jBNRCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNRCancelarActionPerformed
        jTNRCliente.setText("");
        jTNRMonto.setText("");
        Object[] obj = {"", "", ""};
        jLNRPeliculas.setListData(obj);
        jIFNuevoRegistro.setVisible(false);
    }//GEN-LAST:event_jBNRCancelarActionPerformed

    private void JBConsultarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultarPeliculaActionPerformed
        jIFBuscarPeliculas.setSize(500, 325);
        jIFBuscarPeliculas.setLocation(0, 0);
        jIFBuscarPeliculas.setVisible(true);
        jBBPAceptar.setVisible(false);
        jIFBuscarPeliculas.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_JBConsultarPeliculaActionPerformed

    private void jBNuevaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaPeliculaActionPerformed
        jIFNuevaPelicula.setSize(280, 240);
        jIFNuevaPelicula.setLocation(0, 0);
        jIFNuevaPelicula.setVisible(true);
    }//GEN-LAST:event_jBNuevaPeliculaActionPerformed

    private void jBNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoClienteActionPerformed
        jIFNuevoCliente.setSize(280, 182);
        jIFNuevoCliente.setLocation(0, 0);
        jIFNuevoCliente.setVisible(true);
    }//GEN-LAST:event_jBNuevoClienteActionPerformed

    private void jBCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCajaActionPerformed
        jIFCaja.setVisible(true);
        jTBPelicula.setVisible(false);
        jTBCliente.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jBCajaActionPerformed

    private void jBAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlquilerActionPerformed
        jIFNuevoRegistro.setSize(500, 300);
        jIFNuevoRegistro.setLocation(0, 0);
        jIFNuevoRegistro.setVisible(true);
    }//GEN-LAST:event_jBAlquilerActionPerformed

    private void jTbRegistrosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbRegistrosPendientesMouseClicked
        try {

            int fila = jTbRegistrosPendientes.getSelectedRow();
            Integer id = Integer.parseInt(jTbRegistrosPendientes.getValueAt(fila, 0).toString());
            registro = BDRegistros.buscarPorId(id);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jTbRegistrosPendientesMouseClicked

    private void jBRPAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRPAceptarActionPerformed
        try {
            cliente = BDClientes.buscarPorId(registro.getCliente());
            if (registro.getMulta()) {
                Object seleccion = JOptionPane.showInputDialog(
                        jIFDevolucion,
                        "El cliente debe pagar una multa de\n"+registro.getMontoMulta(),
                        "¿que desea hacer?",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Pagar ahora", "Pagar con proximo alquiler"},
                        "Pagar ahora");
                if (seleccion.equals("Pagar con proximo alquiler")) {
                    registro.multaPendiente();
                }
                if (seleccion.equals("Pagar ahora")) {
                    Caja.pagarMulta(registro);
                }
            }
            registro.devuelto();
            JOptionPane.showMessageDialog(this, "devolucion correcta");
            cargarPendientes();
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBRPAceptarActionPerformed

    private void jBBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarClienteActionPerformed
        jBBCAceptar.setVisible(false);
        jBBCAceptar1.setVisible(true);
        jIFBuscarCliente.setVisible(true);
        jIFBuscarCliente.setLocation(0, 270);
        jIFBuscarCliente.setSize(500, 325);
    }//GEN-LAST:event_jBBuscarClienteActionPerformed

    private void jTFClientePendientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFClientePendientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFClientePendientesKeyReleased

    private void jBBCAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBCAceptar1ActionPerformed
        try {
            DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "Cliente", "Fecha de devolución", "películas"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            TableRowSorter sorter = new TableRowSorter(modelo);
            ArrayList<Registro> lista = BDRegistros.buscarPendientesDe(cliente);
            for (Iterator<Registro> it = lista.iterator(); it.hasNext();) {
                Registro r = it.next();
                modelo.addRow(r.toArray());
            }
            jTbRegistrosPendientes.setModel(modelo);
            jTbRegistrosPendientes.setRowSorter(sorter);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_jBBCAceptar1ActionPerformed

    private void jTBDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBDevolucionActionPerformed
        cargarPendientes();
        jIFDevolucion.setSize(500, 325);
        jIFDevolucion.setLocation(0, 0);
        jIFDevolucion.setVisible(true);
    }//GEN-LAST:event_jTBDevolucionActionPerformed

    private void jTNRMultaPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNRMultaPendienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNRMultaPendienteActionPerformed

    private void jTCAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCAlquilerActionPerformed

    private void jBCMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCMostrarActionPerformed
        String sfecha1 = jSfecha1.getValue().toString();
        String sfecha2 = jSfecha2.getValue().toString();
        Date fecha1 = Calendario.getFechaSpinner(sfecha1);
        Date fecha2 = Calendario.getFechaSpinner(sfecha1);
        try {
            jTCAlquiler.setText(Caja.aquiler(fecha2, fecha1).toString());
            jTCMultas.setText(Caja.multa(fecha2, fecha1).toString());
            jTCTotal.setText(Caja.total(fecha2, fecha1).toString());
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBCMostrarActionPerformed
    private void cargarPendientes() {
        try {
            DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "Cliente", "Fecha de devolución", "películas"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            TableRowSorter sorter = new TableRowSorter(modelo);
            ArrayList<Registro> lista = BDRegistros.PendienteDevolucion();
            for (Iterator<Registro> it = lista.iterator(); it.hasNext();) {
                Registro r = it.next();
                modelo.addRow(r.toArray());
            }
            jTbRegistrosPendientes.setModel(modelo);
            jTbRegistrosPendientes.setRowSorter(sorter);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (NotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }



    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBClientes;
    private javax.swing.JButton JBConsultarPelicula;
    private javax.swing.JButton JBNPAceptar;
    private javax.swing.JButton JBNPCancelar;
    private javax.swing.JButton JBPeliculas;
    private javax.swing.JComboBox JCBCPor;
    private javax.swing.JComboBox JCBPPor;
    private javax.swing.JButton jBAlquiler;
    private javax.swing.JButton jBBCAceptar;
    private javax.swing.JButton jBBCAceptar1;
    private javax.swing.JButton jBBPAceptar;
    private javax.swing.JButton jBBuscarCliente;
    private javax.swing.JButton jBCMostrar;
    private javax.swing.JButton jBCNCancelar;
    private javax.swing.JButton jBCaja;
    private javax.swing.JButton jBConsultarClientes;
    private javax.swing.JButton jBNCAceptar;
    private javax.swing.JButton jBNRAceptar;
    private javax.swing.JButton jBNRAgregar;
    private javax.swing.JButton jBNRBuscar;
    private javax.swing.JButton jBNRCancelar;
    private javax.swing.JButton jBNRQuitar;
    private javax.swing.JButton jBNuevaPelicula;
    private javax.swing.JButton jBNuevoCliente;
    private javax.swing.JButton jBRPAceptar;
    private javax.swing.JButton jBRegistros;
    private javax.swing.JComboBox jCBuscarPFormato;
    private javax.swing.JComboBox jCBuscarPGenero;
    private javax.swing.JComboBox jCNPFormato;
    private javax.swing.JComboBox jCNPGenero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jIFBuscarCliente;
    private javax.swing.JInternalFrame jIFBuscarPeliculas;
    private javax.swing.JInternalFrame jIFCaja;
    private javax.swing.JInternalFrame jIFDevolucion;
    private javax.swing.JInternalFrame jIFNuevaPelicula;
    private javax.swing.JInternalFrame jIFNuevoCliente;
    private javax.swing.JInternalFrame jIFNuevoRegistro;
    private javax.swing.JList jLNRPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSEjemplares;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSfecha1;
    private javax.swing.JSpinner jSfecha2;
    private javax.swing.JToolBar jTBCliente;
    private javax.swing.JButton jTBDevolucion;
    private javax.swing.JToolBar jTBPelicula;
    private javax.swing.JToolBar jTBRegistros;
    private javax.swing.JTextField jTCAlquiler;
    private javax.swing.JTextField jTCMultas;
    private javax.swing.JTextField jTCTotal;
    private javax.swing.JTextField jTCampoCliente;
    private javax.swing.JTextField jTCampoPelicula;
    private javax.swing.JTextField jTFClientePendientes;
    private javax.swing.JTextField jTNCDireccion;
    private javax.swing.JTextField jTNCDni;
    private javax.swing.JTextField jTNCNombre;
    private javax.swing.JTextField jTNCTelefono;
    private javax.swing.JTextField jTNPAutor;
    private javax.swing.JTextField jTNPPrecio;
    private javax.swing.JTextField jTNPTitulo;
    private javax.swing.JTextField jTNRCliente;
    private javax.swing.JTextField jTNRMonto;
    private javax.swing.JTextField jTNRMultaPendiente;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTbPeliculas;
    private javax.swing.JTable jTbRegistrosPendientes;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    // End of variables declaration//GEN-END:variables
    private Cliente cliente;
    private Pelicula pelicula;
    private Registro registro;
//    private void ocultarVEntanas() {
//        jIFBuscarCliente.setVisible(false);
//        jIFBuscarPeliculas.setVisible(false);
//        jIFNuevaPelicula.setVisible(false);
//        jIFNuevoCliente.setVisible(false);
//        jIFNuevoRegistro.setVisible(false);
//    }
}
