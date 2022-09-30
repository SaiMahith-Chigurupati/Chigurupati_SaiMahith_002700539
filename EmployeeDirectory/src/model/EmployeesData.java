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
    
    
    
}
