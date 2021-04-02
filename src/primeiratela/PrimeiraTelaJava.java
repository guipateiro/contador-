package primeiratela;

public class PrimeiraTelaJava extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiraTelaJava
     */
    public PrimeiraTelaJava() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoIncremento = new javax.swing.JButton();
        textoPrincipal = new javax.swing.JLabel();
        botaoDecremento = new javax.swing.JButton();
        botaoReset = new javax.swing.JButton();
        textoFixo = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        textoSecreto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoIncremento.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        botaoIncremento.setText("++");
        botaoIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncrementoActionPerformed(evt);
            }
        });

        textoPrincipal.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        textoPrincipal.setToolTipText("");

        botaoDecremento.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botaoDecremento.setText("-1");
        botaoDecremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDecrementoActionPerformed(evt);
            }
        });

        botaoReset.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        botaoReset.setText("reset");
        botaoReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResetActionPerformed(evt);
            }
        });

        textoFixo.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        textoFixo.setText("contador:");

        numero.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        numero.setText("0");

        textoSecreto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoSecretoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoSecretoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoSecreto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSecreto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoIncremento)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoReset, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int contador = 0;
    private void botaoIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncrementoActionPerformed
        // TODO add your handling code here:
        contador++;
        numero.setText(""+contador);
    }//GEN-LAST:event_botaoIncrementoActionPerformed

    private void botaoDecrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDecrementoActionPerformed
        // TODO add your handling code here:
        if (contador > 0)
            contador--;
        numero.setText(""+contador);
    }//GEN-LAST:event_botaoDecrementoActionPerformed

    private void botaoResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResetActionPerformed
        // TODO add your handling code here:
        contador = 0;
        numero.setText(""+contador);
    }//GEN-LAST:event_botaoResetActionPerformed

    private void textoSecretoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSecretoMouseEntered
        // TODO add your handling code here:
        textoSecreto.setText("");
    }//GEN-LAST:event_textoSecretoMouseEntered

    private void textoSecretoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSecretoMouseExited
        // TODO add your handling code here:
        textoSecreto.setText("");
    }//GEN-LAST:event_textoSecretoMouseExited
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
            java.util.logging.Logger.getLogger(PrimeiraTelaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTelaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTelaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTelaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraTelaJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDecremento;
    private javax.swing.JButton botaoIncremento;
    private javax.swing.JButton botaoReset;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel textoFixo;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoSecreto;
    // End of variables declaration//GEN-END:variables
}
