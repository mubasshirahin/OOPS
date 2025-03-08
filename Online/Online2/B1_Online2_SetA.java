package Online.Online2;

class Player{
    String playerType;
    double totalScore;
    double totalMatches;

    Player(){
    }
    Player(String playerType,double totalScore,double totalMatches){
        this.playerType = playerType;
        this.totalScore = totalScore;
        this.totalMatches = totalMatches;
    }
    public double calculateFinalScore(){
        if(playerType.equals("new")){
            return totalScore/totalMatches;
        }
        else{
            double ans = (2*totalScore*totalMatches)/(totalScore+totalMatches);
            return ans;
        }
    }
}

public class B1_Online2_SetA {
    public static void main(String[] args) {
        Player p1 = new Player("Noob",100,12);

        System.out.println(p1.calculateFinalScore());
    }
}
