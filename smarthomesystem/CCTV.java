package smarthomesystem;

public class CCTV extends SmartDevice{
    private boolean isRecording;
    
    public CCTV(String Name){
        super(Name);
        this.isRecording = false;
    }
    
    public void startRecording(){
        isRecording = true;
        System.out.println(getName()+ " stared recording.");
    }
    
    public void stopRecording(){
        isRecording = false;
        System.out.println(getName()+ " stopped recording.");        
    }
    
    @Override
    public void displayStatus(){
        System.out.println(getName()+"-Status: "+ (isOn()?"ON":"OFF")+",Recording: "+ (isRecording? "YES": "NO")+ ".");        
    }
}
