package smarthomesystem;

public class Heater extends SmartDevice{
    public Heater(String Name){
        super(Name);
    }       
    
    @Override
    public void displayStatus(){
        System.out.println(getName()+ "-Status: "+ (isOn()?"ON":"OFF")+".");
    }
}
