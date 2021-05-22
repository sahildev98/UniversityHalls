/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityhalls;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sahil
 */
public class Student extends Person {
    private Date yearOfStudy;
    public Student(String forename, String surname, String gender, String address, String nationality, Date yearOfStudy, Date dateOfbirth, String phoneNum, int ID, String healthConditions) {
        super(forename, surname, gender, address, nationality, dateOfbirth, phoneNum, ID, healthConditions);
    }
        /**
     *
     * @return the date of study. 
     */
    public Date getDate(){
        return yearOfStudy;
    }
    
    /**
     *
     * @param newDate for setting the yearOfStudy date when creating a object for this class.  
     */
    public void setDate(Date newDate){
        newDate = yearOfStudy;
        SimpleDateFormat firstYearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat secondYearFormat = new SimpleDateFormat("yyyy");
        String studyString = firstYearFormat.format(yearOfStudy) + " " + secondYearFormat.format(yearOfStudy);
    }
}
