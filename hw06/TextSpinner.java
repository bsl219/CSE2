//Brian Logsdon
//March 7, 2016
//CSE2
//hw06-TextSpinner

//set up class
public class TextSpinner{
    
    //set up main method
    public static void main(String[] args){
        
        for(int i = 0; i > -1; i++){
            if(i % 4 == 0){
                System.out.print( "\b" + "/");
            }
            
            if(i % 4 == 1){
                System.out.print( '\b' + "-");
            }
            
            if(i % 4 == 2){
                System.out.print( '\b' + "\\");
            }
            
            if(i % 4 == 3){
                System.out.print( '\b' + "|");
            }
        }
    }
}