package Online.Online4;
class Structure{
    private double structureVolume;

    public Structure(double structureVolume) {
        this.structureVolume = structureVolume;
    }

    public double getStructureVolume() {
        return structureVolume;
    }

    public void setStructureVolume(double structureVolume) {
        this.structureVolume = structureVolume;
    }
}
class DevelopStructure{
    public Structure produceStructure(double radius){
        double tmp = (4/3.0)*Math.PI*Math.pow(radius,3);
        Structure s = new Structure(tmp);
        return s;
    }
    public Structure produceStructure(double radius,double height){
        double tmp = (1/3.0)*Math.PI*Math.pow(radius,2)*height;
        Structure s = new Structure(tmp);
        return s;
    }
    public Structure produceStructure(double base,double height,double length){
        double tmp = (1/2.0)*(base*height)*length;
        Structure s = new Structure(tmp);
        return s;
    }
}

public class B2_Online4_SetA {
    public static void main(String[] args) {
        DevelopStructure ds = new DevelopStructure();

        Structure s1 = ds.produceStructure(2);
        Structure s2 = ds.produceStructure(3,6);
        Structure s3 = ds.produceStructure(4,7,5);

        System.out.println(s1.getStructureVolume());
        System.out.println(s2.getStructureVolume());
        System.out.println(s3.getStructureVolume());
    }
}
