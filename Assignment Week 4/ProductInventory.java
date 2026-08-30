import java.util.Scanner;

class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        if (unitPrice <= 0)
            throw new IllegalArgumentException("Price must be positive");

        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCount++;
    }

    public void restock(int amount) {
        if (amount > 0)
            quantity += amount;
    }

    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity)
            return false;

        quantity -= amount;
        return true;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return "Code: " + code +
               ", Name: " + name +
               ", Price: " + unitPrice +
               ", Quantity: " + quantity;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product 1 code: ");
        String code1 = sc.nextLine();

        System.out.print("Enter product 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter product 1 price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter product 1 quantity: ");
        int quantity1 = sc.nextInt();
        sc.nextLine();

        Product p1 = new Product(code1, name1, price1, quantity1);

        System.out.print("\nEnter product 2 code: ");
        String code2 = sc.nextLine();

        System.out.print("Enter product 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter product 2 price: ");
        double price2 = sc.nextDouble();

        Product p2 = new Product(code2, name2, price2);

        System.out.print("\nEnter amount to restock product 2: ");
        int restock = sc.nextInt();
        p2.restock(restock);

        System.out.print("Enter amount to sell from product 1: ");
        int sell = sc.nextInt();

        System.out.println("Sale successful: " + p1.sell(sell));

        System.out.println("\n" + p1);
        System.out.println("Inventory value: " + p1.getInventoryValue());

        System.out.println("\n" + p2);
        System.out.println("Inventory value: " + p2.getInventoryValue());

        System.out.println("\nTotal products: " + Product.getProductCount());

        sc.close();
    }
}
