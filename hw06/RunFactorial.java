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
        
        System.out.println("Please enter an integer between 9 and 6: "); //print input statement
        String numberS = myScanner.next(); //create input variable
        
        for(int i = 0; i < numberS.length(); i++) {
            while(!Character.isDigit(numberS.charAt(i))){
                System.out.println("Invalid input, enter again!");
                numberS = myScanner.next();
                i = 0;
            }
        }
        
        int number = Integer.parseInt(numberS);
        
        while(number > 16 || number < 9){
            System.out.println("Invalid input, enter again!");
            number = myScanner.nextInt();
        }
        
        System.out.println("Input accepted: ");
        
        int factorial = 1;
        
        for(int j = 1; j <= number; j++){
            factorial = factorial * j;
        }
        
        System.out.println(number + "! = " + factorial);
    }
}