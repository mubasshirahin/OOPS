package Online.Online2;

import java.util.*;

class Passenger{
    String name;
    double distanceTravelled;
    boolean isPremiumMember;

    public Passenger(String name, double distanceTravelled, boolean isPremiumMember) {
        this.name = name;
        this.distanceTravelled = distanceTravelled;
        this.isPremiumMember = isPremiumMember;
    }

    public double calculateFare(){
        if(distanceTravelled>=15 && isPremiumMember==true){
            return (distanceTravelled*9)-10;
        }
        else if(distanceTravelled<15 && isPremiumMember==true){
            return (distanceTravelled*10)-9;
        }
        else{
            return distanceTravelled*11;
        }
    }
}

public class A1_Online2_SetB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double distance = sc.nextInt();
        boolean isPremiumMember = sc.nextBoolean();

        Passenger ps = new Passenger(name,distance,isPremiumMember);

        System.out.println(ps.calculateFare());

    }
}
