/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
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
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    HouseDirectory houseDirectory;
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
            
    JSplitPane splitPane;
    Person person;
    EncounterHistory encounterHistory;
    
    public LoginJPanel(PersonDirectory personDirectory,PatientDirectory patientDirectory, DoctorDirectory doctorDirectory,EncounterHistory encounterHistory,HospitalDirectory hospitalDirectory,HouseDirectory houseDirectory,CommunityDirectory communityDirectory, CityDirectory cityDirectory, JSplitPane splitPane) {
       
        this.splitPane = splitPane;
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.houseDirectory = houseDirectory;
        this.cityDirectory = cityDirectory;
        this.communityDirectory = communityDirectory;
        
        
        initComponents();
        
        
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
        lblNewUser = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserID.setText("User ID");
        add(lblUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 169, -1, -1));

        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 217, -1, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 271, -1, -1));
        add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 166, 160, -1));

        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPasswordFocusLost(evt);
            }
        });
        add(fldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 214, 160, -1));

        lblNewUser.setText("New User?");
        add(lblNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 312, -1, -1));

        lblSignUp.setText("Sign Up");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
        });
        add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 312, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon("/Users/mahith/Library/Mobile Documents/com~apple~CloudDocs/Husky/Coursework/INFO5100/Assignments/Assignment 01/Chigurupati_SaiMahith_002700539/EmployeeDirectory/Login Page BG.jpg")); // NOI18N
        add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Health Care Management System");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, -1));
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
            //JOptionPane.showMessageDialog(this,"Login Successful");
            if(authenticatedUser.getRole().equals("Doctor")){
                
                DoctorJPanel doc = new DoctorJPanel(authenticatedUser,personDirectory,patientDirectory,doctorDirectory,encounterHistory, hospitalDirectory,houseDirectory,communityDirectory,cityDirectory,splitPane);
                splitPane.setRightComponent(doc);
            }else if(authenticatedUser.getRole().equals("Patient")){
                //String patientName = authenticatedUser.getFirstName();
                PatientJPanel pat = new PatientJPanel(authenticatedUser,personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory,communityDirectory,cityDirectory,splitPane);
                splitPane.setRightComponent(pat);
                
            }else if(authenticatedUser.getRole().equals("System Admin")){
                SystemAdminPanel admin = new SystemAdminPanel(authenticatedUser,personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory,communityDirectory,cityDirectory, splitPane);
                splitPane.setRightComponent(admin);
            }else if(authenticatedUser.getRole().equals("Community Admin")){
                CommunityAdminPanel comAdmin = new CommunityAdminPanel(personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory, communityDirectory, cityDirectory,splitPane);
                splitPane.setRightComponent(comAdmin);
            }else if(authenticatedUser.getRole().equals("Hospital Admin")){
                HospitalAdminPanel hpAdmin = new HospitalAdminPanel(authenticatedUser,personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory,communityDirectory,cityDirectory, splitPane);
                splitPane.setRightComponent(hpAdmin);
            }
            

        }else{
            JOptionPane.showMessageDialog(this, "Login Failed");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        // TODO add your handling code here:
        SignUpJFrame signUp = new SignUpJFrame(person,personDirectory,patientDirectory,doctorDirectory,encounterHistory, hospitalDirectory,houseDirectory, communityDirectory, cityDirectory, splitPane);
        splitPane.setRightComponent(signUp);
    }//GEN-LAST:event_lblSignUpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
