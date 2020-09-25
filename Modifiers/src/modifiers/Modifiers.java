/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifiers;

/**
 *
 * @author Patrick Francisco
 */
public class Modifiers {
//static variable and methods can be called by reffering to the class and not the object
//instance variables are not allowed to call inside a static method of the same class
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TheSuper i = new TheSuper();
         TheSuper x = new TheSuper();
        TheSuper y = new TheSuper();
      System.out.print(TheSuper.countmyinstance);
      TheSuper.hi(TheSuper.countmyinstance);
       
    }
    
}
