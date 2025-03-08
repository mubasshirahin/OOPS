package smarthomesystem;

public abstract class SmartDevice {
    private final String Name;
    private boolean isOn;
    
    public SmartDevice(String Name){
        this.Name = Name;
        this.isOn = false;        
    }
    
    public String getName(){
        return Name;
    }
    
    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public void turnOn(){
        isOn = true;
        System.out.println(Name + " is now ON.");
    }
    
    public void turnOff(){
        isOn = false;
        System.out.println(Name + " is now OFF.");
    }
    
    public abstract void displayStatus();
    
}
