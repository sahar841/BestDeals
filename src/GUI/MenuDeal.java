/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HAMZA
 */
public class MenuDeal extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeal
     */
    public MenuDeal() {
        initComponents();
        this.setDefaultCloseOperation(MenuDeal.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BoutonMU1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BoutonMU2 = new javax.swing.JButton();
        MenuMU = new javax.swing.JMenuBar();
        FileMU = new javax.swing.JMenu();
        DeconnexionMU = new javax.swing.JMenuItem();
        helpMU = new javax.swing.JMenu();
        PresentationMU = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Menu Deal ");

        BoutonMU1.setBackground(new java.awt.Color(255, 255, 255));
        BoutonMU1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BoutonMU1.setForeground(new java.awt.Color(51, 51, 51));
        BoutonMU1.setText("Deals ");
        BoutonMU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMU1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Produit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BoutonMU2.setBackground(new java.awt.Color(255, 255, 255));
        BoutonMU2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BoutonMU2.setForeground(new java.awt.Color(51, 51, 51));
        BoutonMU2.setText("Catalogue");
        BoutonMU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMU2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonMU2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonMU1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(BoutonMU1)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(BoutonMU2)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        FileMU.setText("File");

        DeconnexionMU.setText("Deconnexion");
        DeconnexionMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionMUActionPerformed(evt);
            }
        });
        FileMU.add(DeconnexionMU);

        MenuMU.add(FileMU);

        helpMU.setText("?");

        PresentationMU.setText("Presentation");
        PresentationMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentationMUActionPerformed(evt);
            }
        });
        helpMU.add(PresentationMU);

        MenuMU.add(helpMU);

        setJMenuBar(MenuMU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName(" ");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonMU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMU2ActionPerformed
        // TODO add your handling code here:
        ListeCatalogue a= new ListeCatalogue();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BoutonMU2ActionPerformed

    private void BoutonMU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMU1ActionPerformed
        // TODO add your handling code here:
        ListDeal a= new ListDeal();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BoutonMU1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ListeProduit a= new ListeProduit();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PresentationMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentationMUActionPerformed
        // TODO add your handling code here:
        Presentation p=new Presentation();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_PresentationMUActionPerformed

    private void DeconnexionMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionMUActionPerformed
        // TODO add your handling code here:
         ConnexionBestDeal cnx = new ConnexionBestDeal();
        this.setVisible(false);
        cnx.setVisible(true);
    }//GEN-LAST:event_DeconnexionMUActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         AcceuilBestDeal l=new AcceuilBestDeal();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDeal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonMU1;
    private javax.swing.JButton BoutonMU2;
    private javax.swing.JMenuItem DeconnexionMU;
    private javax.swing.JMenu FileMU;
    private javax.swing.JMenuBar MenuMU;
    private javax.swing.JMenuItem PresentationMU;
    private javax.swing.JMenu helpMU;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}