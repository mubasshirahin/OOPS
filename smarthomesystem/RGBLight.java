
package smarthomesystem;

public class RGBLight extends SmartDevice{
    private String color;
    
    public RGBLight(String name){
        super(name);
        this.color = "White";
    }
    
    public void setColor(String color){
        this.color = color;
        System.out.println(getName()+ " color set to "+ color + ".");
    }
    
    @Override
    public void displayStatus(){
        System.out.println(getName()+ " -Status: "+ (isOn()?"ON":"OFF")+", Color: "+ color + ".");
    }
}
