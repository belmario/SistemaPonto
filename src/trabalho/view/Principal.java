/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.view;

import trabalho.model.GenericDAO;

/**
 *
 * @author savio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        GenericDAO dao = new GenericDAO();
        //dao.iniciaSessao();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acessarTelaPonto = new javax.swing.JLabel();
        acessarTelaCadastroFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acessarTelaListaRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(710, 565));
        setMinimumSize(new java.awt.Dimension(710, 565));
        setSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(654, 510));

        acessarTelaPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/registrarPonto.png"))); // NOI18N
        acessarTelaPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acessarTelaPontoMouseClicked(evt);
            }
        });
        acessarTelaPonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acessarTelaPontoKeyPressed(evt);
            }
        });

        acessarTelaCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/cadastrarFuncionario.png"))); // NOI18N
        acessarTelaCadastroFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acessarTelaCadastroFuncionarioMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/TIME.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/WORK.png"))); // NOI18N

        acessarTelaListaRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/listarRegistro.png"))); // NOI18N
        acessarTelaListaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acessarTelaListaRegistrosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(acessarTelaCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(acessarTelaListaRegistros, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acessarTelaPonto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(acessarTelaCadastroFuncionario)
                        .addGap(79, 79, 79)
                        .addComponent(acessarTelaListaRegistros)
                        .addGap(73, 73, 73)
                        .addComponent(acessarTelaPonto))
                    .addComponent(jLabel1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acessarTelaCadastroFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarTelaCadastroFuncionarioMouseClicked
        // TODO add your handling code here:
        CadastroFuncionario telaCadastroFuncionario = new CadastroFuncionario();
        telaCadastroFuncionario.setLocationRelativeTo(null);
        telaCadastroFuncionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_acessarTelaCadastroFuncionarioMouseClicked

    private void acessarTelaListaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarTelaListaRegistrosMouseClicked
        // TODO add your handling code here:
        Listas telaListaRegistros = new Listas();
        telaListaRegistros.setLocationRelativeTo(null);
        telaListaRegistros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_acessarTelaListaRegistrosMouseClicked

    private void acessarTelaPontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acessarTelaPontoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_acessarTelaPontoKeyPressed

    private void acessarTelaPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarTelaPontoMouseClicked
        // TODO add your handling code here:
        RegistroPonto telaRegistroPonto = new RegistroPonto();
        telaRegistroPonto.setLocationRelativeTo(null);
        telaRegistroPonto.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_acessarTelaPontoMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acessarTelaCadastroFuncionario;
    private javax.swing.JLabel acessarTelaListaRegistros;
    private javax.swing.JLabel acessarTelaPonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
