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
public class Student extends Person {
    
    public Student(String name, String gender, String address, String nationality, Date dateOfbirth, String phoneNum, int ID, String healthConditions) {
        super(name, gender, address, nationality, dateOfbirth, phoneNum, ID, healthConditions);
    }
    
}
