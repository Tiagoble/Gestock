package br.com.gestock.view;

import br.com.gestock.dao.ClientesDAO;
import br.com.gestock.dao.ProdutosDAO;
import br.com.gestock.dao.UsuariosDAO;
import br.com.gestock.dao.VendasDAO;
import br.com.gestock.model.Clientes;
import br.com.gestock.model.Produtos;
import br.com.gestock.model.Usuarios;
import br.com.gestock.model.Vendas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormHome extends javax.swing.JFrame {
    final int COLUNA_DO_ID = 0;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormHome.class.getName());

    public FormHome() {
        initComponents();
        panelDadosHome.setVisible(true);
        pnClientes.setVisible(false);
        pnProdutos.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
        preencherVendas();
        preencherClientes();
        preencherProdutos();
        labelClientesCount.setText(String.valueOf(tableClientes.getRowCount()));
        labelProdutosCount.setText(String.valueOf(tableProdutos.getRowCount()));
        labelVendasCount.setText(String.valueOf(tableVendas.getRowCount()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalHome = new javax.swing.JPanel();
        panelDadosHome = new javax.swing.JPanel();
        panelProdutos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelProdutosCount = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        labelClientesCount = new javax.swing.JLabel();
        panelVendas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        labelVendasCount = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        labelLogoGestock = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonProdutos = new javax.swing.JButton();
        buttonClientes = new javax.swing.JButton();
        buttonVendas = new javax.swing.JButton();
        buttonUsuarios = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        pnProdutos = new javax.swing.JPanel();
        labelTituloProduto = new javax.swing.JLabel();
        buttonAdicionarProduto = new javax.swing.JButton();
        buttonEditarProduto = new javax.swing.JButton();
        buttonExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        pnClientes = new javax.swing.JPanel();
        labelTituloCliente = new javax.swing.JLabel();
        buttonAdicionarCliente = new javax.swing.JButton();
        buttonEditarCliente = new javax.swing.JButton();
        buttonExcluirCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        pnVendas = new javax.swing.JPanel();
        labelTituloVendas = new javax.swing.JLabel();
        buttonAdicionarVenda = new javax.swing.JButton();
        buttonEditarVenda = new javax.swing.JButton();
        buttonExcluirVenda = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableVendas = new javax.swing.JTable();
        pnUsuarios = new javax.swing.JPanel();
        labelTituloUsuarios = new javax.swing.JLabel();
        buttonAdicionarUsuario = new javax.swing.JButton();
        buttonEditarUsuarios = new javax.swing.JButton();
        buttonExcluirUsuarios = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();

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

        labelProdutosCount.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        labelProdutosCount.setForeground(new java.awt.Color(255, 255, 255));
        labelProdutosCount.setText("0");

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelProdutosCount)
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
                .addComponent(labelProdutosCount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(255, 102, 102));
        panelClientes.setToolTipText("Quantidade de Clientes");
        panelClientes.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel10.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clientes.png"))); // NOI18N
        jLabel10.setText("CLIENTES");

        labelClientesCount.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        labelClientesCount.setForeground(new java.awt.Color(255, 255, 255));
        labelClientesCount.setText("0");

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
                .addComponent(labelClientesCount)
                .addGap(36, 36, 36))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClientesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelVendas.setBackground(new java.awt.Color(0, 255, 102));
        panelVendas.setToolTipText("Quantidade de Vendas");

        jLabel12.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vendas.png"))); // NOI18N
        jLabel12.setText("VENDAS");

        labelVendasCount.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        labelVendasCount.setForeground(new java.awt.Color(255, 255, 255));
        labelVendasCount.setText("0");

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
                .addComponent(labelVendasCount)
                .addGap(32, 32, 32))
        );
        panelVendasLayout.setVerticalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelVendasCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        pnProdutos.setBackground(new java.awt.Color(255, 255, 255));

        labelTituloProduto.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        labelTituloProduto.setText("Produtos");

        buttonAdicionarProduto.setText("Adicionar");
        buttonAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarProdutoActionPerformed(evt);
            }
        });

        buttonEditarProduto.setText("Editar");
        buttonEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarProdutoActionPerformed(evt);
            }
        });

        buttonExcluirProduto.setText("Excluir");
        buttonExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirProdutoActionPerformed(evt);
            }
        });

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "preco", "categoria"
            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        javax.swing.GroupLayout pnProdutosLayout = new javax.swing.GroupLayout(pnProdutos);
        pnProdutos.setLayout(pnProdutosLayout);
        pnProdutosLayout.setHorizontalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutosLayout.createSequentialGroup()
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTituloProduto))
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(buttonAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(buttonEditarProduto)))
                .addGap(232, 232, 232)
                .addComponent(buttonExcluirProduto)
                .addGap(69, 69, 69))
            .addComponent(jScrollPane1)
        );
        pnProdutosLayout.setVerticalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloProduto)
                .addGap(18, 18, 18)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarProduto)
                    .addComponent(buttonEditarProduto)
                    .addComponent(buttonExcluirProduto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );

        pnClientes.setBackground(new java.awt.Color(255, 255, 255));

        labelTituloCliente.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        labelTituloCliente.setText("Clientes");

        buttonAdicionarCliente.setText("Adicionar");
        buttonAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarClienteActionPerformed(evt);
            }
        });

        buttonEditarCliente.setText("Editar");
        buttonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarClienteActionPerformed(evt);
            }
        });

        buttonExcluirCliente.setText("Excluir");
        buttonExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirClienteActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "telefone", "endereco"
            }
        ));
        jScrollPane2.setViewportView(tableClientes);

        javax.swing.GroupLayout pnClientesLayout = new javax.swing.GroupLayout(pnClientes);
        pnClientes.setLayout(pnClientesLayout);
        pnClientesLayout.setHorizontalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(buttonAdicionarCliente)
                .addGap(185, 185, 185)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClientesLayout.createSequentialGroup()
                        .addComponent(labelTituloCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnClientesLayout.createSequentialGroup()
                        .addComponent(buttonEditarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(buttonExcluirCliente)
                        .addGap(113, 113, 113))))
            .addComponent(jScrollPane2)
        );
        pnClientesLayout.setVerticalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloCliente)
                .addGap(18, 18, 18)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarCliente)
                    .addComponent(buttonEditarCliente)
                    .addComponent(buttonExcluirCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );

        pnVendas.setBackground(new java.awt.Color(255, 255, 255));

        labelTituloVendas.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        labelTituloVendas.setText("Vendas");

        buttonAdicionarVenda.setText("Adicionar");
        buttonAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarVendaActionPerformed(evt);
            }
        });

        buttonEditarVenda.setText("Editar");
        buttonEditarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarVendaActionPerformed(evt);
            }
        });

        buttonExcluirVenda.setText("Excluir");
        buttonExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirVendaActionPerformed(evt);
            }
        });

        tableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "cliente", "produto", "quantidade", "total", "data"
            }
        ));
        jScrollPane3.setViewportView(tableVendas);

        javax.swing.GroupLayout pnVendasLayout = new javax.swing.GroupLayout(pnVendas);
        pnVendas.setLayout(pnVendasLayout);
        pnVendasLayout.setHorizontalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(buttonAdicionarVenda)
                .addGap(202, 202, 202)
                .addGroup(pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnVendasLayout.createSequentialGroup()
                        .addComponent(labelTituloVendas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnVendasLayout.createSequentialGroup()
                        .addComponent(buttonEditarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(buttonExcluirVenda)
                        .addGap(99, 99, 99))))
            .addComponent(jScrollPane3)
        );
        pnVendasLayout.setVerticalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloVendas)
                .addGap(18, 18, 18)
                .addGroup(pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarVenda)
                    .addComponent(buttonEditarVenda)
                    .addComponent(buttonExcluirVenda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );

        pnUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        labelTituloUsuarios.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        labelTituloUsuarios.setText("Usuários");

        buttonAdicionarUsuario.setText("Adicionar");
        buttonAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarUsuarioActionPerformed(evt);
            }
        });

        buttonEditarUsuarios.setText("Editar");
        buttonEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarUsuariosActionPerformed(evt);
            }
        });

        buttonExcluirUsuarios.setText("Excluir");
        buttonExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirUsuariosActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "username", "nivel"
            }
        ));
        jScrollPane4.setViewportView(tableUsuarios);

        javax.swing.GroupLayout pnUsuariosLayout = new javax.swing.GroupLayout(pnUsuarios);
        pnUsuarios.setLayout(pnUsuariosLayout);
        pnUsuariosLayout.setHorizontalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuariosLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(buttonAdicionarUsuario)
                .addGap(188, 188, 188)
                .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUsuariosLayout.createSequentialGroup()
                        .addComponent(labelTituloUsuarios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnUsuariosLayout.createSequentialGroup()
                        .addComponent(buttonEditarUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(buttonExcluirUsuarios)
                        .addGap(108, 108, 108))))
            .addComponent(jScrollPane4)
        );
        pnUsuariosLayout.setVerticalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloUsuarios)
                .addGap(18, 18, 18)
                .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarUsuario)
                    .addComponent(buttonEditarUsuarios)
                    .addComponent(buttonExcluirUsuarios))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
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

    private void preencherUsuarios() {
        DefaultTableModel modelUsuarios = (DefaultTableModel) tableUsuarios.getModel();
        modelUsuarios.setRowCount(0);

        UsuariosDAO usuariosDAO = new UsuariosDAO();

        List<Usuarios> listaUsuarios = usuariosDAO.getUsuarios();
        if (listaUsuarios != null) {
            for (Usuarios usuario : listaUsuarios) {
                Object[] linha = {usuario.getId(), usuario.getUsername(), usuario.getNivelAcesso()
                };
                modelUsuarios.addRow(linha);
            }
        } else {
            System.out.println("Não foi possível carregar a lista de usuários do banco.");
        }
    }

    public void preencherProdutos() {
        DefaultTableModel modelProdutos = (DefaultTableModel) tableProdutos.getModel();

        modelProdutos.setRowCount(0);

        ProdutosDAO produtosDAO = new ProdutosDAO();
        
        List<Produtos> listaProdutos = produtosDAO.getProdutos();
        if (listaProdutos != null) {
            for (Produtos produtos : listaProdutos) {
                Object[] linha = {produtos.getId(), produtos.getNome(), produtos.getPreco(), produtos.getCategoria()};
                modelProdutos.addRow(linha);
            }
        }else{
            System.out.println("Não foi possível carregar a lista de produtos do banco.");
        }
    }
    
    public void preencherClientes(){
        DefaultTableModel modelClientes = (DefaultTableModel) tableClientes.getModel();
        modelClientes.setRowCount(0);
        
        ClientesDAO clientesDAO = new ClientesDAO();
        
        List<Clientes> listaClientes = clientesDAO.getClientes();
        if(listaClientes != null){
            for(Clientes clientes : listaClientes){
                Object[] linha = {clientes.getId(), clientes.getNome(), clientes.getTelefone(), clientes.getEndereco()};
                modelClientes.addRow(linha);
            }
        }else{
            System.out.println("Não foi possível carregar a lista de clientes.");
        }
    }
    
    public void preencherVendas(){
        DefaultTableModel modelVendas = (DefaultTableModel) tableVendas.getModel();
        modelVendas.setRowCount(0);
        
        VendasDAO vendasDAO = new VendasDAO();
        List<Vendas> listaVendas = vendasDAO.getVendas();
        if(listaVendas != null){
            for(Vendas venda : listaVendas){
                Object[] linha = {venda.getId(), venda.getId_cliente(), venda.getProduto(), venda.getQuantidade(), venda.getTotal(), venda.getData_venda()};
                modelVendas.addRow(linha);
            }
        }else{
            System.out.println("Não foi possível carregar a lista de vendas.");
        }
    }

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        panelDadosHome.setVisible(true);
        pnClientes.setVisible(false);
        pnProdutos.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
        
        labelClientesCount.setText(String.valueOf(tableClientes.getRowCount()));
        labelProdutosCount.setText(String.valueOf(tableProdutos.getRowCount()));
        labelVendasCount.setText(String.valueOf(tableVendas.getRowCount()));
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void buttonProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProdutosMouseClicked
        pnProdutos.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
        preencherProdutos();
    }//GEN-LAST:event_buttonProdutosMouseClicked

    private void buttonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClientesMouseClicked
        pnClientes.setVisible(true);
        pnProdutos.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnVendas.setVisible(false);
        preencherClientes();
    }//GEN-LAST:event_buttonClientesMouseClicked

    private void buttonVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVendasMouseClicked
        pnVendas.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnUsuarios.setVisible(false);
        pnProdutos.setVisible(false);
        preencherVendas();
    }//GEN-LAST:event_buttonVendasMouseClicked

    private void buttonUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUsuariosMouseClicked
        pnUsuarios.setVisible(true);
        pnClientes.setVisible(false);
        panelDadosHome.setVisible(false);
        pnProdutos.setVisible(false);
        pnVendas.setVisible(false);
        preencherUsuarios();
    }//GEN-LAST:event_buttonUsuariosMouseClicked

    private void buttonExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirProdutoActionPerformed
        int linhaSelecionadaView = tableProdutos.getSelectedRow();
        if (linhaSelecionadaView != -1){
            int linhaSelecionadaModel = tableProdutos.convertRowIndexToModel(linhaSelecionadaView);
            
            Object valorID = tableProdutos.getModel().getValueAt(linhaSelecionadaModel, COLUNA_DO_ID);
            
            try {
                int id = (int) valorID;
                ProdutosDAO produtosDAO = new ProdutosDAO();
                produtosDAO.deletar(id);
            } catch (ClassCastException ex) {
                System.err.println("Erro ao converter o valor do ID.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.", "Erro ao excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirProdutoActionPerformed

    private void buttonAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarClienteActionPerformed
        FormAdicionarCliente addCliente = new FormAdicionarCliente();
        addCliente.setVisible(true);
    }//GEN-LAST:event_buttonAdicionarClienteActionPerformed

    private void buttonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarProdutoActionPerformed
        FormAdicionarProduto addProduto = new FormAdicionarProduto();
        addProduto.setVisible(true);
    }//GEN-LAST:event_buttonAdicionarProdutoActionPerformed

    private void buttonEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarProdutoActionPerformed
        FormEditarProduto editarProduto = new FormEditarProduto();
        editarProduto.setVisible(true);
    }//GEN-LAST:event_buttonEditarProdutoActionPerformed

    private void buttonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarClienteActionPerformed
        FormEditarCliente editarCliente = new FormEditarCliente();
        editarCliente.setVisible(true);
    }//GEN-LAST:event_buttonEditarClienteActionPerformed

    private void buttonExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirClienteActionPerformed
        int linhaSelecionadaView = tableClientes.getSelectedRow();
        if (linhaSelecionadaView != -1){
            int linhaSelecionadaModel = tableClientes.convertRowIndexToModel(linhaSelecionadaView);
            
            Object valorID = tableClientes.getModel().getValueAt(linhaSelecionadaModel, COLUNA_DO_ID);
            
            try {
                int id = (int) valorID;
                ClientesDAO clientesDAO = new ClientesDAO();
                clientesDAO.deletar(id);
            } catch (ClassCastException ex) {
                System.err.println("Erro ao converter o valor do ID.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.", "Erro ao excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirClienteActionPerformed

    private void buttonAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarVendaActionPerformed
        FormAdicionarVenda addVenda = new FormAdicionarVenda();
        addVenda.setVisible(true);
    }//GEN-LAST:event_buttonAdicionarVendaActionPerformed

    private void buttonEditarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarVendaActionPerformed
        FormEditarVenda editarVenda = new FormEditarVenda();
        editarVenda.setVisible(true);
    }//GEN-LAST:event_buttonEditarVendaActionPerformed

    private void buttonExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirVendaActionPerformed
        int linhaSelecionadaView = tableVendas.getSelectedRow();
        if (linhaSelecionadaView != -1){
            int linhaSelecionadaModel = tableVendas.convertRowIndexToModel(linhaSelecionadaView);
            
            Object valorID = tableVendas.getModel().getValueAt(linhaSelecionadaModel, COLUNA_DO_ID);
            
            try {
                int id = (int) valorID;
                VendasDAO vendasDAO = new VendasDAO();
                vendasDAO.deletar(id);
            } catch (ClassCastException ex) {
                System.err.println("Erro ao converter o valor do ID.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.", "Erro ao excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirVendaActionPerformed

    private void buttonAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarUsuarioActionPerformed
        FormAdicionarUsuario addUsuario = new FormAdicionarUsuario();
        addUsuario.setVisible(true);
    }//GEN-LAST:event_buttonAdicionarUsuarioActionPerformed

    private void buttonEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarUsuariosActionPerformed
        FormEditarUsuario editarUsuario = new FormEditarUsuario();
        editarUsuario.setVisible(true);
    }//GEN-LAST:event_buttonEditarUsuariosActionPerformed

    private void buttonExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirUsuariosActionPerformed
        if (tableUsuarios.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Usuário para excluir.", "Erro ao excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirUsuariosActionPerformed

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
    private javax.swing.JButton buttonAdicionarCliente;
    private javax.swing.JButton buttonAdicionarProduto;
    private javax.swing.JButton buttonAdicionarUsuario;
    private javax.swing.JButton buttonAdicionarVenda;
    private javax.swing.JButton buttonClientes;
    private javax.swing.JButton buttonEditarCliente;
    private javax.swing.JButton buttonEditarProduto;
    private javax.swing.JButton buttonEditarUsuarios;
    private javax.swing.JButton buttonEditarVenda;
    private javax.swing.JButton buttonExcluirCliente;
    private javax.swing.JButton buttonExcluirProduto;
    private javax.swing.JButton buttonExcluirUsuarios;
    private javax.swing.JButton buttonExcluirVenda;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonProdutos;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonUsuarios;
    private javax.swing.JButton buttonVendas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelClientesCount;
    private javax.swing.JLabel labelLogoGestock;
    private javax.swing.JLabel labelProdutosCount;
    private javax.swing.JLabel labelTituloCliente;
    private javax.swing.JLabel labelTituloProduto;
    private javax.swing.JLabel labelTituloUsuarios;
    private javax.swing.JLabel labelTituloVendas;
    private javax.swing.JLabel labelVendasCount;
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
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTable tableVendas;
    // End of variables declaration//GEN-END:variables
}
