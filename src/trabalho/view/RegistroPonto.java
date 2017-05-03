/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.view;

import javax.swing.JOptionPane;
import trabalho.entity.FuncionarioEntity;
import trabalho.entity.RegistroPontoEntity;
import trabalho.model.FuncionarioDAO;
import trabalho.model.GenericDAO;
import trabalho.model.JodaMain;
import trabalho.model.RegistroDAO;

/**
 *
 * @author Tecnico
 */
public class RegistroPonto extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPonto
     */
    public RegistroPonto() {
        initComponents();
    }

    JodaMain joda = new JodaMain();
    GenericDAO dao = new GenericDAO();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    RegistroDAO regDAO = new RegistroDAO();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoFuncionariojTextField = new javax.swing.JTextField();
        nomeFuncionariojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        iniciarTurnoButton = new javax.swing.JLabel();
        finalizarTurnoButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel1.setText("Código Funcionário");

        codigoFuncionariojTextField.setBackground(new java.awt.Color(63, 134, 195));
        codigoFuncionariojTextField.setForeground(new java.awt.Color(255, 255, 255));
        codigoFuncionariojTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        codigoFuncionariojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFuncionariojTextFieldFocusLost(evt);
            }
        });

        nomeFuncionariojTextField.setEditable(false);
        nomeFuncionariojTextField.setBackground(new java.awt.Color(63, 134, 195));
        nomeFuncionariojTextField.setForeground(new java.awt.Color(255, 255, 255));
        nomeFuncionariojTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setText("Funcionário");

        iniciarTurnoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/IniciarTurno.jpg"))); // NOI18N
        iniciarTurnoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarTurnoButtonMouseClicked(evt);
            }
        });

        finalizarTurnoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/FinalizarTurno.jpg"))); // NOI18N
        finalizarTurnoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarTurnoButtonMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/JanelaRegistrarPonto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iniciarTurnoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizarTurnoButton)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codigoFuncionariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nomeFuncionariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoFuncionariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeFuncionariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarTurnoButton)
                    .addComponent(finalizarTurnoButton))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoFuncionariojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFuncionariojTextFieldFocusLost
        // TODO add your handling code here:

        int idFuncionario;
        idFuncionario = Integer.parseInt(codigoFuncionariojTextField.getText());
        FuncionarioEntity funcionario = funcDAO.buscaFuncionario(idFuncionario);
        nomeFuncionariojTextField.setText(funcionario.getNomeFuncionario());


    }//GEN-LAST:event_codigoFuncionariojTextFieldFocusLost

    private void iniciarTurnoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarTurnoButtonMouseClicked
        // TODO add your handling code here:
        
        //RegistroPontoEntity ponto = new RegistroPontoEntity();
        RegistroPontoEntity ponto = new RegistroPontoEntity();
        int idFuncionario;
        idFuncionario = Integer.parseInt(codigoFuncionariojTextField.getText());
        FuncionarioEntity funcionario = funcDAO.buscaFuncionario(idFuncionario);
        ponto.setCodigoRegistroFuncionario(idFuncionario);
        ponto.setFuncionario(funcionario);
        ponto.setDataInicial(joda.insereDataLocal());
        ponto.setCodigoBuscaFuncionario(idFuncionario);
        funcionario.setStatusPonto(true);
        funcDAO.updateFuncionario(funcionario);
        dao.salvar(ponto);

    }//GEN-LAST:event_iniciarTurnoButtonMouseClicked

    private void finalizarTurnoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarTurnoButtonMouseClicked
        // TODO add your handling code here:

        int idFuncionario;
        int horaTrabalhada;
        idFuncionario = Integer.parseInt(codigoFuncionariojTextField.getText()); 
        RegistroPontoEntity ponto = regDAO.buscaCodigoRegistro(idFuncionario);
        FuncionarioEntity funcionario = funcDAO.buscaFuncionario(idFuncionario);
        ponto.setDataFinal(joda.insereDataLocal());
        horaTrabalhada = joda.retornaTempo(ponto);
        ponto.setHoraTrabalhada(horaTrabalhada);
        funcionario.setStatusPonto(false);
        funcDAO.updateFuncionario(funcionario);
        regDAO.updateRegistro(ponto);
        


    }//GEN-LAST:event_finalizarTurnoButtonMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPonto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoFuncionariojTextField;
    private javax.swing.JLabel finalizarTurnoButton;
    private javax.swing.JLabel iniciarTurnoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeFuncionariojTextField;
    // End of variables declaration//GEN-END:variables
}
