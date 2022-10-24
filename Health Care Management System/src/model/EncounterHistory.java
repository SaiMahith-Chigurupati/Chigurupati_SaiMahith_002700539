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
    
    public Encounter getEncounter(String selectedDate){
        for(Encounter encounter:encounterHistory){
            if(encounter.getEncounterDate().equals(selectedDate)){
                return encounter;
            }
        }
        return null;
    }
    
    public ArrayList<Encounter> searchEncounter(String searchPatient){
        ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
        
        for(Encounter encounter:encounterHistory){
            if(encounter.getPatientName().equals(searchPatient)){
                encounterList.add(encounter);
            }
            
        }
        return encounterList;
    }
}
