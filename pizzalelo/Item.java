package pizzalelo;

public abstract class Item {
    private double price = 0;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculatePrice();
    
    public Item(int quantity) {
        this.quantity = quantity;
    }
}
