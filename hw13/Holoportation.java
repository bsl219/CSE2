//Brian Logsdon
//May 4, 2016
//CSE2
//hw13

//creates a three dimensional array of strings, fills with code, checks to see if input code
//is in array, holoports codes to new three dimensional array, rearranges codes

//import scanner and decimal format
import java.util.Scanner;
import java.text.DecimalFormat;

//set up class
public class Holoportation{
    
    //set up main method
    public static void main(String[] args){
        
        String[][][] array3D = soRandom(); //declare and construct
        
        //fill array with codes using coder method
        for(int i = 0; i < array3D.length; i++){
            for(int j = 0; j < array3D[i].length; j++){
                for(int k = 0; k < array3D[i][j].length; k++){
                    array3D[i][j][k] = coder();
                }
            }
        }
        
        
        print(array3D); //print array
        
        String[][][] array2 = soRandom(); //declare and construct
        
        
        holoport(array3D, array2); //holoport array3D into array2
        
        System.out.println(); //print new line
        System.out.println(); //print new line
        
        print(array2); //print array
        
        sampling(array2); //call sampling method
        
        percentage(array3D, array2); //call precentage method
        
        System.out.println(); //print new line
        System.out.println(); //print new line
        
        String[][][] frank = frankenstein(array2); //declare and construct
        
        print(frank);//print array
        
        
    }
    
    public static String[][][] soRandom(){
        
        //makes array random length
        String[][][] array3D = new String[(int) (Math.random() * 10) + 1][][];
        
        for(int i = 0; i < array3D.length; i++){
            //makes array random length
            array3D[i] = new String[(int) (Math.random() * 10) + 1][];
        }
        
        for(int i = 0; i < array3D.length; i++){
            
            for(int j = 0; j < array3D[i].length; j++){
                //makes array random length
                array3D[i][j] = new String[(int) (Math.random() * 10) + 1];
            }
        }
        return array3D; //returns array
    }
    
    //makes codes starting with 2 capital letters and ending with 4 integers
    public static String coder(){
        
        String code = Character.toString((char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1))) +
        Character.toString((char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1)));
        
        for( int i = 0; i < 4; i++){
            code = code + (int) (Math.random() * 10);
        }
        return code;
    }
    
    //prints array
    public static void print(String[][][] array3D){
        
        for(int i = 0; i < array3D.length; i++){
            
            for(int j = 0; j < array3D[i].length; j++){
                
                for(int k = 0; k < array3D[i][j].length; k++){
                    if(array3D[i][j].length > 1){
                        if(k == 0){
                            System.out.print("[" + array3D[i][j][k] + ", ");
                        }
                        else if(k == array3D[i][j].length - 1){
                            System.out.print(array3D[i][j][k] + "]");
                        }
                        else{
                            System.out.print(array3D[i][j][k] + ", ");
                        }
                    }
                    else{
                        System.out.print("[" + array3D[i][j][k] + "]");
                    }
                }
                if(j == array3D[i].length - 1){
                }
                else{
                    System.out.print(" | ");
                }
            }
            if(i == array3D.length - 1){
            }
            else{
                    System.out.print("---");
            }
        }
    }
    
    //fills new array with code from old array, if there is extra space, it is filled with $$$$$$
    public static String[][][] holoport(String[][][] array3D, String[][][] array2){
        
        if(array2.length <= array3D.length){
            for(int i = 0; i < array2.length; i++){
                if(array2[i].length <= array3D[i].length){
                    for(int j = 0; j < array2[i].length; j++){
                        
                        if(array2[i][j].length <= array3D[i][j].length){
                            for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k < array3D[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                            for(int k = array3D[i][j].length; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(int j = 0; j < array3D[i].length; j++){
                        
                        if(array2[i][j].length <= array3D[i][j].length){
                            for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k < array3D[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                            for(int k = array3D[i][j].length; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                    for(int j = array3D[i].length; j < array2[i].length; j++){
                        for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                        }
                    }
                }
            }
        }
        else{
            for(int i = 0; i < array3D.length; i++){
                if(array2[i].length <= array3D[i].length){
                    for(int j = 0; j < array2[i].length; j++){
                        
                        if(array2[i][j].length <= array3D[i][j].length){
                            for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k < array3D[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                            for(int k = array3D[i][j].length; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(int j = 0; j < array3D[i].length; j++){
                        
                        if(array2[i][j].length <= array3D[i][j].length){
                            for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                        }
                        else{
                            for(int k = 0; k < array3D[i][j].length; k++){
                                array2[i][j][k] = array3D[i][j][k];
                            }
                            for(int k = array3D[i][j].length; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                    for(int j = array3D[i].length; j < array2[i].length; j++){
                        for(int k = 0; k < array2[i][j].length; k++){
                                array2[i][j][k] = "$$$$$$";
                        }
                    }
                }
            }
            for(int i = array3D.length; i < array2.length; i++){
                for(int j = 0; j < array2[i].length; j++){
                    for(int k = 0; k < array2[i][j].length; k++){
                        array2[i][j][k] = "$$$$$$";
                    }
                }
            }
        }
        return array2;
    }
    
    public static void sampling(String[][][] array2){
        Scanner myScanner = new Scanner(System.in);
        
        String search = "";
        while(true){
            
            System.out.print("Please enter a code to search for: ");
            
            if(myScanner.hasNext("[QWERTYUIOPLKJHGFDSAZXCVBNM]" + "[QWERTYUIOPLKJHGFDSAZXCVBNM]" + "[0123456789]" + "[0123456789]" + "[0123456789]" + "[0123456789]")){
                search = myScanner.next();
                break;
            }
            else{
                System.out.println("Please enter a valid input");
                myScanner.next();
            }
        }
        
        boolean go = true;
        for(int i = 0; i < array2.length; i++){
            if(go){
                for(int j = 0; j < array2[i].length; j++){
                    if(go){
                        for(int k = 0; k < array2[i][j].length; k++){
                            if(array2[i][j][k].equals(search)){
                                System.out.println("Code found at (" + i + ", " + j + ", " + k + ")");
                                go = false;
                            }
                            else if(i == array2.length - 1 && j == array2[i].length - 1 && k == array2[i][j].length - 1){
                                System.out.println("Code not found");
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void percentage(String[][][] array3D, String[][][] array2){
        int counter1 = 0;
        int counter2 = 0;
        
        for(int i = 0; i < array3D.length; i++){
            for(int j = 0; j < array3D[i].length; j++){
                for(int k = 0; k < array3D[i][j].length; k++){
                    counter1+=1;
                }
            }
        }
        
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                for(int k = 0; k < array2[i][j].length; k++){
                    counter2+=1;
                }
            }
        }
        
        DecimalFormat percents = new DecimalFormat("0.00%");
        double percent = ((double)(counter2 - counter1)/counter1);
        System.out.println(percents.format(percent));
    }
    
    public static String[][][] frankenstein(String[][][] array2){
        
        int min = 0;
        String temp;
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                for(int k = 0; k < array2[i][j].length; k++){
                    for( int w = k; w < array2[i][j].length; w++){
                        if(!((array2[i][j][w].charAt(0)) == '$')){
                            if(array2[i][j][w].codePointAt(0) < array2[i][j][min].codePointAt(0)){
                                min = w; 
                            }
                            if(array2[i][j][w].codePointAt(0) == array2[i][j][min].codePointAt(0)){
                                if(array2[i][j][w].codePointAt(1) < array2[i][j][min].codePointAt(1)){
                                    min = w; 
                                }
                                if(array2[i][j][w].codePointAt(1) == array2[i][j][min].codePointAt(1)){
                                    if(Integer.parseInt(array2[i][j][w].substring(2,6)) < Integer.parseInt(array2[i][j][min].substring(2,6))){
                                        min = w;
                                    }
                                }
                            }
                        }
                    }
                    temp = array2[i][j][k];
                    array2[i][j][k] = array2[i][j][min];
                    array2[i][j][min] = temp;
                    min = k + 1;
                }
                min = 0;
            }
        }
        for(int i = 0; i < array2.length; i++){
            min = i;
            for(int j = i; j < array2.length; j++){
                if(array2[j].length < array2[min].length){
                        min = j;
                    }
            }
                
                String[][] temporary = array2[i];
                array2[i] = array2[min];
                array2[min] = temporary;
        }
        return array2;
    }
}