/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exdesignpatern;

/**
 *
 * @author ahmed
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache S = new ShapeCache();
        Shape circle = S.getShape("Circle");
        System.out.println(circle);
        Shape circle2 = S.getShape("Circle");
        System.out.println(circle2);
    }
}
