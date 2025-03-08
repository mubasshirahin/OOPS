package smarthomesystem;

public class AirConditioner extends SmartDevice {
    private int temperature;
    
    public AirConditioner(String name){
        super(name);
        this.temperature = 24;
    }
    
    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println(getName()+ " temperature set to "+ temperature+ " C");
    }
    
    @Override
    public void displayStatus(){
        System.out.println(getName()+" -Status: "+ (isOn()?"ON":"OFF")+", Temperature: "+ temperature + "C");
    }
}
