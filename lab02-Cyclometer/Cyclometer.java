//Brian Logsdon
//Feb 05, 2016
//CSE 002
//Lab 02- Cyclometer


public class Cyclometer{
    // main method required for every Java program
    public static void main(String[] args) {
    
    // our input data
    int secsTrip1=480; //duration of trip 1 in seconds
    int secsTrip2=3220; //duration of trip 2 in seconds
    int countsTrip1=1561; //number of counts of trip 1
    int countsTrip2=9037; //number of counts of trip 2
    
    //our intermediate variables and output data
    double wheelDiameter=27.0, //diameter of wheel in inches
    PI=3.14159, //value of pi
    feetPerMile=5280, //number of feet in a mile
    inchesPerFoot=12, //number of inches in a foot
    secondsPerMinute=60; //number of seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance; //distances of trips 1 and 2, and the total
        
    //print duration of trips 1 and 2
    System.out.println( "Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
    System.out.println( "Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
    //calculate distance of trips
    //use wheel diamter, pi, and counts
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2; //adding distances of trips 1 and 2 to get total distance
    
    //print out output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    } //end of main method
} //end of class