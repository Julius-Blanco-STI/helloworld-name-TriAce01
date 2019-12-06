/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.*;
public class Rusas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);   
        
        System.out.println("............");
        System.out.println(">Hello World<");
        System.out.println("What's Your Name?");
        String name = scn.nextLine();
        
        System.out.println("How Old are you?");  
        int age = scn.nextInt();
        System.out.println("What's Your Address?");
        String address = scn.nextLine();
        address = scn.nextLine();
        
        System.out.println("");
        System.out.println("Hi "+name+"!");
        System.out.println("Your Age is  "+ age);
        System.out.println("You Live at  "+address);
        
       
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
