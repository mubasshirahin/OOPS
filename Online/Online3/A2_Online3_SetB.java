package Online.Online3;

class Appliance{
    private double powerConsumption;

    public Appliance(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}

class ApplianceFactory{
    public Appliance createAppliance(double voltage){
        double tmp = voltage*5;
        Appliance a = new Appliance(tmp);
        return a;
    }
    public Appliance createAppliance(double voltage,double current){
        double tmp = voltage * current;
        Appliance a = new Appliance(tmp);
        return a;
    }
    public Appliance createAppliance(double hours,double powerRating,double efficiency){
        double tmp = (powerRating/efficiency)*hours;
        Appliance a = new Appliance(tmp);
        return a;
    }
}

public class A2_Online3_SetB {
    public static void main(String[] args) {
        ApplianceFactory af = new ApplianceFactory();

        Appliance a1 = af.createAppliance(220);
        System.out.println(a1.getPowerConsumption());
        Appliance a2 = af.createAppliance(220,5);
        System.out.println(a2.getPowerConsumption());
        Appliance a3 = af.createAppliance(10,2000,0.85);
        System.out.println(a3.getPowerConsumption());


    }

}
