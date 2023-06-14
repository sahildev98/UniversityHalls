/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityhalls;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Class extends to Person class to acheive abstract inheritance. 
public class Student extends Person {
    private LocalDate yearOfStudy;
    public Student(String forename, String surname, String gender, String address, String nationality, int theYear, int theMonth, int theDay, String phoneNum, int ID, String healthConditions, int theYearOfStudy,int monthOfStudy,int dayOfStudy) {
        super(forename, surname, gender, address, nationality, theYear, theMonth, theDay, phoneNum, ID, healthConditions);
        yearOfStudy = LocalDate.of(theYearOfStudy, monthOfStudy, dayOfStudy);
    }
        /**
     *
     * @return the date of study as a string. 
     */
    public String getDate(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return yearOfStudy.format(myFormatObj);
        
    }
    
    /**
     *  
     * @param theYearOfStudy
     * @param monthOfStudy
     * @param dayOfStudy
     */
    public void setDate( int theYearOfStudy,int monthOfStudy,int dayOfStudy){
       yearOfStudy = LocalDate.of(theYearOfStudy, monthOfStudy, dayOfStudy);

    }
}
