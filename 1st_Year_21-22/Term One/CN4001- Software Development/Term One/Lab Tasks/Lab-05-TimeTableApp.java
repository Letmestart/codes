import java.util.*;

/** Program to print time tables
 * by Towhedur Rahman
 * on 26th October, 2021
 * */

public class TimeTableApp 
{
    public static void main(String args[]) 
    {
        
      Scanner sc=new Scanner(System.in);
        
      int number;
      System.out.println("Enter the number: ");
      number=sc.nextInt();
    
      
      while(number<2 || number>100){
     System.out.println("Error: Enter  number between 2- 100 ");
     number=sc.nextInt();
          
      }
    
        for(int i=1;i<=12;i++){
            
        System.out.println(number + " x " + i +" = "+ number*i);
        
      }
      System.out.println("End of Program ");
    }
}