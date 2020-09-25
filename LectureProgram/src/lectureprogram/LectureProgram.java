/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureprogram;

/**
 *
 * @author Patrick Francisco
 */
public class LectureProgram {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int[] x = {2,4,6,8,10};
          for(int y : x){
            if(y%2==0){
                 System.out.println(y); 
                  continue;
            }
              System.out.println(y + 1);
          }
        
}
    
    }
    

enum OperationName{
    ADD,MULTIPLY,SUB,DIVIDE
}