public class Product {
    // The product should have a price (double), a quantity (int) and a name (String).

// The class should have:

// the constructor public Product (String initialName, double initialPrice, int initialQuantity)
// a method public void printProduct() that prints product information in the following format:
// Sample output
// Banana, price 1.1, 13 pcs

// The output above is based on the product being assigned the name banana, with a price of 1.1, and a quantity of 13 .

    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price=initialPrice;
        this.quantity=initialQuantity;
        this.name=initialName;
    }

    public void printProduct(){
        System.out.println(this.name+","+" price "+this.price+", "+this.quantity+" pcs");
    }
}
