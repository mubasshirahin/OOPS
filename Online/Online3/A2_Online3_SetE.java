package Online.Online3;

class Code{
    private double linesOfCode;

    public Code(double linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public double getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(double linesOfCode) {
        this.linesOfCode = linesOfCode;
    }
}

class CodeFactory{
    public Code createCode(int methods){
        int tmp = methods*20;
        Code c = new Code(tmp);
        return c;
    }
    public Code createCode(int methods,int linesOfCode){
        int tmp = methods*linesOfCode;
        Code c = new Code(tmp);
        return c;
    }
    public Code createCode(int methods,int linesOfCode,int additionalLines){
        int tmp = (methods*linesOfCode)+additionalLines;
        Code c = new Code(tmp);
        return c;
    }
}

public class A2_Online3_SetE {
    public static void main(String[] args) {
        Code c = new Code(10);
        CodeFactory cf = new CodeFactory();

        Code c1 = cf.createCode(10);
        System.out.println(c1.getLinesOfCode());
        Code c2 = cf.createCode(10,30);
        System.out.println(c2.getLinesOfCode());
        Code c3 = cf.createCode(10,30,50);
        System.out.println(c3.getLinesOfCode());
    }
}
