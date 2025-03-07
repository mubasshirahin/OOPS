package pizzalelo;

public class PizzaNames extends SpiceLevel {
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public PizzaNames(String name, int quantity, String size, String spiceLevel) {
        super(spiceLevel, quantity);
        this.name = name;
        this.size = size;
    }

    public static String addPizza(int pizzaChoice) {
        String pizzaName = " ";
        switch (pizzaChoice) {
            case 1:
                pizzaName = "Chicken Pizza";
                break;
            case 2:
                pizzaName = "Chicken Mushroom Delight";
                break;
            case 3:
                pizzaName = "Crispy Chicken Pizza";
                break;
            case 4:
                pizzaName = "Chicken Naga Lover";
                break;
            case 5:
                pizzaName = "Meat Lover Pizza";
                break;
            case 6:
                pizzaName = "Cheese Lover Pizza";
                break;
            case 7:
                pizzaName = "Pepperoni Pizza";
                break;
        }
        return pizzaName;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 0;
        if (getSize().equals("Small")) {
            basePrice = 499 * getQuantity();
        } else if (getSize().equals("Medium")) {
            basePrice = 699 * getQuantity();
        } else if (getSize().equals("Large")) {
            basePrice = 799 * getQuantity();
        }

        return basePrice;
    }
}
