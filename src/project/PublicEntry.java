/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PublicEntry extends javax.swing.JFrame {

    private CreateAccount acc;
    private ArrayList<WriteEntry> write;

    java.sql.Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PublicEntry() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public PublicEntry(CreateAccount obj) throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.acc = obj;
        write = new ArrayList();
        populateArrayList();
        printArrayList();
    }

    public void printArrayList() {
        for (int i = 0; i < write.size(); i++) {
            System.out.println("Title " + write.get(i).getEntryTitle() + " Text Body " + write.get(i).getEntryBody());
        }
    }

    // adding entries to arraylist from database
    public void populateArrayList() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con;
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##seproject", "123");

        try {
            PreparedStatement pst;
            String query = "SELECT ENTRY_TITLE, ENTRY_BODY FROM C##SEPROJECT.ENTRY where entry_type = 'public'";
            pst = con.prepareStatement(query);

            ResultSet rs;
            rs = pst.executeQuery(query);

            EntriesList.addItem("Entries");

            while (rs.next()) {
                String temp_eTitle = rs.getString("ENTRY_TITLE");
                String temp_eBody = rs.getString("ENTRY_BODY");

                EntriesList.addItem(temp_eTitle);
                write.add(new WriteEntry(temp_eTitle, temp_eBody));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntriesList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EntriesList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EntriesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntriesListActionPerformed(evt);
            }
        });
        getContentPane().add(EntriesList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 290, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Entry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 180, 30));

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 290, 230));

        back.setBackground(new java.awt.Color(44, 182, 125));
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 363, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MacBook_Air_-_9_50.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntriesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntriesListActionPerformed
        // TODO add your handling code here:
        int selectedIndex = EntriesList.getSelectedIndex();
        System.out.printf("Length: %d\n", write.size());
        if (selectedIndex > 0) {
            TextArea.setText("");
            TextArea.setText(write.get(selectedIndex - 1).getEntryBody());
        }
    }//GEN-LAST:event_EntriesListActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainPage(this.acc).show();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(PublicEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublicEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublicEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublicEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PublicEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EntriesList;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
