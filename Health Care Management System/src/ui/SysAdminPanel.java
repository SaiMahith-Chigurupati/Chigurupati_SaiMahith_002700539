/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JSplitPane;

/**
 *
 * @author mahith
 */
public class SysAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminPanel
     */
    public SysAdminPanel() {
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

        btnDoctors = new javax.swing.JButton();
        btnHospitals = new javax.swing.JButton();
        btnPatients = new javax.swing.JButton();

        btnDoctors.setText("View Doctors");
        btnDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsActionPerformed(evt);
            }
        });

        btnHospitals.setText("View Hospitals");
        btnHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsActionPerformed(evt);
            }
        });

        btnPatients.setText("View Patients");
        btnPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDoctors)
                .addGap(18, 18, 18)
                .addComponent(btnHospitals)
                .addGap(18, 18, 18)
                .addComponent(btnPatients)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoctors)
                    .addComponent(btnHospitals)
                    .addComponent(btnPatients))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDoctorsActionPerformed

    private void btnHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnHospitalsActionPerformed

    private void btnPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPatientsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctors;
    private javax.swing.JButton btnHospitals;
    private javax.swing.JButton btnPatients;
    // End of variables declaration//GEN-END:variables
}
