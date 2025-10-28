package br.com.gestock.view;

import br.com.gestock.dao.UsuariosDAO;
import br.com.gestock.model.NivelAcesso;
import br.com.gestock.model.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormEditarUsuario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormEditarUsuario.class.getName());

    public FormEditarUsuario() {
        initComponents();
        preencherCombo();
    }

    private void preencherCombo() {
        NivelAcesso nivelAdministrador = NivelAcesso.Administrador;
        NivelAcesso nivelOperador = NivelAcesso.Operador;
        NivelAcesso nivelPadrão = NivelAcesso.Padrao;

        comboNivel.removeAllItems();
        comboNivel.addItem(nivelAdministrador);
        comboNivel.addItem(nivelOperador);
        comboNivel.addItem(nivelPadrão);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labelNivel = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox<>();
        buttonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        labelTitulo.setText("Editar Usuário");

        labelID.setText("ID:");

        labelUsername.setText("USERNAME:");

        labelNivel.setText("NÍVEL:");

        buttonEditar.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        buttonEditar.setText("EDITAR");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivel)
                    .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        int id = Integer.parseInt(txtID.getText());
        String username = txtUsername.getText();
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        Usuarios usuario = usuariosDAO.getUsuariosID(id);
        
        if(usuario == null){
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro ao editar", JOptionPane.WARNING_MESSAGE);
        }else if(id <= 0 && username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Os campos não podem ficar vazios", "Erro ao editar", JOptionPane.WARNING_MESSAGE);
        }else{
            usuario.setUsername(username);
            usuario.setNivelAcesso((NivelAcesso) comboNivel.getSelectedItem());
            usuariosDAO.Editar(usuario);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FormEditarUsuario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JComboBox<NivelAcesso> comboNivel;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
