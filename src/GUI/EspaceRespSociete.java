/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DAO.ResponsableSocieteDAO;
import Entity.ResponsableSociete;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class EspaceRespSociete extends javax.swing.JFrame {

    /**
     * Creates new form EspaceRespSociete
     */
    public EspaceRespSociete() {
        initComponents();
        affiche();
        this.setDefaultCloseOperation(EspaceRespSociete.DO_NOTHING_ON_CLOSE);
    }
    
     public void affiche()
    { 
        
        DefaultTableModel tm = (DefaultTableModel) tableLRS.getModel();
      
        List<ResponsableSociete> services=new ArrayList<ResponsableSociete>();
       services=ResponsableSocieteDAO.getInstance().readAll();
       for (int i = 0; i < services.size(); i++)
       {
       tm.addRow(new Object[] {services.get(i).getLogin(),services.get(i).getMotDePasse(),services.get(i).getNom(),services.get(i).getPrenom(),services.get(i).getEmail(),services.get(i).getAdresseSociete(),services.get(i).getPhoneNumber(),services.get(i).getNomSociete(),services.get(i).getCin()});
       }
       tm.addRow(new Object[] {null,null,null,null});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelLRS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RadioLRS1 = new javax.swing.JRadioButton();
        RadioLRS2 = new javax.swing.JRadioButton();
        ChercherLRS = new javax.swing.JButton();
        RechercheLRS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLRS = new javax.swing.JTable();
        SupprimerLRS = new javax.swing.JButton();
        ModifierLRS = new javax.swing.JButton();
        AjouterLRS = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MenuLRS = new javax.swing.JMenuBar();
        FileLRS = new javax.swing.JMenu();
        DeconnexionLRS = new javax.swing.JMenuItem();
        helpLRS = new javax.swing.JMenu();
        PresentationLRS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" Liste de Responsables Societés");

        PanelLRS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher Par :");

        RadioLRS1.setText("Nom Societé");

        RadioLRS2.setText("Nom Resp Societé");

        ChercherLRS.setText("Chercher");

        javax.swing.GroupLayout PanelLRSLayout = new javax.swing.GroupLayout(PanelLRS);
        PanelLRS.setLayout(PanelLRSLayout);
        PanelLRSLayout.setHorizontalGroup(
            PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLRSLayout.createSequentialGroup()
                .addGroup(PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLRSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RechercheLRS, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLRSLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelLRSLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RadioLRS2)
                                        .addComponent(RadioLRS1)))))
                        .addGroup(PanelLRSLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(ChercherLRS))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLRSLayout.setVerticalGroup(
            PanelLRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLRSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RadioLRS1)
                .addGap(18, 18, 18)
                .addComponent(RadioLRS2)
                .addGap(18, 18, 18)
                .addComponent(RechercheLRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChercherLRS)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tableLRS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "login", "mot de passe", "nom", "prenom", "E_mail", "nom Societé", "Adresse Societé", "Phone Number", "CIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLRS);

        SupprimerLRS.setText("Supprimer Resp Societé");
        SupprimerLRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerLRSActionPerformed(evt);
            }
        });

        ModifierLRS.setText("Modifier Resp Societé");
        ModifierLRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierLRSActionPerformed(evt);
            }
        });

        AjouterLRS.setText("Ajouter Resp Societé");
        AjouterLRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterLRSActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh-10.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo_yellow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Entrer Login :");

        FileLRS.setText("File");

        DeconnexionLRS.setText("Deconnexion");
        DeconnexionLRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionLRSActionPerformed(evt);
            }
        });
        FileLRS.add(DeconnexionLRS);

        MenuLRS.add(FileLRS);

        helpLRS.setText("?");

        PresentationLRS.setText("Presentation");
        PresentationLRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentationLRSActionPerformed(evt);
            }
        });
        helpLRS.add(PresentationLRS);

        MenuLRS.add(helpLRS);

        setJMenuBar(MenuLRS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelLRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(AjouterLRS)
                        .addGap(52, 52, 52)
                        .addComponent(ModifierLRS)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SupprimerLRS)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelLRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjouterLRS)
                    .addComponent(SupprimerLRS)
                    .addComponent(ModifierLRS)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PresentationLRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentationLRSActionPerformed
        // TODO add your handling code here:
        Presentation p=new Presentation();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_PresentationLRSActionPerformed

    private void DeconnexionLRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionLRSActionPerformed
        // TODO add your handling code here:
         ConnexionBestDeal cnx = new ConnexionBestDeal();
        this.setVisible(false);
        cnx.setVisible(true);
    }//GEN-LAST:event_DeconnexionLRSActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AcceuilBestDeal l=new AcceuilBestDeal();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        EspaceRespSociete l=new EspaceRespSociete();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuUtilisateur l=new MenuUtilisateur();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModifierLRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierLRSActionPerformed
        // TODO add your handling code here:
       RespSocietéCRUDmodif r=new RespSocietéCRUDmodif();
        this.setVisible(false);
       r.setVisible(true);
        
        
    }//GEN-LAST:event_ModifierLRSActionPerformed

    private void SupprimerLRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerLRSActionPerformed
        // TODO add your handling code here:
        ResponsableSociete d=ResponsableSocieteDAO.getInstance().readByLogin(t1.getText());
       boolean b;
        if(d!=null)
        {   
        b=ResponsableSocieteDAO.getInstance().delete(d);
        if(b==true)
            JOptionPane.showMessageDialog(null,"suppresion effectué");
        else
            JOptionPane.showMessageDialog(null,"suppresion non effectué");
 
         }
        else
             JOptionPane.showMessageDialog(null,"login Inexistant");
        t1.setText(null);
    }//GEN-LAST:event_SupprimerLRSActionPerformed

    private void AjouterLRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterLRSActionPerformed
        // TODO add your handling code here:
        RespSocietéCRUD r=new RespSocietéCRUD();
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_AjouterLRSActionPerformed

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
            java.util.logging.Logger.getLogger(EspaceRespSociete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspaceRespSociete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspaceRespSociete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspaceRespSociete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspaceRespSociete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterLRS;
    private javax.swing.JButton ChercherLRS;
    private javax.swing.JMenuItem DeconnexionLRS;
    private javax.swing.JMenu FileLRS;
    private javax.swing.JMenuBar MenuLRS;
    private javax.swing.JButton ModifierLRS;
    private javax.swing.JPanel PanelLRS;
    private javax.swing.JMenuItem PresentationLRS;
    private javax.swing.JRadioButton RadioLRS1;
    private javax.swing.JRadioButton RadioLRS2;
    private javax.swing.JTextField RechercheLRS;
    private javax.swing.JButton SupprimerLRS;
    private javax.swing.JMenu helpLRS;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tableLRS;
    // End of variables declaration//GEN-END:variables
}
