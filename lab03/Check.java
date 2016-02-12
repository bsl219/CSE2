//Brian Logsdon
//Feb 12, 2016
//CSE2
//lab03-Check

//program will take cost of check, percent tip, and number of people eating
//and will determine the price to be paid by everyone

//import Scanner
import java.util.Scanner;

//set up class
public class Check{
    
    //set up main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner ( System.in); //declare and construct
        
        System.out.print("Enter the original cost of the check" +
        "in the form xx.xx: ");
        double checkCost = myScanner.nextDouble(); //create and define variable for check cost
        System.out.print("Enter the percentage tip that you wish to pay" +
        "as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble(); //create and define variable for tip percentage
        tipPercent /= 100; //we want to convert the percentage into a decimal
        System.out.print("Enter the number of people who went" +
        "out to dinner: ");
        int numPeople = myScanner.nextInt();
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point for the cost
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars = (int) costPerPerson;
        //get dimes amount e.g.,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        // after the division:  583%100 -> 83, 27%5 -> 2
        dimes = (int)(costPerPerson * 10) % 10;
        pennies = (int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars +
        '.' + dimes + pennies);
        
    } //end of main method
}//end of class