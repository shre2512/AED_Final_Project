/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author babsybabu
 */
public class petAdoptionRecords {
    private ArrayList<petProfileForAdoption> records;
    public petAdoptionRecords(){
        this.records=new ArrayList<petProfileForAdoption>();
    }

    public ArrayList<petProfileForAdoption> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<petProfileForAdoption> records) {
        this.records = records;
    }
    
    public petProfileForAdoption addNewEmployee(){
        petProfileForAdoption newEmp=new petProfileForAdoption();
        records.add(newEmp);
        return newEmp;
    }

    public void deleteEmployee(petProfileForAdoption emp) {
        records.remove(emp);
    }
    
    public petProfileForAdoption updateEmployee(int index,petProfileForAdoption emp){
    records.set(index,emp);
    return emp;
    }
}
