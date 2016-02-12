//Brian Logsdon
//Feb 16, 2016
//CSE2
//hw03
//Pyramid

import java.util.Scanner; //import Scanner

//create class
public class Pyramid {
    
    //set up main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare and construct
        
        //set up variables
        double sideLength,
        height;
        
        System.out.print("The square side of the pyramid is (input length): "); //print first user prompt
        sideLength = myScanner.nextDouble(); //define side length
        
        System.out.print("The height of the pyramid is (input height): "); //print second user prompt
        height = myScanner.nextDouble();  //define height
        
        double volume = (sideLength * sideLength * height) / 3; //calculate volume
        System.out.println("The volume inside the pyramid is: " + volume); //print results
    }
}