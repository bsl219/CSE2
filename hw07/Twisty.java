//Brian Logsdon
//March 22, 2016
//CSE2
//hw07-Twisty

import java.util.Scanner;

public class Twisty{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int length = 0;
        int width = 0;
        
        System.out.println("Input your desired length: ");
        
        while(true){
            if(myScanner.hasNextInt()){
                length = myScanner.nextInt();
                if(length > 1 && length < 81){
                    break;
                }
                System.out.println("\t Error: please enter an integer between 2 and 80.");
            }
            else{
                System.out.println("\t Error: please enter an integer between 2 and 80.");
                myScanner.next();
            }
        }
        
        System.out.println("Input your desired width: ");
        
         while(true){
            if(myScanner.hasNextInt()){
                width = myScanner.nextInt();
                if(width < length && width > 0){
                    break;
                }
                System.out.println("\t Error: please input a positive integer smaller than the length.");
            }
            else{
                System.out.println("\t Error: please input a positive integer smaller than the length.");
                myScanner.next();
            }
        }
        
        for(int i = 0; i < width; i++){
            int alternator = 0;
            int counter = 0;        
            while(counter < length){    
                for(int j = 0; j < width; j++){
                    if(j == i && counter < length && alternator == 0){
                        System.out.print("#");
                        counter++;
                    }
                    else if (j == width - i - 1 && counter < length && alternator == 0){
                        System.out.print("/");
                        counter++;
                    }
                    else if(j == i && counter < length && alternator == 1){
                        System.out.print("\\");
                        counter++;
                    }
                    else if (j == width - i - 1 && counter < length && alternator == 1){
                        System.out.print("#");
                        counter++;
                    }
                    else{
                        System.out.print(" ");
                        counter++;
                    }
                }
                if(alternator == 0){
                    alternator = 1;
                }
                else{
                    alternator = 0;
                }
            }
                
            System.out.println();
            
        }
    }
}