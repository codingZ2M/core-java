package constructors;

public class AccountDetails {

    public static void main(String[] args) {

   //BankAccount account1 = new BankAccount();
     
 //  BankAccount account2 = new BankAccount("5566788", "Savings", 10000.00, "Rick", "rick@gm.com", "(404) 355 4386");
   
 BankAccount account3 = new BankAccount("11220505", "Rick", "rick@gm.com", "404355076" );
    	
        System.out.println("Account  Holder Number: " + account3.getAccountNumber());
        System.out.println("Account Type: " + account3.getAccountType());
        System.out.println("Account Balance: " + account3.getAccountBalance());
        System.out.println("Account Holder Name: " + account3.getAccountHolderName());
        System.out.println("Account Holder Email: " + account3.getAccountHolderEmail());
        System.out.println("Account Holder Contact Number: " + account3.getAccountHolderrPhoneNumber());
        
        System.out.println("------------------------------------------------------------------------");
        account3.withdrawal(200.0);

        account3.deposit(250.0);
        account3.withdrawal(100.0);

        account3.deposit(150.0);
        account3.withdrawal(200.0);
        
        //Account rickAccount = new Account();
        
   
    }
}
