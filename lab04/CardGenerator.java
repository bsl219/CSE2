//Brian Logsdon
//Feb 19, 2016
//CSE2
//lab04

//set up class
public class CardGenerator {
    
    //set up main method
    public static void main(String[] args) {
        
        //print random number between 1 and 52
        int randomNumber = (int) (Math.random() * 52) + 1;
        
        String suit;
        String identity;
        
        if(randomNumber < 14) {
            suit = "Diamonds";
        }
        
        else if(randomNumber > 13 && randomNumber < 27) {
            suit = "Clubs";
        }
        
        else if(randomNumber > 26 && randomNumber < 40) {
            suit = "Hearts";
        }
        
        else {
            suit = "Spades";
        }
        
        randomNumber = randomNumber % 13;
        
        switch(randomNumber) {
            case 0: identity = "King";
            break;
            case 1: identity = "Ace";
            break;
            case 11: identity = "Jack";
            break;
            case 12: identity = "Queen";
            break;
            default: identity = Integer.toString(randomNumber);
        }
        
        
        System.out.println("You picked the " + identity + " of "+
        suit);
    }
}