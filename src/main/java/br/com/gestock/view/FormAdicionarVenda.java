package br.com.gestock.view;

import br.com.gestock.dao.ClientesDAO;
import br.com.gestock.dao.ProdutosDAO;
import br.com.gestock.dao.VendasDAO;
import br.com.gestock.model.Clientes;
import br.com.gestock.model.Produtos;
import br.com.gestock.model.Vendas;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

public class FormAdicionarVenda extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAdicionarVenda.class.getName());

    public FormAdicionarVenda() {
        initComponents();
        preencherCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        labelProduto = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox<>();
        labelQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        buttonAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Venda");

        labelTitulo.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        labelTitulo.setText("Adicionar Venda");

        labelCliente.setText("CLIENTE:");

        comboCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboClienteMouseClicked(evt);
            }
        });
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        labelProduto.setText("PRODUTO:");

        labelQuantidade.setText("QUANTIDADE:");

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        labelTotal.setText("TOTAL:");

        labelData.setText("DATA:");

        buttonAdicionar.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonAdicionar.setText("ADICIONAR");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherCombo() {
        ClientesDAO clientesDAO = new ClientesDAO();
        ProdutosDAO produtosDAO = new ProdutosDAO();

        List<Clientes> listaClientes = clientesDAO.getClientes();
        List<Produtos> listaProdutos = produtosDAO.getProdutos();
        comboCliente.removeAllItems();
        comboProduto.removeAllItems();
        if (listaClientes != null) {
            for (Clientes cliente : listaClientes) {
                comboCliente.addItem(cliente);
            }
        }

        if (listaProdutos != null) {
            for (Produtos produto : listaProdutos) {
                comboProduto.addItem(produto);
            }
        }

    }

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed

    }//GEN-LAST:event_comboClienteActionPerformed

    private void comboClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboClienteMouseClicked

    }//GEN-LAST:event_comboClienteMouseClicked

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        Vendas venda = new Vendas();
        VendasDAO vendasDAO = new VendasDAO();

        Clientes clienteSelecionado = (Clientes) comboCliente.getSelectedItem();
        Produtos produtoSelecionado = (Produtos) comboProduto.getSelectedItem();
        LocalDateTime date_time = null;
        String regex = "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}";

        int quantidade = Integer.parseInt(txtQuantidade.getText());
        BigDecimal total = new BigDecimal(txtTotal.getText());

        if (txtData.getText().matches(regex)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            date_time = LocalDateTime.parse(txtData.getText(), formatter);
        } else {
            txtData.setText(null);
        }

        if (txtData.getText().isEmpty() || txtData.getText() == null) {
            JOptionPane.showMessageDialog(null, "O campo data deve ter o seguinte formato: yyyy-MM-dd HH:mm:ss", "Erro de formato", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                venda.setId_cliente(clienteSelecionado);
                venda.setProduto(produtoSelecionado);
                venda.setTotal(total);
                venda.setData_venda(date_time);
                venda.setQuantidade(quantidade);
                vendasDAO.adicionar(venda);
                JOptionPane.showMessageDialog(null, "Venda adicionada.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar Venda.", "Erro ao Adicionar", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        Produtos produtoSelecionado = (Produtos) comboProduto.getSelectedItem();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double total;
        String valorProdutoString = String.valueOf(produtoSelecionado.getPreco());
        double valorProduto = Double.parseDouble(valorProdutoString);
        
        total = valorProduto * quantidade;
        
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtQuantidadeFocusLost

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
        java.awt.EventQueue.invokeLater(() -> new FormAdicionarVenda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JComboBox<Clientes> comboCliente;
    private javax.swing.JComboBox<Produtos> comboProduto;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
