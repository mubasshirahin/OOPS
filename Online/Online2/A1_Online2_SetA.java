package Online.Online2;

class Patient{
    public String name;
    double bodyTemp;
    int duration;

    Patient(){
    }

    public Patient(String name, double bodyTemp, int duration) {
        this.name = name;
        this.bodyTemp = bodyTemp;
        this.duration = duration;
    }
    public String diagnosePatient(){
        if(bodyTemp>=103 && duration>7){
            return "Dengue";
        }
        else if(bodyTemp>=100 && duration<7){
            return "Common Fever";
        }
        else{
            return "Nothing";
        }
    }
}

public class A1_Online2_SetA {
    public static void main(String[] args) {
        Patient pt = new Patient("Sadik",100,9);

        System.out.println(pt.diagnosePatient());

    }
}
