/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
public class Test {
    public static void main(String[] args) {
    Line tes = new Line(12.0,15.0,18.0,21.0);
     Line tes2 = new Line(12.0,15.0,18.0,21.0);
      Line tes3 = new Line(12.0,15.0,18.0,21.0);
       Line tes4 = new Line(12.0,15.0,18.0,21.0);
        System.out.println(tes.getLength());
        
        System.out.println(tes.isGreater(tes2, tes3));
        System.out.println(tes.isLess(tes, tes3));
    }
    }

