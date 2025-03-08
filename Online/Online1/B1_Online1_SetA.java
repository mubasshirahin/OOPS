import java.util.*;

public class B1_Online1_SetA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height and base of triangle: ");
        int height = sc.nextInt();
        int base = sc.nextInt();

        double area = (height*base)/2;

        System.out.println("Enter height and widht of rectangle: ");
        int height2 = sc.nextInt();
        int width = sc.nextInt();

        double area2 = (height2*width);

        System.out.println(area);
        System.out.println(area2);

        if(area>area2)System.out.println("Triangle Bigger");
        else if(area<area2)System.out.println("Rectangle Bigger");
        else System.out.println("None");
    }
}
