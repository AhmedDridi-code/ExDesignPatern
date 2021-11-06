/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exdesignpatern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public abstract class Shape implements Cloneable {
    protected String id;
    public String type;
    public Shape Clone(){
        try {
            Shape S = (Shape)super.clone();
            return S;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
        
    }
}
