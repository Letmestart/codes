import java.util.*;


public class TemperatureReadingsApp
{
	 public static void main(String[] args)
	 {
	     double[ ] temperature = new double[7]; 
	     enterTemps(temperature);
	     System.out.println("***TEMPERATURES ENTERED***");
	     displayTemps(temperature);
	     wasHot(temperature);
	     convertToFarenheit(temperature);
	     displayTemps(temperature);
	 }
	
	 static void enterTemps(double[] temperatureIn)
	 {
	     Scanner keyboard = new Scanner(System.in);
	     for (int i = 0; i < temperatureIn.length; i++)
	     {
	         System.out.print("enter max temperature for day " + (i+1)+ ": ");
	         temperatureIn[i] = keyboard.nextDouble();
	     }
	 }
	
	 static void displayTemps(double[] temperatureIn)
	 {
	     System.out.println(); 
	    
	     for (int i = 0; i < temperatureIn.length; i++)
	     {
		      System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
	     }
	 }
	 static void wasHot(double[] temperatureIn)
	 {
	     System.out.println();
	     System.out.print("Hot Days Are");
	     System.out.println();
	     
	     for(int i = 0; i < temperatureIn.length; i++){
	         if (temperatureIn[i] > 18)
	         {
	             System.out.println("Day" + (i+1) + ": " + temperatureIn[i]);
	         }
	     }
	     
	 }
	 
	 static void convertToFarenheit(double[]temperatureIn)
	 {
	         System.out.println();
	         System.out.print("convertToFarenheit");
	         for(int i = 0; i < temperatureIn.length; i++){ 
	             temperatureIn[i]= (temperatureIn[i]*9/5)+32;
	         }
	          
	 }
}