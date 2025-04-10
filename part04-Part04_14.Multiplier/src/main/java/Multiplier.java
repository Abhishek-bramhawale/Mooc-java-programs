public class Multiplier {
//     Constructor public Multiplier(int number).
// Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor

    private int number;
    public Multiplier(int number){
        this.number=number;
    }

    public int multiply(int no){
        return this.number*no;
    }

}
