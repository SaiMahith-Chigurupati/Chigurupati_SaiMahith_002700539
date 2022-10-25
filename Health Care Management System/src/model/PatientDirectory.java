/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mahith
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory= new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientDirectory(){
        return patientDirectory;
    }
    
    public void setPatientDirectory(ArrayList<Patient> patientDirectory){
        this.patientDirectory= patientDirectory;
    }
    
    public Patient addPatient(){
        Patient patient = new Patient();
        patientDirectory.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient){
        patientDirectory.remove(patient);
    }
    
    public Patient getPatient(String searchPatient){
        for(Patient patient:patientDirectory){
            if(patient.getFirstName().equals(searchPatient)){
                return patient;
            }
        }return null;
    }
    
    public ArrayList<Patient> searchPatient(String searchPatient){
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        
        for(Patient patient:patientDirectory){
            if(patient.getFirstName().equals(searchPatient)){
                patientList.add(patient);
            }
            
        }
        return patientList;
    }
}
