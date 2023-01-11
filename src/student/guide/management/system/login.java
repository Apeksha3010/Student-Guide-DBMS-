package student.guide.management.system;

import java.util.HashSet;
import javax.swing.JOptionPane;
import Project.ConnectionProvider;
import java.sql.*;

public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        showpassCheck = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/guide/management/system/loginpage1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2000, 1100));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setText("Username :");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setText("Password :");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        usernameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 271, -1));

        passwordText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 271, -1));

        showpassCheck.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        showpassCheck.setText("Show password");
        showpassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCheckActionPerformed(evt);
            }
        });
        getContentPane().add(showpassCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 149, -1));

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Login as Student");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 170, -1));

        CloseButton.setBackground(new java.awt.Color(255, 0, 0));
        CloseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 730, 90, -1));

        registerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 620, 99, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Don't have an account? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 169, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 96, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Login as Guide");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, 170, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("STUDENT - GUIDE MANAGEMENT SYSTEM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("LOGIN ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/guide/management/system/loginpage1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -220, 2090, 1760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        try{
        Connection con = ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs;
        String user=usernameText.getText();
        String pass =passwordText.getText();
        String sql="Select name,usn from student where name='"+user+"' and usn = '"+pass+"'";
        rs=st.executeQuery(sql);
        if(rs.next())
        {
            setVisible(false);
            Homepage hp = new Homepage(pass);
            hp.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect username or Password !!! Try Again...","Error",JOptionPane.ERROR_MESSAGE );
            usernameText.setText("");
            passwordText.setText("");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Incorrect username or Password !!! Try Again...","Error",JOptionPane.ERROR_MESSAGE );
            usernameText.setText("");
            passwordText.setText("");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Are you sure about closing the app?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void showpassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassCheckActionPerformed
        // TODO add your handling code here:
        if(showpassCheck.isSelected())
            passwordText.setEchoChar((char)0);
        else
            passwordText.setEchoChar('*');
    
    }//GEN-LAST:event_showpassCheckActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        if(registerButton.isEnabled()){
            new Register().setVisible(true);
        }
            
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        Connection con = ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs;
        String user=usernameText.getText();
        String pass =passwordText.getText();
        String sql="Select gname,guide_id from guide where gname='"+user+"' and guide_id = '"+pass+"'";
        rs=st.executeQuery(sql);
        if(rs.next())
        {
            setVisible(false);
            Guidepage gp = new Guidepage(pass);
            gp.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect username or Password !!! Try Again...","Error",JOptionPane.ERROR_MESSAGE );
            usernameText.setText("");
            passwordText.setText("");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Incorrect username or Password !!! Try Again...","Error",JOptionPane.ERROR_MESSAGE );
            usernameText.setText("");
            passwordText.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox showpassCheck;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
