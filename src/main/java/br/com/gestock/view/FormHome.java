package br.com.gestock.view;

public class FormHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormHome.class.getName());

    public FormHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalHome = new javax.swing.JPanel();
        panelDadosHome = new javax.swing.JPanel();
        panelProdutos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelVendas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        labelLogoGestock = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonProdutos = new javax.swing.JButton();
        buttonClientes = new javax.swing.JButton();
        buttonVendas = new javax.swing.JButton();
        buttonUsuarios = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        pnProdutos = new javax.swing.JPanel();
        pnClientes = new javax.swing.JPanel();
        pnVendas = new javax.swing.JPanel();
        pnUsuarios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1124, 800));
        setResizable(false);

        panelDadosHome.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosHome.setPreferredSize(new java.awt.Dimension(840, 800));

        panelProdutos.setBackground(new java.awt.Color(153, 153, 255));
        panelProdutos.setToolTipText("Quantidade de Produtos");

        jLabel8.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produtos.png"))); // NOI18N
        jLabel8.setText("PRODUTOS");

        jLabel9.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("0");

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(38, 38, 38))
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(255, 102, 102));
        panelClientes.setToolTipText("Quantidade de Clientes");
        panelClientes.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel10.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clientes.png"))); // NOI18N
        jLabel10.setText("CLIENTES");

        jLabel11.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("0");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(36, 36, 36))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelVendas.setBackground(new java.awt.Color(0, 255, 102));
        panelVendas.setToolTipText("Quantidade de Vendas");

        jLabel12.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vendas.png"))); // NOI18N
        jLabel12.setText("VENDAS");

        jLabel13.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("0");

        javax.swing.GroupLayout panelVendasLayout = new javax.swing.GroupLayout(panelVendas);
        panelVendas.setLayout(panelVendasLayout);
        panelVendasLayout.setHorizontalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(32, 32, 32))
        );
        panelVendasLayout.setVerticalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDadosHomeLayout = new javax.swing.GroupLayout(panelDadosHome);
        panelDadosHome.setLayout(panelDadosHomeLayout);
        panelDadosHomeLayout.setHorizontalGroup(
            panelDadosHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosHomeLayout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(panelDadosHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(panelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );
        panelDadosHomeLayout.setVerticalGroup(
            panelDadosHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosHomeLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(panelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(panelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        panelMenu.setBackground(new java.awt.Color(204, 204, 204));
        panelMenu.setPreferredSize(new java.awt.Dimension(284, 800));

        labelLogoGestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gestockMenor.png"))); // NOI18N

        buttonHome.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        buttonHome.setText(" HOME");
        buttonHome.setIconTextGap(10);
        buttonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeMouseClicked(evt);
            }
        });

        buttonProdutos.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produtos.png"))); // NOI18N
        buttonProdutos.setText("PRODUTOS");
        buttonProdutos.setIconTextGap(10);
        buttonProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonProdutosMouseClicked(evt);
            }
        });

        buttonClientes.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clientes.png"))); // NOI18N
        buttonClientes.setText("CLIENTES");
        buttonClientes.setIconTextGap(10);
        buttonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClientesMouseClicked(evt);
            }
        });

        buttonVendas.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vendas.png"))); // NOI18N
        buttonVendas.setText("VENDAS");
        buttonVendas.setIconTextGap(10);
        buttonVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVendasMouseClicked(evt);
            }
        });

        buttonUsuarios.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        buttonUsuarios.setText("USUARIOS");
        buttonUsuarios.setIconTextGap(10);
        buttonUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUsuariosMouseClicked(evt);
            }
        });

        buttonSair.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 51, 51));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        buttonSair.setText("SAIR");
        buttonSair.setIconTextGap(10);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelLogoGestock, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(buttonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
            .addComponent(buttonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(labelLogoGestock, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(buttonProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(buttonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(buttonVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnProdutos.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout pnProdutosLayout = new javax.swing.GroupLayout(pnProdutos);
        pnProdutos.setLayout(pnProdutosLayout);
        pnProdutosLayout.setHorizontalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        pnProdutosLayout.setVerticalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );

        pnClientes.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout pnClientesLayout = new javax.swing.GroupLayout(pnClientes);
        pnClientes.setLayout(pnClientesLayout);
        pnClientesLayout.setHorizontalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        pnClientesLayout.setVerticalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );

        pnVendas.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout pnVendasLayout = new javax.swing.GroupLayout(pnVendas);
        pnVendas.setLayout(pnVendasLayout);
        pnVendasLayout.setHorizontalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        pnVendasLayout.setVerticalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );

        pnUsuarios.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout pnUsuariosLayout = new javax.swing.GroupLayout(pnUsuarios);
        pnUsuarios.setLayout(pnUsuariosLayout);
        pnUsuariosLayout.setHorizontalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        pnUsuariosLayout.setVerticalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalHomeLayout = new javax.swing.GroupLayout(panelPrincipalHome);
        panelPrincipalHome.setLayout(panelPrincipalHomeLayout);
        panelPrincipalHomeLayout.setHorizontalGroup(
            panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalHomeLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDadosHome, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalHomeLayout.createSequentialGroup()
                    .addGap(0, 289, Short.MAX_VALUE)
                    .addComponent(pnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalHomeLayout.createSequentialGroup()
                    .addGap(0, 291, Short.MAX_VALUE)
                    .addComponent(pnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalHomeLayout.createSequentialGroup()
                    .addGap(0, 290, Short.MAX_VALUE)
                    .addComponent(pnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalHomeLayout.createSequentialGroup()
                    .addGap(0, 290, Short.MAX_VALUE)
                    .addComponent(pnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelPrincipalHomeLayout.setVerticalGroup(
            panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalHomeLayout.createSequentialGroup()
                .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDadosHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalHomeLayout.createSequentialGroup()
                    .addComponent(pnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        panelDadosHome.setVisible(true);
        pnClientes.setVisible(false);
        pnProdutos.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void buttonProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProdutosMouseClicked
        pnProdutos.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
    }//GEN-LAST:event_buttonProdutosMouseClicked

    private void buttonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClientesMouseClicked
        pnClientes.setVisible(true);
        pnProdutos.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
    }//GEN-LAST:event_buttonClientesMouseClicked

    private void buttonVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVendasMouseClicked
        pnVendas.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnProdutos.setVisible(false);
    }//GEN-LAST:event_buttonVendasMouseClicked

    private void buttonUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsuariosMouseClicked
        pnUsuarios.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnProdutos.setVisible(false);
        pnVendas.setVisible(false);
    }//GEN-LAST:event_buttonUsuariosMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClientes;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonProdutos;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonUsuarios;
    private javax.swing.JButton buttonVendas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelLogoGestock;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelDadosHome;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipalHome;
    private javax.swing.JPanel panelProdutos;
    private javax.swing.JPanel panelVendas;
    private javax.swing.JPanel pnClientes;
    private javax.swing.JPanel pnProdutos;
    private javax.swing.JPanel pnUsuarios;
    private javax.swing.JPanel pnVendas;
    // End of variables declaration//GEN-END:variables
}
