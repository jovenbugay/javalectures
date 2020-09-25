/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureapplication;

/**
 *
 * @author Patrick Francisco
 */
public class LectureApplication {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

int[] y = {2,4,6,8};

for(int x : y){
  if(x%2==0){
    System.out.println(x); 
break;
  }
    System.out.println(x+1);
}
    }
   enum Drinks{
       COLA,WATER,JUICE
   }
    
}
