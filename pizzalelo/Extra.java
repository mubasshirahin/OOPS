package pizzalelo;

public class Extra extends PizzaNames {
    private String extra;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Extra(String name, int quantity, String size, String spiceLevel, String extra) {
        super(name, quantity, size, spiceLevel);
        this.extra = extra;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.calculatePrice();
        
        if (extra.equals("Soft Drinks")) {
            finalPrice += 50;
        } else if (extra.equals("Milkshake")) {
            finalPrice += 100;
        }
        
        return finalPrice;
    }
}
