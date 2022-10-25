import java.util.*;
public class CircleApp
{
    
    
    public static void main(String args[])
    {
    Scanner kb =new Scanner(System.in);
    
    
    
    double radius, diameter,area;
    final double PI=3.14;
     System.out.println ("****Circle App****");
     
     System.out.println ();
     
    System.out.print("Enter the radious ");
    radius= kb.nextDouble();
    
    diameter=2 * radius;
    System.out.println("The Diameter is " + diameter);
    
    area = PI * radius *radius;
    
    System.out.println("The area is = "+area);
    
    System.out.println ("End of Program");
 
     
    }
}