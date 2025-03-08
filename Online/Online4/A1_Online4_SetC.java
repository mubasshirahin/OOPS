package Online.Online4;

class Vehicle{
    private double fuelEfficiency;

    public Vehicle(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}

class ProduceVehicle{
    public Vehicle createVehicle(double speed){
        double tmp = 100.0/speed;
        Vehicle v = new Vehicle(tmp);
        return v;
    }
    public Vehicle createVehicle(double speed,double weight){
        double tmp = (1000.0/weight)+(speed/10.0);
        Vehicle v = new Vehicle(tmp);
        return v;
    }
    public Vehicle createVehicle(int distance,int fuelConsumed){
        double tmp = distance/fuelConsumed;
        Vehicle v = new Vehicle(tmp);
        return v;
    }
}

public class A1_Online4_SetC {
    public static void main(String[] args) {
        ProduceVehicle pv = new ProduceVehicle();

        Vehicle v1 = pv.createVehicle(100);
        Vehicle v2 = pv.createVehicle(100,10);
        Vehicle v3 = pv.createVehicle(100,10);

        System.out.println(v1.getFuelEfficiency());
        System.out.println(v2.getFuelEfficiency());
        System.out.println(v3.getFuelEfficiency());
    }
}
