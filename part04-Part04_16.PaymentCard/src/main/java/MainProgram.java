
public class MainProgram {

    public static void main(String[] args) {
 
        // Create Paul's card. The opening balance of the card is 20 euros
        // Create Matt's card. The opening balance of the card is 30 euros
        // Paul eats heartily
        // Matt eats affordably
        // The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        // Paul tops up 20 euros
        // Matt eats heartily
        // The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        // Paul eats affordably
        // Paul eats affordably
        // Matt tops up 50 euros
        // The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)


    PaymentCard paul=new PaymentCard(20);
    PaymentCard matt=new PaymentCard(30);
    paul.eatHeartily();
    matt.eatAffordably();
    System.out.println("Paul: "+paul);
    System.out.println("Matt: "+matt);
    paul.addMoney(20);
    matt.eatHeartily();
    System.out.println("Paul: "+paul);
    System.out.println("Matt: "+matt);

    paul.eatAffordably();
    paul.eatAffordably();
    matt.addMoney(50);
    System.out.println("Paul: "+paul);
    System.out.println("Matt: "+matt);



    }
}