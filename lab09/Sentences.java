//Brian Logsdon
//March 25, 2016
//CSE2
//lab09

import java.util.Random;

public class Sentences{
        
    public static void main(String[] args){
        
        System.out.print("The ");
        
        adjective();
        
        adjective();
        
        subjectNoun();
        
        pastVerb();
        
        System.out.print("the ");
        
        adjective();
        
        objectNoun();
    }
    
        public static String adjective(){
            
            Random randomGenerator = new Random();
            
            int randomInt = randomGenerator.nextInt(10);
            String adj = "";
            switch (randomInt) {
                case 1: adj = "fat ";
                break;
                case 2: adj = "slow ";
                break;
                case 3: adj = "young ";
                break;
                case 4: adj = "quick ";
                break;
                case 5: adj = "angry ";
                break;
                case 6: adj = "happy ";
                break;
                case 7: adj = "sad ";
                break;
                case 8: adj = "purple ";
                break;
                case 9: adj = "yellow ";
                break;
                case 10: adj = "old ";
                break;
                default: adj = "gross ";
            }
            System.out.print(adj);
            return adj;
        }
        
         public static String subjectNoun(){
            
            Random randomGenerator = new Random();
            
            int randomInt = randomGenerator.nextInt(10);
            String SNoun = "";
            switch (randomInt) {
                case 1: SNoun = "dog ";
                break;
                case 2: SNoun = "cat ";
                break;
                case 3: SNoun = "fox ";
                break;
                case 4: SNoun = "bird ";
                break;
                case 5: SNoun = "sloth ";
                break;
                case 6: SNoun = "wolf ";
                break;
                case 7: SNoun = "man ";
                break;
                case 8: SNoun = "woman ";
                break;
                case 9: SNoun = "baby ";
                break;
                case 10: SNoun = "grandma ";
                break;
                default: SNoun = "grandpa ";
            }
            System.out.print(SNoun);
            return SNoun;
        }
        
        public static String pastVerb(){
            
            Random randomGenerator = new Random();
            
            int randomInt = randomGenerator.nextInt(10);
            
            String verb = "";
            switch (randomInt) {
                case 1: verb = "jumped ";
                break;
                case 2: verb = "tripped ";
                break;
                case 3: verb = "flipped ";
                break;
                case 4: verb = "congratulated ";
                break;
                case 5: verb = "shot ";
                break;
                case 6: verb = "passed ";
                break;
                case 7: verb = "drove ";
                break;
                case 8: verb = "fed ";
                break;
                case 9: verb = "punched ";
                break;
                case 10: verb = "kicked ";
                break;
                default: verb = "karate chopped ";
            }
            System.out.print(verb);
            return verb;
        }
        
        public static String objectNoun(){
            
            Random randomGenerator = new Random();
            
            int randomInt = randomGenerator.nextInt(10);
            
            String ONoun = "";
            switch (randomInt) {
                case 1: ONoun = "dog.";
                break;
                case 2: ONoun = "cat.";
                break;
                case 3: ONoun = "fox.";
                break;
                case 4: ONoun = "bird.";
                break;
                case 5: ONoun = "sloth.";
                break;
                case 6: ONoun = "wolf.";
                break;
                case 7: ONoun = "man.";
                break;
                case 8: ONoun = "woman.";
                break;
                case 9: ONoun = "baby.";
                break;
                case 10: ONoun = "grandma.";
                break;
                default: ONoun = "grandpa.";
            }
            System.out.println(ONoun);
            return ONoun;
        }
        
}