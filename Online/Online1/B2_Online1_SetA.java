import java.util.*;

public class B2_Online1_SetA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String num = sc.nextLine();

        int i = 0;
        int j = num.length()-1;

        boolean check = true;

        while(i<j){
            if(num.charAt(i)!=num.charAt(j)) {
                check = false;
                break;
            }
            i++;
            j--;
        }

        if(check) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");



    }
}
