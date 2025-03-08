import java.util.Scanner;

public class B2_Online1_SetB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum1 = a+b+c;

        int max = 0;
        int min = 0;

        if(a>b && a>c){
            max = a;
        }
        else if(b>a && b>c){
            max = b;
        }
        else{
            max = c;
        }

        if(a<b && a<c){
            min = a;
        }
        else if(b<a && b<c){
            min = b;
        }
        else{
            min = c;
        }

        int sum2 = sum1-(max+min);

        System.out.println(min + " "+sum2+" "+max);

    }
}
