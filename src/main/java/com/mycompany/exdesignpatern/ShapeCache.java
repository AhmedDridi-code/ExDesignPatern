/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exdesignpatern;

import java.util.HashMap;

/**
 *
 * @author ahmed
 */
public class ShapeCache {
    private HashMap<String,Shape> ShapeMap;
    public void loadCache(){
        ShapeMap = new HashMap<String,Shape>();
        ShapeMap.put("Circle", new Circle());
        ShapeMap.put("Rectangle", new Rectangle());
        ShapeMap.put("Square", new Square());
        
    }
    public Shape getShape(String id){
       return ShapeMap.get(id).Clone();
    }
    public ShapeCache(){
        loadCache();
    }
    
}
