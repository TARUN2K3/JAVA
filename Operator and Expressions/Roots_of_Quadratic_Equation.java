import java.util.*;
import java.lang.*;


public class Roots_of_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The First Coffecient of Quadratic Equation :");
        int a = sc.nextInt();
        System.out.println("Enter The Second Coffecient of Quadratic Equation :");
        int b = sc.nextInt();
        System.out.println("Enter The Third Coffecient of Quadratic Equation :");
        int c = sc.nextInt();

        float r1 = (float)((- b + Math.sqrt(b*b-4*a*c))/(2*a));
        float r2 = (float)((- b - Math.sqrt(b*b-4*a*c))/(2*a));

        System.out.println("Roots are "+r1+" and "+r2);
    }
}
