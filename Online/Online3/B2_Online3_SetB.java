package Online.Online3;

class Developer{
    private int lineOfCodeWritten;
    private int totalMonths;

    public Developer(int lineOfCodeWritten, int totalMonths) {
        this.lineOfCodeWritten = lineOfCodeWritten;
        this.totalMonths = totalMonths;
    }

    public int getLineOfCodeWritten() {
        return lineOfCodeWritten;
    }

    public void setLineOfCodeWritten(int lineOfCodeWritten) {
        this.lineOfCodeWritten = lineOfCodeWritten;
    }

    public int getTotalMonths() {
        return totalMonths;
    }

    public void setTotalMonths(int totalMonths) {
        this.totalMonths = totalMonths;
    }
}

class HROfficer{
    HROfficer(){}

    public void checkPerformance(Developer d){
        int ans = d.getLineOfCodeWritten()/d.getTotalMonths();
        System.out.println(ans);

        if(ans>=3000){
            System.out.println("Increament Salary");
        }
        else{
            System.out.println("No Increament");
        }
    }
}

public class B2_Online3_SetB {
    public static void main(String[] args) {
        HROfficer hr = new HROfficer();
        Developer d = new Developer(54000,18);

        hr.checkPerformance(d);

    }
}
