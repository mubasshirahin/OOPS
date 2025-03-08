package Online.Online2;

class RideDemo{
    String destination;
    double distance;
    int passengerCount;

    RideDemo(){
    }

    public RideDemo(String destination, double distance, int passengerCount) {
        this.destination = destination;
        this.distance = distance;
        this.passengerCount = passengerCount;
    }

    public double calculateCost(){
        if(destination.equals("Dhaka")){
            return distance*1.1;
        }
        else if(!destination.equals("Dhaka") && passengerCount <= 2) {
            return distance * 1.2;
        }
        else{
            return distance*1.2 + (100*passengerCount);
        }
    }

}

public class B2_Online2_SetB {
    public static void main(String[] args) {
        RideDemo rd = new RideDemo("Dhaka",1000,4);
        System.out.println(rd.calculateCost());
    }
}
