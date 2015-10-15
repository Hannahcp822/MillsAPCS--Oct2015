
/**
 * Write a description of class Equestria here.
 * 
 * @author Hannah Pang 
 * @version October 16, 2015
 */
public class Equestria
{
    // Exercise 1... three distances (Baltimare - Manehattan, Los Pegasus - Neighagra Falls, Badlands - Ponyville)
    public static double distance(int x1,int y1,int x2,int y2)
    {
        // find distance using distance formula
        double distance = (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))*100;
        
        // round distance to two decimal places
        int distance2 = (int)(distance);
        distance = (distance2)/100;
        return distance;
    }
    
    public static void printDistances()
    {
        // find three distances using the distance method, print these out
        
        double baltimareToManehattan = distance(32,15,35,8);
        System.out.println("Distance from Baltimare to Manehattan = " + baltimareToManehattan);
        double losPegasusToNeighagraFalls = distance(7,19,23,7);
        System.out.println("Distance from Los Pegasus to Neighagra Falls = " + losPegasusToNeighagraFalls);
        double badlandsToPonyville = distance(28,22,17,13);
        System.out.println("Distance from Badlands to Ponyville = " + badlandsToPonyville);
    }
    
    // Exercise 2... length of Princess Luna's circular trip 
    public static double circumference(double diameter)
    {
        return Math.PI*diameter;
    }
    
    public static void printCircumference(int x1,int y1,int x2,int y2)
    {
        // find length of trip using the circumference method, print this out
        
        double d = distance(x1,y1,x2,y2); 
        double lengthOfTrip = circumference(d);
        System.out.println("Length of trip = " + lengthOfTrip);
    }
    
    // Exercise 3... Tour of 3 places, Distances and Angles b/t them (Canterlot, Manehattan, Macintosh Hills)
    public static void printTourDistancesAndAngles()
    {
        // find distances between each place using the distance method, print these out
        
        double a = distance(18,9,35,8); // distance Canterlot to Manehattan
        System.out.println("Distance from Canterlot to Manehattan = " + a);
        double b = distance(35,8,18,23); // distance Manehattan to Macintosh Hills
        System.out.println("Distance from Manehattan to Macintosh Hills = " + b);
        double c = distance(18,23,18,9); // distance Macintosh Hills to Canterlot
        System.out.println("Distance from Macintosh Hills to Canterlot = " + c);
        
        // find angles between each place using law of cosines and Math.acos, print these out
        
        double B = Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c))); // angle MacCanterMane
        System.out.println("Angle Mac-Canter-Mane = " + B);
        double C = Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b))); // angle CanterManeMac
        System.out.println("Angle Canter-Mane-Mac = " + C);
        double A = 180 - B - C; // angle ManeMacCanter
        System.out.println("Angle Mane-Mac-Canter = " + A);
    }
    
    // Exercise 4... Longest distance b/t 4 places (Manehattan, Cloudsdale, Canterlot, Appleloosa)
    public static void longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        // find distances between each place using the distance method u
        
        double distManehattanToCloudsdale = distance(x1,y1,x2,y2);
        double distManehattanToCanterlot = distance(x1,y1,x3,y3);
        double distManehattanToAppleloosa = distance(x1,y1,x4,y4);
        double distCloudsdaleToCanterlot = distance(x2,y2,x3,y4);
        double distCloudsdaleToAppleloosa = distance(x2,y2,x4,y4);
        double distCanterlotToAppleloosa = distance(x3,y3,x4,y4);
        
        // use Math.max to compare each of the distances to find the longest distance
        
        double maxOne = Math.max(distManehattanToCloudsdale,distManehattanToCanterlot);
        double maxTwo = Math.max(maxOne,distManehattanToAppleloosa);
        double maxThree = Math.max(maxTwo,distCloudsdaleToCanterlot);
        double maxFour = Math.max(maxThree,distCloudsdaleToAppleloosa);
        double maxDistance = Math.max(maxFour,distCanterlotToAppleloosa);
        System.out.println("Longest distance between two destinations = " + maxDistance);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Exercise #1");
        printDistances();
        System.out.println();
        System.out.println("Exercise #2");
        printCircumference(18,23,18,9);
        System.out.println();
        System.out.println("Exercise #3");
        printTourDistancesAndAngles();
        System.out.println();
        System.out.println("Exercise #4");
        longestTrip(35,8,15,7,18,9,19,20);
    }
}
        