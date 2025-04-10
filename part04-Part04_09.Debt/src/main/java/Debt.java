public class Debt {
//  the waitOneYear method grows the debt amount.

// The debt is increased by multiplying the balance by the interest rate.

private double balance,interestRate;

public Debt(double initialBalance, double initialInterestRate){
    this.balance=initialBalance;
    this.interestRate=initialInterestRate;
}

public void printBalance(){
    System.out.println(this.balance);
}

public void waitOneYear(){
    this.balance=this.balance*this.interestRate;
}

}
