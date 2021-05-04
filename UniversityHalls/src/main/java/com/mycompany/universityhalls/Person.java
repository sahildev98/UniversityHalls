/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityhalls;

import java.util.Date;

/**
 *
 * @author Sahil
 */
public class Person {
    // Private variables created to only allow classes that inherits this class alone. 
    // Also to achieve escapsluation. 
    private String name;
    private String gender;
    private String nationality;
    private Date dateOfBirth;
    private String phoneNum;
    private int ID;
    private String healthConditions;
     // Constructor is a method used to initiaise objects i.e students entering details. 
    public Person(String name,String gender, String nationality, Date dateOfbirth, String phoneNum, int ID, String healthConditions){
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.dateOfBirth = dateOfbirth;
        this.phoneNum = phoneNum;
        this.ID = ID;
        this.healthConditions = healthConditions;
    } 
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        newName = name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String newGender){
        newGender = gender;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public void setNationality(String newNationality){
        newNationality = nationality;
    }
    
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date newDateOfBirth){
        newDateOfBirth = dateOfBirth;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public void setPhoneNum(String newNum){
        newNum = phoneNum;
    }
    
    public int getID (){
        return ID;
    }
    
    public void setID(int newID){
        newID = ID;
    }
}
