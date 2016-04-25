//Brian Logsdon
//March 11, 2016
//CSE2
//lab07

//code will use '*' to print bowties

//import Scanner
import java.util.Scanner;

//set up class
public class Bowtie{
    
    //set up main method
    public static void main(String[] args){
        
        while(true){
            Scanner myScanner = new Scanner(System.in);
            
            int nStarsInput = 0;
            
             System.out.println("Please enter an odd integer between 3-33.");
             
             //test if input is int between 9 and 16 inclusive
            while(true) {
                if(myScanner.hasNextInt()){
                    nStarsInput = myScanner.nextInt();
                    if(nStarsInput <= 33 && nStarsInput >= 3 && nStarsInput % 2 != 0) {
                    break;
                    }
                     System.out.println("Invalid input, enter again!");
                }
                else {
                    System.out.println("Invalid input, enter again!"); //print error statement
                    myScanner.next();
                }
            }
            
            int nStars = nStarsInput;
            
            for(int k = 0; k < 2; k++){
                nStars = nStars - nStars/2;
        
                for (int i = -nStars; i <= nStars; i++) {
                    if(i == 0){
                        i = 2;
                    }
          /*        for (int j = -nStars + 1; j <= nStars - 1; j++) {
                        if (i*i > j*j){
                            
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    */
                    int j = -nStars + 1;
                    do{
                        if (i*i > j*j){
                            
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                        j++;
                    }while(j <= nStars - 1);
                    
                    System.out.println();
                }
                nStars = nStarsInput;
                System.out.println();
            }
            System.out.println("Would you like to continue?");
            String response = myScanner.next();
            
            if(response.equals("Y") || response.equals("y")){
            }
            else{
                break;
            }
        }
    }
}