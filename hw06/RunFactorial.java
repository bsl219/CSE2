//Brian Logsdon
//March 7, 2016
//CSE2
//hw06-RunFactorial

//code will find the factorial of an input number

//import Scanner
import java.util.Scanner;

//set up class
public class RunFactorial{
    
    //set up main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declare and construct
        
        System.out.println("Please enter an integer between 9 and 16: "); //print input statement
        int number = 0; //create input variable
        
        //test if input is int between 9 and 16 inclusive
        while(true) {
            if(myScanner.hasNextInt()){
                number = myScanner.nextInt();
                if(number <= 16 && number >= 9) {
                    break;
                }
            }
            else {
                System.out.println("Invalid input, enter again!"); //print error statement
                myScanner.next();
            }
        }
        
        System.out.println("Input accepted: "); //print success statement
        
        int factorial = 1; 
        
        //compute factorial
        for(int j = 1; j <= number; j++){
            factorial = factorial * j;
        }
        
        //print answer
        System.out.println(number + "! = " + factorial);
    }
}