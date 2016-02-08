//Brian Logsdon
//Feb 9, 2015
//CSE2
//hw02

//set up class
public class Arithmetic{
    //main method needed for all java programs
    public static void main(String[] args) {
        
        //input data
    
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;
        
        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;
        
        //Number of belts
        int numBelts = 1;
        //Cost per belt
        double beltCost = 33.99;
        
        //tax rate
        double paSalesTax = 0.06;
        
        //declare variables
        double totalCostOfPants, //total cost of pants
        totalCostOfShirts, //total cost of shirts
        totalCostOfBelts, //total cost of belts
        taxOnPants, //tax on all of the pants
        taxOnShirts, //tax on all of the shirts
        taxOnBelts, //tax on all of the belts
        totalCostOfPurchases, //total cost of purchases before tax
        totalSalesTax, //total sales tax
        totalPaid; //total amount paid including tax
        
        //calculate output data
        totalCostOfPants = pantsPrice * numPants; //calculating cost of pants
        totalCostOfShirts = shirtPrice * numShirts; //calculating cost of shirts
        totalCostOfBelts = beltCost * numBelts; //calculating cost of belts
        taxOnPants = ((int)(totalCostOfPants * paSalesTax * 100))/100.0; //calculating tax on pants
        taxOnShirts = ((int)(totalCostOfShirts * paSalesTax * 100))/100.0; //calculating tax on shirts
        taxOnBelts = ((int)(totalCostOfBelts * paSalesTax * 100))/100.0; //calculating tax on belts
        totalCostOfPurchases = totalCostOfPants +
        totalCostOfShirts + totalCostOfBelts; //calculating total cost of purchase
        totalSalesTax = taxOnPants + taxOnShirts +
        taxOnBelts; //calculating total sales tax
        totalPaid = totalCostOfPurchases + totalSalesTax; //calculating total paid
        //dollar ammounts may be inaccurate because of rounding error
        
        //print output data
        System.out.println("The total cost of pants is $" + totalCostOfPants);
        System.out.println("The total cost of shirts is $" + totalCostOfShirts);
        System.out.println("The total cost of belts is $" + totalCostOfBelts);
        System.out.println("The total tax on pants is $" + taxOnPants);
        System.out.println("The total tax on shirts is $" + taxOnShirts);
        System.out.println("The total tax on belts is $" + taxOnBelts);
        System.out.println("The total of the purchase before tax is $" +
        totalCostOfPurchases);
        System.out.println("The total sales tax is $" + totalSalesTax);
        System.out.println("The total amount paid is $" + totalPaid);
    }
}