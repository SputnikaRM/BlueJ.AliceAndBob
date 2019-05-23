/**
 * Created by iyasuwatts on 10/17/17.
 */

// import Scanner

import java.util.Scanner;


public class Main {

    public static void main(String[] args ){
        Scanner myName = new Scanner(System.in); 
        System.out.println("What is your name?");
        
        String name = myName.nextLine();
        
        if((name == "Alice") || (name == "Bob")){
         
        } 
        System.out.println("Greetings " + name);
        

    }
}
