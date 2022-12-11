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
    
    public petProfileForAdoption addNewPet(){
        petProfileForAdoption newPet=new petProfileForAdoption();
        records.add(newPet);
        return newPet;
    }

    public void deleteEmployee(petProfileForAdoption pet) {
        records.remove(pet);
    }
    
    public petProfileForAdoption updateEmployee(int index,petProfileForAdoption pet){
    records.set(index,pet);
    return pet;
    }
}
