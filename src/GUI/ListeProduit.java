/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ProduitDAO;
import Entity.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metier.Freechart;

/**
 *
 * @author ahmed
 */
public class ListeProduit extends javax.swing.JFrame {

    /**
     * Creates new form ListeProduit
     */
    public ListeProduit() {
        initComponents();
        add();
        this.setDefaultCloseOperation(ListeProduit.DO_NOTHING_ON_CLOSE);
    }
    
    
    
    public void add()
    {
           DefaultTableModel tm = (DefaultTableModel) tableLP.getModel();
       
       
        List<Produit> ser=new ArrayList<Produit>();
       ser=ProduitDAO.getInstance().readAll();
       for (int i = 0; i < ser.size(); i++)
       {
    tm.addRow(new Object[] {ser.get(i).getDescription(),ser.get(i).getPrix(),ser.get(i).getRemise(),ser.get(i).getQuantiteInitial(),ser.get(i).getQuantiteDisponible(),ser.get(i).getNom(),ser.get(i).getImage(),ser.get(i).getDeal().getNom()});
       
       }
        
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
        PanelLD = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RadioLD1 = new javax.swing.JRadioButton();
        RadioLD2 = new javax.swing.JRadioButton();
        chercherLD = new javax.swing.JButton();
        RechercheLD = new javax.swing.JTextField();
        PaneltableLD = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLP = new javax.swing.JTable();
        SupprimerLD = new javax.swing.JButton();
        ModifierLD = new javax.swing.JButton();
        AjouterLD = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MenuMU = new javax.swing.JMenuBar();
        FileMU = new javax.swing.JMenu();
        DeconnexionMU = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMU = new javax.swing.JMenu();
        PresentationMU = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" Liste de Produits");

        PanelLD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher Par :");

        RadioLD1.setText("nom Produit");

        RadioLD2.setText("Nom deal");

        chercherLD.setText("Chercher");

        javax.swing.GroupLayout PanelLDLayout = new javax.swing.GroupLayout(PanelLD);
        PanelLD.setLayout(PanelLDLayout);
        PanelLDLayout.setHorizontalGroup(
            PanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLDLayout.createSequentialGroup()
                .addGroup(PanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLDLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(RechercheLD, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLDLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(chercherLD, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLDLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioLD1)
                            .addComponent(RadioLD2)))
                    .addGroup(PanelLDLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PanelLDLayout.setVerticalGroup(
            PanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLDLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RadioLD1)
                .addGap(18, 18, 18)
                .addComponent(RadioLD2)
                .addGap(18, 18, 18)
                .addComponent(RechercheLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chercherLD)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        tableLP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "description", "prix", "remise", "quantité initial", "quantité dispo", "nom", "image", "deal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableLP);
        if (tableLP.getColumnModel().getColumnCount() > 0) {
            tableLP.getColumnModel().getColumn(4).setResizable(false);
            tableLP.getColumnModel().getColumn(6).setResizable(false);
        }

        SupprimerLD.setText("Supprimer Produit");
        SupprimerLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerLDActionPerformed(evt);
            }
        });

        ModifierLD.setText("Modifier Produit");

        AjouterLD.setText("Ajouter Produit");
        AjouterLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterLDActionPerformed(evt);
            }
        });

        jLabel3.setText("donner Nom à supprimer :");

        javax.swing.GroupLayout PaneltableLDLayout = new javax.swing.GroupLayout(PaneltableLD);
        PaneltableLD.setLayout(PaneltableLDLayout);
        PaneltableLDLayout.setHorizontalGroup(
            PaneltableLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneltableLDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PaneltableLDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PaneltableLDLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(AjouterLD)
                .addGap(121, 121, 121)
                .addComponent(ModifierLD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SupprimerLD)
                .addGap(83, 83, 83))
        );
        PaneltableLDLayout.setVerticalGroup(
            PaneltableLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltableLDLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(PaneltableLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifierLD)
                    .addComponent(AjouterLD)
                    .addComponent(SupprimerLD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PaneltableLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo_yellow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh-10.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        FileMU.setText("File");

        DeconnexionMU.setText("Deconnexion");
        DeconnexionMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionMUActionPerformed(evt);
            }
        });
        FileMU.add(DeconnexionMU);

        MenuMU.add(FileMU);

        jMenu1.setText("Statistiques");

        jMenuItem1.setText("Statistiques");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuMU.add(jMenu1);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(PaneltableLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaneltableLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjouterLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterLDActionPerformed
        // TODO add your handling code here:
       AjouterProduit a=new AjouterProduit();
       this.setVisible(false);
       a.setVisible(true);
    }//GEN-LAST:event_AjouterLDActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ListeProduit l=new ListeProduit();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         MenuDeal l=new MenuDeal();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SupprimerLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerLDActionPerformed
        // TODO add your handling code here:
         boolean b;
        Produit d=ProduitDAO.getInstance().readByName(t3.getText());
        if(d!=null){
 
        b=ProduitDAO.getInstance().delete(d);
        if(b==true)
            JOptionPane.showMessageDialog(null,"suppresion effectué");
        else
            JOptionPane.showMessageDialog(null,"suppresion non effectué");
     
        }
        else
             JOptionPane.showMessageDialog(null,"nom inexistant");
        t3.setText(null);
    }//GEN-LAST:event_SupprimerLDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       
      Freechart.getInstance().stats();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListeProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeProduit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterLD;
    private javax.swing.JMenuItem DeconnexionMU;
    private javax.swing.JMenu FileMU;
    private javax.swing.JMenuBar MenuMU;
    private javax.swing.JButton ModifierLD;
    private javax.swing.JPanel PanelLD;
    private javax.swing.JPanel PaneltableLD;
    private javax.swing.JMenuItem PresentationMU;
    private javax.swing.JRadioButton RadioLD1;
    private javax.swing.JRadioButton RadioLD2;
    private javax.swing.JTextField RechercheLD;
    private javax.swing.JButton SupprimerLD;
    private javax.swing.JButton chercherLD;
    private javax.swing.JMenu helpMU;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t3;
    private javax.swing.JTable tableLP;
    // End of variables declaration//GEN-END:variables
}
