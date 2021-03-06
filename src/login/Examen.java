/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Examen extends javax.swing.JFrame {

    /**
     * Creates new form examen1
     */
    private Connection con;
    private Module[] list = new Module[10] ;
    private exam[] current_list = new exam[100];
    int current_count;
    int count;
    int i=0;
    int j=0;
    public Examen() {
        initComponents();
        connection conn = new connection();
        try {
            con = conn.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "select * from module";
        String sql2 = "select specialite from section where codes=?";
        PreparedStatement pst;
        count = 0;
        String specialite = "";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                PreparedStatement pst2 = con.prepareStatement(sql2);
                pst2.setInt(1, rs.getInt("code_sec"));
                ResultSet rs2 = pst2.executeQuery();
                if(rs2.next()){
                    specialite = rs2.getString("specialite");
                }
                
                list[count] = new Module(rs.getInt("codem"), rs.getString("libellem"), specialite );
                count++;
   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        codemodule.setText(Integer.toString(list[i].getCodem()));
        libelle.setText(list[i].getLibelle());
        spec.setText(list[i].getSpeciality());
            
        String sql3 = "select * from examen where module_id=?";
        PreparedStatement pst3;
        int codeModule;
        try {
            pst3 = con.prepareStatement(sql3);
            codeModule = Integer.parseInt(codemodule.getText());
            pst3.setInt(1, codeModule);
            ResultSet rs3 = pst3.executeQuery();
            current_list = new exam[100];
            current_count =0;
            while(rs3.next()){
                String note = Integer.toString(rs3.getInt("note"));
                String mat = rs3.getString("student_id");
                current_list[current_count] = new exam(note, mat, codeModule);
                current_count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        codemodule1.setText(Integer.toString(current_list[j].getCodem()));
        matricule.setText(current_list[j].getMatricule());
        notes.setText(current_list[j].getNote());
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codemodule = new javax.swing.JTextField();
        libelle = new javax.swing.JTextField();
        spec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codemodule1 = new javax.swing.JTextField();
        matricule = new javax.swing.JTextField();
        notes = new javax.swing.JTextField();
        suivant = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        suivant1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Code Module");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Libelle");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sp??cialit??");

        codemodule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codemodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codemoduleActionPerformed(evt);
            }
        });

        libelle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        libelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelleActionPerformed(evt);
            }
        });

        spec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Notes ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Code Module");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Matricule");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Note");

        codemodule1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        matricule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        notes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notesKeyTyped(evt);
            }
        });

        suivant.setBackground(new java.awt.Color(255, 255, 255));
        suivant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        suivant.setText("Suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });

        fermer.setBackground(new java.awt.Color(255, 255, 255));
        fermer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        suivant1.setBackground(new java.awt.Color(255, 255, 255));
        suivant1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        suivant1.setText("Suivant");
        suivant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivant1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codemodule1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel7))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(libelle, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(spec)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codemodule, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(suivant1)
                                    .addGap(50, 50, 50))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fermer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(suivant)))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(codemodule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(suivant1)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codemodule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(suivant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(fermer)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codemoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codemoduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codemoduleActionPerformed

    private void libelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libelleActionPerformed

    private void specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        JFrame frame= new JFrame("Fermer");
    if(JOptionPane.showConfirmDialog(frame, "Voullez vous vraiment fermer? ", "Fermer"
    , JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
       System.exit(0);}  
    }//GEN-LAST:event_fermerActionPerformed

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
        
        
        String sql3 = "UPDATE examen SET note=? WHERE student_id=? AND module_id=?";
        PreparedStatement pst3;
        int note;
        int codeModule;
        int stay=0;
        try {
            codeModule = Integer.parseInt(codemodule1.getText());
            pst3 = con.prepareStatement(sql3);
            note = Integer.parseInt(notes.getText());
            if (note>20 || note<0){
                jLabel8.setText("Error note can't be bigger than 20");
                stay = 1;
            }
            else{
                

            pst3.setInt(1, note);
            pst3.setString(2, matricule.getText());
            pst3.setInt(3, codeModule);
            int rs3 = pst3.executeUpdate();
            if(rs3>0){
                jLabel8.setText("Success!");
                if (j==0){
                    current_list[current_count-1].setNote(notes.getText());
                }
                else{
                    current_list[j-1].setNote(notes.getText());
                }
                
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        if(stay==0){
            if (j==current_count-1){
            j=0;
            }
            else{
                j++;            
            }
            
        }
        
        codemodule1.setText(Integer.toString(current_list[j].getCodem()));
        matricule.setText(current_list[j].getMatricule());
        notes.setText(current_list[j].getNote());
        //
    }//GEN-LAST:event_suivantActionPerformed

    private void suivant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivant1ActionPerformed
        // TODO add your handling code here:
        if (i==count-1){
            i=0;
        }
        else{
            i++;            
        }

        codemodule.setText(Integer.toString(list[i].getCodem()));
        libelle.setText(list[i].getLibelle());
        spec.setText(list[i].getSpeciality());
        
        //
        
        String sql = "select * from examen where module_id=?";
        PreparedStatement pst;
        int codeModule;
        try {
            pst = con.prepareStatement(sql);
            codeModule = Integer.parseInt(codemodule.getText());
            pst.setInt(1, codeModule);
            ResultSet rs = pst.executeQuery();
            current_list = new exam[100];
            current_count=0;
            while(rs.next()){
                String note = Integer.toString(rs.getInt("note"));
                String mat = rs.getString("student_id");
                current_list[current_count] = new exam(note, mat, codeModule);
                current_count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        codemodule1.setText(Integer.toString(current_list[j].getCodem()));
        matricule.setText(current_list[j].getMatricule());
        notes.setText(current_list[j].getNote());
        
        
        
        
    }//GEN-LAST:event_suivant1ActionPerformed

    private void notesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notesKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
    String text = notes.getText();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_notesKeyTyped

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
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codemodule;
    private javax.swing.JTextField codemodule1;
    private javax.swing.JButton fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField libelle;
    private javax.swing.JTextField matricule;
    private javax.swing.JTextField notes;
    private javax.swing.JTextField spec;
    private javax.swing.JButton suivant;
    private javax.swing.JButton suivant1;
    // End of variables declaration//GEN-END:variables
}
