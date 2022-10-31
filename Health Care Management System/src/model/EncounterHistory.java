/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mahith
 */
public class EncounterHistory {
    ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        this.encounterHistory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterHistory(){
        return encounterHistory;
    }
    
    public void setEncounterHistory(ArrayList<Encounter> encounterHistory){
        this.encounterHistory= encounterHistory;
    }
    
    public Encounter addEncounter(){
        Encounter encounter = new Encounter();
        encounterHistory.add(encounter);
        return encounter;
    }
    
    public void deleteEncounter(Encounter encounter){
        encounterHistory.remove(encounter);
    }
    
    public Encounter getEncounter(Date selectedDate){
        for(Encounter encounter:encounterHistory){
            if(encounter.getEncounterDate().equals(selectedDate)){
                return encounter;
            }
        }
        return null;
    }
    
    public Encounter encounterExist(String userID){
        for(Encounter encounter:encounterHistory){
            
            if(encounter.getUserID().equals(userID)){
                return encounter;
            }
            
        }
        return null;
    }
    
    public ArrayList<Encounter> searchEncounter(String searchDoctor, String searchPatient){
        ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
        
        for(Encounter encounter:encounterHistory){
            
            if(encounter.getUserID().equals(searchPatient) && encounter.getDoctorName().equals(searchDoctor)){
                encounterList.add(encounter);
            }
            
        }
        return encounterList;
    }
}
