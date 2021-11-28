/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */


/**
 *
 * @author Youcef
 */
public class ModEtu1 extends javax.swing.JFrame {

    /**
     * Creates new form AddEtu
     */
    public ModEtu1() {
        initComponents();
        ajouter.setEnabled(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        annuler = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        txtgroupe = new javax.swing.JLabel();
        txtsection = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtprenom = new javax.swing.JLabel();
        txtnom = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtmatricule = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        ajouter.setText("Modifier");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        txtgroupe.setText("Groupe");

        txtsection.setText("Section");

        txtprenom.setText("Prenom");

        txtnom.setText("Nom");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        txtmatricule.setText("Matricule");

        jButton4.setText("Rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Modifier Etudiant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ajouter)
                .addGap(18, 18, 18)
                .addComponent(annuler)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom)
                            .addComponent(txtprenom)
                            .addComponent(txtsection)
                            .addComponent(txtgroupe))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(txtmatricule))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprenom)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsection)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgroupe)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler)
                    .addComponent(ajouter))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
    int confirmed = JOptionPane.showConfirmDialog(null, "Quitter?","QUIT",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_annulerActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, "Modifier Etudiante?","MODIFIER",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION){
            String nom, prenom, section;
            nom = jTextField2.getText();
            prenom = jTextField3.getText();
            section = jTextField4.getText();
            String mat = jTextField1.getText();
            int group = Integer.parseInt(jTextField5.getText().trim());
            if (!checkName(nom, prenom, section)){
                jLabel2.setText("nom, prenom and section fields acceptes only letters");
            }
            String spe, lib;
            lib = Character.toString(section.charAt(section.length() -1)).toUpperCase();
            spe = section.substring(0, section.length() - 1).toUpperCase();


            try {
                connection conn = new connection();
                Connection con = conn.connect();
                String sql2 = "select * from section where specialite=? and libelle=?";
                String sql = "update etudiant set nom=?, prenom=?, groupe=?, codes=? where matricule=?";
                PreparedStatement pst = con.prepareStatement(sql2);
                pst.setString(1, spe);
                pst.setString(2, lib);

                ResultSet rs = pst.executeQuery();
                if (rs.next()){

                    int codes = rs.getInt("codes");
                    PreparedStatement pst2 = con.prepareStatement(sql);
                    pst2.setString(1, nom);
                    pst2.setString(2, prenom);
                    pst2.setString(4, Integer.toString(codes));
                    pst2.setInt(3, group);
                    pst2.setString(5, mat);
                   

                    int rs2 = pst2.executeUpdate();
                    if (rs2>0){

                        jLabel2.setText("Student Modified successfully!");
                    }
                    else{
                        jLabel2.setText("error !");
                    }

                }
                else{
                    jLabel2.setText("Section doesn't exist!");
                }
            con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModEtu1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ModEtu1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            ajouter.setEnabled(false);
        }
        else{
            jLabel2.setText("Modification annule");
        }
        
        
        //this.dispose();
        
        
    }//GEN-LAST:event_ajouterActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String mat = jTextField1.getText();
    String nom, prenom, group, lib, spe;
    int codes;
        try {
            connection conn = new connection();
            Connection con = conn.connect();
            String sql = "select * from etudiant where matricule=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, mat);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                codes = rs.getInt("codes");
                group = rs.getString("groupe");
                String sql2 = "select specialite, libelle from section where codes=?";
                PreparedStatement pst2 = con.prepareStatement(sql2);
                String code = Integer.toString(codes);
                pst2.setInt(1, codes);
                ResultSet rs2 = pst2.executeQuery();
                if (rs2.next()){
                    lib = rs2.getString("libelle");
                    spe = rs2.getString("specialite");
                    
                    // setting to fileds
                    jTextField2.setText(nom);
                    jTextField3.setText(prenom);
                    jTextField4.setText(spe+lib);
                    jTextField5.setText(group);
                    
                    jTextField1.setEnabled(false);
                    jButton4.setEnabled(false);
                    ajouter.setEnabled(true);
                }
                else jLabel2.setText("error !");
                
                
                
            }
            else{
                jLabel2.setText("Matricule doesn't exists !");
                
            }
        con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModEtu1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModEtu1.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
    char enter = evt.getKeyChar();
    String text = jTextField5.getText();
        if(!(Character.isDigit(enter)) || Character.getNumericValue(enter)>4 || Character.getNumericValue(enter)<=0 || text.length()==1){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(ModEtu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModEtu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModEtu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModEtu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModEtu1().setVisible(true);
            }
        });
    }
    private static boolean checkName(String str1, String str2, String str3) {
        String expression = "^[a-zA-Z]+";
        if (str1.matches(expression) && str2.matches(expression) && str3.matches(expression)){
            return true;
        }
        return false;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JButton annuler;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel txtgroupe;
    private javax.swing.JLabel txtmatricule;
    private javax.swing.JLabel txtnom;
    private javax.swing.JLabel txtprenom;
    private javax.swing.JLabel txtsection;
    // End of variables declaration//GEN-END:variables
}

