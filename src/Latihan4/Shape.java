/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author User
 */
public class Shape {
    private String color;
    public Shape (String color){
        this.color = color;
        
    }
    public String toString(){
        return "Shape[color= "+color+"]";
    }
    public double GetArea(){
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
