package Online.Online2;

class Train{
    public double ticketPrice;
    public String destination;
    public double distance;

    Train(){
    }

    public Train(double ticketPrice, String destination, double distance) {
        this.ticketPrice = ticketPrice;
        this.destination = destination;
        this.distance = distance;
    }

    public double getDiscount(){
        if(distance>=6000) {
            ticketPrice = 0.25*ticketPrice;
            return ticketPrice;
        }
        else{
            return 0;
        }
    }
}

public class B1_Online2_SetB {
    public static void main(String[] args) {
        Train t = new Train(10000,"Dhaka",7000);

        System.out.println(t.getDiscount());

    }
}
