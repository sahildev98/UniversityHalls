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
    private Date dateOfBirth;
    private String phoneNum;
    private int ID;
    
    public Person(String name, Date dateOfbirth, String phoneNum, int ID){
        this.name = name;
        this.dateOfBirth = dateOfbirth;
        this.phoneNum = phoneNum;
        this.ID = ID;
    }   
}
