/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelliahomesrealestateinformationmanagementsystem;

/**
 *
 * @author Patrick Francisco
 */
public  class House {
    private int rooms;
    public int floors;
    public boolean centralized;
    private int pool = 1;
    public HomeOwner homeOwner;
    
    public House(){
        rooms = 2;
        floors = 1;
        centralized = false;
       
    }
    public House(int rooms, int floors, boolean centralized){
        this.rooms = rooms;
        this.floors = floors;
        this.centralized = centralized;
        
    }
    
    public void demolish(){
        
    }
    public int getPool(){
        return pool;
    }
    public void setPool(int pool){
        this.pool = pool;
    }
}
