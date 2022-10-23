/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author mahith
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    PersonDirectory personDirectory;
    public LoginJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        Person doctor = personDirectory.addPerson();
        //Person patient = personDirectory.addPerson();
        
        doctor.setFirstName("John");
        doctor.setLastName("Doctor");
        doctor.setUserID("John@doctor");
        doctor.setPassword("password");
        doctor.setRole("Doctor");
        
//        patient.setFirstName("John");
//        patient.setLastName("Patient");
//        patient.setUserID("John@patient");
//        patient.setPassword("password");
//        patient.setRole("Patient");
        
        doctor.setFirstName("Johnson");
        doctor.setLastName("Banner");
        doctor.setUserID("Johnson@doctor");
        doctor.setPassword("passwordson");
        doctor.setRole("Doctor");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUserID = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();

        lblUserID.setText("User ID");

        lblPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        fldPassword.setText("password");
        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserID)
                            .addComponent(lblPassword))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtUserID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnLogin)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnLogin)
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusGained
        // TODO add your handling code here:
        fldPassword.setText("");
    }//GEN-LAST:event_fldPasswordFocusGained

    private void fldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fldPasswordFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userID = txtUserID.getText();
        
        String password =new String(fldPassword.getPassword());
        
        Person authenticatedUser = personDirectory.authenticatePerson(userID, password);
        if(authenticatedUser!= null){
            JOptionPane.showMessageDialog(this,"Login Successful");
//            DoctorJPanel doctor = new DoctorJPanel();
//            HomeJFrame hf = new HomeJFrame();
//            JOptionPane.setRootFrame(hf);
//            this.add
            
            hf.add(doctor);
        }else{
            JOptionPane.showMessageDialog(this, "Login Failed");
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
