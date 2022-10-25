/** Program to reveal secrets
* By Towhedur Rahman
* @version 19/10/2020
*/
 import java.util.*;
 public class SecretsApp 
    {
    public static void main(String args[]) 
        {
         Scanner Sc= new Scanner (System.in);
         
         System.out.print(" Enter Security Level  ");
         int level = Sc.nextInt();
         
         switch(level){
            case 1: System.out.println ("The security guard is a robot");break; 
            case 2: System.out.println ("There is a secret room in the basement");break;
            case 3: System.out.println ("The cook is an alien");break;
             default: System.out.println ("No such level");
             
             
             
             
             System.out.println("End of Program" );
             
         }
            
        }
        
    }

 

      
      

     
    
