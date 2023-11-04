/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class SignupPage extends javax.swing.JFrame {
    
    java.sql.Connection con = null ;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
   
    public SignupPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 182, 125));
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 91, -1));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 71, 112, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 182, 125));
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 48, 80, -1));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 71, 112, 30));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 232, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 182, 125));
        jLabel3.setText("username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 68, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 182, 125));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 275, 77, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 295, 232, 30));

        back.setBackground(new java.awt.Color(44, 182, 125));
        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 358, 80, 30));

        signup.setBackground(new java.awt.Color(44, 182, 125));
        signup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 358, 100, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign - Up");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 11, 149, 37));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 182, 125));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 50, 20));

        female.setBackground(new java.awt.Color(51, 51, 51));
        female.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female.setForeground(new java.awt.Color(44, 182, 125));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        male.setBackground(new java.awt.Color(51, 51, 51));
        male.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male.setForeground(new java.awt.Color(44, 182, 125));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        other.setBackground(new java.awt.Color(51, 51, 51));
        other.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        other.setForeground(new java.awt.Color(44, 182, 125));
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel1.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 182, 125));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 77, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(44, 182, 125));
        jLabel9.setText("Confirm Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 130, -1));
        jPanel1.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 232, 30));

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 232, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MacBook_Air_-_3_50.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.show(false);
        new SecondPage().show();
    }//GEN-LAST:event_backActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    // length should be greater then 5, should  contain atleast 1 number and special character
    public boolean passwordvalidation(String a){
        if(a.length() < 5){
            return false;
        }
        else{
            int num = 0;
            int letter = 0;
            int special = 0;
            
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(a);
            boolean specialcharacter = matcher.find();
            
            for(int i = 0; i < a.length(); i++){
                System.out.print(a.charAt(i));
                if(Character.isLetter(a.charAt(i)))
                    letter++;
                if(Character.isDigit(a.charAt(i)))
                    num++;
                
            }
            
            
            if(num == 0 || letter == 0 || !specialcharacter)
                return false;
            else
                return true;
        }
    }
    
    
    
    // checking for existing username in database
    public boolean username_dup() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con;
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##seproject", "123");
        
        PreparedStatement pst;
        String query= "select username from c##seproject.users";
        pst = con.prepareStatement(query);
        
        ResultSet rs;
        rs = pst.executeQuery(query);
        
        boolean alreadyexists = false;
        
        while(rs.next()){
            if(rs.getString("username").equals(uname.getText())){
//                JOptionPane.showMessageDialog(null, "username already exists");
                alreadyexists = true;
            }
        }
        return alreadyexists;
    }
    
    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        
        try {
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##seproject", "123");
            
            String username = uname.getText();
            String firstname = fname.getText();
            String lastname = lname.getText();
            String email = mail.getText();
            String password = pass.getText();
            String confirmpassword = cpass.getText();
            String gender = "";
            if(female.isSelected()){
                gender = "F";
            }
            if(male.isSelected()){
                gender = "M";
            }
            
            if(other.isSelected()){
                gender = "O";
            }
            
            // blank fields
            if(firstname.isEmpty() || lastname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields must be filled");
                return;
            }
            
            // confirmation of password
            if(!password.equals(confirmpassword)){
                JOptionPane.showMessageDialog(null, "password must be same");
                cpass.setText("");
                return;
            }
            
             //password validation
            if(!passwordvalidation(password)){
                JOptionPane.showMessageDialog(null, "\n" +
                "Password must contain both numbers and letters, And should be greater than 5");
                return;
            }
            
            // duplication of username
            if(username_dup()){
                JOptionPane.showMessageDialog(null, "username already exits!");
                uname.setText("");
                return;
            }
            
            String sql = "INSERT INTO USERS (USERNAME, FIRSTNAME, LASTNAME, GENDER, EMAIL, PASSWORD) VALUES(?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, username);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, gender);
            pst.setString(5, email);
            pst.setString(6, password);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sign up successfully");
            
            uname.setText("");
            fname.setText("");
            lname.setText("");
            mail.setText("");
            pass.setText("");
            cpass.setText("");
            male.setSelected(false);
            female.setSelected(false); 
            other.setSelected(false);
            
            this.show(false);
            new SecondPage().show();
            
        } catch (SQLException ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signupActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        male.setSelected(true);
        female.setSelected(false);
        other.setSelected(false);
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        male.setSelected(false);
        female.setSelected(true);
        other.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
        male.setSelected(false);
        female.setSelected(false);
        other.setSelected(true);
    }//GEN-LAST:event_otherActionPerformed

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mail;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signup;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
