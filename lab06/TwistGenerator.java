//Brian Logsdon
//March 4, 2016
//CSE2
//lab06

//program will print out a "twist" on the screen

//import Scanner
import java.util.Scanner;

//set up class
public class TwistGenerator{
    
    //set up main method
    public static void main(String[] args) {
        
        //construct and declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        //print input statement
        System.out.println("Please enter a positive integer.");
        
        //create input variable
        String lengthS = myScanner.next();
        
        //check to see if input is acceptable
        for(int i = 0; i < lengthS.length(); i++) {
            if(!Character.isDigit(lengthS.charAt(i))) {
                System.out.println("Sorry, you must enter a positive integer.");
                return;
            }
        }
        
        //set up variables
        int length = Integer.parseInt(lengthS);
        int i = 0;
        
        //print first line
        while(i < length){
            int lengthMod1 = i % 3;
            switch (lengthMod1) {
                case 1 : System.out.print(" "); 
                break;
                case 0 : System.out.print("\\"); 
                break;
                case 2 : System.out.print("/"); 
                break;
            }
            i++;
        }
        
        //start new line
        System.out.println("");
        
        i = 0; //reset counter
        
        //print second line
        while(i < length){
            int lengthMod2 = i % 3;
            switch (lengthMod2) {
                case 1 : System.out.print("X"); 
                break;
                case 0 : System.out.print(" "); 
                break;
                case 2 : System.out.print(" "); 
                break;
            }
            i++;
        }
        
        //start new line
        System.out.println("");
        
        i = 0; //reset counter
        
        //print third line
        while(i < length){
            int lengthMod3 = i % 3;
            switch (lengthMod3) {
                case 1 : System.out.print(" "); 
                break;
                case 0 : System.out.print("/"); 
                break;
                case 2 : System.out.print("\\"); 
                break;
            }
            i++;
        }
    }
}