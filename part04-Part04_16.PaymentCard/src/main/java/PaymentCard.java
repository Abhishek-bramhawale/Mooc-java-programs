public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance=openingBalance;
    }

    public void eatAffordably() {
        // write code here
        if(this.balance>=2.60){
        this.balance=this.balance-2.60;
        }
    }
    
    public void eatHeartily() {
        if(this.balance>=4.60){
        // write code here

        this.balance=this.balance-4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if(amount>0){
        this.balance+=amount;
            if(this.balance>150){
            this.balance=150;
        }}

    }

    public String toString() {
        // write code here
        return "The card has a balance of "+this.balance+" euros";
    }
}