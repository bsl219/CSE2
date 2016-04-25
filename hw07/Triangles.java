//Brian Logsdon
//March 22, 2016
//CSE2
//hw07-Triangles

import java.util.Scanner;

public class Triangles{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter an integer between 5 and 30: ");
        
        while(true){
            if(myScanner.hasNextInt()){
                number = myScanner.nextInt();
                if(number >= 5 && number <= 30){
                    break;
                }
                System.out.println("Please enter an integer between 5 and 30 inclusive.");
            }
            else{
                System.out.println("Please enter an integer between 5 and 30 inclusive.");
                myScanner.next();
            }
        }
        
        System.out.println();
        System.out.println("FOR LOOP:");
        
        for(int i = 1; i <= number; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
                if(number > 9 && i < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i = number - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
                if(number > 9 && i < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("WHILE LOOP:");
        
        int i = 1;
        int j = 0;
        while(i <= number){
            while(j < i){
                System.out.print(i);
                if(number > 9 && i < 10){
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
        
        i = number - 1;
        j = 0;
        
        while(i >= 1){
            while(j < i){
                System.out.print(i);
                if(number > 9 && i < 10){
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            j = 0;
            i--;
        }
        
        System.out.println();
        System.out.println("DO-WHILE LOOP:");
        
        i = 1;
        j = 0;
        do{
            if(i <=number){
                do{
                    if(j<i){
                        System.out.print(i);
                        if(number > 9 && i < 10){
                    System.out.print(" ");
                }
                        j++;
                    }
                }while(j < i);
                System.out.println();
                    j = 0;
                    i++;
            }
            
        }while(i <= number - 1);
        
        do{
            if(i >= 1){
                do{
                    if(j<i){
                        System.out.print(i);
                        if(number > 9 && i < 10){
                    System.out.print(" ");
                }
                        j++;
                    }
                }while(j < i);
                System.out.println();
                    j = 0;
                    i--;
            }
            
        }while(i >= 1);
        
    }
}
