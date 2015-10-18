
/**
 * Equestria Programming Assignment - Returning Values
 * 
 * @author Hannah Pang 
 * @version October 19, 2015
 */
public class Equestria
{
    // Exercise 1... three distances (Baltimare - Manehattan, Los Pegasus - Neighagra Falls, Badlands - Ponyville)
    public static double distance(int x1,int y1,int x2,int y2)
    {
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return Math.round(distance*100.0)/100.0;
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
    public static double circumference(double radius)
    {
        double circumference = Math.PI*radius*2;
        return Math.round(circumference*100.0)/100.0;
    }
    
    public static void printCircumference(int x1,int y1,int x2,int y2)
    {
        // find length of trip using the circumference method, print this out
        double radius = distance(18,9,35,8);
        double lengthOfTrip = circumference(radius);
        System.out.println("Length of trip (with Canterlot-Manehattan as the radius) = " + lengthOfTrip);
    }
    
    // Exercise 3... Tour of 3 places, Distances and Angles b/t them (Canterlot, Manehattan, Macintosh Hills)
    public static double angle(double d1, double d2, double d3)
    {
        double angle = Math.toDegrees(Math.acos((d1*d1+d3*d3-d2*d2)/(2*d1*d3)));
        return Math.round(angle*100.0)/100.0;
    }
    
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
        double B = angle(a,b,c); // angle MacCanterMane
        System.out.println("Angle Mac-Canter-Mane = " + B);
        double C = angle(a,c,b); // angle CanterManeMac
        System.out.println("Angle Canter-Mane-Mac = " + C);
        double A = angle(c,a,b); // angle ManeMacCanter
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
        double maxdistance = Math.max(Math.max(Math.max(Math.max(Math.max(distManehattanToCloudsdale,distManehattanToCanterlot),
                                                         distManehattanToAppleloosa),
                                                distCloudsdaleToCanterlot),
                                       distCloudsdaleToAppleloosa),
                              distCanterlotToAppleloosa);
        System.out.println("Longest distance between two destinations = " + maxdistance);
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
        