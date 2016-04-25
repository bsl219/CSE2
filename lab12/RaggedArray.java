//Brian Logsdon
//April 22, 2016
//CSE2
//lab12

import java.util.Scanner;

public class RaggedArray{
    
    public static void main(String[] args){
        
        System.out.print("Please enter the size of the main array: ");
        Scanner myScanner = new Scanner(System.in);
        
        int size = myScanner.nextInt();
        
        System.out.println();
        
        int length = 0;
        
        int[][] array = new int[size][];
        
        for(int i = 0; i < size; i++){
            length = (int) (Math.random() * (size - 1) + 1);
            array[i] = new int[length];
        }
        
        System.out.println("Here is your unsorted array:");
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 21);
                
                if(j == array[i].length - 1){
                    System.out.print(array[i][j]);
                }
                
                else{
                 System.out.print(array[i][j] + ", ");   
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Here is your sorted array:");
        
         for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                
                int min = j;
                for( int k = j; k < array[i].length; k++){
                    
                    if(array[i][k] < array[i][min]){
                        min = k;
                    }
                }
                int temp = array[i][j];
                array[i][j] = array[i][min];
                array[i][min] = temp;
            }
        }
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                
                if(j == array[i].length - 1){
                    System.out.print(array[i][j]);
                }
                
                else{
                 System.out.print(array[i][j] + ", ");   
                }
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Here is your rearranged array:");
        
        for(int i = 0; i < array.length; i++){
            int min = i;
            
            for(int j = i; j < array.length; j++){
                if(array[j].length < array[min].length){
                        min = j;
                    }
            }
                
                int[] temp = array[i];
                array[i] = array[min];
                array[min] = temp;
        }
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                
                if(j == array[i].length - 1){
                    System.out.print(array[i][j]);
                }
                
                else{
                 System.out.print(array[i][j] + ", ");   
                }
            }
            System.out.println();
        }
        
        System.out.println("What number would you like to search for? ");
        int number = myScanner.nextInt();
        
        for(int i = 0; i < array.length; i++){
            
            for(int j= 0; j < array[i].length; j++){
                if(number == array[i][j]){
                    System.out.println("Column " + (j + 1) + " Row " + (i + 1));
                    System.exit(0);
                }
                else if (i == array.length - 1 && j == array[i].length - 1){
                    System.out.println("Not in the array.");
                }
            }
        }
    }
}