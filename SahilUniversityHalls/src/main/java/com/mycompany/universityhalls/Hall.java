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
}
