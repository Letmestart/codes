 public class BankApp 
 {
/**  Program to process bankAccount Objects
 * By- Md Towhedur Rahman
 * on 16th November 2021
 **/

    public static void main(String args[])
   {
        
     BankAccount acc1 = new BankAccount("111", "Batman");	
	BankAccount acc2 = new BankAccount("222", "Robin");
	displayAccount(acc1);
	displayAccount(acc2);
	
	System.out.println("After deposit");
	acc1.deposit (100);
	acc2.deposit (50);
	
	displayAccount(acc1);
	displayAccount(acc2);
    
    System.out.println("After Withdraw");
    acc1.withdraw(75);
    acc2.withdraw(75);
    
    displayAccount(acc1);
	displayAccount(acc2);
       
   }
    
    public static void displayAccount(BankAccount account)
    {
    System.out.println ("Account Number:" +account.getAccountNumber());
    System.out.println ("account Name:" +account.getAccountName());
    System.out.println ("Account Balance:" +account.getBalance());
    System.out.println();
    }
}