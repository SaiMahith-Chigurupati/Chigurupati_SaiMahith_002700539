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
public class HouseDirectory {
    private ArrayList<House> houseDirectory;

    public HouseDirectory(){
        this.houseDirectory= new ArrayList<House>();
    }
    
    public ArrayList<House> getHouseDirectory(){
        return houseDirectory;
    }
    
    public void setHouseDirectory(ArrayList<House> houseDirectory){
        this.houseDirectory= houseDirectory;
    }
    
    public House addHouse(){
        House house = new House();
        houseDirectory.add(house);
        return house;
    }
    
    public void deleteHouse(House house){
        houseDirectory.remove(house);
    }
    
    public House getHouse(String name){
        for(House house:houseDirectory){
            if(house.getHouse().equals(name)){
                return house;
            }
            
        }
        return null;
    }
}
