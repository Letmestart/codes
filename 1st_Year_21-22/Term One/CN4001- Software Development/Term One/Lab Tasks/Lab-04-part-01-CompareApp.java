/** Program to reveal secrets
* Towhedur rahman
* @version 19/10/2020
*/
 import java.util.*;
 public class CompareApp 
    {
    public static void main(String args[]) 
        {
            Scanner kb= new Scanner(System.in);
            int num1 ;
            int num2;
            System.out.println(" Enter first number " );
            num1 = kb.nextInt();
            
            System.out.println();
 
            System.out.println("Enter second number " );
            num2 = kb.nextInt();
 
             if(num1== num2){
             System.out.println("Numbers are equal" );
             }
             else
             {
             System.out.println("Numbers are not equal" );
              System.out.println();
             }
             System.out.println("End of Program" );
        }
    }
 

      
      

     
    
