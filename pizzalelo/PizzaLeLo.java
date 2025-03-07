package pizzalelo;

import java.util.Scanner;

public class PizzaLeLo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to PizzaLeLo");
        System.out.println("====================");
        System.out.println(" ");
        System.out.println("--->Menu<----");
        System.out.println("1. Chicken Pizza");
        System.out.println("2. Chicken Mushroom Delight");
        System.out.println("3. Crispy Chicken Pizza");
        System.out.println("4. Chicken Naga Lover");
        System.out.println("5. Meat Lover Pizza");
        System.out.println("6. Cheese Lover Pizza");
        System.out.println("7. Pepperoni Pizza");
        System.out.println(" ");
        System.out.print("Enter your choice: ");
        
        int pizzaChoice = sc.nextInt();       

        String pizzaName = PizzaNames.addPizza(pizzaChoice);
        
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Extra pizza = new Extra(pizzaName, quantity, " ", " ", " ");
        
        System.out.println("Welcome to PizzaLeLo");
        System.out.println("====================");
        System.out.println("--->Size<----");
        System.out.println("1. Small - 499/-");
        System.out.println("2. Medium - 699/-");
        System.out.println("3. Large - 799/-");
        System.out.print("Enter your choice: ");
        
        int sizeChoice = sc.nextInt();

        switch(sizeChoice) {
            case 1:
                pizza.setSize("Small");
                break;
            case 2:
                pizza.setSize("Medium");
                break;
            case 3:
                pizza.setSize("Large");
                break;
        }
        
        System.out.println("Welcome to PizzaLeLo");
        System.out.println("====================");
        System.out.println("--->Spice Level<----");
        System.out.println("1. Less Spicy");
        System.out.println("2. Medium Spicy");
        System.out.println("3. Very Spicy");
        System.out.print("Enter your choice: ");
        
        int spiceChoice = sc.nextInt();
        
        String spice = " ";
        
        switch(spiceChoice) {
            case 1:
                spice = "Less Spicy";
                break;
            case 2:
                spice = "Medium Spicy";
                break;
            case 3:
                spice = "Very Spicy";
                break;
        }
        
        pizza.setSpiceLevel(spice);
        
        System.out.println("Welcome to PizzaLeLo");
        System.out.println("====================");
        System.out.println("--->Extra Items<----");
        System.out.println("1. Soft Drinks");
        System.out.println("2. Milkshake");
        System.out.println("3. Nothing");
        System.out.print("Enter your choice: ");
        
        int extraChoice = sc.nextInt();
        String extra = " ";
        
        switch(extraChoice) {
            case 1:
                extra = "Soft Drinks";
                break;
            case 2:
                extra = "Milkshake";
                break;
            case 3:
                extra = "Null";
                break;
        }
        
        pizza.setExtra(extra);
        
        double totalPrice = pizza.calculatePrice();
        pizza.setPrice(totalPrice);
        
        System.out.println("\n---->Bill<----");
        System.out.println("Pizza: " + pizza.getName());
        System.out.println("Quantity: "+ pizza.getQuantity());
        System.out.println("Size: " + pizza.getSize());
        System.out.println("Spice Level: " + pizza.getSpiceLevel());
        System.out.println("Extra: " + pizza.getExtra());  
        System.out.println("Total Price: " + pizza.getPrice());
    }
}
