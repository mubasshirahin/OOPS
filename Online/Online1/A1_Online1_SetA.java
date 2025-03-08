import java.util.Scanner;

public class A1_Online1_SetA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;

        while(num!=0){
            int ld = num%10;
            num=num/10;
            sum+=ld;
        }

        System.out.println("Sum of digit: "+ sum);

        if((sum&1)==0){
            System.out.println("Sum is Even");
        }
        else{
            System.out.println("Sum is Odd");
        }
    }
}
