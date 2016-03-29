//Brian Logsdon
//March 29, 2016
//CSE2
//hw09-Games

import java.util.Scanner; //import Scanner

//set up class
public class Games{
    
    //set up main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare
        
        //print opening statements
        System.out.println("Welcome to Brian's Game Center!");
        System.out.println();
        System.out.println();
        System.out.println("Please choose one of the following games:");
        System.out.println();
        System.out.println("guessTheBox");
        System.out.println();
        System.out.println("spinTheWheel");
        System.out.println();
        System.out.println("scrambler");
        System.out.println();
    
        //have user select game
        while(true){
            
            String input = myScanner.next(); //set up input variable
            
            //if user enters guessTheBox
            if("guessTheBox".equals(input)){
                
                guessTheBox(); //run method
                break;
            }
            
            //if user enters spinTheWheel
            else if("spinTheWheel".equals(input)){
                
                spinTheWheel(); //run method
                break;
            }
            
            //if user enters scrambler
            else if("scrambler".equals(input)){
                
                scrambler(); //run method
                break;
            }
            
            //if user doesn't enter valid name
            else{
                System.out.println("Please enter a valid name of a game."); //print response
            }
        }
    }
    
    //guessTheBox game method
    public static void guessTheBox(){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare
        
        System.out.println("There are 3 boxes: Box 1, Box 2, and Box 3." +
        "One of them contains a prize."); //print rules
        
        //infinite loop
        while(true){
        
            System.out.println("Enter a box number to make your choice."); //print input statement
            int number = 0; //initiallize variable
        
        //infinite loop
            while(true){
                
                //if user enters integer
                if(myScanner.hasNextInt()){
                    number = myScanner.nextInt(); //variable = input
                    
                    //test if input is whithin proper range
                    if(number >= 1 && number <= 3){
                        break; //leave loop
                    }
                    System.out.println("Please enter a valid number."); //print correction statement
                }
                else{
                    System.out.println("Please enter a valid number."); //print correction statement
                    myScanner.next(); //look for new input
                }
            }
            
            //randomize answer
            int prize = (int) ((Math.random() * 3) + 1);
            
            //if input = answer, end game
            if(prize == number){
                System.out.println("Congratulations, you win!"); //print win statement
                break; //leave loop
            }
            
            else{
                System.out.println("Sorry, try again."); //print failure statement
            }
        }
    }
    
    //spinTheWheel game method
    public static void spinTheWheel(){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare
        
        System.out.println("The wheel has 10 spaces, 5 are red and 5 are black." +
        "Each of the spaces has a number between 1 and 5 on them. Guess which " +
        "color and number the wheel will land on."); //print rules
        
        //infinite loop
        while(true){
            
            System.out.println(); //print new line
            System.out.println(); //print new line
            
            //initiallize input variables
            String color = ""; 
            int number = 0;
            String prizeColor = "";
            
            System.out.println("Choose black or red: "); //print input statement
            
            //infinite loop
            while(true){
            
            
                color = myScanner.next(); //assign input variable
                color = color.toLowerCase(); //make word all lower case
                
                //check if input is valid
                if("black".equals(color) || "red".equals(color)){
                    break; //exit loop
                }
                
                else{
                    System.out.println("Please choose black or red."); //print correction statement
                }
            }
            
            System.out.println(); //print new line
            System.out.println("Choose an integer between 1 and 5: "); //print input statement
            
            //infinite loop
            while(true){
                
                //if input is integer
                if(myScanner.hasNextInt()){
                    number = myScanner.nextInt(); // variable = input
                    
                    //test if input is within proper range
                    if(number >= 1 && number <= 5){
                        break; //exit loop
                    }
                    System.out.println("Please enter an integer between 1 and 5."); //print correction statement
                }
                else{
                    System.out.println("Please enter an integer between 1 and 5."); //print correction statement
                    myScanner.next(); //look for new input
                }
            }
            
            //randomize color
            int colorNumber = (int) ((Math.random() * 2) + 1); //randomize
            
            //set color to black or red
            if(colorNumber == 1){
                prizeColor = "black";
            }
            
            else{
                prizeColor = "red";
            }
            
            //randomize number
            int prizeNumber = (int) ((Math.random() * 5) + 1);
            
            System.out.println("The spin resulted in " + prizeColor + " " + prizeNumber + "."); //print results
            
            //if input matches answer
            if(color.equals(prizeColor) && number == prizeNumber){
                System.out.println("Congratulations, you win!"); //print success statement
                break; //exit loop
            }
            else{
                System.out.println("Sorry, try again."); //print failure statement
            }
        }
    }
    
    //scrambler game method
    public static void scrambler(){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare
        
        System.out.println("Please enter a word to be scrambled."); //print input statement
        
        String input = myScanner.next(); //set up input variable
        
        int length = input.length(); //set length of input
        
        int swapNumber = 0; //initiallize swap variable
        
        char[] c = input.toCharArray(); //set up array
        
        //swap a random letter in the input with the first letter in the input 7 times
        for(int i = 0; i < 7; i++){
            swapNumber = (int) (Math.random() * length); //randomize swap number
            char temporary = c[0];
            c[0] = c[swapNumber];
            c[swapNumber] = temporary;
        }
        
        String scrambled = new String(c); //make rearranged letters a string
        
        System.out.println(scrambled); //print scrambled word
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}