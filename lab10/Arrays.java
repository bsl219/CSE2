//Brian Logsdon
//April 8, 2016
//CSE2
//lab10

//Program will create two arrays: one with names given by the user
//and another with random midterm grades from 0 to 100. Then the grades
//assigned to each name will be printed.

import java.util.Scanner;

public class Arrays{
    
    public static void main(String[] args){
        
        int length = (int) (Math.random() * 5) + 5;
        
        String[] students = new String[length];
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter " + length + " student names:");
        
        for(int i = 0; i < length; i++){
            students[i] = myScanner.nextLine();
        }
        
        int[] midterm = new int[length];
        
        for(int i = 0; i < length; i++){
            midterm[i] = (int) (Math.random() * 101);
        }
        
        System.out.println("Here are the midterm grades of the " + length +
        " students above:");
        
        for(int i = 0; i < length; i++){
            System.out.println(students[i] + ": " + midterm[i]);
        }
    }
}