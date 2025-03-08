import java.util.Scanner;

public class A2_Online1_SetB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        StringBuilder s = new StringBuilder();
        int num = sc.nextInt();

        while(num!=0){
            int bhagshesh = num%2;
            s.append(bhagshesh);
            num/=2;
        }

        s.reverse();

        System.out.println(s);
    }
}
