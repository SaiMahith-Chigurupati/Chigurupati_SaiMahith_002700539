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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory(){
        this.hospitalDirectory= new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital> getHospitalDirectory(){
        return hospitalDirectory;
    }
    
    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory){
        this.hospitalDirectory= hospitalDirectory;
    }
    
    public Hospital addHospital(){
        Hospital hospital = new Hospital();
        hospitalDirectory.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(Hospital hospital){
        hospitalDirectory.remove(hospital);
    }
    
    public Hospital getHospital(String name){
        for(Hospital hospital:hospitalDirectory){
            if(hospital.getHospitalName().equals(name)){
                return hospital;
            }
            
        }
        return null;
    }
    
    public boolean isExist(String hospitalName, String community){
        for(Hospital hospital:hospitalDirectory){
            if(hospital.getHospitalName().equals(hospitalName) && hospital.getCommunity().equals(community)){
                return true;
            }
            
        }
        return false;
    }
    
    public ArrayList<Hospital> getHospitalList(String name){
        ArrayList<Hospital> hospitalList = new ArrayList();
        for(Hospital hospital:hospitalDirectory){
            if(hospital.getHospitalName().equals(name)){
                hospitalList.add(hospital);
            }
            
        }
        return hospitalList;
    }
}
