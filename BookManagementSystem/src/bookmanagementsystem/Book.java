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
public class Book {
    private String name;
    public Author[] authors;
    private double price;
    public int qty;
    public Book(String name, Author[] authors, double price){
     this.name = name;
     this.authors = authors;
     this.price = price;
     
    }
    public Book(String name, Author[] authors, double price, int qty){
      this.name = name;
     this.authors = authors;
     this.price = price;
     this.qty = qty;  
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        String i = "";
        i = "Book Name: " + this.name + " Authors: " + getAuthorNames() + " Price: " + this.price + " Quantity: " + this.qty +"";
        return i;
    }
    public String getAuthorNames(){
        String i = "";
        for (Author x : authors){
            i = i.concat(", " + x.getName());
        }
        return i;
    }
}
