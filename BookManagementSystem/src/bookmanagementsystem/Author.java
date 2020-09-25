/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

/**
 *
 * @author Patrick Francisco
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmial(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return this.gender;
    }
}
