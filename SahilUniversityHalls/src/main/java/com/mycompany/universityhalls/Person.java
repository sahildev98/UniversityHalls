/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityhalls;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sahil
 */
public abstract class Person {
    // Private variables created to only allow classes that inherits this class alone. 
    // Also to achieve escapsluation. 
    private String forename;
    private String surname;
    private String gender;
    private String address;
    private String nationality;
    private LocalDate dateOfBirth;
    private String phoneNum;
    private int ID;
    private String healthConditions;
     // Constructor is a method used to initiaise objects i.e students/employees entering details. 
    public Person(String forename,String surname,String gender, String address, String nationality, int theYear, int theMonth, int theDay, String phoneNum, int ID, String healthConditions){
        this.forename = forename;
        this.surname = surname;
        this.gender = gender;
        this.address = address;
        this.nationality = nationality;
        dateOfBirth = LocalDate.of(theYear, theMonth, theDay);
        this.phoneNum = phoneNum;
        this.ID = ID;
        this.healthConditions = healthConditions;
    } 
    // Getters and Setters to allow access to all classes that inherits this class.
    public String getForeName(){
        return forename;
    }
    
    public void setForeName(String newForeName){
        newForeName = forename;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String newSurname){
        newSurname = surname;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String newGender){
        newGender = gender;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String newAddress){
        newAddress = address;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public void setNationality(String newNationality){
        newNationality = nationality;
    }
    
    public String getDateOfBirth(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dateOfBirth.format(myFormatObj);
        return formattedDate;
    }
    
    public void setDateOfBirth(LocalDate newDateOfBirth){
        newDateOfBirth = dateOfBirth;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateOfString = sdf.format(dateOfBirth);
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
    
    public String getHealthConditions(){
        return healthConditions;
    }
    
    public void setHealthConditions(String newHealthConditions){
        newHealthConditions = healthConditions;
    }
}
