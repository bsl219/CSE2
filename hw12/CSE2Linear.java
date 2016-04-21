//Brian Logsdon
//April 19, 2016
//CSE2
//hw12-CSE2Linear

//program will prompt user to input 15 grades in increasing order
//into an array, then will ask for a specific grade to search for
//in the array. Array will then be scrambled, and user will be asked
//for another grade to search for.

import java.util.Scanner; //import Scanner

//set up class
public class CSE2Linear{ 
    
    //set up main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //construct and declare Scanner
        
        int[] grades = new int[15]; //construct and declare array
        
        //have user fill array with grades between 0-100 in increasing order
        for(int i = 0; i < 15; i++){
            while(true){
                
                System.out.println("Please enter a grade.");
                
                if(myScanner.hasNextInt()){
                    grades[i] = myScanner.nextInt();
                    
                    if(grades[i] >= 0 && grades[i] <= 100){
                        
                        if(i == 0){
                            break;
                        }
                        
                        else if(i > 0){
                            
                            if(grades[i] >= grades[i - 1]){
                                break;
                            }
                            else{
                                System.out.println("Grade entered must be " + 
                                "greater than or equal to the last grade entered.");
                            }
                        }
                    }
                    else{
                        System.out.println("Grade entered must be between 0-100.");
                    }
                }
                else{
                    System.out.println("Grade entered must be an integer.");
                    myScanner.next();
                }
            }
        }
         System.out.println("Sorted:");
         
         //print out sorted array
         for(int i = 0; i < 15; i++){
            System.out.print(grades[i] + " ");
         }
         System.out.println();
         
         int searchNum1 = 0;
         
         //have user input valid grade to search for
         while(true){
             
            System.out.print("Enter a grade to search for: ");
            if(myScanner.hasNextInt()){
             
                searchNum1 = myScanner.nextInt();
                 
                if (searchNum1 >= 0 && searchNum1 <= 100){
                     break;
                }
                else{
                     System.out.println("Grade entered must be between 0-100.");
                }
            }
            else{
                System.out.println("Grade entered must be an integer.");
                myScanner.next();
            }
         }
         
         int counter = 1;
         int pos = 15 / 2;
         int length = 15/2;
         //say if search number is in the array and 
         //tell how many iterations it took to find it
         while(true){
             
             if(searchNum1 == grades[pos]){
                 System.out.println(searchNum1 + " was found in the list with " + 
                 counter + " iterations.");
                 break;
             }
             
             else if(searchNum1 > grades[pos]){
                 if(length == 1){
                     pos = pos + length;
                 }
                 else{
                     pos = pos + length/2;
                     if(length % 2 == 1){
                      length = length / 2 + 1;   
                     }
                     else{
                         length = length / 2;
                     }
                 }
             }
             
             else{
                 if(length == 1){
                     pos = pos - length;
                 }
                 else{
                     pos = pos - length / 2;
                     if(length % 2 == 1){
                      length = length / 2 + 1;   
                     }
                     else{
                         length = length / 2;
                     }
                 }
             }
             if(counter == 5){
                 System.out.println(searchNum1 + " was not found in the list with " + 
                 counter + " iterations.");
                 break;
             }
             counter = counter + 1;
         }
         
         System.out.println("Scrambled:");
         
         //swap members of array around
         for(int i = 0; i < 25; i++){
             int swapNumber = (int) (Math.random() * 15);
             
             int temp = grades[0];
             grades[0] = grades[swapNumber];
             grades[swapNumber] = temp;
         }
         
         //print scrambled array
         for(int i = 0; i < 15; i++){
             System.out.print(grades[i] + " ");
         }
         
         System.out.println();
         
         int searchNum2 = 0;
         
         //have user input valid grade to search for
         while(true){
             
            System.out.print("Enter a grade to search for: ");
            if(myScanner.hasNextInt()){
             
                searchNum2 = myScanner.nextInt();
                 
                if (searchNum2 >= 0 && searchNum2 <= 100){
                     break;
                }
                else{
                     System.out.println("Grade entered must be between 0-100.");
                }
            }
            else{
                System.out.println("Grade entered must be an integer.");
                myScanner.next();
            }
         }
         
         counter = 1;
         
         //say if search number is in the array and 
         //tell how many iterations it took to find it
         for(int i = 0; i < 15; i++){
             if(grades[i] == searchNum2){
                 System.out.println(searchNum2 + " was found in the list with " + 
                 counter + " iterations.");
                 break;
             }
             else{
                 if(i == 14){
                     System.out.println(searchNum2 + " was not found in the list with " +
                    counter + " iterations."); 
                 }
             }
             counter = counter + 1;
         }
    }
}