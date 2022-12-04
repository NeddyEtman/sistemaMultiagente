
package Views;

import Controllers.BaseControllers;
import Controllers.DatosControllers;
import Controllers.Datos1Controllers;
import Controllers.ConfigControllers;
import Controllers.UsuariosControllers;
import Models.Base;
import Models.BaseDao;
import Models.Datos;
import Models.Datos1;
import Models.DatosDao;
import Models.DatosDao1;
import Models.UsuarioDao;
import Models.Usuarios;


public class PanelAdmin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuarioDao usDao = new UsuarioDao();
    Datos dt = new Datos(); //Viene de clientes
    Datos1 dt1 = new Datos1();
    DatosDao dtDao = new DatosDao();//Viene de clientes
    DatosDao1 dtDao1 = new DatosDao1();
    Base bs = new Base();
    BaseDao bsDao= new BaseDao();
        
    public PanelAdmin() {
        initComponents();
        this.setLocationRelativeTo(null); 
        ConfigControllers config = new ConfigControllers(this);
        UsuariosControllers users = new UsuariosControllers(us, usDao, this);
        DatosControllers dato = new DatosControllers(dt, dtDao, this);//Viene de clientes
        Datos1Controllers dato1 = new Datos1Controllers(dt1, dtDao1, this);
        BaseControllers base = new BaseControllers(bs, bsDao, this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupUsuarios = new javax.swing.JPopupMenu();
        JMenuEliminarUsers = new javax.swing.JMenuItem();
        JMenuReingresarUser = new javax.swing.JMenuItem();
        jPopupAduana = new javax.swing.JPopupMenu();
        JMenuEliminarAduana = new javax.swing.JMenuItem();
        JMenuModificarAduana = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        JPanelInfoGene = new javax.swing.JPanel();
        JLabelInfoGeneral = new javax.swing.JLabel();
        JPanelAnalisisDescriptivo = new javax.swing.JPanel();
        JLabelAnalisisDescriptivo = new javax.swing.JLabel();
        JPanelAnalisisPredictivo = new javax.swing.JPanel();
        JLabelAnalisisPredictivo = new javax.swing.JLabel();
        JPanelIngresoDatos = new javax.swing.JPanel();
        JLabelIngresoBD = new javax.swing.JLabel();
        JPanelProveedores = new javax.swing.JPanel();
        JLabelUsuarios = new javax.swing.JLabel();
        JPanelMedidas = new javax.swing.JPanel();
        JLabelNotificaciones = new javax.swing.JLabel();
        JPanelConfig = new javax.swing.JPanel();
        JLabelConfig = new javax.swing.JLabel();
        JPanelUsers = new javax.swing.JPanel();
        JLabelUsers = new javax.swing.JLabel();
        JPanelSalir = new javax.swing.JPanel();
        JLabelSalir = new javax.swing.JLabel();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        PaginadoUser = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUser = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsuarioUser = new javax.swing.JTextField();
        txtNombreUser = new javax.swing.JTextField();
        cbxCajaUser = new javax.swing.JComboBox<>();
        cbxRolUser = new javax.swing.JComboBox<>();
        btnNuevoUser = new javax.swing.JButton();
        btnRegistrarUser = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        txtClaveUser = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        txtBuscarUsers = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRUs = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtGestionRUs = new javax.swing.JTextField();
        txtNandinaRUs = new javax.swing.JTextField();
        btnNuevoRUs = new javax.swing.JButton();
        btnRegistrarRUs = new javax.swing.JButton();
        btnModificarRUs = new javax.swing.JButton();
        txtIdRUs = new javax.swing.JTextField();
        txtBuscarRUs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAduanaRus = new javax.swing.JTextField();
        txtDeptoRUs = new javax.swing.JTextField();
        txtViaRUs = new javax.swing.JTextField();
        txtMedioRUs = new javax.swing.JTextField();
        txtPaisRUs = new javax.swing.JTextField();
        txtMesRUs = new javax.swing.JTextField();
        txtKilosRUs = new javax.swing.JTextField();
        txtFobRUs = new javax.swing.JTextField();
        txtAduRUs = new javax.swing.JTextField();
        txtCusiRus = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtIdentRUs = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableRUs1 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtGestionRUs1 = new javax.swing.JTextField();
        txtNandinaRUs1 = new javax.swing.JTextField();
        btnNuevoRUs1 = new javax.swing.JButton();
        btnRegistrarRUs1 = new javax.swing.JButton();
        btnModificarRUs1 = new javax.swing.JButton();
        txtIdRUs1 = new javax.swing.JTextField();
        txtBuscarRUs1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtAduanaRus1 = new javax.swing.JTextField();
        txtDeptoRUs1 = new javax.swing.JTextField();
        txtViaRUs1 = new javax.swing.JTextField();
        txtMedioRUs1 = new javax.swing.JTextField();
        txtPaisRUs1 = new javax.swing.JTextField();
        txtMesRUs1 = new javax.swing.JTextField();
        txtKilosRUs1 = new javax.swing.JTextField();
        txtFobRUs1 = new javax.swing.JTextField();
        txtAduRUs1 = new javax.swing.JTextField();
        txtCusiRus1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtIdentRUs1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaBase = new javax.swing.JTable();
        jLabelNoti = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtIdBas = new javax.swing.JTextField();
        txtNandinaBas = new javax.swing.JTextField();
        btnNuevoBas = new javax.swing.JButton();
        btnRegistrarBas = new javax.swing.JButton();
        btnModificarBas = new javax.swing.JButton();
        txtBuscarBas = new javax.swing.JTextField();
        txtComentarioBas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        JMenuEliminarUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarUsers.setText("Eliminar");
        JPopupUsuarios.add(JMenuEliminarUsers);

        JMenuReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarUser.setText("Reingresar");
        JPopupUsuarios.add(JMenuReingresarUser);

        JMenuEliminarAduana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarAduana.setText("Eliminar");
        jPopupAduana.add(JMenuEliminarAduana);

        JMenuModificarAduana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuModificarAduana.setText("Reingresar");
        jPopupAduana.add(JMenuModificarAduana);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 95, 85));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelInfoGene.setBackground(new java.awt.Color(254, 95, 85));

        JLabelInfoGeneral.setBackground(new java.awt.Color(254, 95, 85));
        JLabelInfoGeneral.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelInfoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        JLabelInfoGeneral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelInfoGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/informacion.png"))); // NOI18N
        JLabelInfoGeneral.setText("Informacion General");
        JLabelInfoGeneral.setToolTipText("");
        JLabelInfoGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelInfoGeneLayout = new javax.swing.GroupLayout(JPanelInfoGene);
        JPanelInfoGene.setLayout(JPanelInfoGeneLayout);
        JPanelInfoGeneLayout.setHorizontalGroup(
            JPanelInfoGeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelInfoGeneLayout.setVerticalGroup(
            JPanelInfoGeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelInfoGene, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        JPanelAnalisisDescriptivo.setBackground(new java.awt.Color(254, 95, 85));

        JLabelAnalisisDescriptivo.setBackground(new java.awt.Color(254, 95, 85));
        JLabelAnalisisDescriptivo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelAnalisisDescriptivo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAnalisisDescriptivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelAnalisisDescriptivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/almacenamiento-de-base-de-datos.png"))); // NOI18N
        JLabelAnalisisDescriptivo.setText("Base de Datos");
        JLabelAnalisisDescriptivo.setToolTipText("");
        JLabelAnalisisDescriptivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelAnalisisDescriptivoLayout = new javax.swing.GroupLayout(JPanelAnalisisDescriptivo);
        JPanelAnalisisDescriptivo.setLayout(JPanelAnalisisDescriptivoLayout);
        JPanelAnalisisDescriptivoLayout.setHorizontalGroup(
            JPanelAnalisisDescriptivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisDescriptivo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelAnalisisDescriptivoLayout.setVerticalGroup(
            JPanelAnalisisDescriptivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisDescriptivo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelAnalisisDescriptivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        JPanelAnalisisPredictivo.setBackground(new java.awt.Color(254, 95, 85));

        JLabelAnalisisPredictivo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelAnalisisPredictivo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAnalisisPredictivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelAnalisisPredictivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/almacenamiento-de-base-de-datos_1.png"))); // NOI18N
        JLabelAnalisisPredictivo.setText("Base de Datos 2");
        JLabelAnalisisPredictivo.setToolTipText("");
        JLabelAnalisisPredictivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelAnalisisPredictivoLayout = new javax.swing.GroupLayout(JPanelAnalisisPredictivo);
        JPanelAnalisisPredictivo.setLayout(JPanelAnalisisPredictivoLayout);
        JPanelAnalisisPredictivoLayout.setHorizontalGroup(
            JPanelAnalisisPredictivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisPredictivo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelAnalisisPredictivoLayout.setVerticalGroup(
            JPanelAnalisisPredictivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisPredictivo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelAnalisisPredictivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        JPanelIngresoDatos.setBackground(new java.awt.Color(254, 95, 85));

        JLabelIngresoBD.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelIngresoBD.setForeground(new java.awt.Color(255, 255, 255));
        JLabelIngresoBD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelIngresoBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        JLabelIngresoBD.setText("  Notificaciones");
        JLabelIngresoBD.setToolTipText("");
        JLabelIngresoBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelIngresoDatosLayout = new javax.swing.GroupLayout(JPanelIngresoDatos);
        JPanelIngresoDatos.setLayout(JPanelIngresoDatosLayout);
        JPanelIngresoDatosLayout.setHorizontalGroup(
            JPanelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelIngresoBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelIngresoDatosLayout.setVerticalGroup(
            JPanelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelIngresoBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelIngresoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        JPanelProveedores.setBackground(new java.awt.Color(254, 95, 85));

        JLabelUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users.png"))); // NOI18N
        JLabelUsuarios.setText("  Usuarios");
        JLabelUsuarios.setToolTipText("");
        JLabelUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProveedoresLayout = new javax.swing.GroupLayout(JPanelProveedores);
        JPanelProveedores.setLayout(JPanelProveedoresLayout);
        JPanelProveedoresLayout.setHorizontalGroup(
            JPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProveedoresLayout.setVerticalGroup(
            JPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        JPanelMedidas.setBackground(new java.awt.Color(254, 95, 85));

        JLabelNotificaciones.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelNotificaciones.setToolTipText("");
        JLabelNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelMedidasLayout = new javax.swing.GroupLayout(JPanelMedidas);
        JPanelMedidas.setLayout(JPanelMedidasLayout);
        JPanelMedidasLayout.setHorizontalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelMedidasLayout.setVerticalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        JPanelConfig.setBackground(new java.awt.Color(254, 95, 85));

        JLabelConfig.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        JLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelConfig.setToolTipText("");
        JLabelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelConfigLayout = new javax.swing.GroupLayout(JPanelConfig);
        JPanelConfig.setLayout(JPanelConfigLayout);
        JPanelConfigLayout.setHorizontalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelConfigLayout.setVerticalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        JPanelUsers.setBackground(new java.awt.Color(254, 95, 85));

        JLabelUsers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelUsers.setToolTipText("");
        JLabelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelUsersLayout = new javax.swing.GroupLayout(JPanelUsers);
        JPanelUsers.setLayout(JPanelUsersLayout);
        JPanelUsersLayout.setHorizontalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelUsersLayout.setVerticalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        JPanelSalir.setBackground(new java.awt.Color(254, 95, 85));

        JLabelSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        JLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        JLabelSalir.setText("Salir");
        JLabelSalir.setToolTipText("");
        JLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelSalirLayout = new javax.swing.GroupLayout(JPanelSalir);
        JPanelSalir.setLayout(JPanelSalirLayout);
        JPanelSalirLayout.setHorizontalGroup(
            JPanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelSalirLayout.setVerticalGroup(
            JPanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 540));

        jPanel9.setBackground(new java.awt.Color(189, 213, 234));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(247, 247, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(120, 100));

        jButton5.setBackground(new java.awt.Color(189, 213, 234));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PERFILES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 120, 110));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jButton2.setBackground(new java.awt.Color(87, 115, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DESCRIPTIVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, 110));

        jPanel13.setBackground(new java.awt.Color(102, 102, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(120, 100));

        jButton6.setBackground(new java.awt.Color(189, 213, 234));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("NOTIFICACIONES 2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 120, 110));

        jPanel14.setBackground(new java.awt.Color(255, 153, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(120, 100));

        jButton4.setBackground(new java.awt.Color(87, 115, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INFORMACIÓN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, 110));

        jPanel15.setBackground(new java.awt.Color(255, 153, 0));
        jPanel15.setPreferredSize(new java.awt.Dimension(120, 100));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(87, 115, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PREDICTIVO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel32)
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, 110));

        jButton1.setBackground(new java.awt.Color(254, 95, 85));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(247, 247, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 120, 108));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FONDO2.jpg"))); // NOI18N
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 600, 460));

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 510));

        jTabbedPane12.addTab("Principal", jPanel9);

        jPanel8.setBackground(new java.awt.Color(189, 213, 234));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaginadoUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(PaginadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 760, 90));

        TableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Rol", "Caja", "Estado"
            }
        ));
        TableUser.setComponentPopupMenu(JPopupUsuarios);
        TableUser.setRowHeight(20);
        jScrollPane2.setViewportView(TableUser);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 760, 390));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Usuario");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Contrasena");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Departamento");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Id");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));
        jPanel10.add(txtUsuarioUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, 30));
        jPanel10.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        cbxCajaUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General" }));
        jPanel10.add(cbxCajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 180, 30));

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));
        jPanel10.add(cbxRolUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, 30));

        btnNuevoUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNuevoUser.setText("Nuevo");
        jPanel10.add(btnNuevoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 420, 100, 30));

        btnRegistrarUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistrarUser.setText("Registrar");
        jPanel10.add(btnRegistrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 420, 100, 30));

        btnModificarUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnModificarUser.setText("Modificar");
        jPanel10.add(btnModificarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 420, 100, 30));
        jPanel10.add(txtClaveUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 30));
        jPanel10.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 30));
        jPanel10.add(txtBuscarUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 180, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setText("Rol");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 490));

        jTabbedPane12.addTab("Usuarios", jPanel8);

        jPanel7.setBackground(new java.awt.Color(87, 115, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 900, 60));

        TableRUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Gestion", "Mes", "Aduana", "Depto", "Via", "Medio", "Pais", "Nandina", "Kilos", "Fob", "Adu", "CUSI", "Ident"
            }
        ));
        TableRUs.setComponentPopupMenu(jPopupAduana);
        jScrollPane1.setViewportView(TableRUs);
        if (TableRUs.getColumnModel().getColumnCount() > 0) {
            TableRUs.getColumnModel().getColumn(0).setPreferredWidth(8);
            TableRUs.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableRUs.getColumnModel().getColumn(2).setPreferredWidth(12);
            TableRUs.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableRUs.getColumnModel().getColumn(4).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(5).setPreferredWidth(14);
            TableRUs.getColumnModel().getColumn(6).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(7).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(8).setPreferredWidth(120);
            TableRUs.getColumnModel().getColumn(9).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(10).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(11).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(12).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(13).setPreferredWidth(50);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 900, 420));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Bases de Datos Aduana Nacional"));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Gestion");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Nandina");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setText("Mes");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 30));
        jPanel11.add(txtGestionRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, 20));
        jPanel11.add(txtNandinaRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 20));

        btnNuevoRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnNuevoRUs.setText("Nuevo");
        jPanel11.add(btnNuevoRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, 60));

        btnRegistrarRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnRegistrarRUs.setText("Registrar");
        jPanel11.add(btnRegistrarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, 30));

        btnModificarRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnModificarRUs.setText("Modificar");
        jPanel11.add(btnModificarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 80, 30));
        jPanel11.add(txtIdRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));
        jPanel11.add(txtBuscarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Id");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Buscar");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Aduana");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Depto");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Via");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Medio");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Pais");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel11.add(txtAduanaRus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));
        jPanel11.add(txtDeptoRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 20));
        jPanel11.add(txtViaRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 20));
        jPanel11.add(txtMedioRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 20));
        jPanel11.add(txtPaisRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 20));
        jPanel11.add(txtMesRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));
        jPanel11.add(txtKilosRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 20));
        jPanel11.add(txtFobRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 20));
        jPanel11.add(txtAduRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 20));
        jPanel11.add(txtCusiRus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 20));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setText("Kilos");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setText("Fob");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel22.setText("Adu");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel23.setText("Cusi");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel24.setText("Ident");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel11.add(txtIdentRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, 20));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 490));

        jTabbedPane12.addTab("Base de Datos", jPanel7);

        jPanel16.setBackground(new java.awt.Color(73, 88, 103));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 900, 60));

        TableRUs1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Gestion", "Mes", "Aduana", "Depto", "Via", "Medio", "Pais", "Nandina", "Kilos", "Fob", "Adu", "CUSI", "Ident"
            }
        ));
        TableRUs1.setComponentPopupMenu(jPopupAduana);
        jScrollPane4.setViewportView(TableRUs1);
        if (TableRUs1.getColumnModel().getColumnCount() > 0) {
            TableRUs1.getColumnModel().getColumn(0).setPreferredWidth(8);
            TableRUs1.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableRUs1.getColumnModel().getColumn(2).setPreferredWidth(12);
            TableRUs1.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableRUs1.getColumnModel().getColumn(4).setPreferredWidth(25);
            TableRUs1.getColumnModel().getColumn(5).setPreferredWidth(14);
            TableRUs1.getColumnModel().getColumn(6).setPreferredWidth(25);
            TableRUs1.getColumnModel().getColumn(7).setPreferredWidth(25);
            TableRUs1.getColumnModel().getColumn(8).setPreferredWidth(120);
            TableRUs1.getColumnModel().getColumn(9).setPreferredWidth(50);
            TableRUs1.getColumnModel().getColumn(10).setPreferredWidth(50);
            TableRUs1.getColumnModel().getColumn(11).setPreferredWidth(50);
            TableRUs1.getColumnModel().getColumn(12).setPreferredWidth(50);
            TableRUs1.getColumnModel().getColumn(13).setPreferredWidth(50);
        }

        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 900, 420));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Bases de Datos Aduana Nacional"));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel39.setText("Gestion");
        jPanel21.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 30));

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel40.setText("Nandina");
        jPanel21.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, 30));

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel42.setText("Mes");
        jPanel21.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 30));
        jPanel21.add(txtGestionRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, 20));
        jPanel21.add(txtNandinaRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 20));

        btnNuevoRUs1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnNuevoRUs1.setText("Nuevo");
        jPanel21.add(btnNuevoRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, 60));

        btnRegistrarRUs1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnRegistrarRUs1.setText("Registrar");
        jPanel21.add(btnRegistrarRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, 30));

        btnModificarRUs1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnModificarRUs1.setText("Modificar");
        jPanel21.add(btnModificarRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 80, 30));
        jPanel21.add(txtIdRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));
        jPanel21.add(txtBuscarRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 20));

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel43.setText("Id");
        jPanel21.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel44.setText("Buscar");
        jPanel21.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel45.setText("Aduana");
        jPanel21.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel46.setText("Depto");
        jPanel21.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel47.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel47.setText("Via");
        jPanel21.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel48.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel48.setText("Medio");
        jPanel21.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel49.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel49.setText("Pais");
        jPanel21.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel21.add(txtAduanaRus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));
        jPanel21.add(txtDeptoRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 20));
        jPanel21.add(txtViaRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 20));
        jPanel21.add(txtMedioRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 20));
        jPanel21.add(txtPaisRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 20));
        jPanel21.add(txtMesRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));
        jPanel21.add(txtKilosRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 20));
        jPanel21.add(txtFobRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 20));
        jPanel21.add(txtAduRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 20));
        jPanel21.add(txtCusiRus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 20));

        jLabel50.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel50.setText("Kilos");
        jPanel21.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, -1, -1));

        jLabel51.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel51.setText("Fob");
        jPanel21.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        jLabel52.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel52.setText("Adu");
        jPanel21.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel53.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel53.setText("Cusi");
        jPanel21.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel54.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel54.setText("Ident");
        jPanel21.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel21.add(txtIdentRUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, 20));

        jPanel16.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 490));

        jTabbedPane12.addTab("Base de Datos 2", jPanel16);

        jPanel17.setBackground(new java.awt.Color(189, 213, 234));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(73, 88, 103));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaBase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaBase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NANDINA", "RESULTADO"
            }
        ));
        jScrollPane3.setViewportView(TablaBase);

        jPanel18.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 130, 810, 340));

        jLabelNoti.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNoti.setForeground(new java.awt.Color(247, 247, 255));
        jLabelNoti.setText("Notificaciones ");
        jPanel18.add(jLabelNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(247, 247, 255));
        jLabel35.setText("Los siguientes productos tuvieron una variacón mayor al 10 %");
        jPanel18.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 11, 840, 490));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Notificaciones"));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setText("Id");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setText("Nandina");
        jPanel19.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel38.setText("Resultado");
        jPanel19.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));
        jPanel19.add(txtIdBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, 80, 30));
        jPanel19.add(txtNandinaBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 60, 110, 30));

        btnNuevoBas.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnNuevoBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/notificacion3.png"))); // NOI18N
        btnNuevoBas.setBorder(null);
        btnNuevoBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoBasActionPerformed(evt);
            }
        });
        jPanel19.add(btnNuevoBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 30));

        btnRegistrarBas.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnRegistrarBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/notificacion2.png"))); // NOI18N
        btnRegistrarBas.setBorder(null);
        jPanel19.add(btnRegistrarBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 60));

        btnModificarBas.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnModificarBas.setForeground(new java.awt.Color(240, 240, 240));
        btnModificarBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/notificacion.png"))); // NOI18N
        btnModificarBas.setBorder(null);
        btnModificarBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBasActionPerformed(evt);
            }
        });
        jPanel19.add(btnModificarBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, 50));

        txtBuscarBas.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarBas.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel19.add(txtBuscarBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 0));
        jPanel19.add(txtComentarioBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 100, 80, 30));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 230));

        jTabbedPane12.addTab("Notificaciones", jPanel17);

        getContentPane().add(jTabbedPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1100, 540));

        jPanel2.setBackground(new java.awt.Color(87, 115, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Agentes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.setBackground(new java.awt.Color(73, 88, 103));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Universidad Salesiana de Bolivia");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 410, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo--usb.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 280, 80));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1100, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveUser1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(WIDTH);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        FrmGraficas2 Frm=new FrmGraficas2();
        Frm.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Informacion FrmG=new Informacion();
        FrmG.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmGraficas FrmG=new FrmGraficas();
        FrmG.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Perfiles Per = new Perfiles();
        Per.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Mensaje_3 ms3 = new Mensaje_3();
        ms3.setVisible(true);        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnModificarBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarBasActionPerformed

    private void btnNuevoBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoBasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoBasActionPerformed

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel JLabelAnalisisDescriptivo;
    public javax.swing.JLabel JLabelAnalisisPredictivo;
    public javax.swing.JLabel JLabelConfig;
    public javax.swing.JLabel JLabelInfoGeneral;
    public javax.swing.JLabel JLabelIngresoBD;
    public javax.swing.JLabel JLabelNotificaciones;
    public javax.swing.JLabel JLabelSalir;
    public javax.swing.JLabel JLabelUsers;
    public javax.swing.JLabel JLabelUsuarios;
    public javax.swing.JMenuItem JMenuEliminarAduana;
    public javax.swing.JMenuItem JMenuEliminarUsers;
    public javax.swing.JMenuItem JMenuModificarAduana;
    public javax.swing.JMenuItem JMenuReingresarUser;
    public javax.swing.JPanel JPanelAnalisisDescriptivo;
    public javax.swing.JPanel JPanelAnalisisPredictivo;
    public javax.swing.JPanel JPanelConfig;
    public javax.swing.JPanel JPanelInfoGene;
    public javax.swing.JPanel JPanelIngresoDatos;
    public javax.swing.JPanel JPanelMedidas;
    public javax.swing.JPanel JPanelProveedores;
    public javax.swing.JPanel JPanelSalir;
    public javax.swing.JPanel JPanelUsers;
    private javax.swing.JPopupMenu JPopupUsuarios;
    private javax.swing.JPanel PaginadoUser;
    public javax.swing.JTable TablaBase;
    public javax.swing.JTable TableRUs;
    public javax.swing.JTable TableRUs1;
    public javax.swing.JTable TableUser;
    public javax.swing.JButton btnModificarBas;
    public javax.swing.JButton btnModificarRUs;
    public javax.swing.JButton btnModificarRUs1;
    public javax.swing.JButton btnModificarUser;
    public javax.swing.JButton btnNuevoBas;
    public javax.swing.JButton btnNuevoRUs;
    public javax.swing.JButton btnNuevoRUs1;
    public javax.swing.JButton btnNuevoUser;
    public javax.swing.JButton btnRegistrarBas;
    public javax.swing.JButton btnRegistrarRUs;
    public javax.swing.JButton btnRegistrarRUs1;
    public javax.swing.JButton btnRegistrarUser;
    public javax.swing.JComboBox<String> cbxCajaUser;
    public javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNoti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPopupMenu jPopupAduana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane12;
    public javax.swing.JTextField txtAduRUs;
    public javax.swing.JTextField txtAduRUs1;
    public javax.swing.JTextField txtAduanaRus;
    public javax.swing.JTextField txtAduanaRus1;
    public javax.swing.JTextField txtBuscarBas;
    public javax.swing.JTextField txtBuscarRUs;
    public javax.swing.JTextField txtBuscarRUs1;
    public javax.swing.JTextField txtBuscarUsers;
    public javax.swing.JPasswordField txtClaveUser;
    public javax.swing.JTextField txtComentarioBas;
    public javax.swing.JTextField txtCusiRus;
    public javax.swing.JTextField txtCusiRus1;
    public javax.swing.JTextField txtDeptoRUs;
    public javax.swing.JTextField txtDeptoRUs1;
    public javax.swing.JTextField txtFobRUs;
    public javax.swing.JTextField txtFobRUs1;
    public javax.swing.JTextField txtGestionRUs;
    public javax.swing.JTextField txtGestionRUs1;
    public javax.swing.JTextField txtIdBas;
    public javax.swing.JTextField txtIdRUs;
    public javax.swing.JTextField txtIdRUs1;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtIdentRUs;
    public javax.swing.JTextField txtIdentRUs1;
    public javax.swing.JTextField txtKilosRUs;
    public javax.swing.JTextField txtKilosRUs1;
    public javax.swing.JTextField txtMedioRUs;
    public javax.swing.JTextField txtMedioRUs1;
    public javax.swing.JTextField txtMesRUs;
    public javax.swing.JTextField txtMesRUs1;
    public javax.swing.JTextField txtNandinaBas;
    public javax.swing.JTextField txtNandinaRUs;
    public javax.swing.JTextField txtNandinaRUs1;
    public javax.swing.JTextField txtNombreUser;
    public javax.swing.JTextField txtPaisRUs;
    public javax.swing.JTextField txtPaisRUs1;
    public javax.swing.JTextField txtUsuarioUser;
    public javax.swing.JTextField txtViaRUs;
    public javax.swing.JTextField txtViaRUs1;
    // End of variables declaration//GEN-END:variables
}
