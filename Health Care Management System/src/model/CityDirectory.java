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
public class CityDirectory {

    private ArrayList<City> cityDirectory;

    public CityDirectory(){
        this.cityDirectory= new ArrayList<City>();
    }
    
    public ArrayList<City> getCityDirectory(){
        return cityDirectory;
    }
    
    public void setCityDirectory(ArrayList<City> cityDirectory){
        this.cityDirectory= cityDirectory;
    }
    
    public City addCity(){
        City city = new City();
        cityDirectory.add(city);
        return city;
    }
    
    public void deleteCity(City city){
        cityDirectory.remove(city);
    }
    
    public City getCity(String name){
        for(City city:cityDirectory){
            if(city.getCity().equals(name)){
                return city;
            }
            
        }
        return null;
    }
}
