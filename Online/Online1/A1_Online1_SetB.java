import javax.crypto.spec.PSource;
import java.util.Scanner;

public class A1_Online1_SetB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=num;i+=2){
            sum+=i;
        }

        System.out.println("Sum of series: "+ sum);
    }
}
