
/**
 * Write a description of class Equestria here.
 * 
 * @author Hannah Pang 
 * @version October 13, 2015
 */
public class Equestria
{
    public static double distance(int x1,int y1,int x2,int y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    
    public static void printDistances()
    {
        double baltimareToManehattan = distance();
        System.out.println("Distance from Baltimare to Manehattan = " + baltimareToManehattan);
        double losPegasusToNeighagraFalls = distance();
        System.out.println("Distance from Los Pegasus to Neighagra = " + losPegasusToNeighagraFalls);
        double badlandsToPonyville = distance();
        System.out.println("Distance from Badlands to Ponyville = " + badlandsToPonyville);
    }
    
    public static double circumference(int diameter)
    {
        return Math.PI*diameter;
    }
    
    public static void printCircumference()
    {
        double lengthOfTrip = circumference();
        System.out.println("Length of trip = " + lengthOfTrip);
    }
    
    public static void printTourDistancesAndAngles()
    {
        double distCanterlotToManehattan = distance();
        double a = distCanterlotToManehattan;
        double distManehattanToMacintoshHills = distance();
        double b = distManehattanToMacintoshHills;
        double distMacintoshHillsToCanterlot = distance();
        double c = distMacintoshHillsToCanterlot;
        double angleMacCanterMane = Math.acos((a*a+c*c-b*b)/(2*a*c));
        double B = Math.toDegrees(angelMacCanterMane);
        double angleCanterManeMac = Math.acos((a*a+c*c-b*b)/(2*a*c));
        double C = Math.toDegrees(angleCanterManeMac);
        double angleManeMacCanter = 180 - B - C;
    }
    
    public static void longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        double distManehattanToCloudsdale = distance();
        double distManehattanToCanterlot = distance();
        double distManehattanToAppleloosa = distance()
        double distCloudsdaleToCanterlot = distance();
        double distCloudsdaleToAppleloosa = distance();
        double distCanterlotToAppleloosa = distance();
        double maxOne = Math.max(distManehattanToCloudsdale,distManehattanToCanterlot);
        double maxTwo = Math.max(maxOne,distManehattanToAppleloosa);
        double maxThree = Math.max(maxTwo,distCloudsdaleToCanterlot);
        double maxFour = Math.max(maxThree,distCloudsdaleToAppleloosa);
        double maxDistance = Math.max(maxFour,distCanterlotToAppleloosa);
        System.out.println("Longest distance between two destinations = " + maxDistance);
    }
    
    public static void main(String[] args)
    {
        printDistances();
        printCircumference();
        printTourDistancesAndAngles();
        longestTrip();
    }
}
        