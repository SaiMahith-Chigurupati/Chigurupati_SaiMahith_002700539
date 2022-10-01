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
public class EmployeesData {
    
    private ArrayList<EmployeeDetails> data;
    
    public EmployeesData(){
        this.data = new ArrayList<EmployeeDetails>();
    }

    public ArrayList<EmployeeDetails> getData() {
        return data;
    }

    public void setData(ArrayList<EmployeeDetails> data) {
        this.data = data;
    }
    
    public EmployeeDetails addNewEmployee(){
        EmployeeDetails newEmployee = new EmployeeDetails();
        data.add(newEmployee);
        return newEmployee;
        
    }
    
    public void deleteEmployee(EmployeeDetails ed){
        data.remove(ed);
    }
    
    public ArrayList<EmployeeDetails> getEmployee(String searchName, String empId, String level){
        ArrayList<EmployeeDetails> ed1=new ArrayList<EmployeeDetails>();
        for(EmployeeDetails ed:data){
            
            if(ed.getName().equals(searchName)|| ed.getLevel().equals(level)|| ed.getEmpId().equals(empId)){
                
                ed1.add(ed);
                
                
            }
        }

        return ed1;
    }
    
}
