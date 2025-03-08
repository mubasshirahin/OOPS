package Online.Online2;

class CustomerDemo{
    String customerType;
    double totalCost;
    int totalItems;

    CustomerDemo(){
    }

    public CustomerDemo(String customerType, double totalCost, int totalItems) {
        this.customerType = customerType;
        this.totalCost = totalCost;
        this.totalItems = totalItems;
    }

    public double calculatePrice(){
        if(customerType.equals("new") && totalItems<10){
            return totalCost+(totalCost*0.05);
        }
        else if(customerType.equals("new") && totalItems>=10){
            return totalCost-(0.05*totalCost);
        }
        else{
            return totalCost-(0.01*totalCost);
        }
    }

}

public class B2_Online2_SetA {
    public static void main(String[] args) {
        CustomerDemo cd = new CustomerDemo("Rookie",1000,10);

        System.out.println(cd.calculatePrice());
    }
}
