/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacont;

/**
 *
 * @author Patrick Francisco
 */
public class JavaCont extends TryAbs{

    /**
     * @param args the command line arguments
     */
    public void shoot(){
    
    }
    public static void main(String[] args) {
sayTheWord("patrick",4);
    }
    
   
   public static void sayTheWord(String theWord, int quantity){
       if(quantity > 0){
           System.out.println(theWord);
           sayTheWord(theWord,quantity - 1);
       }
   }
}
 
