/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindmap;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class TelaSelecao extends javax.swing.JFrame {

    /**
     * Creates new form TelaSelecao
     */
    public TelaSelecao() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        LEVANTADOR_BOTAO = new javax.swing.JButton();
        PONTEIRO_BOTAO = new javax.swing.JButton();
        LIBERO_BOTAO = new javax.swing.JButton();
        OPOSTO_BOTAO = new javax.swing.JButton();
        CENTRAL_BOTAO = new javax.swing.JButton();
        FINALIZAR_BOTAO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Escolha sua Posição que deseja Jogar:");

        LEVANTADOR_BOTAO.setText("Levantador");
        LEVANTADOR_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEVANTADOR_BOTAOActionPerformed(evt);
            }
        });

        PONTEIRO_BOTAO.setText("Ponteiro");
        PONTEIRO_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PONTEIRO_BOTAOActionPerformed(evt);
            }
        });

        LIBERO_BOTAO.setText("Libero");
        LIBERO_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIBERO_BOTAOActionPerformed(evt);
            }
        });

        OPOSTO_BOTAO.setText("Oposto");
        OPOSTO_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPOSTO_BOTAOActionPerformed(evt);
            }
        });

        CENTRAL_BOTAO.setText("Central");
        CENTRAL_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CENTRAL_BOTAOActionPerformed(evt);
            }
        });

        FINALIZAR_BOTAO.setText("Finalizar");
        FINALIZAR_BOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINALIZAR_BOTAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LIBERO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(LEVANTADOR_BOTAO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FINALIZAR_BOTAO)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PONTEIRO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CENTRAL_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPOSTO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CENTRAL_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PONTEIRO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPOSTO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LEVANTADOR_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LIBERO_BOTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FINALIZAR_BOTAO)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PONTEIRO_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PONTEIRO_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Posição Ponteiro Selecionado!");
    }//GEN-LAST:event_PONTEIRO_BOTAOActionPerformed

    private void CENTRAL_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CENTRAL_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Posição Central Selecionado!");
    }//GEN-LAST:event_CENTRAL_BOTAOActionPerformed

    private void LIBERO_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIBERO_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Poseição Libero Selecionado!");
    }//GEN-LAST:event_LIBERO_BOTAOActionPerformed

    private void OPOSTO_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPOSTO_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Posição Oposto Selecionado!");
    }//GEN-LAST:event_OPOSTO_BOTAOActionPerformed

    private void LEVANTADOR_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEVANTADOR_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Posição Levantador Selecionado!");
    }//GEN-LAST:event_LEVANTADOR_BOTAOActionPerformed

    private void FINALIZAR_BOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALIZAR_BOTAOActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        this.dispose();
    }//GEN-LAST:event_FINALIZAR_BOTAOActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CENTRAL_BOTAO;
    private javax.swing.JButton FINALIZAR_BOTAO;
    private javax.swing.JButton LEVANTADOR_BOTAO;
    private javax.swing.JButton LIBERO_BOTAO;
    private javax.swing.JButton OPOSTO_BOTAO;
    private javax.swing.JButton PONTEIRO_BOTAO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
