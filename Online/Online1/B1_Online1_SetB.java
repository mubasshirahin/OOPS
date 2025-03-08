import java.util.*;

public class B1_Online1_SetB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        int min = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }

        System.out.println(max);
        System.out.println(min);

        int diff = max - min;

        if(diff>10) System.out.println("Difference is too BIG");
        else System.out.println("Difference is OK");

    }
}
