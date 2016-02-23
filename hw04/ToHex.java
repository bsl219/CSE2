//Brian Logsdon
//February 22, 2016
//CSE2
//hw04

//import
import java.util.*;

//set up class
public class ToHex {
    
  //set up main method
  public static void main(String[] args) {
      
      Scanner myScanner = new Scanner(System.in); //construct and declare Scanner
      
      System.out.println("Please enter three numbers representing RGB values: "); //print input prompt
      
      String redS, greenS, blueS;  //create input string variables and assignments
      redS = myScanner.next();
      greenS = myScanner.next();
      blueS = myScanner.next();
      
      //test if user input is not an integer
      //if it is, continue with code
      //if it isn't, print statement and exit code
      for(int i = 0; i < redS.length(); i++ ) {
          
          if (!Character.isDigit(redS.charAt(i))) {
            System.out.println("Sorry, your input must consist of integers."); 
            System.exit(0);
          }
      }
      
      
      for(int j = 0; j < greenS.length(); j++ ) {
          
          if (!Character.isDigit(greenS.charAt(j))) {
              System.out.println("Sorry, your input must consist of integers.");
              System.exit(0);
          }
      }
      
      
      for(int i = 0; i < blueS.length(); i++ ) {
          
          if (!Character.isDigit(blueS.charAt(i))) {
              System.out.println("Sorry, your input must consist of integers.");
              System.exit(0);
          }
      }
     
          int red = Integer.parseInt(redS);
          int green = Integer.parseInt(greenS);
          int blue = Integer.parseInt(blueS);
      
      if( red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255) {
          
          //create variables
          int redQuo = red / 16;
          int redRem = red % 16;
          int greenQuo = green / 16;
          int greenRem = green % 16;
          int blueQuo = blue / 16;
          int blueRem = blue % 16;
          
          String red1, red2, green1, green2, blue1, blue2;
          
          //use switch statements to define 10-15 for hexidecimal
          switch(redQuo) {
              case 10: red1 = "A";
              break;
              case 11: red1 = "B";
              break;
              case 12: red1 = "C";
              break;
              case 13: red1 = "D";
              break;
              case 14: red1 = "E";
              break;
              case 15: red1 = "F";
              break;
              default: red1 = Integer.toString(redQuo);
          }
          
           switch(redRem) {
              case 10: red2 = "A";
              break;
              case 11: red2 = "B";
              break;
              case 12: red2 = "C";
              break;
              case 13: red2 = "D";
              break;
              case 14: red2 = "E";
              break;
              case 15: red2 = "F";
              break;
              default: red2 = Integer.toString(redRem);
          }
          
           switch(greenQuo) {
              case 10: green1 = "A";
              break;
              case 11: green1 = "B";
              break;
              case 12: green1 = "C";
              break;
              case 13: green1 = "D";
              break;
              case 14: green1 = "E";
              break;
              case 15: green1 = "F";
              break;
              default: green1 = Integer.toString(greenQuo);
          }
          
          switch(greenRem) {
              case 10: green2 = "A";
              break;
              case 11: green2 = "B";
              break;
              case 12: green2 = "C";
              break;
              case 13: green2 = "D";
              break;
              case 14: green2 = "E";
              break;
              case 15: green2 = "F";
              break;
              default: green2 = Integer.toString(greenRem);
          }
          
          switch(blueQuo) {
              case 10: blue1 = "A";
              break;
              case 11: blue1 = "B";
              break;
              case 12: blue1 = "C";
              break;
              case 13: blue1 = "D";
              break;
              case 14: blue1 = "E";
              break;
              case 15: blue1 = "F";
              break;
              default: blue1 = Integer.toString(blueQuo);
          }
          
          switch(blueRem) {
              case 10: blue2 = "A";
              break;
              case 11: blue2 = "B";
              break;
              case 12: blue2 = "C";
              break;
              case 13: blue2 = "D";
              break;
              case 14: blue2 = "E";
              break;
              case 15: blue2 = "F";
              break;
              default: blue2 = Integer.toString(blueRem);
          }
          
          //print output statement
          System.out.println("The decimal numbers R:" + red + ", G:" +
          green + ", B:" + blue + ", is represented in hexadecimal as: " +
          red1 + red2 + green1 + green2 + blue1 + blue2);
      
      }
    
    //if inputs are out of range, print error statement
    else {
        System.out.println("Sorry, you must enter values between 0-255.");
    }
  }
}