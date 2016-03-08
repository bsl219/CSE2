//Brian Logsdon
//March 7, 2016
//CSE2
//hw06-Fibonacci

//program takes 3 input numbers and prints a
//fibonacci sequence with a selected amount of
//numbers printed

//import Scanner
import java.util.Scanner;

//set up class
public class Fibonacci{
    
    //set up main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declare and construct
        
        
        System.out.print("Enter the first number in the sequence: "); //print input statement
        String number1S = myScanner.next(); //create input variable
        
        //check if input is valid, if not, ask for another
        for(int i = 0; i < number1S.length(); i++) {
            while(!Character.isDigit(number1S.charAt(i))) {
                System.out.println("Sorry, you must enter a positive integer.");
                System.out.print("Enter the first number in the sequence: ");
                number1S = myScanner.next();
                i = 0;
            }
        }
        
        System.out.print("Enter the second number in the sequence: "); //print input statement
        String number2S = myScanner.next(); //create input variable
        
        //check if input is valid, if not, ask for another
        for(int i = 0; i < number2S.length(); i++) {
            while(!Character.isDigit(number2S.charAt(i))) {
                System.out.println("Sorry, you must enter a positive integer.");
                System.out.print("Enter the second number in the sequence: ");
                number2S = myScanner.next();
                i = 0;
            }
        }
        
        System.out.print("How many custom Fibonacci numbers should be printed? "); //print input statement
        String number3S = myScanner.next(); //create input variable
        
        //check if input is valid, if not, ask for another
        for(int i = 0; i < number3S.length(); i++) {
            while(!Character.isDigit(number3S.charAt(i))) {
                System.out.println("Sorry, you must enter a positive integer.");
                System.out.print("How many custom Fibonacci numbers should be printed? ");
                number3S = myScanner.next();
                i = 0;
            }
        }
        
        
        //convert strings to integers
        int number1 = Integer.parseInt(number1S);
        int number2 = Integer.parseInt(number2S);
        int number3 = Integer.parseInt(number3S);
        
        if (number3 == 1){
            System.out.println("The number is:");
            System.out.println("");
            System.out.println(number1 + ".");
            return;
        }
        
        if (number3 == 2){
            System.out.println("The numbers are: ");
            System.out.println("");
            System.out.println(number1 + ", " + number2 + ".");
            return;
        }
        
        //print output statements
        System.out.println("The numbers are: ");
        System.out.println("");
        System.out.print(number1 + ", " + number2 + ", ");
        
        //calculate the next number in the sequence
        int j = 0;
        while(j < number3 - 3) {
            int number4 = number1 + number2;
            number1 = number2;
            number2 = number4;
            System.out.print(number4 + ", ");
            j++;
        }
        
        //put a period after the last number in the sequence
        if(j == number3 - 3) {
            int number4 = number1 + number2;
            number1 = number2;
            number2 = number4;
            System.out.print(number4 + ".");
        }
    }
}