package Online.Online3;

class Batsman{
    private int totalRuns;
    private int totalOuts;

    public Batsman(int totalRuns, int totalOuts) {
        this.totalRuns = totalRuns;
        this.totalOuts = totalOuts;
    }

    public void setTotalRuns(int totalRuns){
        this.totalRuns = totalRuns;
    }
    public int getTotalRuns() {
        return totalRuns;
    }
    public int getTotalOuts() {
        return totalOuts;
    }
    public void setTotalOuts(int totalOuts) {
        this.totalOuts = totalOuts;
    }
}

class Committee{
    Committee(){
    }
    public void calculateAverage(Batsman b){
        int avg =  b.getTotalRuns()/b.getTotalOuts();
        System.out.println(avg);
        if(avg>=50) System.out.println("Batsman selected");
        else{
            System.out.println("Batsman not selected");
        }

    }
}

public class B2_Online3_SetA {
    public static void main(String[] args) {
        Batsman b = new Batsman(3645,27);
        Committee c = new Committee();

        c.calculateAverage(b);
    }
}
