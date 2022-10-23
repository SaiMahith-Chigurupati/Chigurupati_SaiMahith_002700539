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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory= new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonDirectory(){
        return personDirectory;
    }
    
    public void setPersonDirectory(ArrayList<Person> personDirectory){
        this.personDirectory= personDirectory;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        personDirectory.remove(person);
    }
    
    public Person authenticatePerson(String userID, String password){
        System.out.println(password);
        for(Person authPerson:personDirectory){
            if(authPerson.getUserID().equals(userID) && authPerson.getPassword().equals(password)){
                return authPerson;
            }
            
        }
        return null;
    }
    
}
