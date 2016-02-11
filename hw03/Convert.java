//Brian Logsdon
//Feb 16, 2016
//CSE2
//hw03
//Convert

import java.util.Scanner; //import Scanner

//set up class
public class Convert{
    
    //set up main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare
        myScanner = new Scanner(System.in); //construct
        
        //set up variables
        double inchesPerMeter = 39.37;
        double meters1;
        double meters2;
        
        System.out.print("Enter the distance in meters: "); //print first input statement
        meters1 = myScanner.nextDouble(); //first user input
        double inches1 = ((int) (meters1 * inchesPerMeter * 10000.0))/10000.0; //convert from meters to inches
        System.out.println(meters1 + " meters is " + inches1 +
        " inches."); //print first output statement
        
        System.out.println(" "); //make blank line
        
        System.out.print("Enter the distance in meters: "); //print second input statement
        meters2 = myScanner.nextDouble(); //second user input
        double inches2 = ((int) (meters2 * inchesPerMeter * 10000.0))/10000.0; //convert from meters to inches
        System.out.println(meters2 + " meters is " + inches2 +
        " inches."); //print second output statement
    }
}