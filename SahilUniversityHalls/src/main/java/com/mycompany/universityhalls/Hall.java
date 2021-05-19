/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityhalls;

import java.util.ArrayList;

/**
 *
 * @author Sahil
 */
public class Hall {
    private ArrayList <Student>hallsToStay;
    public final int MAX;
    
    public Hall(int maxIn){
        hallsToStay = new ArrayList<>();
        MAX = maxIn;
    }
    
    /**
     *
     * @param theStudent that is going to be added 
     * @return true if bike is added and false otherwise.
     */
    public boolean addStudent(Student theStudent) {
        if (!isFull()) {
            hallsToStay.add(theStudent);
            return true;

        } else {
            return false;
        }
    }
    /**
     * Outline whether list is empty or not. 
     * @return true if the list is empty. Otherwise false.
     */
    public boolean isEmpty(){
        return hallsToStay.isEmpty();
    }
    
    /**
     * Reports whether the list is full or not. 
     * @return true if the list is full and false otherwise.
     */
    public boolean isFull(){
        return hallsToStay.size()==MAX;
    }
    
    public String displayStudents(){
        String result = "\n";
        return result;
    }
}
