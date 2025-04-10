public class Statistics {
    private int count;
    private int sum;
    // private double avg=0;

    public Statistics() {
        // initialize the variable numberCount here
        this.count=0;
        this.sum=0;

    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum=this.sum+number;
    }

    public int getCount() {
        // write code here
        return this.count;

    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // this.avg=(double)this.sum/this.count;
        if (this.count == 0) {
            return 0.0;
        }
        return (double)this.sum/this.count;
        // write code here
    }
}
