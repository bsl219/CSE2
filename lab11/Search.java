//Brian Logsdon
//April 15, 2016
//CSE2
//lab11

//code will form two arrays and fill them with random ints

import java.util.Scanner;

public class Search{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        for(int i = 0; i < 50; i++){
            array1[i] = (int) (Math.random() * 101);
        }
        
        int max1 = 0;
        int min1 = 100;
        
        for(int i = 0; i < 50; i++){
            if(array1[i] > max1){
                max1 = array1[i];
            }
            
            if(array1[i] < min1){
                min1 = array1[i];
            }
        }
        System.out.println("The maximum of array1 is: " + max1);
        System.out.println("The minimum of array1 is: " + min1);
        
        for(int i = 0; i < 50; i++){
            int number = (int) (Math.random()*100) + 1;
            
            if(i == 0){
                array2[i] = (int) (Math.random()*101);
            }
            
            if(i > 0){
                array2[i] = array2[i - 1] + number;
            }
        }
        
        int max2 = 0;
        int min2 = 2000;
        
        for(int i = 0; i < 50; i++){
            if(array2[i] > max2){
                max2 = array2[i];
            }
            
            if(array2[i] < min2){
                min2 = array2[i];
            }
            System.out.println(array2[i]);
        }
        System.out.println("The maximum of array2 is: " + max2);
        System.out.println("The minimum of array2 is: " + min2);
        
        int input = 0;
        
        while(true){
            System.out.print("Enter an int: ");
            
            if(myScanner.hasNextInt()){
                input = myScanner.nextInt();
                
                if(input >= 0){
                   break;
                }
                System.out.println("You did not enter an int > 0");
                break;
            }
            else{
                System.out.println("You did not enter an int");
                break;
            }
        }
        
        int low = 0;
        int high = array2.length - 1;
        int counter = 1;
        
        while(high > low){
            int mid = (low + high) / 2;
            
            if(array2[mid] == input){
                System.out.println(input + " was found in the list");
                break;
            }
            else if(array2[mid] < input){
                low = mid ;
            }
            else if(array2[mid] > input){
                high = mid;
            }
            System.out.println(low + ", " + high);
            if(high == low + 1){
                System.out.println(input + " was not found in the list");
                System.out.println("The number above the key was " + array2[high] +
                "\nThe number below the key was " + array2[low]);
                break;
            }
        }
        
    }
}