
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        
        // Creates an account named "Matthews account" with the balance 1000
        // Creates an account named "My account" with the balance 0
        // Withdraws 100.0 from Matthew's account
        // Deposits 100.0 to "my account"
        // Prints both the accounts

        Account a1=new Account("Matthews account",1000);
        Account a2=new Account("My account",0);
         a1.withdrawal(100.0);
         a2.deposit(100.0);
         System.out.println(a1);
         System.out.println(a2);


    }
}
