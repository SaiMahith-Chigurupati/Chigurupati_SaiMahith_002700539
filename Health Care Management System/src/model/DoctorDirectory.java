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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        this.doctorDirectory= new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> getDoctorDirectory(){
        return doctorDirectory;
    }
    
    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory){
        this.doctorDirectory= doctorDirectory;
    }
    
    public Doctor addDoctor(){
        Doctor doctor = new Doctor();
        doctorDirectory.add(doctor);
        return doctor;
    }
    
    public void deleteDoctor(Doctor doctor){
        doctorDirectory.remove(doctor);
    }
    
    public Doctor getDoctor(String name){
        for(Doctor doctor:doctorDirectory){
            if(doctor.getFirstName().equals(name)){
                return doctor;
            }
            
        }
        return null;
    }
    
    public ArrayList<Doctor> getDoctorList(String name){
        ArrayList<Doctor> doctorList = new ArrayList();
        for(Doctor doctor:doctorDirectory){
            if(doctor.getFirstName().equals(name)){
                doctorList.add(doctor);
            }
            
        }
        return doctorList;
    }
    
    
    //public Doctor getDoctor(String )
    
    public Doctor authenticateDoctor(String userID, String password){
        
        for(Doctor authDoctor:doctorDirectory){
            if(authDoctor.getUserID().equals(userID) && authDoctor.getPassword().equals(password)){
                return authDoctor;
            }
            
        }
        return null;
    }
}
