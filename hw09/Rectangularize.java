//Brian Logsdon
//March 29, 2016
//CSE2
//hw09-Rectangularize

import java.util.Scanner; //import Scanner

//set up class
public class Rectangularize{
    
    //set up main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare
        
        System.out.println("Please enter an input"); //print input statement
        
            String input = myScanner.next();  //set up input variable
            
            //check if input can be converted into an int
            for(int i = 0; i < input.length(); i++){
                while(!Character.isDigit(input.charAt(i))) {
                    
                    rectangle(input); //run method
                    System.exit(0); //exit code
                    }
            }
        
        //convert input to int
        int number = Integer.parseInt(input);
        
        rectangle(number); //run method
    }
    
    //method for int
    static void rectangle(int x){
        
        //prints x number of lines
        for(int i = 0; i < x; i++){ 
            
            //print x number of % on a line
            for(int j = 0; j < x; j++){ 
                System.out.print("%"); //print %
            }
            System.out.println(); //print new line
        }
        
    }
    
    //method for string
    static void rectangle(String x){
        
        //print input the number of times that there are letters in the input
        for(int i = 0; i < x.length() - 1; i++){
            System.out.println(x); //print the input
        }
    }
}