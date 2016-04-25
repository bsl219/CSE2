
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            
            if(i < 5){
                for(int j = 0; j <= i; j++){
                    System.out.print(i);
                }
            }
            
            if(i > 4){
                for(int j = 0; j <= 4 - (i - 5); j++){
                    System.out.print(i);
                }
            }
            
            System.out.println();
        }
    }
}