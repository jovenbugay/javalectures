/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

/**
 *
 * @author Patrick Francisco
 */
public final class Perishable extends Stocks{
   public int something = 1;
   @Override
    public void replenish(int x){
        super.replenish();
    }
    @Override
    public void count(){
       System.out.println(super.tag);
        
    }
  /*modifiers
    access
    + - # _
    non-access
    */
}
