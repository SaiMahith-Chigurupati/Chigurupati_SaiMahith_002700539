/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author mahith
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    JSplitPane splitPane;
    Person patient;
    EncounterHistory encounterHistory;
    String doctorFname;
    
    public PatientJPanel(Person patient, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, EncounterHistory encounterHistory, JSplitPane splitPane) {
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
        this.splitPane = splitPane;
        this.patient = patient;
     
        initComponents();
        lblPatient.setText("Welcome "+patient.getFirstName());
        vitalsPanel.setVisible(false);
        bookAppointmentPanel.setVisible(false);
        btnBookAppointment.setVisible(false);
        //scrollEncounters.setVisible(false);
        chDate.setDateFormatString("MM-dd-YYYY");
        populateDoctorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        lblPatient = new javax.swing.JLabel();
        lblPersonalDetails = new javax.swing.JLabel();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        scrollEncounters = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        btnBookAppointment = new javax.swing.JButton();
        vitalsPanel = new javax.swing.JPanel();
        lblBP = new javax.swing.JLabel();
        txtSystole = new javax.swing.JTextField();
        lblSystole = new javax.swing.JLabel();
        lblDiastole = new javax.swing.JLabel();
        txtDiastole = new javax.swing.JTextField();
        lblDiabetes = new javax.swing.JLabel();
        lblPreDiet = new javax.swing.JLabel();
        txtPreDiet = new javax.swing.JTextField();
        lblPostDiet = new javax.swing.JLabel();
        txtPostDiet = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        lblComments = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        bookAppointmentPanel = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        chDate = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        lblInfo = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        lblPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPersonalDetails.setText("   View/Update Details");
        lblPersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonalDetailsMouseClicked(evt);
            }
        });

        btnSearchDoctor.setText("Search Doctor");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor", "Hospital", "Community"
            }
        ));
        tblDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctors);

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Encounters"
            }
        ));
        tblEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncountersMouseClicked(evt);
            }
        });
        scrollEncounters.setViewportView(tblEncounters);

        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        lblBP.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBP.setText("BP:");

        txtSystole.setEditable(false);

        lblSystole.setText("Systole");

        lblDiastole.setText("Diastole");

        txtDiastole.setEditable(false);

        lblDiabetes.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDiabetes.setText("Diabetes:");

        lblPreDiet.setText("Pre Diet");

        txtPreDiet.setEditable(false);

        lblPostDiet.setText("Post Diet");

        txtPostDiet.setEditable(false);

        txtComments.setEditable(false);
        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane3.setViewportView(txtComments);

        lblComments.setText("Comments");

        lblHeartRate.setText("Heart Rate");

        txtHeartRate.setEditable(false);

        javax.swing.GroupLayout vitalsPanelLayout = new javax.swing.GroupLayout(vitalsPanel);
        vitalsPanel.setLayout(vitalsPanelLayout);
        vitalsPanelLayout.setHorizontalGroup(
            vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vitalsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vitalsPanelLayout.createSequentialGroup()
                        .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSystole, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreDiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(vitalsPanelLayout.createSequentialGroup()
                                .addComponent(lblDiastole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiastole, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vitalsPanelLayout.createSequentialGroup()
                                .addComponent(lblPostDiet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPostDiet))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vitalsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPreDiet)
                        .addComponent(lblHeartRate)
                        .addComponent(lblSystole)
                        .addComponent(lblBP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiabetes))
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        vitalsPanelLayout.setVerticalGroup(
            vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vitalsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSystole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiastole)
                    .addComponent(txtDiastole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreDiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostDiet)
                    .addComponent(txtPostDiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComments))
                .addGap(63, 63, 63))
            .addGroup(vitalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vitalsPanelLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(lblBP)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblSystole)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblDiabetes)
                    .addGap(18, 18, 18)
                    .addComponent(lblPreDiet)
                    .addGap(18, 18, 18)
                    .addComponent(lblHeartRate)
                    .addContainerGap(169, Short.MAX_VALUE)))
        );

        lblDate.setText("Date");

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane4.setViewportView(txtInfo);

        lblInfo.setText("Info");

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookAppointmentPanelLayout = new javax.swing.GroupLayout(bookAppointmentPanel);
        bookAppointmentPanel.setLayout(bookAppointmentPanelLayout);
        bookAppointmentPanelLayout.setHorizontalGroup(
            bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookAppointmentPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBook)
                    .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(chDate, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        bookAppointmentPanelLayout.setVerticalGroup(
            bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblInfo))
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnBook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchDoctor)
                .addGap(52, 52, 52))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(vitalsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookAppointmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonalDetails)
                    .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDoctor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBookAppointment)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vitalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookAppointmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPersonalDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalDetailsMouseClicked
        // TODO add your handling code here:
        SignUpJFrame signUp = new SignUpJFrame(patient,personDirectory,patientDirectory,doctorDirectory,encounterHistory,splitPane);
        splitPane.setRightComponent(signUp);
    }//GEN-LAST:event_lblPersonalDetailsMouseClicked

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        vitalsPanel.setVisible(false);
        bookAppointmentPanel.setVisible(true);
        
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void tblDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorsMouseClicked
        // TODO add your handling code here:
        
        btnBookAppointment.setVisible(true);
        int index = tblDoctors.getSelectedRow();
        TableModel model = tblDoctors.getModel();
        
        doctorFname = model.getValueAt(index, 0).toString();
        
        ArrayList<Encounter> encounterList = encounterHistory.searchEncounter(doctorFname, patient.getUserID());
        populateEncounters(encounterList);
        
        
 
    }//GEN-LAST:event_tblDoctorsMouseClicked

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here:
        String doctorName = txtSearchDoctor.getText();
        
        ArrayList<Doctor> doctorList = doctorDirectory.getDoctorList(doctorName);
        
        if(doctorList.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Results Found!");

        }else{
            
            populateSearchResults(doctorList);
        
        }

    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void tblEncountersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncountersMouseClicked
        // TODO add your handling code here:
        int index = tblEncounters.getSelectedRow();
        TableModel model = tblEncounters.getModel();
        
        String encounterDate = model.getValueAt(index, 0).toString();
        
        Encounter selectedEncounter = encounterHistory.getEncounter(encounterDate);
        if(selectedEncounter.getComments().equals(" ")){
            vitalsPanel.setVisible(false);
            JOptionPane.showMessageDialog(this, "No Vitals Added\nINFO: "+selectedEncounter.getInfo());
            
        }else{
            vitalsPanel.setVisible(true);
        
            txtSystole.setText(String.valueOf(selectedEncounter.getSystole()));
            txtDiastole.setText(String.valueOf(selectedEncounter.getDiastole()));
            txtPreDiet.setText(String.valueOf(selectedEncounter.getPreDiet()));
            txtPostDiet.setText(String.valueOf(selectedEncounter.getPostDiet()));
            txtHeartRate.setText(String.valueOf(selectedEncounter.getHeartRate()));
            txtComments.setText(selectedEncounter.getComments());
        }
        
    }//GEN-LAST:event_tblEncountersMouseClicked

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        
        String appointmentdate = chDate.getDate().toString().substring(0, 10);
        String info = txtInfo.getText();

        Encounter newEncounter = encounterHistory.addEncounter();
        newEncounter.setEncounterDate(appointmentdate);
        newEncounter.setInfo(info);
        newEncounter.setUserID(patient.getUserID());
        newEncounter.setDoctorName(doctorFname);
        newEncounter.setComments(" ");
        
        JOptionPane.showMessageDialog(this, "New Appointment created with "+doctorFname+" on "+appointmentdate);
        
        tblDoctorsMouseClicked(null);
        
        bookAppointmentPanel.setVisible(false);
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel(personDirectory,patientDirectory,doctorDirectory,encounterHistory,splitPane);
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookAppointmentPanel;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearchDoctor;
    private com.toedter.calendar.JDateChooser chDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiabetes;
    private javax.swing.JLabel lblDiastole;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPersonalDetails;
    private javax.swing.JLabel lblPostDiet;
    private javax.swing.JLabel lblPreDiet;
    private javax.swing.JLabel lblSystole;
    private javax.swing.JScrollPane scrollEncounters;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtDiastole;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtPostDiet;
    private javax.swing.JTextField txtPreDiet;
    private javax.swing.JTextField txtSearchDoctor;
    private javax.swing.JTextField txtSystole;
    private javax.swing.JPanel vitalsPanel;
    // End of variables declaration//GEN-END:variables

    private void populateDoctorTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor doctor: doctorDirectory.getDoctorDirectory()){
            if(patient.getCommunity().equals(doctor.getCommunity())){
                Object[] Row =new Object[3];
                Row[0] = doctor.getFirstName();
                Row[1] = doctor.getHospital();
                Row[2] = doctor.getCommunity();

                model.addRow(Row);
            }
            
        }
    }
    
    private void populateSearchResults(ArrayList<Doctor> doctorList){
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor doctor: doctorList){
            
            Object[] Row =new Object[3];
            Row[0] = doctor.getFirstName();
            Row[1] = doctor.getHospital();
            Row[2] = doctor.getCommunity();
            
            model.addRow(Row);
            
        }
    }
    
    private void populateEncounters(ArrayList<Encounter> encounterList){
        scrollEncounters.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        for(Encounter encounter: encounterList){
            
            Object[] Row =new Object[3];
            Row[0] = encounter.getEncounterDate();
            
            model.addRow(Row);
            
        }
    }

}
