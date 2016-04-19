//Brian Logsdon
//April 19, 2016
//CSE2
//hw12-RemoveElements

import java.util.Scanner; //import Scanner

//set up class
public class RemoveElements{
    
    //set up main method
  public static void main(String [] arg){
      
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	
	do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
     
      	System.out.print("Enter the index ");
      	while(true){ 
      	index = scan.nextInt();
      	    if(index >= 0 && index <= 9){
      	        break;
      	    }
      	    else{
      	        System.out.println("Please enter an int between 0-9.");
      	        scan.next();
      	    }
      	}
      	newArray1 = delete(num,index);
      	String out1="The output array is ";
      	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out1);
     
          System.out.print("Enter the target value ");
      	target = scan.nextInt();
      	newArray2 = remove(num,target);
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
      	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //set up randomInput method
  public static int[] randomInput(){
      int[] array = new int[10]; //forms new array with length 10
      
      //fill array with random ints betwen 0-9
      for(int i = 0; i < 10; i++){
            array[i] = (int) (Math.random() * 10);
        }
    return array; //return new array
  }
  
  //set up delete method
  public static int[] delete(int[] array, int pos){
      int[] deleteArray = new int[9]; //form new array with length 9
      int counter = 0; //declare and initialize counter
      
      //keep all members of input array except for the one at the target position
      for(int i = 0; i < 10; i++){
        
        if(i != pos){
          deleteArray[i - counter] = array[i];
        }
        else{
          counter = counter + 1;
        }
      }
      
      return deleteArray; //return the new array
  }
  
  //set up remove method
  public static int[] remove(int[] array, int target){
    int counter = 0; //declare and initialize counter
    
    //determine how many target members there are
    for(int i = 0; i < 10; i++){
      if(target == array[i]){
        counter = counter + 1;
      }
    }
    
    int[] removeArray = new int[10 - counter]; //form new array with proper length
    
    counter = 0; //set counter equal to 0
    
    //keep members of input array except for the ones that equal the target input
    for(int i = 0; i < 10; i++){
      if(target != array[i]){
        removeArray[i - counter] = array[i];
      }
      else{
        counter = counter + 1;
      }
    }
    return removeArray; //return new array
  }
}
