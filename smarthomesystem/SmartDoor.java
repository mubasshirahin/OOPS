
package smarthomesystem;

public class SmartDoor extends SmartDevice{
    private boolean isLocked;

    public SmartDoor(String Name) {
        super(Name);
        this.isLocked = isLocked;
    }
    
    public void Lock(){
        isLocked = true;
        System.out.println(getName()+ " is now LOCKED.");
    }
    public void Unlock(){
        isLocked = false;
        System.out.println(getName()+ " is now UNLOCKED");
    }
    @Override
    public void displayStatus(){
        System.out.println(getName()+ "-Status: "+ (isOn()?"ON":"OFF")+",Locked: "+ (isLocked?"YES":"NO")+ ".");
    }
    
}
