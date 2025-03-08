package smarthomesystem;

import java.util.*;

public class SmartHome {
    private List<SmartDevice> devices;    
   
    public SmartHome(){
        this.devices = new ArrayList<>();
    }
    
    public void addDevice(SmartDevice device){
        devices.add(device);
    }
    
    public void displayAllDevices(){
        System.out.println("---->Smart Home Devices<----");
        System.out.println("=============================");
        for(SmartDevice device : devices){
            device.displayStatus();
        }
    }
    
    public SmartDevice getDeviceByIndex(int index){
        if(index>=0 && index<devices.size()){
            return devices.get(index);
        }
        System.out.println("Invalid device number.");
        return null;
    }
    
    public void displayDeviceList(){
        System.out.println("\nAvailable Devices:");
        System.out.println("=======================");
        
        for(int i=0;i<devices.size();i++){
            System.out.println((i+1)+"."+devices.get(i).getName());
        }
    }
}
