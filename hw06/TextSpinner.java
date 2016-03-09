//Brian Logsdon
//March 7, 2016
//CSE2
//hw06-TextSpinner

//code makes infinite loop to make text spinner
//set up class
public class TextSpinner{
    
    //set up main method
    public static void main(String[] args){
        
        //make for loop that runs forever
        //runs through /, -, \, |
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