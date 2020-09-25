/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;
import java.util.Scanner;


/**
 *
 * @author Patrick Francisco
 */
public class BookManagementSystem {

    /**
     * @param args the command line arguments
     */
    //JUST RUN THIS FILE TO START (SHIFT + F6)
    public static void main(String[] args) {
        Book[] books = new Book[5];
        int selection = 0;
        int individualSelection;
        Scanner input = new Scanner(System.in);
        
        
        
        
        
        
        while (selection != 6){
            System.out.println("What action would you like to take(enter the number): \n 1.Add Books \n 2.Change Books \n 3.Delete Books \n 4.View Individual Book \n 5.View All Books \n 6.Exit");
            selection  = input.nextInt();
        
            switch (selection){
                case 1:
                    String bName;
                    Author[] bAuthor;
                    double bPrice;
                    int bQty;
                    int authorCount;
                    int bookCount = 0;
                    for(Book i : books){
                        System.out.println("What is the name of the book");
                        input.nextLine();
                        bName = input.nextLine();
                        System.out.println("How many authors of the book?");
                        authorCount = input.nextInt();
                        bAuthor = new Author[authorCount];
                        for(int x = 0; x < authorCount; x++){
                            String p;
                            char j;
                            System.out.println("What is the name of author?");
                            input.nextLine();
                            p = input.nextLine(); 
                            bAuthor[x] = new Author();
                            bAuthor[x].setName(p);
                            System.out.println("What is the gender of author?");
                            j = input.next().charAt(0);
                            bAuthor[x].setGender(j);
                            System.out.println("What is the email of author?");
                            p = input.next();   
                            bAuthor[x].setEmial(p);
                              
                        }
                        System.out.println("Quantity of books?");
                            bQty = input.nextInt();
                            System.out.println("What is the price of the book");
                            bPrice = input.nextDouble();
                        books[bookCount] = new Book(bName,bAuthor, bPrice, bQty);  
                    bookCount += 1;
                    }
                    
                    System.out.println("BOOKS CREATED");
                    
                    break;
                case 2:
                    int localCount2 = 1;
                    System.out.print("Choose the book you wish to change (type the number)");
                    
                    for (Book i : books){
                        System.out.println(localCount2 + " " + i.getName());
                        localCount2 += 1;
                    }
                    
                    individualSelection = input.nextInt();
                    individualSelection -= 1;
                    
                    
                        System.out.println("What is the name of the book");
                        input.nextLine();
                        bName = input.nextLine();
                        System.out.println("How many authors of the book?");
                        authorCount = input.nextInt();
                        bAuthor = new Author[authorCount];
                        for(int x = 0; x < authorCount; x++){
                            String p;
                            char j;
                            System.out.println("What is the name of author?");
                            input.nextLine();
                            p = input.nextLine(); 
                            bAuthor[x] = new Author();
                            bAuthor[x].setName(p);
                            System.out.println("What is the gender of author?");
                            j = input.next().charAt(0);
                            bAuthor[x].setGender(j);
                            System.out.println("What is the email of author?");
                            p = input.next();   
                            bAuthor[x].setEmial(p);
                              
                        }
                        System.out.println("Quantity of books?");
                            bQty = input.nextInt();
                            System.out.println("What is the price of the book");
                            bPrice = input.nextDouble();
                        books[individualSelection] = new Book(bName,bAuthor, bPrice, bQty);  
                        
                    
                    System.out.println("BOOKS CREATED");
                    
                    break;
                case 3:
                    Author[] n = new Author[1];
                    n[0] = new Author();
                    n[0].setName("DELETED");
                    n[0].setGender('m');
                    n[0].setEmial("DELETED");
                    
                    
//                    for (Book i : books){
//                        i = null;
//                        i = new Book("DELETED",n,0,0);
//                    }
                    for(int x = 0; x < 5; x++){
                        books[x] = new Book("DELETED",n,0,0);
                        
                    }
                     
                   
                    System.out.println("BOOKS DELETED");
                    
                    break;
                case 4:
                    int localCount = 1;
                    System.out.println("Choose the book you wish to see the information (type the number)");
                    
                    for (Book i : books){
                        System.out.println(localCount + " " + i.getName());
                        localCount += 1;
                    }
                    
                    individualSelection = input.nextInt();
                    System.out.println(books[individualSelection - 1].toString());
                    break;
                case 5:
                    System.out.println("Here are the list of all books stored in this system:");
                    
                    for (Book i : books){
                        
                                
                        System.out.println(i.toString());
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Not an option");
                    break;    
            }
        
        }
        
    }
    
}
